package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelKeyDeletionRequest extends js.Object {
  /**
    * The unique identifier for the customer master key (CMK) for which to cancel deletion. Specify the key ID or the Amazon Resource Name (ARN) of the CMK. For example:   Key ID: 1234abcd-12ab-34cd-56ef-1234567890ab    Key ARN: arn:aws:kms:us-east-2:111122223333:key/1234abcd-12ab-34cd-56ef-1234567890ab    To get the key ID and key ARN for a CMK, use ListKeys or DescribeKey.
    */
  var KeyId: KeyIdType = js.native
}

object CancelKeyDeletionRequest {
  @scala.inline
  def apply(KeyId: KeyIdType): CancelKeyDeletionRequest = {
    val __obj = js.Dynamic.literal(KeyId = KeyId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelKeyDeletionRequest]
  }
  @scala.inline
  implicit class CancelKeyDeletionRequestOps[Self <: CancelKeyDeletionRequest] (val x: Self) extends AnyVal {
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
  }
  
}

