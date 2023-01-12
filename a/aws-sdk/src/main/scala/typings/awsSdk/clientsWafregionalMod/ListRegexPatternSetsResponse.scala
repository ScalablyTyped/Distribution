package typings.awsSdk.clientsWafregionalMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListRegexPatternSetsResponse extends StObject {
  
  /**
    * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.clientsWafregionalMod.NextMarker] = js.undefined
  
  /**
    * An array of RegexPatternSetSummary objects.
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.undefined
}
object ListRegexPatternSetsResponse {
  
  inline def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListRegexPatternSetsResponse] (val x: Self) extends AnyVal {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setRegexPatternSets(value: RegexPatternSetSummaries): Self = StObject.set(x, "RegexPatternSets", value.asInstanceOf[js.Any])
    
    inline def setRegexPatternSetsUndefined: Self = StObject.set(x, "RegexPatternSets", js.undefined)
    
    inline def setRegexPatternSetsVarargs(value: RegexPatternSetSummary*): Self = StObject.set(x, "RegexPatternSets", js.Array(value*))
  }
}
