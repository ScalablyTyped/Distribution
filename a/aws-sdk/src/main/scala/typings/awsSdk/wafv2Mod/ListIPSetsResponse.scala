package typings.awsSdk.wafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListIPSetsResponse extends StObject {
  
  /**
    * Array of IPSets. This may not be the full list of IPSets that you have defined. See the Limit specification for this request.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.native
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, AWS WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafv2Mod.NextMarker] = js.native
}
object ListIPSetsResponse {
  
  @scala.inline
  def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  @scala.inline
  implicit class ListIPSetsResponseMutableBuilder[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIPSets(value: IPSetSummaries): Self = StObject.set(x, "IPSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIPSetsUndefined: Self = StObject.set(x, "IPSets", js.undefined)
    
    @scala.inline
    def setIPSetsVarargs(value: IPSetSummary*): Self = StObject.set(x, "IPSets", js.Array(value :_*))
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
