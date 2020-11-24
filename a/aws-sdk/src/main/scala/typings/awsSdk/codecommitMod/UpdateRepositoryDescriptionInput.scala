package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepositoryDescriptionInput extends js.Object {
  
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
  implicit class UpdateRepositoryDescriptionInputOps[Self <: UpdateRepositoryDescriptionInput] (val x: Self) extends AnyVal {
    
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
  }
}
