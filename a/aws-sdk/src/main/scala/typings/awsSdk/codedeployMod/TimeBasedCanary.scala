package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedCanary extends js.Object {
  /**
    * The number of minutes between the first and second traffic shifts of a TimeBasedCanary deployment.
    */
  var canaryInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic to shift in the first increment of a TimeBasedCanary deployment.
    */
  var canaryPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedCanary {
  @scala.inline
  def apply(
    canaryInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
    canaryPercentage: js.UndefOr[Percentage] = js.undefined
  ): TimeBasedCanary = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(canaryInterval)) __obj.updateDynamic("canaryInterval")(canaryInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(canaryPercentage)) __obj.updateDynamic("canaryPercentage")(canaryPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedCanary]
  }
}

