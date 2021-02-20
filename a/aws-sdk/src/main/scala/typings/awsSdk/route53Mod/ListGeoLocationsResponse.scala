package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListGeoLocationsResponse extends StObject {
  
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
  implicit class ListGeoLocationsResponseMutableBuilder[Self <: ListGeoLocationsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setGeoLocationDetailsList(value: GeoLocationDetailsList): Self = StObject.set(x, "GeoLocationDetailsList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeoLocationDetailsListVarargs(value: GeoLocationDetails*): Self = StObject.set(x, "GeoLocationDetailsList", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextContinentCode(value: GeoLocationContinentCode): Self = StObject.set(x, "NextContinentCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextContinentCodeUndefined: Self = StObject.set(x, "NextContinentCode", js.undefined)
    
    @scala.inline
    def setNextCountryCode(value: GeoLocationCountryCode): Self = StObject.set(x, "NextCountryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextCountryCodeUndefined: Self = StObject.set(x, "NextCountryCode", js.undefined)
    
    @scala.inline
    def setNextSubdivisionCode(value: GeoLocationSubdivisionCode): Self = StObject.set(x, "NextSubdivisionCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextSubdivisionCodeUndefined: Self = StObject.set(x, "NextSubdivisionCode", js.undefined)
  }
}
