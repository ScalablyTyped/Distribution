package typings.awsSdk.wafMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListByteMatchSetsResponse extends StObject {
  
  /**
    * An array of ByteMatchSetSummary objects.
    */
  var ByteMatchSets: js.UndefOr[ByteMatchSetSummaries] = js.undefined
  
  /**
    * If you have more ByteMatchSet objects than the number that you specified for Limit in the request, the response includes a NextMarker value. To list more ByteMatchSet objects, submit another ListByteMatchSets request, and specify the NextMarker value from the response in the NextMarker value in the next request.
    */
  var NextMarker: js.UndefOr[typings.awsSdk.wafMod.NextMarker] = js.undefined
}
object ListByteMatchSetsResponse {
  
  inline def apply(): ListByteMatchSetsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListByteMatchSetsResponse]
  }
  
  extension [Self <: ListByteMatchSetsResponse](x: Self) {
    
    inline def setByteMatchSets(value: ByteMatchSetSummaries): Self = StObject.set(x, "ByteMatchSets", value.asInstanceOf[js.Any])
    
    inline def setByteMatchSetsUndefined: Self = StObject.set(x, "ByteMatchSets", js.undefined)
    
    inline def setByteMatchSetsVarargs(value: ByteMatchSetSummary*): Self = StObject.set(x, "ByteMatchSets", js.Array(value*))
    
    inline def setNextMarker(value: NextMarker): Self = StObject.set(x, "NextMarker", value.asInstanceOf[js.Any])
    
    inline def setNextMarkerUndefined: Self = StObject.set(x, "NextMarker", js.undefined)
  }
}
