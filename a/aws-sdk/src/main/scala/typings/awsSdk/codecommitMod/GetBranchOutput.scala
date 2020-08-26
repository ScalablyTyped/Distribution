package typings.awsSdk.codecommitMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait GetBranchOutput extends js.Object {
  /**
    * The name of the branch.
    */
  var branch: js.UndefOr[BranchInfo] = js.native
}

object GetBranchOutput {
  @scala.inline
  def apply(): GetBranchOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetBranchOutput]
  }
  @scala.inline
  implicit class GetBranchOutputOps[Self <: GetBranchOutput] (val x: Self) extends AnyVal {
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
    def setBranch(value: BranchInfo): Self = this.set("branch", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranch: Self = this.set("branch", js.undefined)
  }
  
}

