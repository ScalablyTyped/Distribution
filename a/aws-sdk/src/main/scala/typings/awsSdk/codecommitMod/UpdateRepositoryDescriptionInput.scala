package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepositoryDescriptionInput extends StObject {
  
  /**
    * The new comment or description for the specified repository. Repository descriptions are limited to 1,000 characters.
    */
  var repositoryDescription: js.UndefOr[RepositoryDescription] = js.native
  
  /**
    * The name of the repository to set or change the comment or description for.
    */
  var repositoryName: RepositoryName = js.native
}
object UpdateRepositoryDescriptionInput {
  
  @scala.inline
  def apply(repositoryName: RepositoryName): UpdateRepositoryDescriptionInput = {
    val __obj = js.Dynamic.literal(repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryDescriptionInput]
  }
  
  @scala.inline
  implicit class UpdateRepositoryDescriptionInputMutableBuilder[Self <: UpdateRepositoryDescriptionInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setRepositoryDescription(value: RepositoryDescription): Self = StObject.set(x, "repositoryDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRepositoryDescriptionUndefined: Self = StObject.set(x, "repositoryDescription", js.undefined)
    
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = StObject.set(x, "repositoryName", value.asInstanceOf[js.Any])
  }
}
