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
    * The token to use to retrieve the next page of results. This value is null when there are no more results to return. 
    */
  var NextToken: js.UndefOr[PaginationToken] = js.undefined
}
object DescribeWorkspaceDirectoriesResult {
  
  inline def apply(): DescribeWorkspaceDirectoriesResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeWorkspaceDirectoriesResult]
  }
  
  extension [Self <: DescribeWorkspaceDirectoriesResult](x: Self) {
    
    inline def setDirectories(value: DirectoryList): Self = StObject.set(x, "Directories", value.asInstanceOf[js.Any])
    
    inline def setDirectoriesUndefined: Self = StObject.set(x, "Directories", js.undefined)
    
    inline def setDirectoriesVarargs(value: WorkspaceDirectory*): Self = StObject.set(x, "Directories", js.Array(value*))
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
