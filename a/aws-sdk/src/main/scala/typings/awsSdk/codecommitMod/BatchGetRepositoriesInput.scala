package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetRepositoriesInput extends StObject {
  
  /**
    * The names of the repositories to get information about.  The length constraint limit is for each string in the array. The array itself can be empty. 
    */
  var repositoryNames: RepositoryNameList = js.native
}
object BatchGetRepositoriesInput {
  
  @scala.inline
  def apply(repositoryNames: RepositoryNameList): BatchGetRepositoriesInput = {
    val __obj = js.Dynamic.literal(repositoryNames = repositoryNames.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesInput]
  }
  
  @scala.inline
  implicit class BatchGetRepositoriesInputMutableBuilder[Self <: BatchGetRepositoriesInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryNames(value: RepositoryNameList): Self = StObject.set(x, "repositoryNames", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryNamesVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoryNames", js.Array(value :_*))
  }
}
