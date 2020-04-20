package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CreateBranchInput extends js.Object {
  /**
    * The name of the new branch to create.
    */
  var branchName: BranchName = js.native
  /**
    * The ID of the commit to point the new branch to.
    */
  var commitId: CommitId = js.native
  /**
    * The name of the repository in which you want to create the new branch.
    */
  var repositoryName: RepositoryName = js.native
}

object CreateBranchInput {
  @scala.inline
  def apply(branchName: BranchName, commitId: CommitId, repositoryName: RepositoryName): CreateBranchInput = {
    val __obj = js.Dynamic.literal(branchName = branchName.asInstanceOf[js.Any], commitId = commitId.asInstanceOf[js.Any], repositoryName = repositoryName.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateBranchInput]
  }
}

