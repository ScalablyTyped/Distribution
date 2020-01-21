package typings.awsSdk.firehoseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutRecordOutput extends js.Object {
  /**
    * Indicates whether server-side encryption (SSE) was enabled during this operation.
    */
  var Encrypted: js.UndefOr[BooleanObject] = js.native
  /**
    * The ID of the record.
    */
  var RecordId: PutResponseRecordId = js.native
}

object PutRecordOutput {
  @scala.inline
  def apply(RecordId: PutResponseRecordId, Encrypted: js.UndefOr[Boolean] = js.undefined): PutRecordOutput = {
    val __obj = js.Dynamic.literal(RecordId = RecordId.asInstanceOf[js.Any])
    if (!js.isUndefined(Encrypted)) __obj.updateDynamic("Encrypted")(Encrypted.asInstanceOf[js.Any])
    __obj.asInstanceOf[PutRecordOutput]
  }
}

