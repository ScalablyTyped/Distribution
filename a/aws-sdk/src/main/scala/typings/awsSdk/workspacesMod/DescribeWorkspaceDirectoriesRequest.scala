package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeWorkspaceDirectoriesRequest extends StObject {
  
  /**
    * The identifiers of the directories. If the value is null, all directories are retrieved.
    */
  var DirectoryIds: js.UndefOr[DirectoryIdList] = js.native
  
  /**
    * The maximum number of directories to return.
    */
  var Limit: js.UndefOr[typings.awsSdk.workspacesMod.Limit] = js.native
  
  /**
    * If you received a NextToken from a previous call that was paginated, provide this token to receive the next set of results.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.native
}
object DescribeWorkspaceDirectoriesRequest {
  
  @scala.inline
  def apply(): DescribeWorkspaceDirectoriesRequest = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesRequest]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceDirectoriesRequestMutableBuilder[Self <: DescribeWorkspaceDirectoriesRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectoryIds(value: DirectoryIdList): Self = StObject.set(x, "DirectoryIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoryIdsUndefined: Self = StObject.set(x, "DirectoryIds", js.undefined)
    
    @scala.inline
    def setDirectoryIdsVarargs(value: DirectoryId*): Self = StObject.set(x, "DirectoryIds", js.Array(value :_*))
    
    @scala.inline
    def setLimit(value: Limit): Self = StObject.set(x, "Limit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLimitUndefined: Self = StObject.set(x, "Limit", js.undefined)
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
