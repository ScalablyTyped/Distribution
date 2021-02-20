package typings.awsSdk.codecommitMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateRepositoryNameInput extends StObject {
  
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
  implicit class UpdateRepositoryNameInputMutableBuilder[Self <: UpdateRepositoryNameInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNewName(value: RepositoryName): Self = StObject.set(x, "newName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOldName(value: RepositoryName): Self = StObject.set(x, "oldName", value.asInstanceOf[js.Any])
  }
}
