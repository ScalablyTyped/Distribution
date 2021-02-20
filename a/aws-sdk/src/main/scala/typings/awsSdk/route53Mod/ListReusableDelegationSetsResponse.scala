package typings.awsSdk.route53Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListReusableDelegationSetsResponse extends StObject {
  
  /**
    * A complex type that contains one DelegationSet element for each reusable delegation set that was created by the current AWS account.
    */
  var DelegationSets: typings.awsSdk.route53Mod.DelegationSets = js.native
  
  /**
    * A flag that indicates whether there are more reusable delegation sets to be listed.
    */
  var IsTruncated: PageTruncated = js.native
  
  /**
    * For the second and subsequent calls to ListReusableDelegationSets, Marker is the value that you specified for the marker parameter in the request that produced the current response.
    */
  var Marker: PageMarker = js.native
  
  /**
    * The value that you specified for the maxitems parameter in the call to ListReusableDelegationSets that produced the current response.
    */
  var MaxItems: PageMaxItems = js.native
  
  /**
    * If IsTruncated is true, the value of NextMarker identifies the next reusable delegation set that Amazon Route 53 will return if you submit another ListReusableDelegationSets request and specify the value of NextMarker in the marker parameter.
    */
  var NextMarker: js.UndefOr[PageMarker] = js.native
}
object ListReusableDelegationSetsResponse {
  
  @scala.inline
  def apply(
    DelegationSets: DelegationSets,
    IsTruncated: PageTruncated,
    Marker: PageMarker,
    MaxItems: PageMaxItems
  ): ListReusableDelegationSetsResponse = {
    val __obj = js.Dynamic.literal(DelegationSets = DelegationSets.asInstanceOf[js.Any], IsTruncated = IsTruncated.asInstanceOf[js.Any], Marker = Marker.asInstanceOf[js.Any], MaxItems = MaxItems.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListReusableDelegationSetsResponse]
  }
  
  @scala.inline
  implicit class ListReusableDelegationSetsResponseMutableBuilder[Self <: ListReusableDelegationSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDelegationSets(value: DelegationSets): Self = StObject.set(x, "DelegationSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDelegationSetsVarargs(value: DelegationSet*): Self = StObject.set(x, "DelegationSets", js.Array(value :_*))
    
    @scala.inline
    def setIsTruncated(value: PageTruncated): Self = StObject.set(x, "IsTruncated", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMarker(value: PageMarker): Self = StObject.set(x, "Marker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxItems(value: PageMaxItems): Self = StObject.set(x, "MaxItems", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarker(value: PageMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
