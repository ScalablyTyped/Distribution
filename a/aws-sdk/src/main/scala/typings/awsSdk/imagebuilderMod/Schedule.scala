package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Schedule extends StObject {
  
  /**
    * The condition configures when the pipeline should trigger a new image build. When the pipelineExecutionStartCondition is set to EXPRESSION_MATCH_AND_DEPENDENCY_UPDATES_AVAILABLE, and you use semantic version filters on the source image or components in your image recipe, EC2 Image Builder will build a new image only when there are new versions of the image or components in your recipe that match the semantic version filter. When it is set to EXPRESSION_MATCH_ONLY, it will build a new image every time the CRON expression matches the current time. For semantic version syntax, see CreateComponent in the  EC2 Image Builder API Reference.
    */
  var pipelineExecutionStartCondition: js.UndefOr[PipelineExecutionStartCondition] = js.undefined
  
  /**
    * The cron expression determines how often EC2 Image Builder evaluates your pipelineExecutionStartCondition. For information on how to format a cron expression in Image Builder, see Use cron expressions in EC2 Image Builder.
    */
  var scheduleExpression: js.UndefOr[NonEmptyString] = js.undefined
}
object Schedule {
  
  @scala.inline
  def apply(): Schedule = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Schedule]
  }
  
  @scala.inline
  implicit class ScheduleMutableBuilder[Self <: Schedule] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPipelineExecutionStartCondition(value: PipelineExecutionStartCondition): Self = StObject.set(x, "pipelineExecutionStartCondition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPipelineExecutionStartConditionUndefined: Self = StObject.set(x, "pipelineExecutionStartCondition", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: NonEmptyString): Self = StObject.set(x, "scheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleExpressionUndefined: Self = StObject.set(x, "scheduleExpression", js.undefined)
  }
}
