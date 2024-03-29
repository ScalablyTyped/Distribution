package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PutTraceSegmentsResult extends StObject {
  
  /**
    * Segments that failed processing.
    */
  var UnprocessedTraceSegments: js.UndefOr[UnprocessedTraceSegmentList] = js.undefined
}
object PutTraceSegmentsResult {
  
  inline def apply(): PutTraceSegmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTraceSegmentsResult]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PutTraceSegmentsResult] (val x: Self) extends AnyVal {
    
    inline def setUnprocessedTraceSegments(value: UnprocessedTraceSegmentList): Self = StObject.set(x, "UnprocessedTraceSegments", value.asInstanceOf[js.Any])
    
    inline def setUnprocessedTraceSegmentsUndefined: Self = StObject.set(x, "UnprocessedTraceSegments", js.undefined)
    
    inline def setUnprocessedTraceSegmentsVarargs(value: UnprocessedTraceSegment*): Self = StObject.set(x, "UnprocessedTraceSegments", js.Array(value*))
  }
}
