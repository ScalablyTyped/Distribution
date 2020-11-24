package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepositoryNameInput extends js.Object {
  
  /**
    * The new name for the repository.
    */
  var newName: RepositoryName = js.native
  
  /**
    * The current name of the repository.
    */
  var oldName: RepositoryName = js.native
}
object UpdateRepositoryNameInput {
  
  @scala.inline
  def apply(newName: RepositoryName, oldName: RepositoryName): UpdateRepositoryNameInput = {
    val __obj = js.Dynamic.literal(newName = newName.asInstanceOf[js.Any], oldName = oldName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryNameInput]
  }
  
  @scala.inline
  implicit class UpdateRepositoryNameInputOps[Self <: UpdateRepositoryNameInput] (val x: Self) extends AnyVal {
    
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
    def setNewName(value: RepositoryName): Self = this.set("newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldName(value: RepositoryName): Self = this.set("oldName", value.asInstanceOf[js.Any])
  }
}
