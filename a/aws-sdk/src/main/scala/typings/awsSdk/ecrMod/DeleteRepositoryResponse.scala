package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryResponse extends js.Object {
  /**
    * The repository that was deleted.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object DeleteRepositoryResponse {
  @scala.inline
  def apply(repository: Repository = null): DeleteRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryResponse]
  }
}

