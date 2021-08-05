package typings.cordovaPluginDeviceName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CordovaPlugins extends StObject {
  
  /**
    * cordova-plugin-device-name interface
    */
  var deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName
}
object CordovaPlugins {
  
  inline def apply(deviceName: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): CordovaPlugins = {
    val __obj = js.Dynamic.literal(deviceName = deviceName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CordovaPlugins]
  }
  
  extension [Self <: CordovaPlugins](x: Self) {
    
    inline def setDeviceName(value: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName): Self = StObject.set(x, "deviceName", value.asInstanceOf[js.Any])
  }
}
