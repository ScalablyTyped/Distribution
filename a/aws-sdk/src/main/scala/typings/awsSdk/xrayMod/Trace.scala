package typings.awsSdk.xrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Trace extends StObject {
  
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.native
  
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.native
  
  /**
    * LimitExceeded is set to true when the trace has exceeded one of the defined quotas. For more information about quotas, see AWS X-Ray endpoints and quotas.
    */
  var LimitExceeded: js.UndefOr[NullableBoolean] = js.native
  
  /**
    * Segment documents for the segments and subsegments that comprise the trace.
    */
  var Segments: js.UndefOr[SegmentList] = js.native
}
object Trace {
  
  @scala.inline
  def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  
  @scala.inline
  implicit class TraceMutableBuilder[Self <: Trace] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDuration(value: NullableDouble): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    @scala.inline
    def setId(value: TraceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    @scala.inline
    def setLimitExceeded(value: NullableBoolean): Self = StObject.set(x, "LimitExceeded", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitExceededUndefined: Self = StObject.set(x, "LimitExceeded", js.undefined)
    
    @scala.inline
    def setSegments(value: SegmentList): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
    
    @scala.inline
    def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "Segments", js.Array(value :_*))
  }
}
