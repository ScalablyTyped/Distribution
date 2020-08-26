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
  def apply(): LabelingJobStoppingConditions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LabelingJobStoppingConditions]
  }
  @scala.inline
  implicit class LabelingJobStoppingConditionsOps[Self <: LabelingJobStoppingConditions] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setMaxHumanLabeledObjectCount(value: MaxHumanLabeledObjectCount): Self = this.set("MaxHumanLabeledObjectCount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxHumanLabeledObjectCount: Self = this.set("MaxHumanLabeledObjectCount", js.undefined)
    @scala.inline
    def setMaxPercentageOfInputDatasetLabeled(value: MaxPercentageOfInputDatasetLabeled): Self = this.set("MaxPercentageOfInputDatasetLabeled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxPercentageOfInputDatasetLabeled: Self = this.set("MaxPercentageOfInputDatasetLabeled", js.undefined)
  }
  
}

