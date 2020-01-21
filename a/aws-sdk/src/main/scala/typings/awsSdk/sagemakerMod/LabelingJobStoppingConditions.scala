package typings.awsSdk.sagemakerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LabelingJobStoppingConditions extends js.Object {
  /**
    * The maximum number of objects that can be labeled by human workers.
    */
  var MaxHumanLabeledObjectCount: js.UndefOr[typings.awsSdk.sagemakerMod.MaxHumanLabeledObjectCount] = js.native
  /**
    * The maximum number of input data objects that should be labeled.
    */
  var MaxPercentageOfInputDatasetLabeled: js.UndefOr[typings.awsSdk.sagemakerMod.MaxPercentageOfInputDatasetLabeled] = js.native
}

object LabelingJobStoppingConditions {
  @scala.inline
  def apply(
    MaxHumanLabeledObjectCount: Int | Double = null,
    MaxPercentageOfInputDatasetLabeled: Int | Double = null
  ): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    if (MaxHumanLabeledObjectCount != null) __obj.updateDynamic("MaxHumanLabeledObjectCount")(MaxHumanLabeledObjectCount.asInstanceOf[js.Any])
    if (MaxPercentageOfInputDatasetLabeled != null) __obj.updateDynamic("MaxPercentageOfInputDatasetLabeled")(MaxPercentageOfInputDatasetLabeled.asInstanceOf[js.Any])
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
}

