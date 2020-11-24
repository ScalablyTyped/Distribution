package typings.babylonjs.sceneLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ISceneLoaderPluginFactory extends js.Object {
  
  /**
    * The callback that returns true if the data can be directly loaded.
    * @param data string containing the file data
    * @returns if the data can be loaded directly
    */
  var canDirectLoad: js.UndefOr[js.Function1[/* data */ String, Boolean]] = js.native
  
  /**
    * Function called to create a new plugin
    * @return the new plugin
    */
  def createPlugin(): ISceneLoaderPlugin | ISceneLoaderPluginAsync = js.native
  
  /**
    * Defines the name of the factory
    */
  var name: String = js.native
}
object ISceneLoaderPluginFactory {
  
  @scala.inline
  def apply(createPlugin: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync, name: String): ISceneLoaderPluginFactory = {
    val __obj = js.Dynamic.literal(createPlugin = js.Any.fromFunction0(createPlugin), name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISceneLoaderPluginFactory]
  }
  
  @scala.inline
  implicit class ISceneLoaderPluginFactoryOps[Self <: ISceneLoaderPluginFactory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCreatePlugin(value: () => ISceneLoaderPlugin | ISceneLoaderPluginAsync): Self = this.set("createPlugin", js.Any.fromFunction0(value))
    
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCanDirectLoad(value: /* data */ String => Boolean): Self = this.set("canDirectLoad", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteCanDirectLoad: Self = this.set("canDirectLoad", js.undefined)
  }
}
