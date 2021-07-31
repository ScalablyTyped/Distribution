package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeMaintenanceWindowScheduleResult extends StObject {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.undefined
  
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.undefined
}
object DescribeMaintenanceWindowScheduleResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowScheduleResultMutableBuilder[Self <: DescribeMaintenanceWindowScheduleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    @scala.inline
    def setScheduledWindowExecutions(value: ScheduledWindowExecutionList): Self = StObject.set(x, "ScheduledWindowExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduledWindowExecutionsUndefined: Self = StObject.set(x, "ScheduledWindowExecutions", js.undefined)
    
    @scala.inline
    def setScheduledWindowExecutionsVarargs(value: ScheduledWindowExecution*): Self = StObject.set(x, "ScheduledWindowExecutions", js.Array(value :_*))
  }
}
