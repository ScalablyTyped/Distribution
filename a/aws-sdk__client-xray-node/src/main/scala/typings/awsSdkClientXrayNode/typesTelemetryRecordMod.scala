package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesTelemetryRecordMod {
  
  trait TelemetryRecord extends StObject {
    
    /**
      * <p/>
      */
    var BackendConnectionErrors: js.UndefOr[
        typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
      ] = js.undefined
    
    /**
      * <p/>
      */
    var SegmentsReceivedCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var SegmentsRejectedCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var SegmentsSentCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var SegmentsSpilloverCount: js.UndefOr[Double] = js.undefined
    
    /**
      * <p/>
      */
    var Timestamp: js.Date | String | Double
  }
  object TelemetryRecord {
    
    inline def apply(Timestamp: js.Date | String | Double): TelemetryRecord = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryRecord]
    }
    
    extension [Self <: TelemetryRecord](x: Self) {
      
      inline def setBackendConnectionErrors(value: BackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
      
      inline def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
      
      inline def setSegmentsReceivedCount(value: Double): Self = StObject.set(x, "SegmentsReceivedCount", value.asInstanceOf[js.Any])
      
      inline def setSegmentsReceivedCountUndefined: Self = StObject.set(x, "SegmentsReceivedCount", js.undefined)
      
      inline def setSegmentsRejectedCount(value: Double): Self = StObject.set(x, "SegmentsRejectedCount", value.asInstanceOf[js.Any])
      
      inline def setSegmentsRejectedCountUndefined: Self = StObject.set(x, "SegmentsRejectedCount", js.undefined)
      
      inline def setSegmentsSentCount(value: Double): Self = StObject.set(x, "SegmentsSentCount", value.asInstanceOf[js.Any])
      
      inline def setSegmentsSentCountUndefined: Self = StObject.set(x, "SegmentsSentCount", js.undefined)
      
      inline def setSegmentsSpilloverCount(value: Double): Self = StObject.set(x, "SegmentsSpilloverCount", value.asInstanceOf[js.Any])
      
      inline def setSegmentsSpilloverCountUndefined: Self = StObject.set(x, "SegmentsSpilloverCount", js.undefined)
      
      inline def setTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledTelemetryRecord
    extends StObject
       with TelemetryRecord {
    
    /**
      * <p/>
      */
    @JSName("BackendConnectionErrors")
    var BackendConnectionErrors_UnmarshalledTelemetryRecord: js.UndefOr[UnmarshalledBackendConnectionErrors] = js.undefined
    
    /**
      * <p/>
      */
    @JSName("Timestamp")
    var Timestamp_UnmarshalledTelemetryRecord: js.Date
  }
  object UnmarshalledTelemetryRecord {
    
    inline def apply(Timestamp: js.Date): UnmarshalledTelemetryRecord = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledTelemetryRecord]
    }
    
    extension [Self <: UnmarshalledTelemetryRecord](x: Self) {
      
      inline def setBackendConnectionErrors(value: UnmarshalledBackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
      
      inline def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
      
      inline def setTimestamp(value: js.Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
