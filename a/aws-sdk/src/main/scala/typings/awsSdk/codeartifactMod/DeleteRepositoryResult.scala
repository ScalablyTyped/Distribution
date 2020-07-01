package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteRepositoryResult extends js.Object {
  /**
    *  Information about the deleted repository after processing the request. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object DeleteRepositoryResult {
  @scala.inline
  def apply(repository: RepositoryDescription = null): DeleteRepositoryResult = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteRepositoryResult]
  }
}

