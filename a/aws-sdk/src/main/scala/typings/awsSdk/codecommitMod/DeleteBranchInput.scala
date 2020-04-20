package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBranchInput extends js.Object {
  /**
    * The name of the branch to delete.
    */
  var branchName: BranchName = js.native
  /**
    * The name of the repository that contains the branch to be deleted.
    */
  var repositoryName: RepositoryName = js.native
}

object DeleteBranchInput {
  @scala.inline
  def apply(branchName: BranchName, repositoryName: RepositoryName): DeleteBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchInput]
  }
}

