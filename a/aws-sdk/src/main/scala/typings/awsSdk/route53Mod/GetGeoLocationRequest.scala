package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetGeoLocationRequest extends StObject {
  
  /**
    * For geolocation resource record sets, a two-letter abbreviation that identifies a continent. Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America  
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * For SubdivisionCode, Amazon Route 53 supports only states of the United States. For a list of state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website.  If you specify subdivisioncode, you must also specify US for CountryCode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}
object GetGeoLocationRequest {
  
  @scala.inline
  def apply(): GetGeoLocationRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetGeoLocationRequest]
  }
  
  @scala.inline
  implicit class GetGeoLocationRequestMutableBuilder[Self <: GetGeoLocationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "ContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentCodeUndefined: Self = StObject.set(x, "ContinentCode", js.undefined)
    
    @scala.inline
    def setCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    @scala.inline
    def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "SubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionCodeUndefined: Self = StObject.set(x, "SubdivisionCode", js.undefined)
  }
}
