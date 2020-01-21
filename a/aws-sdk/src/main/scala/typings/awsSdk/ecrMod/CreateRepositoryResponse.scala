package typings.awsSdk.ecrMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateRepositoryResponse extends js.Object {
  /**
    * The repository that was created.
    */
  var repository: js.UndefOr[Repository] = js.native
}

object CreateRepositoryResponse {
  @scala.inline
  def apply(repository: Repository = null): CreateRepositoryResponse = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateRepositoryResponse]
  }
}

