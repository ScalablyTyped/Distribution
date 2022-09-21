package typings.awsSdk.snsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PhoneNumberInformation extends StObject {
  
  /**
    * The date and time when the phone number was created.
    */
  var CreatedAt: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The two-character code for the country or region, in ISO 3166-1 alpha-2 format.
    */
  var Iso2CountryCode: js.UndefOr[typings.awsSdk.snsMod.Iso2CountryCode] = js.undefined
  
  /**
    * The capabilities of each phone number.
    */
  var NumberCapabilities: js.UndefOr[NumberCapabilityList] = js.undefined
  
  /**
    * The phone number.
    */
  var PhoneNumber: js.UndefOr[String] = js.undefined
  
  /**
    * The list of supported routes.
    */
  var RouteType: js.UndefOr[typings.awsSdk.snsMod.RouteType] = js.undefined
  
  /**
    * The status of the phone number.
    */
  var Status: js.UndefOr[String] = js.undefined
}
object PhoneNumberInformation {
  
  inline def apply(): PhoneNumberInformation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PhoneNumberInformation]
  }
  
  extension [Self <: PhoneNumberInformation](x: Self) {
    
    inline def setCreatedAt(value: js.Date): Self = StObject.set(x, "CreatedAt", value.asInstanceOf[js.Any])
    
    inline def setCreatedAtUndefined: Self = StObject.set(x, "CreatedAt", js.undefined)
    
    inline def setIso2CountryCode(value: Iso2CountryCode): Self = StObject.set(x, "Iso2CountryCode", value.asInstanceOf[js.Any])
    
    inline def setIso2CountryCodeUndefined: Self = StObject.set(x, "Iso2CountryCode", js.undefined)
    
    inline def setNumberCapabilities(value: NumberCapabilityList): Self = StObject.set(x, "NumberCapabilities", value.asInstanceOf[js.Any])
    
    inline def setNumberCapabilitiesUndefined: Self = StObject.set(x, "NumberCapabilities", js.undefined)
    
    inline def setNumberCapabilitiesVarargs(value: NumberCapability*): Self = StObject.set(x, "NumberCapabilities", js.Array(value*))
    
    inline def setPhoneNumber(value: String): Self = StObject.set(x, "PhoneNumber", value.asInstanceOf[js.Any])
    
    inline def setPhoneNumberUndefined: Self = StObject.set(x, "PhoneNumber", js.undefined)
    
    inline def setRouteType(value: RouteType): Self = StObject.set(x, "RouteType", value.asInstanceOf[js.Any])
    
    inline def setRouteTypeUndefined: Self = StObject.set(x, "RouteType", js.undefined)
    
    inline def setStatus(value: String): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
