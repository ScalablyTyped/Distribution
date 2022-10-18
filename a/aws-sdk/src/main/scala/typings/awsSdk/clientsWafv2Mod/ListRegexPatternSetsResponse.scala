package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegexPatternSetsResponse extends StObject {
  
  /**
    * When you request a list of objects with a Limit setting, if the number of objects that are still available for retrieval exceeds the limit, WAF returns a NextMarker value in the response. To retrieve the next batch of objects, provide the marker from the prior call in your next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafv2Mod.NextMarker] = js.undefined
  
  /**
    * 
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined
}
object ListRegexPatternSetsResponse {
  
  inline def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  
  extension [Self <: ListRegexPatternSetsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRegexPatternSets(value: RegexPatternSetSummaries): Self = StObject.set(x, "RegexPatternSets", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetsUndefined: Self = StObject.set(x, "RegexPatternSets", js.undefined)
    
    inline def setRegexPatternSetsVarargs(value: RegexPatternSetSummary*): Self = StObject.set(x, "RegexPatternSets", js.Array(value*))
  }
}
