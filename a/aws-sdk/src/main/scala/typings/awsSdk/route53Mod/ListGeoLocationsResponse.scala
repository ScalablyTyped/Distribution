package typings.awsSdk.route53Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGeoLocationsResponse extends js.Object {
  
  /**
    * A complex type that contains one GeoLocationDetails element for each location that Amazon Route 53 supports for geolocation.
    */
  var GeoLocationDetailsList: typings.awsSdk.route53Mod.GeoLocationDetailsList = js.native
  
  /**
    * A value that indicates whether more locations remain to be listed after the last location in this response. If so, the value of IsTruncated is true. To get more values, submit another request and include the values of NextContinentCode, NextCountryCode, and NextSubdivisionCode in the startcontinentcode, startcountrycode, and startsubdivisioncode, as applicable.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * The value that you specified for MaxItems in the request.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextContinentCode in the startcontinentcode parameter in another ListGeoLocations request.
    */
  var NextContinentCode: js.UndefOr[GeoLocationContinentCode] = js.native
  
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextCountryCode in the startcountrycode parameter in another ListGeoLocations request.
    */
  var NextCountryCode: js.UndefOr[GeoLocationCountryCode] = js.native
  
  /**
    * If IsTruncated is true, you can make a follow-up request to display more locations. Enter the value of NextSubdivisionCode in the startsubdivisioncode parameter in another ListGeoLocations request.
    */
  var NextSubdivisionCode: js.UndefOr[GeoLocationSubdivisionCode] = js.native
}
object ListGeoLocationsResponse {
  
  @scala.inline
  def apply(GeoLocationDetailsList: GeoLocationDetailsList, IsTruncated: PageTruncated, MaxItems: PageMaxItems): ListGeoLocationsResponse = {
    val __obj = js.Dynamic.literal(GeoLocationDetailsList = GeoLocationDetailsList.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListGeoLocationsResponse]
  }
  
  @scala.inline
  implicit class ListGeoLocationsResponseOps[Self <: ListGeoLocationsResponse] (val x: Self) extends AnyVal {
    
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
    def setGeoLocationDetailsListVarargs(value: GeoLocationDetails*): Self = this.set("GeoLocationDetailsList", js.Array(value :_*))
    
    @scala.inline
    def setGeoLocationDetailsList(value: GeoLocationDetailsList): Self = this.set("GeoLocationDetailsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = this.set("IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = this.set("MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextContinentCode(value: GeoLocationContinentCode): Self = this.set("NextContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextContinentCode: Self = this.set("NextContinentCode", js.undefined)
    
    @scala.inline
    def setNextCountryCode(value: GeoLocationCountryCode): Self = this.set("NextCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextCountryCode: Self = this.set("NextCountryCode", js.undefined)
    
    @scala.inline
    def setNextSubdivisionCode(value: GeoLocationSubdivisionCode): Self = this.set("NextSubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextSubdivisionCode: Self = this.set("NextSubdivisionCode", js.undefined)
  }
}
