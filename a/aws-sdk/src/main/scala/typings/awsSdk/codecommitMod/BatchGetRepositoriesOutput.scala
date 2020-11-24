package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchGetRepositoriesOutput extends js.Object {
  
  /**
    * A list of repositories returned by the batch get repositories operation.
    */
  var repositories: js.UndefOr[RepositoryMetadataList] = js.native
  
  /**
    * Returns a list of repository names for which information could not be found.
    */
  var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.native
}
object BatchGetRepositoriesOutput {
  
  @scala.inline
  def apply(): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
  
  @scala.inline
  implicit class BatchGetRepositoriesOutputOps[Self <: BatchGetRepositoriesOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRepositoriesVarargs(value: RepositoryMetadata*): Self = this.set("repositories", js.Array(value :_*))
    
    @scala.inline
    def setRepositories(value: RepositoryMetadataList): Self = this.set("repositories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositories: Self = this.set("repositories", js.undefined)
    
    @scala.inline
    def setRepositoriesNotFoundVarargs(value: RepositoryName*): Self = this.set("repositoriesNotFound", js.Array(value :_*))
    
    @scala.inline
    def setRepositoriesNotFound(value: RepositoryNotFoundList): Self = this.set("repositoriesNotFound", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoriesNotFound: Self = this.set("repositoriesNotFound", js.undefined)
  }
}
