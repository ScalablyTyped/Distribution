package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
  def apply(
    MaxItems: PageMaxItems = null,
    StartContinentCode: GeoLocationContinentCode = null,
    StartCountryCode: GeoLocationCountryCode = null,
    StartSubdivisionCode: GeoLocationSubdivisionCode = null
  ): ListGeoLocationsRequest = {
    val __obj = js.Dynamic.literal()
    if (MaxItems != null) __obj.updateDynamic("MaxItems")(MaxItems.asInstanceOf[js.Any])
    if (StartContinentCode != null) __obj.updateDynamic("StartContinentCode")(StartContinentCode.asInstanceOf[js.Any])
    if (StartCountryCode != null) __obj.updateDynamic("StartCountryCode")(StartCountryCode.asInstanceOf[js.Any])
    if (StartSubdivisionCode != null) __obj.updateDynamic("StartSubdivisionCode")(StartSubdivisionCode.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeoLocationsRequest]
  }
}

