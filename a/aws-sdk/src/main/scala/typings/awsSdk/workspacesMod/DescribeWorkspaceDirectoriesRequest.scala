package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceDirectoriesRequest extends StObject {
  
  /**
    * The identifiers of the directories. If the value is null, all directories are retrieved.
    */
  var DirectoryIds: js.UndefOr[DirectoryIdList] = js.undefined
  
  /**
    * The maximum number of directories to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.workspacesMod.Limit] = js.undefined
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceDirectoriesRequest {
  
  inline def apply(): DescribeWorkspaceDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
  }
  
  extension [Self <: DescribeWorkspaceDirectoriesRequest](x: Self) {
    
    inline def setDirectoryIds(value: DirectoryIdList): Self = StObject.set(x, "DirectoryIds", value.asInstanceOf[js.Any])
    
    inline def setDirectoryIdsUndefined: Self = StObject.set(x, "DirectoryIds", js.undefined)
    
    inline def setDirectoryIdsVarargs(value: DirectoryId*): Self = StObject.set(x, "DirectoryIds", js.Array(value*))
    
    inline def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    inline def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
