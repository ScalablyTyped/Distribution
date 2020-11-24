package typings.awsSdk.redshiftMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ScheduledAction extends js.Object {
  
  /**
    * The end time in UTC when the schedule is no longer active. After this time, the scheduled action does not trigger. 
    */
  var EndTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The IAM role to assume to run the scheduled action. This IAM role must have permission to run the Amazon Redshift API operation in the scheduled action. This IAM role must allow the Amazon Redshift scheduler (Principal scheduler.redshift.amazonaws.com) to assume permissions on your behalf. For more information about the IAM role to use with the Amazon Redshift scheduler, see Using Identity-Based Policies for Amazon Redshift in the Amazon Redshift Cluster Management Guide. 
    */
  var IamRole: js.UndefOr[String] = js.native
  
  /**
    * List of times when the scheduled action will run. 
    */
  var NextInvocations: js.UndefOr[ScheduledActionTimeList] = js.native
  
  /**
    * The schedule for a one-time (at format) or recurring (cron format) scheduled action. Schedule invocations must be separated by at least one hour. Format of at expressions is "at(yyyy-mm-ddThh:mm:ss)". For example, "at(2016-03-04T17:27:00)". Format of cron expressions is "cron(Minutes Hours Day-of-month Month Day-of-week Year)". For example, "cron(0 10 ? * MON *)". For more information, see Cron Expressions in the Amazon CloudWatch Events User Guide.
    */
  var Schedule: js.UndefOr[String] = js.native
  
  /**
    * The description of the scheduled action. 
    */
  var ScheduledActionDescription: js.UndefOr[String] = js.native
  
  /**
    * The name of the scheduled action. 
    */
  var ScheduledActionName: js.UndefOr[String] = js.native
  
  /**
    * The start time in UTC when the schedule is active. Before this time, the scheduled action does not trigger. 
    */
  var StartTime: js.UndefOr[TStamp] = js.native
  
  /**
    * The state of the scheduled action. For example, DISABLED. 
    */
  var State: js.UndefOr[ScheduledActionState] = js.native
  
  /**
    * A JSON format string of the Amazon Redshift API operation with input parameters.  "{\"ResizeCluster\":{\"NodeType\":\"ds2.8xlarge\",\"ClusterIdentifier\":\"my-test-cluster\",\"NumberOfNodes\":3}}". 
    */
  var TargetAction: js.UndefOr[ScheduledActionType] = js.native
}
object ScheduledAction {
  
  @scala.inline
  def apply(): ScheduledAction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ScheduledAction]
  }
  
  @scala.inline
  implicit class ScheduledActionOps[Self <: ScheduledAction] (val x: Self) extends AnyVal {
    
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
    def setEndTime(value: TStamp): Self = this.set("EndTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("EndTime", js.undefined)
    
    @scala.inline
    def setIamRole(value: String): Self = this.set("IamRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIamRole: Self = this.set("IamRole", js.undefined)
    
    @scala.inline
    def setNextInvocationsVarargs(value: TStamp*): Self = this.set("NextInvocations", js.Array(value :_*))
    
    @scala.inline
    def setNextInvocations(value: ScheduledActionTimeList): Self = this.set("NextInvocations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNextInvocations: Self = this.set("NextInvocations", js.undefined)
    
    @scala.inline
    def setSchedule(value: String): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    
    @scala.inline
    def setScheduledActionDescription(value: String): Self = this.set("ScheduledActionDescription", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionDescription: Self = this.set("ScheduledActionDescription", js.undefined)
    
    @scala.inline
    def setScheduledActionName(value: String): Self = this.set("ScheduledActionName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScheduledActionName: Self = this.set("ScheduledActionName", js.undefined)
    
    @scala.inline
    def setStartTime(value: TStamp): Self = this.set("StartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("StartTime", js.undefined)
    
    @scala.inline
    def setState(value: ScheduledActionState): Self = this.set("State", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteState: Self = this.set("State", js.undefined)
    
    @scala.inline
    def setTargetAction(value: ScheduledActionType): Self = this.set("TargetAction", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTargetAction: Self = this.set("TargetAction", js.undefined)
  }
}
