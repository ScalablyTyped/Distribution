package typings.awsSdk.kinesisMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordsOutput extends js.Object {
  /**
    * The encryption type used on the records. This parameter can be one of the following values:    NONE: Do not encrypt the records.    KMS: Use server-side encryption on the records using a customer-managed AWS KMS key.  
    */
  var EncryptionType: js.UndefOr[typings.awsSdk.kinesisMod.EncryptionType] = js.native
  /**
    * The number of unsuccessfully processed records in a PutRecords request.
    */
  var FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.native
  /**
    * An array of successfully and unsuccessfully processed record results, correlated with the request by natural ordering. A record that is successfully added to a stream includes SequenceNumber and ShardId in the result. A record that fails to be added to a stream includes ErrorCode and ErrorMessage in the result.
    */
  var Records: PutRecordsResultEntryList = js.native
}

object PutRecordsOutput {
  @scala.inline
  def apply(
    Records: PutRecordsResultEntryList,
    EncryptionType: EncryptionType = null,
    FailedRecordCount: js.UndefOr[PositiveIntegerObject] = js.undefined
  ): PutRecordsOutput = {
    val __obj = js.Dynamic.literal(Records = Records.asInstanceOf[js.Any])
    if (EncryptionType != null) __obj.updateDynamic("EncryptionType")(EncryptionType.asInstanceOf[js.Any])
    if (!js.isUndefined(FailedRecordCount)) __obj.updateDynamic("FailedRecordCount")(FailedRecordCount.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordsOutput]
  }
}

