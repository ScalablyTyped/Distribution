package typings.awsSdk.iotMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditMitigationActionsTaskResponse extends js.Object {
  
  /**
    * Specifies the mitigation actions and their parameters that are applied as part of this task.
    */
  var actionsDefinition: js.UndefOr[MitigationActionList] = js.native
  
  /**
    * Specifies the mitigation actions that should be applied to specific audit checks.
    */
  var auditCheckToActionsMapping: js.UndefOr[AuditCheckToActionsMapping] = js.native
  
  /**
    * The date and time when the task was completed or canceled.
    */
  var endTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * The date and time when the task was started.
    */
  var startTime: js.UndefOr[Timestamp] = js.native
  
  /**
    * Identifies the findings to which the mitigation actions are applied. This can be by audit checks, by audit task, or a set of findings.
    */
  var target: js.UndefOr[AuditMitigationActionsTaskTarget] = js.native
  
  /**
    * Aggregate counts of the results when the mitigation tasks were applied to the findings for this audit mitigation actions task.
    */
  var taskStatistics: js.UndefOr[AuditMitigationActionsTaskStatistics] = js.native
  
  /**
    * The current status of the task.
    */
  var taskStatus: js.UndefOr[AuditMitigationActionsTaskStatus] = js.native
}
object DescribeAuditMitigationActionsTaskResponse {
  
  @scala.inline
  def apply(): DescribeAuditMitigationActionsTaskResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeAuditMitigationActionsTaskResponse]
  }
  
  @scala.inline
  implicit class DescribeAuditMitigationActionsTaskResponseOps[Self <: DescribeAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    
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
    def setActionsDefinitionVarargs(value: MitigationAction*): Self = this.set("actionsDefinition", js.Array(value :_*))
    
    @scala.inline
    def setActionsDefinition(value: MitigationActionList): Self = this.set("actionsDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActionsDefinition: Self = this.set("actionsDefinition", js.undefined)
    
    @scala.inline
    def setAuditCheckToActionsMapping(value: AuditCheckToActionsMapping): Self = this.set("auditCheckToActionsMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAuditCheckToActionsMapping: Self = this.set("auditCheckToActionsMapping", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = this.set("endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEndTime: Self = this.set("endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = this.set("startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStartTime: Self = this.set("startTime", js.undefined)
    
    @scala.inline
    def setTarget(value: AuditMitigationActionsTaskTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTarget: Self = this.set("target", js.undefined)
    
    @scala.inline
    def setTaskStatistics(value: AuditMitigationActionsTaskStatistics): Self = this.set("taskStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskStatistics: Self = this.set("taskStatistics", js.undefined)
    
    @scala.inline
    def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = this.set("taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTaskStatus: Self = this.set("taskStatus", js.undefined)
  }
}
