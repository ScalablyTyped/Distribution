package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleKeyDeletionResponse extends js.Object {
  /**
    * The date and time after which AWS KMS deletes the customer master key (CMK).
    */
  var DeletionDate: js.UndefOr[DateType] = js.native
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is scheduled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object ScheduleKeyDeletionResponse {
  @scala.inline
  def apply(DeletionDate: DateType = null, KeyId: KeyIdType = null): ScheduleKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    if (DeletionDate != null) __obj.updateDynamic("DeletionDate")(DeletionDate.asInstanceOf[js.Any])
    if (KeyId != null) __obj.updateDynamic("KeyId")(KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionResponse]
  }
}

