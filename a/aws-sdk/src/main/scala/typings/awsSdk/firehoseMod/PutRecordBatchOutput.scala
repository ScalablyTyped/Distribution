package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordBatchOutput extends js.Object {
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.native
  /**
    * The number of records that might have failed processing. This number might be greater than 0 even if the PutRecordBatch call succeeds. Check FailedPutCount to determine whether there are records that you need to resend.
    */
  var FailedPutCount: NonNegativeIntegerObject = js.native
  /**
    * The results array. For each record, the index of the response element is the same as the index used in the request array.
    */
  var RequestResponses: PutRecordBatchResponseEntryList = js.native
}

object PutRecordBatchOutput {
  @scala.inline
  def apply(
    FailedPutCount: NonNegativeIntegerObject,
    RequestResponses: PutRecordBatchResponseEntryList,
    Encrypted: js.UndefOr[Boolean] = js.undefined
  ): PutRecordBatchOutput = {
    val __obj = js.Dynamic.literal(FailedPutCount = FailedPutCount.asInstanceOf[js.Any], RequestResponses = RequestResponses.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordBatchOutput]
  }
}

