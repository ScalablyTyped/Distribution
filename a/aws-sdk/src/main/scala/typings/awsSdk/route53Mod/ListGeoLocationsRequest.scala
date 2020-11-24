package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGeoLocationsRequest extends js.Object {
  
  /**
    * (Optional) The maximum number of geolocations to be included in the response body for this request. If more than maxitems geolocations remain to be listed, then the value of the IsTruncated element in the response is true.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.native
  
  /**
    * The code for the continent with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextContinentCode from the previous response has a value, enter that value in startcontinentcode to return the next page of results. Include startcontinentcode only if you want to list continents. Don't include startcontinentcode when you're listing countries or countries with their subdivisions.
    */
  var StartContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * The code for the country with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextCountryCode from the previous response has a value, enter that value in startcountrycode to return the next page of results.
    */
  var StartCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * The code for the state of the United States with which you want to start listing locations that Amazon Route 53 supports for geolocation. If Route 53 has already returned a page or more of results, if IsTruncated is true, and if NextSubdivisionCode from the previous response has a value, enter that value in startsubdivisioncode to return the next page of results. To list subdivisions (U.S. states), you must include both startcountrycode and startsubdivisioncode.
    */
  var StartSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}
object ListGeoLocationsRequest {
  
  @scala.inline
  def apply(): ListGeoLocationsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoLocationsRequest]
  }
  
  @scala.inline
  implicit class ListGeoLocationsRequestOps[Self <: ListGeoLocationsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMaxItems: Self = this.set("MaxItems", js.undefined)
    
    @scala.inline
    def setStartContinentCode(value: GeoLocationContinentCode): Self = this.set("StartContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartContinentCode: Self = this.set("StartContinentCode", js.undefined)
    
    @scala.inline
    def setStartCountryCode(value: GeoLocationCountryCode): Self = this.set("StartCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartCountryCode: Self = this.set("StartCountryCode", js.undefined)
    
    @scala.inline
    def setStartSubdivisionCode(value: GeoLocationSubdivisionCode): Self = this.set("StartSubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartSubdivisionCode: Self = this.set("StartSubdivisionCode", js.undefined)
  }
}
