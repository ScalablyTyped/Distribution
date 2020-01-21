package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordInput extends js.Object {
  /**
    * The data blob to put into the record, which is base64-encoded when the blob is serialized. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).
    */
  var Data: typings.awsSdk.kinesisMod.Data = js.native
  /**
    * The hash value used to explicitly determine the shard the data record is assigned to by overriding the partition key hash.
    */
  var ExplicitHashKey: js.UndefOr[HashKey] = js.native
  /**
    * Determines which shard in the stream the data record is assigned to. Partition keys are Unicode strings with a maximum length limit of 256 characters for each key. Amazon Kinesis Data Streams uses the partition key as input to a hash function that maps the partition key and associated data to a specific shard. Specifically, an MD5 hash function is used to map partition keys to 128-bit integer values and to map associated data records to shards. As a result of this hashing mechanism, all data records with the same partition key map to the same shard within the stream.
    */
  var PartitionKey: typings.awsSdk.kinesisMod.PartitionKey = js.native
  /**
    * Guarantees strictly increasing sequence numbers, for puts from the same client and to the same partition key. Usage: set the SequenceNumberForOrdering of record n to the sequence number of record n-1 (as returned in the result when putting record n-1). If this parameter is not set, records are coarsely ordered based on arrival time.
    */
  var SequenceNumberForOrdering: js.UndefOr[SequenceNumber] = js.native
  /**
    * The name of the stream to put the data record into.
    */
  var StreamName: typings.awsSdk.kinesisMod.StreamName = js.native
}

object PutRecordInput {
  @scala.inline
  def apply(
    Data: Data,
    PartitionKey: PartitionKey,
    StreamName: StreamName,
    ExplicitHashKey: HashKey = null,
    SequenceNumberForOrdering: SequenceNumber = null
  ): PutRecordInput = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], StreamName = StreamName.asInstanceOf[js.Any])
    if (ExplicitHashKey != null) __obj.updateDynamic("ExplicitHashKey")(ExplicitHashKey.asInstanceOf[js.Any])
    if (SequenceNumberForOrdering != null) __obj.updateDynamic("SequenceNumberForOrdering")(SequenceNumberForOrdering.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordInput]
  }
}

