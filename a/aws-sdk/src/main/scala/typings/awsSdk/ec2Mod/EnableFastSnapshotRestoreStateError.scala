package typings.awsSdk.ec2Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EnableFastSnapshotRestoreStateError extends js.Object {
  /**
    * The error code.
    */
  var Code: js.UndefOr[String] = js.native
  /**
    * The error message.
    */
  var Message: js.UndefOr[String] = js.native
}

object EnableFastSnapshotRestoreStateError {
  @scala.inline
  def apply(): EnableFastSnapshotRestoreStateError = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EnableFastSnapshotRestoreStateError]
  }
  @scala.inline
  implicit class EnableFastSnapshotRestoreStateErrorOps[Self <: EnableFastSnapshotRestoreStateError] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCode(value: String): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setMessage(value: String): Self = this.set("Message", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMessage: Self = this.set("Message", js.undefined)
  }
  
}

