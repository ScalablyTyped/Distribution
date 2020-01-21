package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchResponseEntry extends js.Object {
  /**
    * The error code for an individual record result.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.firehoseMod.ErrorCode] = js.native
  /**
    * The error message for an individual record result.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.firehoseMod.ErrorMessage] = js.native
  /**
    * The ID of the record.
    */
  var RecordId: js.UndefOr[PutResponseRecordId] = js.native
}

object PutRecordBatchResponseEntry {
  @scala.inline
  def apply(
    ErrorCode: ErrorCode = null,
    ErrorMessage: ErrorMessage = null,
    RecordId: PutResponseRecordId = null
  ): PutRecordBatchResponseEntry = {
    val __obj = js.Dynamic.literal()
    if (ErrorCode != null) __obj.updateDynamic("ErrorCode")(ErrorCode.asInstanceOf[js.Any])
    if (ErrorMessage != null) __obj.updateDynamic("ErrorMessage")(ErrorMessage.asInstanceOf[js.Any])
    if (RecordId != null) __obj.updateDynamic("RecordId")(RecordId.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchResponseEntry]
  }
}

