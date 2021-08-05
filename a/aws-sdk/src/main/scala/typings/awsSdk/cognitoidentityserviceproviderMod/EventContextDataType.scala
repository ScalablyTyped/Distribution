package typings.awsSdk.cognitoidentityserviceproviderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EventContextDataType extends StObject {
  
  /**
    * The user's city.
    */
  var City: js.UndefOr[StringType] = js.undefined
  
  /**
    * The user's country.
    */
  var Country: js.UndefOr[StringType] = js.undefined
  
  /**
    * The user's device name.
    */
  var DeviceName: js.UndefOr[StringType] = js.undefined
  
  /**
    * The user's IP address.
    */
  var IpAddress: js.UndefOr[StringType] = js.undefined
  
  /**
    * The user's time zone.
    */
  var Timezone: js.UndefOr[StringType] = js.undefined
}
object EventContextDataType {
  
  inline def apply(): EventContextDataType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EventContextDataType]
  }
  
  extension [Self <: EventContextDataType](x: Self) {
    
    inline def setCity(value: StringType): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    inline def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    inline def setCountry(value: StringType): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    inline def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    inline def setDeviceName(value: StringType): Self = StObject.set(x, "DeviceName", value.asInstanceOf[js.Any])
    
    inline def setDeviceNameUndefined: Self = StObject.set(x, "DeviceName", js.undefined)
    
    inline def setIpAddress(value: StringType): Self = StObject.set(x, "IpAddress", value.asInstanceOf[js.Any])
    
    inline def setIpAddressUndefined: Self = StObject.set(x, "IpAddress", js.undefined)
    
    inline def setTimezone(value: StringType): Self = StObject.set(x, "Timezone", value.asInstanceOf[js.Any])
    
    inline def setTimezoneUndefined: Self = StObject.set(x, "Timezone", js.undefined)
  }
}
