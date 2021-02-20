package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeviceConfiguration extends StObject {
  
  /**
    * Returns information about the device configuration for an AWS Snowcone job.
    */
  var SnowconeDeviceConfiguration: js.UndefOr[typings.awsSdk.snowballMod.SnowconeDeviceConfiguration] = js.native
}
object DeviceConfiguration {
  
  @scala.inline
  def apply(): DeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeviceConfiguration]
  }
  
  @scala.inline
  implicit class DeviceConfigurationMutableBuilder[Self <: DeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setSnowconeDeviceConfiguration(value: SnowconeDeviceConfiguration): Self = StObject.set(x, "SnowconeDeviceConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnowconeDeviceConfigurationUndefined: Self = StObject.set(x, "SnowconeDeviceConfiguration", js.undefined)
  }
}
