package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Record extends js.Object {
  /**
    * The approximate time that the record was inserted into the stream.
    */
  var ApproximateArrivalTimestamp: js.UndefOr[Timestamp] = js.native
  /**
    * The data blob. The data in the blob is both opaque and immutable to Kinesis Data Streams, which does not inspect, interpret, or change the data in the blob in any way. When the data blob (the payload before base64-encoding) is added to the partition key size, the total size must not exceed the maximum record size (1 MB).
    */
  var Data: typings.awsSdk.kinesisMod.Data = js.native
  /**
    * The encryption type used on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * Identifies which shard in the stream the data record is assigned to.
    */
  var PartitionKey: typings.awsSdk.kinesisMod.PartitionKey = js.native
  /**
    * The unique identifier of the record within its shard.
    */
  var SequenceNumber: typings.awsSdk.kinesisMod.SequenceNumber = js.native
}

object Record {
  @scala.inline
  def apply(
    Data: Data,
    PartitionKey: PartitionKey,
    SequenceNumber: SequenceNumber,
    ApproximateArrivalTimestamp: Timestamp = null,
    EncryptionType: EncryptionType = null
  ): Record = {
    val __obj = js.Dynamic.literal(Data = Data.asInstanceOf[js.Any], PartitionKey = PartitionKey.asInstanceOf[js.Any], SequenceNumber = SequenceNumber.asInstanceOf[js.Any])
    if (ApproximateArrivalTimestamp != null) __obj.updateDynamic("ApproximateArrivalTimestamp")(ApproximateArrivalTimestamp.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Record]
  }
}

