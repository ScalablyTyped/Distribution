package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Schedule extends js.Object {
  /**
    *  The condition configures when the pipeline should trigger a new image build. When the pipelineExecutionStartCondition is set to EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE, EC2 Image Builder will build a new image only when there are known changes pending. When it is set to EXPRESSION_MATCH_ONLY, it will build a new image every time the CRON expression matches the current time.
    */
  var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.native
  /**
    *  The expression determines how often EC2 Image Builder evaluates your pipelineExecutionStartCondition.
    */
  var scheduleExpression: js.UndefOr[NonEmptyString] = js.native
}

object Schedule {
  @scala.inline
  def apply(
    pipelineExecutionStartCondition: PipelineExecutionStartCondition = null,
    scheduleExpression: NonEmptyString = null
  ): Schedule = {
    val __obj = js.Dynamic.literal()
    if (pipelineExecutionStartCondition != null) __obj.updateDynamic("pipelineExecutionStartCondition")(pipelineExecutionStartCondition.asInstanceOf[js.Any])
    if (scheduleExpression != null) __obj.updateDynamic("scheduleExpression")(scheduleExpression.asInstanceOf[js.Any])
    __obj.asInstanceOf[Schedule]
  }
}

