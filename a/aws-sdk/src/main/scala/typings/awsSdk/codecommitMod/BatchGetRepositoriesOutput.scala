package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchGetRepositoriesOutput extends StObject {
  
  /**
    * A list of repositories returned by the batch get repositories operation.
    */
  var repositories: js.UndefOr[RepositoryMetadataList] = js.undefined
  
  /**
    * Returns a list of repository names for which information could not be found.
    */
  var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.undefined
}
object BatchGetRepositoriesOutput {
  
  @scala.inline
  def apply(): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  
  @scala.inline
  implicit class BatchGetRepositoriesOutputMutableBuilder[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositories(value: RepositoryMetadataList): Self = StObject.set(x, "repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesNotFound(value: RepositoryNotFoundList): Self = StObject.set(x, "repositoriesNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoriesNotFoundUndefined: Self = StObject.set(x, "repositoriesNotFound", js.undefined)
    
    @scala.inline
    def setRepositoriesNotFoundVarargs(value: RepositoryName*): Self = StObject.set(x, "repositoriesNotFound", js.Array(value :_*))
    
    @scala.inline
    def setRepositoriesUndefined: Self = StObject.set(x, "repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesVarargs(value: RepositoryMetadata*): Self = StObject.set(x, "repositories", js.Array(value :_*))
  }
}
