package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RateIncreaseCriteria extends js.Object {
  /**
    * The threshold for number of notified things that will initiate the increase in rate of rollout.
    */
  var numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.native
  /**
    * The threshold for number of succeeded things that will initiate the increase in rate of rollout.
    */
  var numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.native
}

object RateIncreaseCriteria {
  @scala.inline
  def apply(
    numberOfNotifiedThings: js.UndefOr[NumberOfThings] = js.undefined,
    numberOfSucceededThings: js.UndefOr[NumberOfThings] = js.undefined
  ): RateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfNotifiedThings)) __obj.updateDynamic("numberOfNotifiedThings")(numberOfNotifiedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfSucceededThings)) __obj.updateDynamic("numberOfSucceededThings")(numberOfSucceededThings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[RateIncreaseCriteria]
  }
}

