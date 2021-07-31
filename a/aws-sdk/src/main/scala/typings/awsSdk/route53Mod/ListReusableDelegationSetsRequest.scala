package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListReusableDelegationSetsRequest extends StObject {
  
  /**
    * If the value of IsTruncated in the previous response was true, you have more reusable delegation sets. To get another group, submit another ListReusableDelegationSets request.  For the value of marker, specify the value of NextMarker from the previous response, which is the ID of the first reusable delegation set that Amazon Route 53 will return if you submit another request. If the value of IsTruncated in the previous response was false, there are no more reusable delegation sets to get.
    */
  var Marker: js.UndefOr[PageMarker] = js.undefined
  
  /**
    * The number of reusable delegation sets that you want Amazon Route 53 to return in the response to this request. If you specify a value greater than 100, Route 53 returns only the first 100 reusable delegation sets.
    */
  var MaxItems: js.UndefOr[PageMaxItems] = js.undefined
}
object ListReusableDelegationSetsRequest {
  
  @scala.inline
  def apply(): ListReusableDelegationSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListReusableDelegationSetsRequest]
  }
  
  @scala.inline
  implicit class ListReusableDelegationSetsRequestMutableBuilder[Self <: ListReusableDelegationSetsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarkerUndefined: Self = StObject.set(x, "Marker", js.undefined)
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItemsUndefined: Self = StObject.set(x, "MaxItems", js.undefined)
  }
}
