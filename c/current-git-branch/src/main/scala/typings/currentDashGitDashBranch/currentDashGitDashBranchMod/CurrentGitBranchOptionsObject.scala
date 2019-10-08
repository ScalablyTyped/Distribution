package typings.currentDashGitDashBranch.currentDashGitDashBranchMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CurrentGitBranchOptionsObject extends js.Object {
  var altPath: js.UndefOr[String] = js.undefined
  var branchOptions: js.UndefOr[String] = js.undefined
}

object CurrentGitBranchOptionsObject {
  @scala.inline
  def apply(altPath: String = null, branchOptions: String = null): CurrentGitBranchOptionsObject = {
    val __obj = js.Dynamic.literal()
    if (altPath != null) __obj.updateDynamic("altPath")(altPath)
    if (branchOptions != null) __obj.updateDynamic("branchOptions")(branchOptions)
    __obj.asInstanceOf[CurrentGitBranchOptionsObject]
  }
}

