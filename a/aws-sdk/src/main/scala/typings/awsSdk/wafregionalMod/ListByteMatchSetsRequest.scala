package typings.awsSdk.wafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListByteMatchSetsRequest extends StObject {
  
  /**
    * Specifies the number of ByteMatchSet objects that you want AWS WAF to return for this request. If you have more ByteMatchSets objects than the number you specify for Limit, the response includes a NextMarker value that you can use to get another batch of ByteMatchSet objects.
    */
  var Limit: js.UndefOr[PaginationLimit] = js.undefined
  
  /**
    * If you specify a value for Limit and you have more ByteMatchSets than the value of Limit, AWS WAF returns a NextMarker value in the response that allows you to list another group of ByteMatchSets. For the second and subsequent ListByteMatchSets requests, specify the value of NextMarker from the previous response to get information about another batch of ByteMatchSets.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafregionalMod.NextMarker] = js.undefined
}
object ListByteMatchSetsRequest {
  
  @scala.inline
  def apply(): ListByteMatchSetsRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByteMatchSetsRequest]
  }
  
  @scala.inline
  implicit class ListByteMatchSetsRequestMutableBuilder[Self <: ListByteMatchSetsRequest] (val x: Self) extends AnyVal {
    
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
