package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateRepositoryInput extends StObject {
  
  /**
    * A comment or description about the new repository.  The description field for a repository accepts all HTML characters and all valid Unicode characters. Applications that do not HTML-encode the description and display it in a webpage can expose users to potentially malicious code. Make sure that you HTML-encode the description field in any application that uses this API to display the repository description on a webpage. 
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.undefined
  
  /**
    * The name of the new repository to be created.  The repository name must be unique across the calling AWS account. Repository names are limited to 100 alphanumeric, dash, and underscore characters, and cannot include certain characters. For more information about the limits on repository names, see Limits in the AWS CodeCommit User Guide. The suffix .git is prohibited. 
    */
  var repositoryName: RepositoryName
  
  /**
    * One or more tag key-value pairs to use when tagging this repository.
    */
  var tags: js.UndefOr[TagsMap] = js.undefined
}
object CreateRepositoryInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): CreateRepositoryInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryInput]
  }
  
  @scala.inline
  implicit class CreateRepositoryInputMutableBuilder[Self <: CreateRepositoryInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryDescription(value: RepositoryDescription): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTags(value: TagsMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
  }
}
