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
  @scala.inline
  implicit class CreateBranchInputOps[Self <: CreateBranchInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setBranchName(value: BranchName): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommitId(value: CommitId): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
  
}

