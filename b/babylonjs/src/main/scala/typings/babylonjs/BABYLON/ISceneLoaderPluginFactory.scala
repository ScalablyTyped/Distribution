package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ISceneLoaderPluginFactory extends StObject {
  
  /**
    * The callback that returns true if the data can be directly loaded.
    * @param data string containing the file data
    * @returns if the data can be loaded directly
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.undefined
  
  /**
    * Function called to create a new plugin
    * @returns the new plugin
    */
  def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync
  
  /**
    * Defines the name of the factory
    */
  var name: String
}
object ISceneLoaderPluginFactory {
  
  inline def apply(createPlugin: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync, name: String): ISceneLoaderPluginFactory = {
    val __obj = js.Dynamic.literal(createPlugin = js.Any.fromFunction0(createPlugin), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderPluginFactory]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ISceneLoaderPluginFactory] (val x: Self) extends AnyVal {
    
    inline def setCanDirectLoad(value: /* data */ String => Boolean): Self = StObject.set(x, "canDirectLoad", js.Any.fromFunction1(value))
    
    inline def setCanDirectLoadUndefined: Self = StObject.set(x, "canDirectLoad", js.undefined)
    
    inline def setCreatePlugin(value: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync): Self = StObject.set(x, "createPlugin", js.Any.fromFunction0(value))
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
  }
}
