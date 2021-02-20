package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.typesRecordMod.Record
import typings.awsSdkClientKinesisBrowser.typesRecordMod.UnmarshalledRecord
import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesSubscribeToShardEventMod {
  
  @js.native
  trait SubscribeToShardEvent extends StObject {
    
    /**
      * <p>Use this as <code>StartingSequenceNumber</code> in the next call to <a>SubscribeToShard</a>.</p>
      */
    var ContinuationSequenceNumber: String = js.native
    
    /**
      * <p>The number of milliseconds the read records are from the tip of the stream, indicating how far behind current time the consumer is. A value of zero indicates that record processing is caught up, and there are no new records to process at this moment.</p>
      */
    var MillisBehindLatest: Double = js.native
    
    /**
      * <p/>
      */
    var Records: js.Array[Record] | Iterable[Record] = js.native
  }
  object SubscribeToShardEvent {
    
    @scala.inline
    def apply(
      ContinuationSequenceNumber: String,
      MillisBehindLatest: Double,
      Records: js.Array[Record] | Iterable[Record]
    ): SubscribeToShardEvent = {
      val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[SubscribeToShardEvent]
    }
    
    @scala.inline
    implicit class SubscribeToShardEventMutableBuilder[Self <: SubscribeToShardEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setContinuationSequenceNumber(value: String): Self = StObject.set(x, "ContinuationSequenceNumber", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMillisBehindLatest(value: Double): Self = StObject.set(x, "MillisBehindLatest", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecords(value: js.Array[Record] | Iterable[Record]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: Record*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
  
  @js.native
  trait UnmarshalledSubscribeToShardEvent extends SubscribeToShardEvent {
    
    /**
      * <p/>
      */
    @JSName("Records")
    var Records_UnmarshalledSubscribeToShardEvent: js.Array[UnmarshalledRecord] = js.native
  }
  object UnmarshalledSubscribeToShardEvent {
    
    @scala.inline
    def apply(
      ContinuationSequenceNumber: String,
      MillisBehindLatest: Double,
      Records: js.Array[UnmarshalledRecord]
    ): UnmarshalledSubscribeToShardEvent = {
      val __obj = js.Dynamic.literal(ContinuationSequenceNumber = ContinuationSequenceNumber.asInstanceOf[js.Any], MillisBehindLatest = MillisBehindLatest.asInstanceOf[js.Any], Records = Records.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledSubscribeToShardEvent]
    }
    
    @scala.inline
    implicit class UnmarshalledSubscribeToShardEventMutableBuilder[Self <: UnmarshalledSubscribeToShardEvent] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecords(value: js.Array[UnmarshalledRecord]): Self = StObject.set(x, "Records", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRecordsVarargs(value: UnmarshalledRecord*): Self = StObject.set(x, "Records", js.Array(value :_*))
    }
  }
}
