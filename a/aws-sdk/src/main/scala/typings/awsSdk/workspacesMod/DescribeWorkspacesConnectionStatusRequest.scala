package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspacesConnectionStatusRequest extends js.Object {
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  
  /**
    * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.native
}
object DescribeWorkspacesConnectionStatusRequest {
  
  @scala.inline
  def apply(): DescribeWorkspacesConnectionStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkspacesConnectionStatusRequestOps[Self <: DescribeWorkspacesConnectionStatusRequest] (val x: Self) extends AnyVal {
    
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
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setWorkspaceIdsVarargs(value: WorkspaceId*): Self = this.set("WorkspaceIds", js.Array(value :_*))
    
    @scala.inline
    def setWorkspaceIds(value: WorkspaceIdList): Self = this.set("WorkspaceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWorkspaceIds: Self = this.set("WorkspaceIds", js.undefined)
  }
}
