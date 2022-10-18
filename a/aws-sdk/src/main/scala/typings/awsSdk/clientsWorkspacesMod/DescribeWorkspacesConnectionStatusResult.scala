package typings.awsSdk.clientsWorkspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspacesConnectionStatusResult extends StObject {
  
  /**
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the connection status of the WorkSpace.
    */
  var WorkspacesConnectionStatus: js.UndefOr[WorkspaceConnectionStatusList] = js.undefined
}
object DescribeWorkspacesConnectionStatusResult {
  
  inline def apply(): DescribeWorkspacesConnectionStatusResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspacesConnectionStatusResult]
  }
  
  extension [Self <: DescribeWorkspacesConnectionStatusResult](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setWorkspacesConnectionStatus(value: WorkspaceConnectionStatusList): Self = StObject.set(x, "WorkspacesConnectionStatus", value.asInstanceOf[js.Any])
    
    inline def setWorkspacesConnectionStatusUndefined: Self = StObject.set(x, "WorkspacesConnectionStatus", js.undefined)
    
    inline def setWorkspacesConnectionStatusVarargs(value: WorkspaceConnectionStatus*): Self = StObject.set(x, "WorkspacesConnectionStatus", js.Array(value*))
  }
}
