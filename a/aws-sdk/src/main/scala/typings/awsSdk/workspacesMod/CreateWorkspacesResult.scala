package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateWorkspacesResult extends js.Object {
  /**
    * Information about the WorkSpaces that could not be created.
    */
  var FailedRequests: js.UndefOr[FailedCreateWorkspaceRequests] = js.native
  /**
    * Information about the WorkSpaces that were created. Because this operation is asynchronous, the identifier returned is not immediately available for use with other operations. For example, if you call DescribeWorkspaces before the WorkSpace is created, the information returned can be incomplete.
    */
  var PendingRequests: js.UndefOr[WorkspaceList] = js.native
}

object CreateWorkspacesResult {
  @scala.inline
  def apply(): CreateWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateWorkspacesResult]
  }
  @scala.inline
  implicit class CreateWorkspacesResultOps[Self <: CreateWorkspacesResult] (val x: Self) extends AnyVal {
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
    def setFailedRequestsVarargs(value: FailedCreateWorkspaceRequest*): Self = this.set("FailedRequests", js.Array(value :_*))
    @scala.inline
    def setFailedRequests(value: FailedCreateWorkspaceRequests): Self = this.set("FailedRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailedRequests: Self = this.set("FailedRequests", js.undefined)
    @scala.inline
    def setPendingRequestsVarargs(value: Workspace*): Self = this.set("PendingRequests", js.Array(value :_*))
    @scala.inline
    def setPendingRequests(value: WorkspaceList): Self = this.set("PendingRequests", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePendingRequests: Self = this.set("PendingRequests", js.undefined)
  }
  
}

