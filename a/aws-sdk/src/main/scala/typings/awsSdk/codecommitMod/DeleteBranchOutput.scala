package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeleteBranchOutput extends js.Object {
  /**
    * Information about the branch deleted by the operation, including the branch name and the commit ID that was the tip of the branch.
    */
  var deletedBranch: js.UndefOr[BranchInfo] = js.native
}

object DeleteBranchOutput {
  @scala.inline
  def apply(): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeleteBranchOutput]
  }
  @scala.inline
  implicit class DeleteBranchOutputOps[Self <: DeleteBranchOutput] (val x: Self) extends AnyVal {
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
    def setDeletedBranch(value: BranchInfo): Self = this.set("deletedBranch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDeletedBranch: Self = this.set("deletedBranch", js.undefined)
  }
  
}

