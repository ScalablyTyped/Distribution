package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GeoLocationDetails extends StObject {
  
  /**
    * The two-letter code for the continent.
    */
  var ContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * The full name of the continent.
    */
  var ContinentName: js.UndefOr[GeoLocationContinentName] = js.native
  
  /**
    * The two-letter code for the country.
    */
  var CountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * The name of the country.
    */
  var CountryName: js.UndefOr[GeoLocationCountryName] = js.native
  
  /**
    * The code for the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
  
  /**
    * The full name of the subdivision. Route 53 currently supports only states in the United States.
    */
  var SubdivisionName: js.UndefOr[GeoLocationSubdivisionName] = js.native
}
object GeoLocationDetails {
  
  @scala.inline
  def apply(): GeoLocationDetails = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GeoLocationDetails]
  }
  
  @scala.inline
  implicit class GeoLocationDetailsMutableBuilder[Self <: GeoLocationDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "ContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentCodeUndefined: Self = StObject.set(x, "ContinentCode", js.undefined)
    
    @scala.inline
    def setContinentName(value: GeoLocationContinentName): Self = StObject.set(x, "ContinentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContinentNameUndefined: Self = StObject.set(x, "ContinentName", js.undefined)
    
    @scala.inline
    def setCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "CountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryCodeUndefined: Self = StObject.set(x, "CountryCode", js.undefined)
    
    @scala.inline
    def setCountryName(value: GeoLocationCountryName): Self = StObject.set(x, "CountryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCountryNameUndefined: Self = StObject.set(x, "CountryName", js.undefined)
    
    @scala.inline
    def setSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "SubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionCodeUndefined: Self = StObject.set(x, "SubdivisionCode", js.undefined)
    
    @scala.inline
    def setSubdivisionName(value: GeoLocationSubdivisionName): Self = StObject.set(x, "SubdivisionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubdivisionNameUndefined: Self = StObject.set(x, "SubdivisionName", js.undefined)
  }
}
