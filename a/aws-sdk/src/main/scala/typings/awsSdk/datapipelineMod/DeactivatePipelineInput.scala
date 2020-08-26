package typings.awsSdk.datapipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DeactivatePipelineInput extends js.Object {
  /**
    * Indicates whether to cancel any running objects. The default is true, which sets the state of any running objects to CANCELED. If this value is false, the pipeline is deactivated after all running objects finish.
    */
  var cancelActive: js.UndefOr[typings.awsSdk.datapipelineMod.cancelActive] = js.native
  /**
    * The ID of the pipeline.
    */
  var pipelineId: id = js.native
}

object DeactivatePipelineInput {
  @scala.inline
  def apply(pipelineId: id): DeactivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivatePipelineInput]
  }
  @scala.inline
  implicit class DeactivatePipelineInputOps[Self <: DeactivatePipelineInput] (val x: Self) extends AnyVal {
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
    def setCancelActive(value: cancelActive): Self = this.set("cancelActive", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCancelActive: Self = this.set("cancelActive", js.undefined)
  }
  
}

