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
  def apply(linearInterval: Int | Double = null, linearPercentage: Int | Double = null): TimeBasedLinear = {
    val __obj = js.Dynamic.literal()
    if (linearInterval != null) __obj.updateDynamic("linearInterval")(linearInterval.asInstanceOf[js.Any])
    if (linearPercentage != null) __obj.updateDynamic("linearPercentage")(linearPercentage.asInstanceOf[js.Any])
    __obj.asInstanceOf[TimeBasedLinear]
  }
}

