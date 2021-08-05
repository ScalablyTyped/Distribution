package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSizeConstraintSetsResponse extends StObject {
  
  /**
    * If you have more SizeConstraintSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more SizeConstraintSet objects, submit another ListSizeConstraintSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
  
  /**
    * An array of SizeConstraintSetSummary objects.
    */
  var SizeConstraintSets: js.UndefOr[SizeConstraintSetSummaries] = js.undefined
}
object ListSizeConstraintSetsResponse {
  
  inline def apply(): ListSizeConstraintSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSizeConstraintSetsResponse]
  }
  
  extension [Self <: ListSizeConstraintSetsResponse](x: Self) {
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
    
    inline def setSizeConstraintSets(value: SizeConstraintSetSummaries): Self = StObject.set(x, "SizeConstraintSets", value.asInstanceOf[js.Any])
    
    inline def setSizeConstraintSetsUndefined: Self = StObject.set(x, "SizeConstraintSets", js.undefined)
    
    inline def setSizeConstraintSetsVarargs(value: SizeConstraintSetSummary*): Self = StObject.set(x, "SizeConstraintSets", js.Array(value :_*))
  }
}
