package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionOpenCounts extends StObject {
  
  /**
    * The count of activity tasks whose status is OPEN.
    */
  var openActivityTasks: Count
  
  /**
    * The count of child workflow executions whose status is OPEN.
    */
  var openChildWorkflowExecutions: Count
  
  /**
    * The count of decision tasks whose status is OPEN. A workflow execution can have at most one open decision task.
    */
  var openDecisionTasks: OpenDecisionTasksCount
  
  /**
    * The count of Lambda tasks whose status is OPEN.
    */
  var openLambdaFunctions: js.UndefOr[Count] = js.undefined
  
  /**
    * The count of timers started by this workflow execution that have not fired yet.
    */
  var openTimers: Count
}
object WorkflowExecutionOpenCounts {
  
  inline def apply(
    openActivityTasks: Count,
    openChildWorkflowExecutions: Count,
    openDecisionTasks: OpenDecisionTasksCount,
    openTimers: Count
  ): WorkflowExecutionOpenCounts = {
    val __obj = js.Dynamic.literal(openActivityTasks = openActivityTasks.asInstanceOf[js.Any], openChildWorkflowExecutions = openChildWorkflowExecutions.asInstanceOf[js.Any], openDecisionTasks = openDecisionTasks.asInstanceOf[js.Any], openTimers = openTimers.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionOpenCounts]
  }
  
  extension [Self <: WorkflowExecutionOpenCounts](x: Self) {
    
    inline def setOpenActivityTasks(value: Count): Self = StObject.set(x, "openActivityTasks", value.asInstanceOf[js.Any])
    
    inline def setOpenChildWorkflowExecutions(value: Count): Self = StObject.set(x, "openChildWorkflowExecutions", value.asInstanceOf[js.Any])
    
    inline def setOpenDecisionTasks(value: OpenDecisionTasksCount): Self = StObject.set(x, "openDecisionTasks", value.asInstanceOf[js.Any])
    
    inline def setOpenLambdaFunctions(value: Count): Self = StObject.set(x, "openLambdaFunctions", value.asInstanceOf[js.Any])
    
    inline def setOpenLambdaFunctionsUndefined: Self = StObject.set(x, "openLambdaFunctions", js.undefined)
    
    inline def setOpenTimers(value: Count): Self = StObject.set(x, "openTimers", value.asInstanceOf[js.Any])
  }
}
