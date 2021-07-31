package typings.awsSdk.clouddirectoryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDirectoriesResponse extends StObject {
  
  /**
    * Lists all directories that are associated with your account in pagination fashion.
    */
  var Directories: DirectoryList
  
  /**
    * The pagination token.
    */
  var NextToken: js.UndefOr[typings.awsSdk.clouddirectoryMod.NextToken] = js.undefined
}
object ListDirectoriesResponse {
  
  @scala.inline
  def apply(Directories: DirectoryList): ListDirectoriesResponse = {
    val __obj = js.Dynamic.literal(Directories = Directories.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListDirectoriesResponse]
  }
  
  @scala.inline
  implicit class ListDirectoriesResponseMutableBuilder[Self <: ListDirectoriesResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDirectories(value: DirectoryList): Self = StObject.set(x, "Directories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDirectoriesVarargs(value: Directory*): Self = StObject.set(x, "Directories", js.Array(value :_*))
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
