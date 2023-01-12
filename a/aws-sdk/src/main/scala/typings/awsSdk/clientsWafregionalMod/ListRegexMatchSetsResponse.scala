package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegexMatchSetsResponse extends StObject {
  
  /**
    * If you have more RegexMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexMatchSet objects, submit another ListRegexMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
  
  /**
    * An array of RegexMatchSetSummary objects.
    */
  var RegexMatchSets: js.UndefOr[RegexMatchSetSummaries] = js.undefined
}
object ListRegexMatchSetsResponse {
  
  inline def apply(): ListRegexMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexMatchSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRegexMatchSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRegexMatchSets(value: RegexMatchSetSummaries): Self = StObject.set(x, "RegexMatchSets", value.asInstanceOf[js.Any])
    
    inline def setRegexMatchSetsUndefined: Self = StObject.set(x, "RegexMatchSets", js.undefined)
    
    inline def setRegexMatchSetsVarargs(value: RegexMatchSetSummary*): Self = StObject.set(x, "RegexMatchSets", js.Array(value*))
  }
}
