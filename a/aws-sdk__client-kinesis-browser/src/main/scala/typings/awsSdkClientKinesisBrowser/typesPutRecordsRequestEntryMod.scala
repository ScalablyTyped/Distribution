package typings.awsSdkClientKinesisBrowser

import typings.std.ArrayBuffer
import typings.std.ArrayBufferView
import typings.std.Uint8Array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object typesPutRecordsRequestEntryMod {
  
  trait PutRecordsRequestEntry extends StObject {
    
    /**
      * <p>The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
      */
    var Data: ArrayBuffer | ArrayBufferView | String
    
    /**
      * <p>The hash value used to determine explicitly the shard that the data record is assigned to by overriding the partition key hash.</p>
      */
    var ExplicitHashKey: js.UndefOr[String] = js.undefined
    
    /**
      * <p>Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.</p>
      */
    var PartitionKey: String
  }
  object PutRecordsRequestEntry {
    
    @scala.inline
    def apply(Data: ArrayBuffer | ArrayBufferView | String, PartitionKey: String): PutRecordsRequestEntry = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[PutRecordsRequestEntry]
    }
    
    @scala.inline
    implicit class PutRecordsRequestEntryMutableBuilder[Self <: PutRecordsRequestEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: ArrayBuffer | ArrayBufferView | String): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitHashKey(value: String): Self = StObject.set(x, "ExplicitHashKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExplicitHashKeyUndefined: Self = StObject.set(x, "ExplicitHashKey", js.undefined)
      
      @scala.inline
      def setPartitionKey(value: String): Self = StObject.set(x, "PartitionKey", value.asInstanceOf[js.Any])
    }
  }
  
  trait UnmarshalledPutRecordsRequestEntry
    extends StObject
       with PutRecordsRequestEntry {
    
    /**
      * <p>The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).</p>
      */
    @JSName("Data")
    var Data_UnmarshalledPutRecordsRequestEntry: Uint8Array
  }
  object UnmarshalledPutRecordsRequestEntry {
    
    @scala.inline
    def apply(Data: Uint8Array, PartitionKey: String): UnmarshalledPutRecordsRequestEntry = {
      val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any])
      __obj.asInstanceOf[UnmarshalledPutRecordsRequestEntry]
    }
    
    @scala.inline
    implicit class UnmarshalledPutRecordsRequestEntryMutableBuilder[Self <: UnmarshalledPutRecordsRequestEntry] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setData(value: Uint8Array): Self = StObject.set(x, "Data", value.asInstanceOf[js.Any])
    }
  }
}
