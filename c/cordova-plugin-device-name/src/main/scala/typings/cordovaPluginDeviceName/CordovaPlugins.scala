package typings.cordovaPluginDeviceName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CordovaPlugins extends StObject {
  
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
  implicit class CordovaPluginsMutableBuilder[Self <: CordovaPlugins] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeviceName(value: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
  }
}
