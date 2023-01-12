package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListIPSetsResponse extends StObject {
  
  /**
    * Array of IPSets. This may not be the full list of IPSets that you have defined. See the Limit specification for this request.
    */
  var IPSets: js.UndefOr[IPSetSummaries] = js.undefined
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
}
object ListIPSetsResponse {
  
  inline def apply(): ListIPSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListIPSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListIPSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setIPSets(value: IPSetSummaries): Self = StObject.set(x, "IPSets", value.asInstanceOf[js.Any])
    
    inline def setIPSetsUndefined: Self = StObject.set(x, "IPSets", js.undefined)
    
    inline def setIPSetsVarargs(value: IPSetSummary*): Self = StObject.set(x, "IPSets", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
