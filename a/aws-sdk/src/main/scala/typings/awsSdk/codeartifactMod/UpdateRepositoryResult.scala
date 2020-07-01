package typings.awsSdk.codeartifactMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateRepositoryResult extends js.Object {
  /**
    *  The updated repository. 
    */
  var repository: js.UndefOr[RepositoryDescription] = js.native
}

object UpdateRepositoryResult {
  @scala.inline
  def apply(repository: RepositoryDescription = null): UpdateRepositoryResult = {
    val __obj = js.Dynamic.literal()
    if (repository != null) __obj.updateDynamic("repository")(repository.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateRepositoryResult]
  }
}

