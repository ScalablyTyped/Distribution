package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspacesConnectionStatusRequest extends StObject {
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * The identifiers of the WorkSpaces. You can specify up to 25 WorkSpaces.
    */
  var WorkspaceIds: js.UndefOr[WorkspaceIdList] = js.undefined
}
object DescribeWorkspacesConnectionStatusRequest {
  
  inline def apply(): DescribeWorkspacesConnectionStatusRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeWorkspacesConnectionStatusRequest] (val x: Self) extends AnyVal {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkspaceIds(value: WorkspaceIdList): Self = StObject.set(x, "WorkspaceIds", value.asInstanceOf[js.Any])
    
    inline def setWorkspaceIdsUndefined: Self = StObject.set(x, "WorkspaceIds", js.undefined)
    
    inline def setWorkspaceIdsVarargs(value: WorkspaceId*): Self = StObject.set(x, "WorkspaceIds", js.Array(value*))
  }
}
