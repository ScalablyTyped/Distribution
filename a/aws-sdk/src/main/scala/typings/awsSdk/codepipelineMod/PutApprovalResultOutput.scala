package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PutApprovalResultOutput extends js.Object {
  /**
    * The timestamp showing when the approval or rejection was submitted.
    */
  var approvedAt: js.UndefOr[Timestamp] = js.native
}

object PutApprovalResultOutput {
  @scala.inline
  def apply(): PutApprovalResultOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PutApprovalResultOutput]
  }
  @scala.inline
  implicit class PutApprovalResultOutputOps[Self <: PutApprovalResultOutput] (val x: Self) extends AnyVal {
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
    def setApprovedAt(value: Timestamp): Self = this.set("approvedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteApprovedAt: Self = this.set("approvedAt", js.undefined)
  }
  
}

