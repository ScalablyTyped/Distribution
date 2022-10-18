package typings.awsSdk.clientsXrayMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Trace extends StObject {
  
  /**
    * The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.
    */
  var Duration: js.UndefOr[NullableDouble] = js.undefined
  
  /**
    * The unique identifier for the request that generated the trace's segments and subsegments.
    */
  var Id: js.UndefOr[TraceId] = js.undefined
  
  /**
    * LimitExceeded is set to true when the trace has exceeded one of the defined quotas. For more information about quotas, see Amazon Web Services X-Ray endpoints and quotas.
    */
  var LimitExceeded: js.UndefOr[NullableBoolean] = js.undefined
  
  /**
    * Segment documents for the segments and subsegments that comprise the trace.
    */
  var Segments: js.UndefOr[SegmentList] = js.undefined
}
object Trace {
  
  inline def apply(): Trace = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Trace]
  }
  
  extension [Self <: Trace](x: Self) {
    
    inline def setDuration(value: NullableDouble): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
    
    inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
    
    inline def setId(value: TraceId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setLimitExceeded(value: NullableBoolean): Self = StObject.set(x, "LimitExceeded", value.asInstanceOf[js.Any])
    
    inline def setLimitExceededUndefined: Self = StObject.set(x, "LimitExceeded", js.undefined)
    
    inline def setSegments(value: SegmentList): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
    
    inline def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
    
    inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "Segments", js.Array(value*))
  }
}
