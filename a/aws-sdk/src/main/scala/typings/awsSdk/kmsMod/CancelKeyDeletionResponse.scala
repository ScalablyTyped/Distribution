package typings.awsSdk.kmsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CancelKeyDeletionResponse extends js.Object {
  /**
    * The Amazon Resource Name (key ARN) of the CMK whose deletion is canceled.
    */
  var KeyId: js.UndefOr[KeyIdType] = js.native
}

object CancelKeyDeletionResponse {
  @scala.inline
  def apply(): CancelKeyDeletionResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CancelKeyDeletionResponse]
  }
  @scala.inline
  implicit class CancelKeyDeletionResponseOps[Self <: CancelKeyDeletionResponse] (val x: Self) extends AnyVal {
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
    def deleteKeyId: Self = this.set("KeyId", js.undefined)
  }
  
}

