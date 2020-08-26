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
  @scala.inline
  implicit class DeleteBranchInputOps[Self <: DeleteBranchInput] (val x: Self) extends AnyVal {
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
    def setRepositoryName(value: RepositoryName): Self = this.set("repositoryName", value.asInstanceOf[js.Any])
  }
  
}

