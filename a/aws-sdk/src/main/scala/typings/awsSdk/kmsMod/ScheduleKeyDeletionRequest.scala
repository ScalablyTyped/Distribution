package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ScheduleKeyDeletionRequest extends js.Object {
  /**
    * The unique identifier of the customer master key (CMK) to delete. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
  /**
    * The waiting period, specified in number of days. After the waiting period ends, AWS KMS deletes the customer master key (CMK). This value is optional. If you include a value, it must be between 7 and 30, inclusive. If you do not include a value, it defaults to 30.
    */
  var PendingWindowInDays: js.UndefOr[PendingWindowInDaysType] = js.native
}

object ScheduleKeyDeletionRequest {
  @scala.inline
  def apply(KeyId: KeyIdType): ScheduleKeyDeletionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScheduleKeyDeletionRequest]
  }
  @scala.inline
  implicit class ScheduleKeyDeletionRequestOps[Self <: ScheduleKeyDeletionRequest] (val x: Self) extends AnyVal {
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
    def setKeyId(value: KeyIdType): Self = this.set("KeyId", value.asInstanceOf[js.Any])
    @scala.inline
    def setPendingWindowInDays(value: PendingWindowInDaysType): Self = this.set("PendingWindowInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingWindowInDays: Self = this.set("PendingWindowInDays", js.undefined)
  }
  
}

