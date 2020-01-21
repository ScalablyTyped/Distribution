package typings.awsSdkClientCodecommitNode.typesBranchInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait BranchInfo extends js.Object {
  /**
    * <p>The name of the branch.</p>
    */
  var branchName: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the last commit made to the branch.</p>
    */
  var commitId: js.UndefOr[String] = js.undefined
}

object BranchInfo {
  @scala.inline
  def apply(branchName: String = null, commitId: String = null): BranchInfo = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName.asInstanceOf[js.Any])
    if (commitId != null) __obj.updateDynamic("commitId")(commitId.asInstanceOf[js.Any])
    __obj.asInstanceOf[BranchInfo]
  }
}

