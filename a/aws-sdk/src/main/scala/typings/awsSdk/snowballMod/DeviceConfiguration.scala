package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeviceConfiguration extends StObject {
  
  /**
    * Returns information about the device configuration for an Snowcone job.
    */
  var SnowconeDeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.SnowconeDeviceConfiguration] = js.undefined
}
object DeviceConfiguration {
  
  inline def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  
  extension [Self <: DeviceConfiguration](x: Self) {
    
    inline def setSnowconeDeviceConfiguration(value: SnowconeDeviceConfiguration): Self = StObject.set(x, "SnowconeDeviceConfiguration", value.asInstanceOf[js.Any])
    
    inline def setSnowconeDeviceConfigurationUndefined: Self = StObject.set(x, "SnowconeDeviceConfiguration", js.undefined)
  }
}
