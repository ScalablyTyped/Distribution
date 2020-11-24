package typings.awsSdk.swfMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WorkflowTypeConfiguration extends js.Object {
  
  /**
    *  The default policy to use for the child workflow executions when a workflow execution of this type is terminated, by calling the TerminateWorkflowExecution action explicitly or due to an expired timeout. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The supported child policies are:    TERMINATE – The child executions are terminated.    REQUEST_CANCEL – A request to cancel is attempted for each child execution by recording a WorkflowExecutionCancelRequested event in its history. It is up to the decider to take appropriate actions when it receives an execution history with this event.    ABANDON – No action is taken. The child executions continue to run.  
    */
  var defaultChildPolicy: js.UndefOr[ChildPolicy] = js.native
  
  /**
    *  The default maximum duration, specified when registering the workflow type, for executions of this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultExecutionStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
  
  /**
    * The default IAM role attached to this workflow type.  Executions of this workflow type need IAM roles to invoke Lambda functions. If you don't specify an IAM role when starting this workflow type, the default Lambda role is attached to the execution. For more information, see https://docs.aws.amazon.com/amazonswf/latest/developerguide/lambda-task.html in the Amazon SWF Developer Guide. 
    */
  var defaultLambdaRole: js.UndefOr[Arn] = js.native
  
  /**
    *  The default task list, specified when registering the workflow type, for decisions tasks scheduled for workflow executions of this type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision.
    */
  var defaultTaskList: js.UndefOr[TaskList] = js.native
  
  /**
    *  The default task priority, specified when registering the workflow type, for all decision tasks of this workflow type. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution decision. Valid values are integers that range from Java's Integer.MIN_VALUE (-2147483648) to Integer.MAX_VALUE (2147483647). Higher numbers indicate higher priority. For more information about setting task priority, see Setting Task Priority in the Amazon SWF Developer Guide.
    */
  var defaultTaskPriority: js.UndefOr[TaskPriority] = js.native
  
  /**
    *  The default maximum duration, specified when registering the workflow type, that a decision task for executions of this workflow type might take before returning completion or failure. If the task doesn'tdo close in the specified time then the task is automatically timed out and rescheduled. If the decider eventually reports a completion or failure, it is ignored. This default can be overridden when starting a workflow execution using the StartWorkflowExecution action or the StartChildWorkflowExecution Decision. The duration is specified in seconds, an integer greater than or equal to 0. You can use NONE to specify unlimited duration.
    */
  var defaultTaskStartToCloseTimeout: js.UndefOr[DurationInSecondsOptional] = js.native
}
object WorkflowTypeConfiguration {
  
  @scala.inline
  def apply(): WorkflowTypeConfiguration = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[WorkflowTypeConfiguration]
  }
  
  @scala.inline
  implicit class WorkflowTypeConfigurationOps[Self <: WorkflowTypeConfiguration] (val x: Self) extends AnyVal {
    
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
    def setDefaultChildPolicy(value: ChildPolicy): Self = this.set("defaultChildPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultChildPolicy: Self = this.set("defaultChildPolicy", js.undefined)
    
    @scala.inline
    def setDefaultExecutionStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("defaultExecutionStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultExecutionStartToCloseTimeout: Self = this.set("defaultExecutionStartToCloseTimeout", js.undefined)
    
    @scala.inline
    def setDefaultLambdaRole(value: Arn): Self = this.set("defaultLambdaRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultLambdaRole: Self = this.set("defaultLambdaRole", js.undefined)
    
    @scala.inline
    def setDefaultTaskList(value: TaskList): Self = this.set("defaultTaskList", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTaskList: Self = this.set("defaultTaskList", js.undefined)
    
    @scala.inline
    def setDefaultTaskPriority(value: TaskPriority): Self = this.set("defaultTaskPriority", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTaskPriority: Self = this.set("defaultTaskPriority", js.undefined)
    
    @scala.inline
    def setDefaultTaskStartToCloseTimeout(value: DurationInSecondsOptional): Self = this.set("defaultTaskStartToCloseTimeout", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDefaultTaskStartToCloseTimeout: Self = this.set("defaultTaskStartToCloseTimeout", js.undefined)
  }
}
