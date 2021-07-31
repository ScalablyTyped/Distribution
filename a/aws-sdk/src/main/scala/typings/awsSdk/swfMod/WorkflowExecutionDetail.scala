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
  var latestActivityTaskTimestamp: js.UndefOr[Timestamp] = js.undefined
  
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
  
  @scala.inline
  def apply(
    executionConfiguration: WorkflowExecutionConfiguration,
    executionInfo: WorkflowExecutionInfo,
    openCounts: WorkflowExecutionOpenCounts
  ): WorkflowExecutionDetail = {
    val __obj = js.Dynamic.literal(executionConfiguration = executionConfiguration.asInstanceOf[js.Any], executionInfo = executionInfo.asInstanceOf[js.Any], openCounts = openCounts.asInstanceOf[js.Any])
    __obj.asInstanceOf[WorkflowExecutionDetail]
  }
  
  @scala.inline
  implicit class WorkflowExecutionDetailMutableBuilder[Self <: WorkflowExecutionDetail] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setExecutionConfiguration(value: WorkflowExecutionConfiguration): Self = StObject.set(x, "executionConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionInfo(value: WorkflowExecutionInfo): Self = StObject.set(x, "executionInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestActivityTaskTimestamp(value: Timestamp): Self = StObject.set(x, "latestActivityTaskTimestamp", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestActivityTaskTimestampUndefined: Self = StObject.set(x, "latestActivityTaskTimestamp", js.undefined)
    
    @scala.inline
    def setLatestExecutionContext(value: Data): Self = StObject.set(x, "latestExecutionContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLatestExecutionContextUndefined: Self = StObject.set(x, "latestExecutionContext", js.undefined)
    
    @scala.inline
    def setOpenCounts(value: WorkflowExecutionOpenCounts): Self = StObject.set(x, "openCounts", value.asInstanceOf[js.Any])
  }
}
