package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GeoLocation extends StObject {
  
  /**
    * The two-letter code for the continent. Amazon Route 53 supports the following continent codes:    AF: Africa    AN: Antarctica    AS: Asia    EU: Europe    OC: Oceania    NA: North America    SA: South America   Constraint: Specifying ContinentCode with either CountryCode or SubdivisionCode returns an InvalidInput error.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.undefined
  
  /**
    * For geolocation resource record sets, the two-letter code for a country. Amazon Route 53 uses the two-letter country codes that are specified in ISO standard 3166-1 alpha-2.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.undefined
  
  /**
    * For geolocation resource record sets, the two-letter code for a state of the United States. Route 53 doesn't support any other values for SubdivisionCode. For a list of state abbreviations, see Appendix B: Two–Letter State and Possession Abbreviations on the United States Postal Service website.  If you specify subdivisioncode, you must also specify US for CountryCode. 
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.undefined
}
object GeoLocation {
  
  @scala.inline
  def apply(): GeoLocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocation]
  }
  
  @scala.inline
  implicit class GeoLocationMutableBuilder[Self <: GeoLocation] (val x: Self) extends AnyVal {
    
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
