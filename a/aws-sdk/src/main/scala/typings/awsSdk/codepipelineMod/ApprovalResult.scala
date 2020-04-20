package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApprovalResult extends js.Object {
  /**
    * The response submitted by a reviewer assigned to an approval action request.
    */
  var status: ApprovalStatus = js.native
  /**
    * The summary of the current status of the approval request.
    */
  var summary: ApprovalSummary = js.native
}

object ApprovalResult {
  @scala.inline
  def apply(status: ApprovalStatus, summary: ApprovalSummary): ApprovalResult = {
    val __obj = js.Dynamic.literal(status = status.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApprovalResult]
  }
}

