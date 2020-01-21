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
  def apply(Branches: ListOfRandomSplitEntry = null): RandomSplitActivity = {
    val __obj = js.Dynamic.literal()
    if (Branches != null) __obj.updateDynamic("Branches")(Branches.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomSplitActivity]
  }
}

