package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateRepositoryInput extends js.Object {
  
  /**
    * A comment or description about the new repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  
  /**
    * The name of the new repository to be created.  The repository name must be unique across the calling AWS account. Repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. For more information about the limits on repository names, see Limits in the AWS CodeCommit User Guide. The suffix .git is prohibited. 
    */
  var repositoryName: RepositoryName = js.native
  
  /**
    * One or more tag key-value pairs to use when tagging this repository.
    */
  var tags: js.UndefOr[TagsMap] = js.native
}
object CreateRepositoryInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): CreateRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryInput]
  }
  
  @scala.inline
  implicit class CreateRepositoryInputOps[Self <: CreateRepositoryInput] (val x: Self) extends AnyVal {
    
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryDescription(value: RepositoryDescription): Self = this.set("repositoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRepositoryDescription: Self = this.set("repositoryDescription", js.undefined)
    
    @scala.inline
    def setTags(value: TagsMap): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
