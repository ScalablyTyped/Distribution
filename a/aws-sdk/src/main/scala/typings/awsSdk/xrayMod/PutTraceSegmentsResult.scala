package typings.awsSdk.xrayMod

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
  
  @scala.inline
  def apply(): PutTraceSegmentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTraceSegmentsResult]
  }
  
  @scala.inline
  implicit class PutTraceSegmentsResultMutableBuilder[Self <: PutTraceSegmentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setUnprocessedTraceSegments(value: UnprocessedTraceSegmentList): Self = StObject.set(x, "UnprocessedTraceSegments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnprocessedTraceSegmentsUndefined: Self = StObject.set(x, "UnprocessedTraceSegments", js.undefined)
    
    @scala.inline
    def setUnprocessedTraceSegmentsVarargs(value: UnprocessedTraceSegment*): Self = StObject.set(x, "UnprocessedTraceSegments", js.Array(value :_*))
  }
}
