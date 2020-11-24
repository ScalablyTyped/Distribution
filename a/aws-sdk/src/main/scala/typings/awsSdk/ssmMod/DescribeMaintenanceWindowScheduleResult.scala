package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeMaintenanceWindowScheduleResult extends js.Object {
  
  /**
    * The token for the next set of items to return. (You use this token in the next call.)
    */
  var NextToken: js.UndefOr[typings.awsSdk.ssmMod.NextToken] = js.native
  
  /**
    * Information about maintenance window executions scheduled for the specified time range.
    */
  var ScheduledWindowExecutions: js.UndefOr[ScheduledWindowExecutionList] = js.native
}
object DescribeMaintenanceWindowScheduleResult {
  
  @scala.inline
  def apply(): DescribeMaintenanceWindowScheduleResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeMaintenanceWindowScheduleResult]
  }
  
  @scala.inline
  implicit class DescribeMaintenanceWindowScheduleResultOps[Self <: DescribeMaintenanceWindowScheduleResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setNextToken(value: NextToken): Self = this.set("NextToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextToken: Self = this.set("NextToken", js.undefined)
    
    @scala.inline
    def setScheduledWindowExecutionsVarargs(value: ScheduledWindowExecution*): Self = this.set("ScheduledWindowExecutions", js.Array(value :_*))
    
    @scala.inline
    def setScheduledWindowExecutions(value: ScheduledWindowExecutionList): Self = this.set("ScheduledWindowExecutions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledWindowExecutions: Self = this.set("ScheduledWindowExecutions", js.undefined)
  }
}
