package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListGeoMatchSetsRequest extends StObject {
  
  /**
    * Specifies the number of GeoMatchSet objects that you want AWS WAF to return for this request. If you have more GeoMatchSet objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of GeoMatchSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more GeoMatchSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of GeoMatchSet objects. For the second and subsequent ListGeoMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of GeoMatchSet objects.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
}
object ListGeoMatchSetsRequest {
  
  @scala.inline
  def apply(): ListGeoMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListGeoMatchSetsRequest]
  }
  
  @scala.inline
  implicit class ListGeoMatchSetsRequestMutableBuilder[Self <: ListGeoMatchSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLimit(value: PaginationLimit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
