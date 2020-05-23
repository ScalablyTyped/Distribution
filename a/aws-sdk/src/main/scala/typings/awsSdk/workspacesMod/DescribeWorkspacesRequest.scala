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
  def apply(
    BundleId: BundleId = null,
    DirectoryId: DirectoryId = null,
    Limit: js.UndefOr[Limit] = js.undefined,
    NextToken: PaginationToken = null,
    UserName: UserName = null,
    WorkspaceIds: WorkspaceIdList = null
  ): DescribeWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    if (BundleId != null) __obj.updateDynamic("BundleId")(BundleId.asInstanceOf[js.Any])
    if (DirectoryId != null) __obj.updateDynamic("DirectoryId")(DirectoryId.asInstanceOf[js.Any])
    if (!js.isUndefined(Limit)) __obj.updateDynamic("Limit")(Limit.get.asInstanceOf[js.Any])
    if (NextToken != null) __obj.updateDynamic("NextToken")(NextToken.asInstanceOf[js.Any])
    if (UserName != null) __obj.updateDynamic("UserName")(UserName.asInstanceOf[js.Any])
    if (WorkspaceIds != null) __obj.updateDynamic("WorkspaceIds")(WorkspaceIds.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeWorkspacesRequest]
  }
}

