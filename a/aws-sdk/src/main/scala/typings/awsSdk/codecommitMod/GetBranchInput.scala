package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchInput extends js.Object {
  /**
    * The name of the branch for which you want to retrieve information.
    */
  var branchName: js.UndefOr[BranchName] = js.native
  /**
    * The name of the repository that contains the branch for which you want to retrieve information.
    */
  var repositoryName: js.UndefOr[RepositoryName] = js.native
}

object GetBranchInput {
  @scala.inline
  def apply(branchName: BranchName = null, repositoryName: RepositoryName = null): GetBranchInput = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (repositoryName != null) __obj.updateDynamic("repositoryName")(repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetBranchInput]
  }
}

