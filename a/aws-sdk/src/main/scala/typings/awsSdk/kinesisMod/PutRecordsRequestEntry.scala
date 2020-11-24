package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PutRecordsRequestEntry extends js.Object {
  
  /**
    * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MiB).
    */
  var Data: typings.awsSdk.kinesisMod.Data = js.native
  
  /**
    * The hash value used to determine explicitly the shard that the data record is assigned to by overriding the partition key hash.
    */
  var ExplicitHashKey: js.UndefOr[HashKey] = js.native
  
  /**
    * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
    */
  var PartitionKey: typings.awsSdk.kinesisMod.PartitionKey = js.native
}
object PutRecordsRequestEntry {
  
  @scala.inline
  def apply(Data: Data, PartitionKey: PartitionKey): PutRecordsRequestEntry = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsRequestEntry]
  }
  
  @scala.inline
  implicit class PutRecordsRequestEntryOps[Self <: PutRecordsRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setData(value: Data): Self = this.set("Data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPartitionKey(value: PartitionKey): Self = this.set("PartitionKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExplicitHashKey(value: HashKey): Self = this.set("ExplicitHashKey", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExplicitHashKey: Self = this.set("ExplicitHashKey", js.undefined)
  }
}
