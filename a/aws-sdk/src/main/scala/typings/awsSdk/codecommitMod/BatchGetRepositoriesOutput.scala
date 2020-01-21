package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchGetRepositoriesOutput extends js.Object {
  /**
    * A list of repositories returned by the batch get repositories operation.
    */
  var repositories: js.UndefOr[RepositoryMetadataList] = js.native
  /**
    * Returns a list of repository names for which information could not be found.
    */
  var repositoriesNotFound: js.UndefOr[RepositoryNotFoundList] = js.native
}

object BatchGetRepositoriesOutput {
  @scala.inline
  def apply(repositories: RepositoryMetadataList = null, repositoriesNotFound: RepositoryNotFoundList = null): BatchGetRepositoriesOutput = {
    val __obj = js.Dynamic.literal()
    if (repositories != null) __obj.updateDynamic("repositories")(repositories.asInstanceOf[js.Any])
    if (repositoriesNotFound != null) __obj.updateDynamic("repositoriesNotFound")(repositoriesNotFound.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchGetRepositoriesOutput]
  }
}

