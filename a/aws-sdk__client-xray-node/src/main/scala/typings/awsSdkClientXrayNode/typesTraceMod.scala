package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesSegmentMod.Segment
import typings.awsSdkClientXrayNode.typesSegmentMod.UnmarshalledSegment
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTraceMod {
  
  trait Trace extends StObject {
    
    /**
      * <p>The length of time in seconds between the start time of the root segment and the end time of the last segment that completed.</p>
      */
    var Duration: js.UndefOr[Double] = js.undefined
    
    /**
      * <p>The unique identifier for the request that generated the trace's segments and subsegments.</p>
      */
    var Id: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
      */
    var Segments: js.UndefOr[js.Array[Segment] | js.Iterable[Segment]] = js.undefined
  }
  object Trace {
    
    inline def apply(): Trace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Trace]
    }
    
    extension [Self <: Trace](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "Duration", value.asInstanceOf[js.Any])
      
      inline def setDurationUndefined: Self = StObject.set(x, "Duration", js.undefined)
      
      inline def setId(value: String): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
      
      inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
      
      inline def setSegments(value: js.Array[Segment] | js.Iterable[Segment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
      
      inline def setSegmentsVarargs(value: Segment*): Self = StObject.set(x, "Segments", js.Array(value*))
    }
  }
  
  trait UnmarshalledTrace
    extends StObject
       with Trace {
    
    /**
      * <p>Segment documents for the segments and subsegments that comprise the trace.</p>
      */
    @JSName("Segments")
    var Segments_UnmarshalledTrace: js.UndefOr[js.Array[UnmarshalledSegment]] = js.undefined
  }
  object UnmarshalledTrace {
    
    inline def apply(): UnmarshalledTrace = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[UnmarshalledTrace]
    }
    
    extension [Self <: UnmarshalledTrace](x: Self) {
      
      inline def setSegments(value: js.Array[UnmarshalledSegment]): Self = StObject.set(x, "Segments", value.asInstanceOf[js.Any])
      
      inline def setSegmentsUndefined: Self = StObject.set(x, "Segments", js.undefined)
      
      inline def setSegmentsVarargs(value: UnmarshalledSegment*): Self = StObject.set(x, "Segments", js.Array(value*))
    }
  }
}
