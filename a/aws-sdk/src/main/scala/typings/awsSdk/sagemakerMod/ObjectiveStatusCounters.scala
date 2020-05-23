package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectiveStatusCounters extends js.Object {
  /**
    * The number of training jobs whose final objective metric was not evaluated and used in the hyperparameter tuning process. This typically occurs when the training job failed or did not emit an objective metric.
    */
  var Failed: js.UndefOr[ObjectiveStatusCounter] = js.native
  /**
    * The number of training jobs that are in progress and pending evaluation of their final objective metric.
    */
  var Pending: js.UndefOr[ObjectiveStatusCounter] = js.native
  /**
    * The number of training jobs whose final objective metric was evaluated by the hyperparameter tuning job and used in the hyperparameter tuning process.
    */
  var Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.native
}

object ObjectiveStatusCounters {
  @scala.inline
  def apply(
    Failed: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
    Pending: js.UndefOr[ObjectiveStatusCounter] = js.undefined,
    Succeeded: js.UndefOr[ObjectiveStatusCounter] = js.undefined
  ): ObjectiveStatusCounters = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(Failed)) __obj.updateDynamic("Failed")(Failed.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Pending)) __obj.updateDynamic("Pending")(Pending.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Succeeded)) __obj.updateDynamic("Succeeded")(Succeeded.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ObjectiveStatusCounters]
  }
}

