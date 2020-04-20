package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateDefaultBranchInput extends js.Object {
  /**
    * The name of the branch to set as the default.
    */
  var defaultBranchName: BranchName = js.native
  /**
    * The name of the repository to set or change the default branch for.
    */
  var repositoryName: RepositoryName = js.native
}

object UpdateDefaultBranchInput {
  @scala.inline
  def apply(defaultBranchName: BranchName, repositoryName: RepositoryName): UpdateDefaultBranchInput = {
    val __obj = js.Dynamic.literal(defaultBranchName = defaultBranchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateDefaultBranchInput]
  }
}

