package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AwsJobRateIncreaseCriteria extends js.Object {
  /**
    * When this number of things have been notified, it will initiate an increase in the rollout rate.
    */
  var numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
  /**
    * When this number of things have succeeded in their job execution, it will initiate an increase in the rollout rate.
    */
  var numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.native
}

object AwsJobRateIncreaseCriteria {
  @scala.inline
  def apply(
    numberOfNotifiedThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined,
    numberOfSucceededThings: js.UndefOr[AwsJobRateIncreaseCriteriaNumberOfThings] = js.undefined
  ): AwsJobRateIncreaseCriteria = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(numberOfNotifiedThings)) __obj.updateDynamic("numberOfNotifiedThings")(numberOfNotifiedThings.get.asInstanceOf[js.Any])
    if (!js.isUndefined(numberOfSucceededThings)) __obj.updateDynamic("numberOfSucceededThings")(numberOfSucceededThings.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[AwsJobRateIncreaseCriteria]
  }
}

