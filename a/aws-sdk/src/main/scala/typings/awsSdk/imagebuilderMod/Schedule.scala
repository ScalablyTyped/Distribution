package typings.awsSdk.imagebuilderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Schedule extends js.Object {
  
  /**
    * The condition configures when the pipeline should trigger a new image build. When the pipelineExecutionStartCondition is set to EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE, and you use semantic version filters on the source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new versions of the image or components in your recipe that match the semantic version filter. When it is set to EXPRESSION_MATCH_ONLY, it will build a new image every time the CRON expression matches the current time. For semantic version syntax, see CreateComponent in the  EC2 Image Builder API Reference.
    */
  var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.native
  
  /**
    * The cron expression determines how often EC2 Image Builder evaluates your pipelineExecutionStartCondition. For information on how to format a cron expression in Image Builder, see Use cron expressions in EC2 Image Builder.
    */
  var scheduleExpression: js.UndefOr[NonEmptyString] = js.native
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleOps[Self <: Schedule] (val x: Self) extends AnyVal {
    
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
    def setPipelineExecutionStartCondition(value: PipelineExecutionStartCondition): Self = this.set("pipelineExecutionStartCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePipelineExecutionStartCondition: Self = this.set("pipelineExecutionStartCondition", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: NonEmptyString): Self = this.set("scheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduleExpression: Self = this.set("scheduleExpression", js.undefined)
  }
}
