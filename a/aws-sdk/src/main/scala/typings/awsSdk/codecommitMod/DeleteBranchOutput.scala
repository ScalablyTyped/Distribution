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
  def apply(deletedBranch: BranchInfo = null): DeleteBranchOutput = {
    val __obj = js.Dynamic.literal()
    if (deletedBranch != null) __obj.updateDynamic("deletedBranch")(deletedBranch.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteBranchOutput]
  }
}

