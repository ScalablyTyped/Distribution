package typings.babylonjs.BABYLON

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a plugin registered by the SceneLoader
  */
trait IRegisteredPlugin extends StObject {
  
  /**
    * Defines if the plugin supports binary data
    */
  var isBinary: Boolean
  
  /**
    * Defines the plugin to use
    */
  var plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
}
object IRegisteredPlugin {
  
  inline def apply(
    isBinary: Boolean,
    plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
  ): IRegisteredPlugin = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisteredPlugin]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IRegisteredPlugin] (val x: Self) extends AnyVal {
    
    inline def setIsBinary(value: Boolean): Self = StObject.set(x, "isBinary", value.asInstanceOf[js.Any])
    
    inline def setPlugin(value: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory): Self = StObject.set(x, "plugin", value.asInstanceOf[js.Any])
  }
}
