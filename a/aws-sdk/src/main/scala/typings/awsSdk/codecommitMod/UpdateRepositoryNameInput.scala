package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
}

