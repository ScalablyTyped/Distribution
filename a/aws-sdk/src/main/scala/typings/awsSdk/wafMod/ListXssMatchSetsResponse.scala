package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListXssMatchSetsResponse extends StObject {
  
  /**
    * If you have more XssMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more XssMatchSet objects, submit another ListXssMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
  
  /**
    * An array of XssMatchSetSummary objects.
    */
  var XssMatchSets: js.UndefOr[XssMatchSetSummaries] = js.undefined
}
object ListXssMatchSetsResponse {
  
  inline def apply(): ListXssMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListXssMatchSetsResponse]
  }
  
  extension [Self <: ListXssMatchSetsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setXssMatchSets(value: XssMatchSetSummaries): Self = StObject.set(x, "XssMatchSets", value.asInstanceOf[js.Any])
    
    inline def setXssMatchSetsUndefined: Self = StObject.set(x, "XssMatchSets", js.undefined)
    
    inline def setXssMatchSetsVarargs(value: XssMatchSetSummary*): Self = StObject.set(x, "XssMatchSets", js.Array(value :_*))
  }
}
