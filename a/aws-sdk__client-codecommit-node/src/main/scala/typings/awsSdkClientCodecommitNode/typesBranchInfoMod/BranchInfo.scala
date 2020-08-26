package typings.awsSdkClientCodecommitNode.typesBranchInfoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BranchInfo extends js.Object {
  /**
    * <p>The name of the branch.</p>
    */
  var branchName: js.UndefOr[String] = js.native
  /**
    * <p>The ID of the last commit made to the branch.</p>
    */
  var commitId: js.UndefOr[String] = js.native
}

object BranchInfo {
  @scala.inline
  def apply(): BranchInfo = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BranchInfo]
  }
  @scala.inline
  implicit class BranchInfoOps[Self <: BranchInfo] (val x: Self) extends AnyVal {
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
    def setBranchName(value: String): Self = this.set("branchName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranchName: Self = this.set("branchName", js.undefined)
    @scala.inline
    def setCommitId(value: String): Self = this.set("commitId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommitId: Self = this.set("commitId", js.undefined)
  }
  
}

