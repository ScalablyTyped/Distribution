package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ListRegexPatternSetsResponse extends StObject {
  
  /**
    * If you have more RegexPatternSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more RegexPatternSet objects, submit another ListRegexPatternSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.native
  
  /**
    * An array of RegexPatternSetSummary objects.
    */
  var RegexPatternSets: js.UndefOr[RegexPatternSetSummaries] = js.native
}
object ListRegexPatternSetsResponse {
  
  @scala.inline
  def apply(): ListRegexPatternSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListRegexPatternSetsResponse]
  }
  
  @scala.inline
  implicit class ListRegexPatternSetsResponseMutableBuilder[Self <: ListRegexPatternSetsResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    @scala.inline
    def setRegexPatternSets(value: RegexPatternSetSummaries): Self = StObject.set(x, "RegexPatternSets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRegexPatternSetsUndefined: Self = StObject.set(x, "RegexPatternSets", js.undefined)
    
    @scala.inline
    def setRegexPatternSetsVarargs(value: RegexPatternSetSummary*): Self = StObject.set(x, "RegexPatternSets", js.Array(value :_*))
  }
}
