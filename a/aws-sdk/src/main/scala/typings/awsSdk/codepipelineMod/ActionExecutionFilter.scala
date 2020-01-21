package typings.awsSdk.codepipelineMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ActionExecutionFilter extends js.Object {
  /**
    * The pipeline execution ID used to filter action execution history.
    */
  var pipelineExecutionId: js.UndefOr[PipelineExecutionId] = js.native
}

object ActionExecutionFilter {
  @scala.inline
  def apply(pipelineExecutionId: PipelineExecutionId = null): ActionExecutionFilter = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionId != null) __obj.updateDynamic("pipelineExecutionId")(pipelineExecutionId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ActionExecutionFilter]
  }
}

