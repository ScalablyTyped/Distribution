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
  def apply(pipelineId: id, cancelActive: js.UndefOr[cancelActive] = js.undefined): DeactivatePipelineInput = {
    val __obj = js.Dynamic.literal(pipelineId = pipelineId.asInstanceOf[js.Any])
    if (!js.isUndefined(cancelActive)) __obj.updateDynamic("cancelActive")(cancelActive.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeactivatePipelineInput]
  }
}

