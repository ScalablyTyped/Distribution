package typings.awsSdk.workspacesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DescribeWorkspacesRequest extends js.Object {
  /**
    * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine this parameter with any other filter.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.native
  /**
    * The identifier of the directory. In addition, you can optionally specify a specific directory user (see UserName). You cannot combine this parameter with any other filter.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryId] = js.native
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.workspacesMod.Limit] = js.native
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
  /**
    * The name of the directory user. You must specify this parameter with DirectoryId.
    */
  var UserName: js.UndefOr[typings.awsSdk.workspacesMod.UserName] = js.native
  /**
    * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter. Because the CreateWorkspaces operation is asynchronous, the identifier it returns is not immediately available. If you immediately call DescribeWorkspaces with this identifier, no information is returned.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.native
}

object DescribeWorkspacesRequest {
  @scala.inline
  def apply(): DescribeWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesRequest]
  }
  @scala.inline
  implicit class DescribeWorkspacesRequestOps[Self <: DescribeWorkspacesRequest] (val x: Self) extends AnyVal {
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
    def setBundleId(value: BundleId): Self = this.set("BundleId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBundleId: Self = this.set("BundleId", js.undefined)
    @scala.inline
    def setDirectoryId(value: DirectoryId): Self = this.set("DirectoryId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDirectoryId: Self = this.set("DirectoryId", js.undefined)
    @scala.inline
    def setLimit(value: Limit): Self = this.set("Limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("Limit", js.undefined)
    @scala.inline
    def setNextToken(value: PaginationToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    @scala.inline
    def setUserName(value: UserName): Self = this.set("UserName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUserName: Self = this.set("UserName", js.undefined)
    @scala.inline
    def setWorkspaceIdsVarargs(value: WorkspaceId*): Self = this.set("WorkspaceIds", js.Array(value :_*))
    @scala.inline
    def setWorkspaceIds(value: WorkspaceIdList): Self = this.set("WorkspaceIds", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWorkspaceIds: Self = this.set("WorkspaceIds", js.undefined)
  }
  
}

