package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RebuildWorkspacesResult extends js.Object {
  
  /**
    * Information about the WorkSpace that could not be rebuilt.
    */
  var FailedRequests: js.UndefOr[FailedRebuildWorkspaceRequests] = js.native
}
object RebuildWorkspacesResult {
  
  @scala.inline
  def apply(): RebuildWorkspacesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RebuildWorkspacesResult]
  }
  
  @scala.inline
  implicit class RebuildWorkspacesResultOps[Self <: RebuildWorkspacesResult] (val x: Self) extends AnyVal {
    
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
    def setFailedRequests(value: FailedRebuildWorkspaceRequests): Self = this.set("FailedRequests", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailedRequests: Self = this.set("FailedRequests", js.undefined)
  }
}
