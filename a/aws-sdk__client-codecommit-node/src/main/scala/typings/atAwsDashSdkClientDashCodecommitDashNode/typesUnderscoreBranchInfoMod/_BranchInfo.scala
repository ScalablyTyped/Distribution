package typings.atAwsDashSdkClientDashCodecommitDashNode.typesUnderscoreBranchInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait _BranchInfo extends js.Object {
  /**
    * <p>The name of the branch.</p>
    */
  var branchName: js.UndefOr[String] = js.undefined
  /**
    * <p>The ID of the last commit made to the branch.</p>
    */
  var commitId: js.UndefOr[String] = js.undefined
}

object _BranchInfo {
  @scala.inline
  def apply(branchName: String = null, commitId: String = null): _BranchInfo = {
    val __obj = js.Dynamic.literal()
    if (branchName != null) __obj.updateDynamic("branchName")(branchName)
    if (commitId != null) __obj.updateDynamic("commitId")(commitId)
    __obj.asInstanceOf[_BranchInfo]
  }
}

