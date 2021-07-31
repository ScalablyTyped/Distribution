package typings.awsSdk.snowballMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SnowconeDeviceConfiguration extends StObject {
  
  /**
    * Configures the wireless connection for the AWS Snowcone device.
    */
  var WirelessConnection: js.UndefOr[typings.awsSdk.snowballMod.WirelessConnection] = js.undefined
}
object SnowconeDeviceConfiguration {
  
  @scala.inline
  def apply(): SnowconeDeviceConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SnowconeDeviceConfiguration]
  }
  
  @scala.inline
  implicit class SnowconeDeviceConfigurationMutableBuilder[Self <: SnowconeDeviceConfiguration] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWirelessConnection(value: WirelessConnection): Self = StObject.set(x, "WirelessConnection", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWirelessConnectionUndefined: Self = StObject.set(x, "WirelessConnection", js.undefined)
  }
}
