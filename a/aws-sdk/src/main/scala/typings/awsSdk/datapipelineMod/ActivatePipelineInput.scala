package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActivatePipelineInput extends js.Object {
  /**
    * A list of parameter values to pass to the pipeline at activation.
    */
  var parameterValues: js.UndefOr[ParameterValueList] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
  /**
    * The date and time to resume the pipeline. By default, the pipeline resumes from the last completed execution.
    */
  var startTimestamp: js.UndefOr[timestamp] = js.native
}

object ActivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id): ActivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActivatePipelineInput]
  }
  @scala.inline
  implicit class ActivatePipelineInputOps[Self <: ActivatePipelineInput] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPipelineId(value: id): Self = this.set("pipelineId", value.asInstanceOf[js.Any])
    @scala.inline
    def setParameterValuesVarargs(value: ParameterValue*): Self = this.set("parameterValues", js.Array(value :_*))
    @scala.inline
    def setParameterValues(value: ParameterValueList): Self = this.set("parameterValues", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteParameterValues: Self = this.set("parameterValues", js.undefined)
    @scala.inline
    def setStartTimestamp(value: timestamp): Self = this.set("startTimestamp", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartTimestamp: Self = this.set("startTimestamp", js.undefined)
  }
  
}

