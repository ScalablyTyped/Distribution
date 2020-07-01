package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DisassociateExternalConnectionResult extends js.Object {
  /**
    *  The repository associated with the removed external connection. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object DisassociateExternalConnectionResult {
  @scala.inline
  def apply(repository: RepositoryDescription = null): DisassociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateExternalConnectionResult]
  }
}

