package typings.awsSdk.eventbridgeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutTargetsResultEntry extends js.Object {
  /**
    * The error code that indicates why the target addition failed. If the value is ConcurrentModificationException, too many requests were made at the same time.
    */
  var ErrorCode: js.UndefOr[typings.awsSdk.eventbridgeMod.ErrorCode] = js.native
  /**
    * The error message that explains why the target addition failed.
    */
  var ErrorMessage: js.UndefOr[typings.awsSdk.eventbridgeMod.ErrorMessage] = js.native
  /**
    * The ID of the target.
    */
  var TargetId: js.UndefOr[typings.awsSdk.eventbridgeMod.TargetId] = js.native
}

object PutTargetsResultEntry {
  @scala.inline
  def apply(): PutTargetsResultEntry = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutTargetsResultEntry]
  }
  @scala.inline
  implicit class PutTargetsResultEntryOps[Self <: PutTargetsResultEntry] (val x: Self) extends AnyVal {
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
    def setErrorCode(value: ErrorCode): Self = this.set("ErrorCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorCode: Self = this.set("ErrorCode", js.undefined)
    @scala.inline
    def setErrorMessage(value: ErrorMessage): Self = this.set("ErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteErrorMessage: Self = this.set("ErrorMessage", js.undefined)
    @scala.inline
    def setTargetId(value: TargetId): Self = this.set("TargetId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTargetId: Self = this.set("TargetId", js.undefined)
  }
  
}

