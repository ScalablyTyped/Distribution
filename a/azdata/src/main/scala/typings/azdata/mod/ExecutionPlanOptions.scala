package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExecutionPlanOptions extends js.Object {
  var displayActualQueryPlan: js.UndefOr[Boolean] = js.undefined
  var displayEstimatedQueryPlan: js.UndefOr[Boolean] = js.undefined
}

object ExecutionPlanOptions {
  @scala.inline
  def apply(
    displayActualQueryPlan: js.UndefOr[Boolean] = js.undefined,
    displayEstimatedQueryPlan: js.UndefOr[Boolean] = js.undefined
  ): ExecutionPlanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(displayActualQueryPlan)) __obj.updateDynamic("displayActualQueryPlan")(displayActualQueryPlan.get.asInstanceOf[js.Any])
    if (!js.isUndefined(displayEstimatedQueryPlan)) __obj.updateDynamic("displayEstimatedQueryPlan")(displayEstimatedQueryPlan.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionPlanOptions]
  }
}

