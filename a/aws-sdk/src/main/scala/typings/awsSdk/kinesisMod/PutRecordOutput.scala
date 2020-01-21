package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordOutput extends js.Object {
  /**
    * The encryption type to use on the record. This parameter can be one of the following values:    NONE: Do not encrypt the records in the stream.    KMS: Use server-side encryption on the records in the stream using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * The sequence number identifier that was assigned to the put data record. The sequence number for the record is unique across all records in the stream. A sequence number is the identifier associated with every record put into the stream.
    */
  var SequenceNumber: typings.awsSdk.kinesisMod.SequenceNumber = js.native
  /**
    * The shard ID of the shard where the data record was placed.
    */
  var ShardId: typings.awsSdk.kinesisMod.ShardId = js.native
}

object PutRecordOutput {
  @scala.inline
  def apply(SequenceNumber: SequenceNumber, ShardId: ShardId, EncryptionType: EncryptionType = null): PutRecordOutput = {
    val __obj = js.Dynamic.literal(SequenceNumber = SequenceNumber.asInstanceOf[js.Any], ShardId = ShardId.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
}

