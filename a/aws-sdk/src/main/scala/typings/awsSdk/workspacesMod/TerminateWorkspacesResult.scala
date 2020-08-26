package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TerminateWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be terminated.
    */
  var FailedRequests: js.UndefOr[FailedTerminateWorkspaceRequests] = js.native
}

object TerminateWorkspacesResult {
  @scala.inline
  def apply(): TerminateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TerminateWorkspacesResult]
  }
  @scala.inline
  implicit class TerminateWorkspacesResultOps[Self <: TerminateWorkspacesResult] (val x: Self) extends AnyVal {
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
    def setFailedRequestsVarargs(value: FailedWorkspaceChangeRequest*): Self = this.set("FailedRequests", js.Array(value :_*))
    @scala.inline
    def setFailedRequests(value: FailedTerminateWorkspaceRequests): Self = this.set("FailedRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedRequests: Self = this.set("FailedRequests", js.undefined)
  }
  
}

