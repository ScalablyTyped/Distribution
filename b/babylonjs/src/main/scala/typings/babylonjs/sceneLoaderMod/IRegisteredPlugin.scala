package typings.babylonjs.sceneLoaderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Defines a plugin registered by the SceneLoader
  */
@js.native
trait IRegisteredPlugin extends js.Object {
  
  /**
    * Defines if the plugin supports binary data
    */
  var isBinary: Boolean = js.native
  
  /**
    * Defines the plugin to use
    */
  var plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory = js.native
}
object IRegisteredPlugin {
  
  @scala.inline
  def apply(
    isBinary: Boolean,
    plugin: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory
  ): IRegisteredPlugin = {
    val __obj = js.Dynamic.literal(isBinary = isBinary.asInstanceOf[js.Any], plugin = plugin.asInstanceOf[js.Any])
    __obj.asInstanceOf[IRegisteredPlugin]
  }
  
  @scala.inline
  implicit class IRegisteredPluginOps[Self <: IRegisteredPlugin] (val x: Self) extends AnyVal {
    
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
    def setIsBinary(value: Boolean): Self = this.set("isBinary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPlugin(value: ISceneLoaderPlugin | ISceneLoaderPluginAsync | ISceneLoaderPluginFactory): Self = this.set("plugin", value.asInstanceOf[js.Any])
  }
}
