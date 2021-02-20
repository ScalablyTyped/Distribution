package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EventContextDataType extends StObject {
  
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.native
  
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.native
  
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.native
  
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.native
  
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.native
}
object EventContextDataType {
  
  @scala.inline
  def apply(): EventContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventContextDataType]
  }
  
  @scala.inline
  implicit class EventContextDataTypeMutableBuilder[Self <: EventContextDataType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: StringType): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCountry(value: StringType): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setDeviceName(value: StringType): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    @scala.inline
    def setIpAddress(value: StringType): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    @scala.inline
    def setTimezone(value: StringType): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
