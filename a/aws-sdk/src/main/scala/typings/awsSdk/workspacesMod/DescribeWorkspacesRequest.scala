package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspacesRequest extends StObject {
  
  /**
    * The identifier of the bundle. All WorkSpaces that are created from this bundle are retrieved. You cannot combine this parameter with any other filter.
    */
  var BundleId: js.UndefOr[typings.awsSdk.workspacesMod.BundleId] = js.undefined
  
  /**
    * The identifier of the directory. In addition, you can optionally specify a specific directory user (see UserName). You cannot combine this parameter with any other filter.
    */
  var DirectoryId: js.UndefOr[typings.awsSdk.workspacesMod.DirectoryId] = js.undefined
  
  /**
    * The maximum number of items to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.workspacesMod.Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The name of the directory user. You must specify this parameter with DirectoryId.
    */
  var UserName: js.UndefOr[typings.awsSdk.workspacesMod.UserName] = js.undefined
  
  /**
    * The identifiers of the WorkSpaces. You cannot combine this parameter with any other filter. Because the CreateWorkspaces operation is asynchronous, the identifier it returns is not immediately available. If you immediately call DescribeWorkspaces with this identifier, no information is returned.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
}
object DescribeWorkspacesRequest {
  
  inline def apply(): DescribeWorkspacesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesRequest]
  }
  
  extension [Self <: DescribeWorkspacesRequest](x: Self) {
    
    inline def setBundleId(value: BundleId): Self = StObject.set(x, "BundleId", value.asInstanceOf[js.Any])
    
    inline def setBundleIdUndefined: Self = StObject.set(x, "BundleId", js.undefined)
    
    inline def setDirectoryId(value: DirectoryId): Self = StObject.set(x, "DirectoryId", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdUndefined: Self = StObject.set(x, "DirectoryId", js.undefined)
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setUserName(value: UserName): Self = StObject.set(x, "UserName", value.asInstanceOf[js.Any])
    
    inline def setUserNameUndefined: Self = StObject.set(x, "UserName", js.undefined)
    
    inline def setWorkspaceIds(value: WorkspaceIdList): Self = StObject.set(x, "WorkspaceIds", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdsUndefined: Self = StObject.set(x, "WorkspaceIds", js.undefined)
    
    inline def setWorkspaceIdsVarargs(value: WorkspaceId*): Self = StObject.set(x, "WorkspaceIds", js.Array(value :_*))
  }
}
