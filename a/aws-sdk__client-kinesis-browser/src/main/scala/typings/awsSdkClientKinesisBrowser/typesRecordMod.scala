package typings.awsSdkClientKinesisBrowser

import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.KMS
import typings.awsSdkClientKinesisBrowser.awsSdkClientKinesisBrowserStrings.NONE
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesRecordMod {
  
  trait Record extends StObject {
    
    /**
      * <p>The approximate time that the record was inserted into the stream.</p>
      */
    var ApproximateArrivalTimestamp: js.UndefOr[js.Date | String | Double] = js.undefined
    
    /**
      * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
      */
    var Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String
    
    /**
      * <p>The encryption type used on the record. This parameter can be one of the following values:</p> <ul> <li> <p> <code>NONE</code>: Do not encrypt the records in the stream.</p> </li> <li> <p> <code>KMS</code>: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.</p> </li> </ul>
      */
    var EncryptionType: js.UndefOr[NONE | KMS | String] = js.undefined
    
    /**
      * <p>Identifies which shard in the stream the data record is assigned to.</p>
      */
    var PartitionKey: String
    
    /**
      * <p>The unique identifier of the record within its shard.</p>
      */
    var SequenceNumber: String
  }
  object Record {
    
    inline def apply(
      Data: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String,
      PartitionKey: String,
      SequenceNumber: String
    ): Record = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[Record]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Record] (val x: Self) extends AnyVal {
      
      inline def setApproximateArrivalTimestamp(value: js.Date | String | Double): Self = StObject.set(x, "ApproximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setApproximateArrivalTimestampUndefined: Self = StObject.set(x, "ApproximateArrivalTimestamp", js.undefined)
      
      inline def setData(value: js.typedarray.ArrayBuffer | js.typedarray.ArrayBufferView | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      inline def setEncryptionType(value: NONE | KMS | String): Self = StObject.set(x, "EncryptionType", value.asInstanceOf[js.Any])
      
      inline def setEncryptionTypeUndefined: Self = StObject.set(x, "EncryptionType", js.undefined)
      
      inline def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
      
      inline def setSequenceNumber(value: String): Self = StObject.set(x, "SequenceNumber", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledRecord
    extends StObject
       with Record {
    
    /**
      * <p>The approximate time that the record was inserted into the stream.</p>
      */
    @JSName("ApproximateArrivalTimestamp")
    var ApproximateArrivalTimestamp_UnmarshalledRecord: js.UndefOr[js.Date] = js.undefined
    
    /**
      * <p>The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
      */
    @JSName("Data")
    var Data_UnmarshalledRecord: js.typedarray.Uint8Array
  }
  object UnmarshalledRecord {
    
    inline def apply(Data: js.typedarray.Uint8Array, PartitionKey: String, SequenceNumber: String): UnmarshalledRecord = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledRecord]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: UnmarshalledRecord] (val x: Self) extends AnyVal {
      
      inline def setApproximateArrivalTimestamp(value: js.Date): Self = StObject.set(x, "ApproximateArrivalTimestamp", value.asInstanceOf[js.Any])
      
      inline def setApproximateArrivalTimestampUndefined: Self = StObject.set(x, "ApproximateArrivalTimestamp", js.undefined)
      
      inline def setData(value: js.typedarray.Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    }
  }
}
