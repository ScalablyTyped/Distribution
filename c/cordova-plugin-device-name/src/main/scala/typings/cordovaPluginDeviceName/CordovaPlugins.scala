package typings.cordovaPluginDeviceName

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends js.Object {
  
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName = js.native
}
object CordovaPlugins {
  
  @scala.inline
  def apply(deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  @scala.inline
  implicit class CordovaPluginsOps[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
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
    def setDeviceName(value: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): Self = this.set("deviceName", value.asInstanceOf[js.Any])
  }
}
