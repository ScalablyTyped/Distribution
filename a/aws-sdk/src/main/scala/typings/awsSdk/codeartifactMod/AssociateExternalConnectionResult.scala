package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AssociateExternalConnectionResult extends js.Object {
  /**
    *  Information about the connected repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object AssociateExternalConnectionResult {
  @scala.inline
  def apply(repository: RepositoryDescription = null): AssociateExternalConnectionResult = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateExternalConnectionResult]
  }
}

