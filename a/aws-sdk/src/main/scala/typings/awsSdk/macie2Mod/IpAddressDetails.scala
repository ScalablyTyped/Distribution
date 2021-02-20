package typings.awsSdk.macie2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IpAddressDetails extends StObject {
  
  /**
    * The Internet Protocol version 4 (IPv4) address of the device.
    */
  var ipAddressV4: js.UndefOr[string] = js.native
  
  /**
    * The city that the IP address originated from.
    */
  var ipCity: js.UndefOr[IpCity] = js.native
  
  /**
    * The country that the IP address originated from.
    */
  var ipCountry: js.UndefOr[IpCountry] = js.native
  
  /**
    * The geographic coordinates of the location that the IP address originated from.
    */
  var ipGeoLocation: js.UndefOr[IpGeoLocation] = js.native
  
  /**
    * The registered owner of the IP address.
    */
  var ipOwner: js.UndefOr[IpOwner] = js.native
}
object IpAddressDetails {
  
  @scala.inline
  def apply(): IpAddressDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IpAddressDetails]
  }
  
  @scala.inline
  implicit class IpAddressDetailsMutableBuilder[Self <: IpAddressDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIpAddressV4(value: string): Self = StObject.set(x, "ipAddressV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressV4Undefined: Self = StObject.set(x, "ipAddressV4", js.undefined)
    
    @scala.inline
    def setIpCity(value: IpCity): Self = StObject.set(x, "ipCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCityUndefined: Self = StObject.set(x, "ipCity", js.undefined)
    
    @scala.inline
    def setIpCountry(value: IpCountry): Self = StObject.set(x, "ipCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpCountryUndefined: Self = StObject.set(x, "ipCountry", js.undefined)
    
    @scala.inline
    def setIpGeoLocation(value: IpGeoLocation): Self = StObject.set(x, "ipGeoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpGeoLocationUndefined: Self = StObject.set(x, "ipGeoLocation", js.undefined)
    
    @scala.inline
    def setIpOwner(value: IpOwner): Self = StObject.set(x, "ipOwner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpOwnerUndefined: Self = StObject.set(x, "ipOwner", js.undefined)
  }
}
