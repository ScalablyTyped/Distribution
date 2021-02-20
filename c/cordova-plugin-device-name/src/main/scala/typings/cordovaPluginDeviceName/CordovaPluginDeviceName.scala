package typings.cordovaPluginDeviceName

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Keep the type global namespace clean by using a module
  */
object CordovaPluginDeviceName {
  
  @js.native
  trait CordovaPluginDeviceName extends StObject {
    
    /**
      * User-friendly name of the device.
      * @example cordova.plugins.deviceName.name // e.g: Larry's Android
      */
    var name: String = js.native
  }
  object CordovaPluginDeviceName {
    
    @scala.inline
    def apply(name: String): typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName]
    }
    
    @scala.inline
    implicit class CordovaPluginDeviceNameMutableBuilder[Self <: typings.cordovaPluginDeviceName.CordovaPluginDeviceName.CordovaPluginDeviceName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    }
  }
}
