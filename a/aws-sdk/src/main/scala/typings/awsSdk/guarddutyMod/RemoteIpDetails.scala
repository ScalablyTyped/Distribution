package typings.awsSdk.guarddutyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RemoteIpDetails extends StObject {
  
  /**
    * The city information of the remote IP address.
    */
  var City: js.UndefOr[typings.awsSdk.guarddutyMod.City] = js.native
  
  /**
    * The country code of the remote IP address.
    */
  var Country: js.UndefOr[typings.awsSdk.guarddutyMod.Country] = js.native
  
  /**
    * The location information of the remote IP address.
    */
  var GeoLocation: js.UndefOr[typings.awsSdk.guarddutyMod.GeoLocation] = js.native
  
  /**
    * The IPv4 remote address of the connection.
    */
  var IpAddressV4: js.UndefOr[String] = js.native
  
  /**
    * The ISP organization information of the remote IP address.
    */
  var Organization: js.UndefOr[typings.awsSdk.guarddutyMod.Organization] = js.native
}
object RemoteIpDetails {
  
  @scala.inline
  def apply(): RemoteIpDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RemoteIpDetails]
  }
  
  @scala.inline
  implicit class RemoteIpDetailsMutableBuilder[Self <: RemoteIpDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCity(value: City): Self = StObject.set(x, "City", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCityUndefined: Self = StObject.set(x, "City", js.undefined)
    
    @scala.inline
    def setCountry(value: Country): Self = StObject.set(x, "Country", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryUndefined: Self = StObject.set(x, "Country", js.undefined)
    
    @scala.inline
    def setGeoLocation(value: GeoLocation): Self = StObject.set(x, "GeoLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoLocationUndefined: Self = StObject.set(x, "GeoLocation", js.undefined)
    
    @scala.inline
    def setIpAddressV4(value: String): Self = StObject.set(x, "IpAddressV4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIpAddressV4Undefined: Self = StObject.set(x, "IpAddressV4", js.undefined)
    
    @scala.inline
    def setOrganization(value: Organization): Self = StObject.set(x, "Organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationUndefined: Self = StObject.set(x, "Organization", js.undefined)
  }
}
