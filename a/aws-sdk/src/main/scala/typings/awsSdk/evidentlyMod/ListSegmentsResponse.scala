package typings.awsSdk.evidentlyMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListSegmentsResponse extends StObject {
  
  /**
    * The token to use in a subsequent ListSegments operation to return the next set of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
  
  /**
    * An array of structures that contain information about the segments in this Region.
    */
  var segments: js.UndefOr[SegmentList] = js.undefined
}
object ListSegmentsResponse {
  
  inline def apply(): ListSegmentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListSegmentsResponse]
  }
  
  extension [Self <: ListSegmentsResponse](x: Self) {
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setSegments(value: SegmentList): Self = StObject.set(x, "segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "segments", js.Array(value*))
  }
}
