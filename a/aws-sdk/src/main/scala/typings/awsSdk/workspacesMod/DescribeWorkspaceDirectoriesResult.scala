package typings.awsSdk.workspacesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeWorkspaceDirectoriesResult extends StObject {
  
  /**
    * Information about the directories.
    */
  var Directories: js.UndefOr[DirectoryList] = js.undefined
  
  /**
    * The token to use to retrieve the next set of results, or null if no more results are available.
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceDirectoriesResult {
  
  @scala.inline
  def apply(): DescribeWorkspaceDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
  }
  
  @scala.inline
  implicit class DescribeWorkspaceDirectoriesResultMutableBuilder[Self <: DescribeWorkspaceDirectoriesResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: DirectoryList): Self = StObject.set(x, "Directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesUndefined: Self = StObject.set(x, "Directories", js.undefined)
    
    @scala.inline
    def setDirectoriesVarargs(value: WorkspaceDirectory*): Self = StObject.set(x, "Directories", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
