package typings.awsSdk.codedeployMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TimeBasedLinear extends js.Object {
  /**
    * The number of minutes between each incremental traffic shift of a TimeBasedLinear deployment.
    */
  var linearInterval: js.UndefOr[WaitTimeInMins] = js.native
  /**
    * The percentage of traffic that is shifted at the start of each increment of a TimeBasedLinear deployment.
    */
  var linearPercentage: js.UndefOr[Percentage] = js.native
}

object TimeBasedLinear {
  @scala.inline
  def apply(
    linearInterval: js.UndefOr[WaitTimeInMins] = js.undefined,
    linearPercentage: js.UndefOr[Percentage] = js.undefined
  ): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(linearInterval)) __obj.updateDynamic("linearInterval")(linearInterval.get.asInstanceOf[js.Any])
    if (!js.isUndefined(linearPercentage)) __obj.updateDynamic("linearPercentage")(linearPercentage.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedLinear]
  }
}

