package typings.awsSdk.pinpointMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HoldoutActivity extends js.Object {
  /**
    * The unique identifier for the next activity to perform, after performing the holdout activity.
    */
  var NextActivity: js.UndefOr[string] = js.native
  /**
    * The percentage of participants who shouldn't continue the journey. To determine which participants are held out, Amazon Pinpoint applies a probability-based algorithm to the percentage that you specify. Therefore, the actual percentage of participants who are held out may not be equal to the percentage that you specify.
    */
  var Percentage: integer = js.native
}

object HoldoutActivity {
  @scala.inline
  def apply(Percentage: integer, NextActivity: string = null): HoldoutActivity = {
    val __obj = js.Dynamic.literal(Percentage = Percentage.asInstanceOf[js.Any])
    if (NextActivity != null) __obj.updateDynamic("NextActivity")(NextActivity.asInstanceOf[js.Any])
    __obj.asInstanceOf[HoldoutActivity]
  }
}

