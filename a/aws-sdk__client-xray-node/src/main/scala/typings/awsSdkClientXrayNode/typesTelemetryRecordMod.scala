package typings.awsSdkClientXrayNode

import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.BackendConnectionErrors
import typings.awsSdkClientXrayNode.typesBackendConnectionErrorsMod.UnmarshalledBackendConnectionErrors
import typings.std.Date
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
    var Timestamp: Date | String | Double
  }
  object TelemetryRecord {
    
    @scala.inline
    def apply(Timestamp: Date | String | Double): TelemetryRecord = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[TelemetryRecord]
    }
    
    @scala.inline
    implicit class TelemetryRecordMutableBuilder[Self <: TelemetryRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendConnectionErrors(value: BackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
      
      @scala.inline
      def setSegmentsReceivedCount(value: Double): Self = StObject.set(x, "SegmentsReceivedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsReceivedCountUndefined: Self = StObject.set(x, "SegmentsReceivedCount", js.undefined)
      
      @scala.inline
      def setSegmentsRejectedCount(value: Double): Self = StObject.set(x, "SegmentsRejectedCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsRejectedCountUndefined: Self = StObject.set(x, "SegmentsRejectedCount", js.undefined)
      
      @scala.inline
      def setSegmentsSentCount(value: Double): Self = StObject.set(x, "SegmentsSentCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsSentCountUndefined: Self = StObject.set(x, "SegmentsSentCount", js.undefined)
      
      @scala.inline
      def setSegmentsSpilloverCount(value: Double): Self = StObject.set(x, "SegmentsSpilloverCount", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSegmentsSpilloverCountUndefined: Self = StObject.set(x, "SegmentsSpilloverCount", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date | String | Double): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
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
    var Timestamp_UnmarshalledTelemetryRecord: Date
  }
  object UnmarshalledTelemetryRecord {
    
    @scala.inline
    def apply(Timestamp: Date): UnmarshalledTelemetryRecord = {
      val __obj = js.Dynamic.literal(Timestamp = Timestamp.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledTelemetryRecord]
    }
    
    @scala.inline
    implicit class UnmarshalledTelemetryRecordMutableBuilder[Self <: UnmarshalledTelemetryRecord] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackendConnectionErrors(value: UnmarshalledBackendConnectionErrors): Self = StObject.set(x, "BackendConnectionErrors", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackendConnectionErrorsUndefined: Self = StObject.set(x, "BackendConnectionErrors", js.undefined)
      
      @scala.inline
      def setTimestamp(value: Date): Self = StObject.set(x, "Timestamp", value.asInstanceOf[js.Any])
    }
  }
}
