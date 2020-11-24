package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait StartWorkspacesResult extends js.Object {
  
  /**
    * Information about the WorkSpaces that could not be started.
    */
  var FailedRequests: js.UndefOr[FailedStartWorkspaceRequests] = js.native
}
object StartWorkspacesResult {
  
  @scala.inline
  def apply(): StartWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StartWorkspacesResult]
  }
  
  @scala.inline
  implicit class StartWorkspacesResultOps[Self <: StartWorkspacesResult] (val x: Self) extends AnyVal {
    
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
    def setFailedRequests(value: FailedStartWorkspaceRequests): Self = this.set("FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedRequests: Self = this.set("FailedRequests", js.undefined)
  }
}
