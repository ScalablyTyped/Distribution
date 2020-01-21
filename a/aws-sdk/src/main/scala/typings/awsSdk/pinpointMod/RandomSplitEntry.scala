package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RandomSplitEntry extends js.Object {
  /**
    * The unique identifier for the next activity to perform, after completing the activity for the path.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The percentage of participants to send down the activity path. To determine which participants are sent down each path, Amazon Pinpoint applies a probability-based algorithm to the percentages that you specify for the paths. Therefore, the actual percentage of participants who are sent down a path may not be equal to the percentage that you specify.
    */
  var Percentage: js.UndefOr[integer] = js.native
}

object RandomSplitEntry {
  @scala.inline
  def apply(NextActivity: string = null, Percentage: Int | Double = null): RandomSplitEntry = {
    val __obj = js.Dynamic.literal()
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    if (Percentage != null) __obj.updateDynamic("Percentage")(Percentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[RandomSplitEntry]
  }
}

