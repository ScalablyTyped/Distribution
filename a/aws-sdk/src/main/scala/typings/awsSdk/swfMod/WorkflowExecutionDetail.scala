package typings.awsSdk.swfMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WorkflowExecutionDetail extends StObject {
  
  /**
    * The configuration settings for this workflow execution including timeout values, tasklist etc.
    */
  var executionConfiguration: WorkflowExecutionConfiguration
  
  /**
    * Information about the workflow execution.
    */
  var executionInfo: WorkflowExecutionInfo
  
  /**
    * The time when the last activity task was scheduled for this workflow execution. You can use this information to determine if the workflow has not made progress for an unusually long period of time and might require a corrective action.
    */
  var latestActivityTaskTimestamp: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The latest executionContext provided by the decider for this workflow execution. A decider can provide an executionContext (a free-form string) when closing a decision task using RespondDecisionTaskCompleted.
    */
  var latestExecutionContext: js.UndefOr[Data] = js.undefined
  
  /**
    * The number of tasks for this workflow execution. This includes open and closed tasks of all types.
    */
  var openCounts: WorkflowExecutionOpenCounts
}
object WorkflowExecutionDetail {
  
  inline def apply(
    executionConfiguration: WorkflowExecutionConfiguration,
    executionInfo: WorkflowExecutionInfo,
    openCounts: WorkflowExecutionOpenCounts
  ): WorkflowExecutionDetail = {
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration.asInstanceOf[js.Any], executionInfo = executionInfo.asInstanceOf[js.Any], openCounts = openCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
  
  extension [Self <: WorkflowExecutionDetail](x: Self) {
    
    inline def setExecutionConfiguration(value: WorkflowExecutionConfiguration): Self = StObject.set(x, "executionConfiguration", value.asInstanceOf[js.Any])
    
    inline def setExecutionInfo(value: WorkflowExecutionInfo): Self = StObject.set(x, "executionInfo", value.asInstanceOf[js.Any])
    
    inline def setLatestActivityTaskTimestamp(value: js.Date): Self = StObject.set(x, "latestActivityTaskTimestamp", value.asInstanceOf[js.Any])
    
    inline def setLatestActivityTaskTimestampUndefined: Self = StObject.set(x, "latestActivityTaskTimestamp", js.undefined)
    
    inline def setLatestExecutionContext(value: Data): Self = StObject.set(x, "latestExecutionContext", value.asInstanceOf[js.Any])
    
    inline def setLatestExecutionContextUndefined: Self = StObject.set(x, "latestExecutionContext", js.undefined)
    
    inline def setOpenCounts(value: WorkflowExecutionOpenCounts): Self = StObject.set(x, "openCounts", value.asInstanceOf[js.Any])
  }
}
