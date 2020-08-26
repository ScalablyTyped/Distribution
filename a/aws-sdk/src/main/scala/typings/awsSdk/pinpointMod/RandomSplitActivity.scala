package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSplitActivity extends js.Object {
  /**
    * The paths for the activity, including the percentage of participants to enter each path and the activity to perform for each path.
    */
  var Branches: js.UndefOr[ListOfRandomSplitEntry] = js.native
}

object RandomSplitActivity {
  @scala.inline
  def apply(): RandomSplitActivity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RandomSplitActivity]
  }
  @scala.inline
  implicit class RandomSplitActivityOps[Self <: RandomSplitActivity] (val x: Self) extends AnyVal {
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
    def setBranchesVarargs(value: RandomSplitEntry*): Self = this.set("Branches", js.Array(value :_*))
    @scala.inline
    def setBranches(value: ListOfRandomSplitEntry): Self = this.set("Branches", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBranches: Self = this.set("Branches", js.undefined)
  }
  
}

