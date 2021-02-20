package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DescribeAuditMitigationActionsTaskResponse extends StObject {
  
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
  implicit class DescribeAuditMitigationActionsTaskResponseMutableBuilder[Self <: DescribeAuditMitigationActionsTaskResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setActionsDefinition(value: MitigationActionList): Self = StObject.set(x, "actionsDefinition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsDefinitionUndefined: Self = StObject.set(x, "actionsDefinition", js.undefined)
    
    @scala.inline
    def setActionsDefinitionVarargs(value: MitigationAction*): Self = StObject.set(x, "actionsDefinition", js.Array(value :_*))
    
    @scala.inline
    def setAuditCheckToActionsMapping(value: AuditCheckToActionsMapping): Self = StObject.set(x, "auditCheckToActionsMapping", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditCheckToActionsMappingUndefined: Self = StObject.set(x, "auditCheckToActionsMapping", js.undefined)
    
    @scala.inline
    def setEndTime(value: Timestamp): Self = StObject.set(x, "endTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEndTimeUndefined: Self = StObject.set(x, "endTime", js.undefined)
    
    @scala.inline
    def setStartTime(value: Timestamp): Self = StObject.set(x, "startTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartTimeUndefined: Self = StObject.set(x, "startTime", js.undefined)
    
    @scala.inline
    def setTarget(value: AuditMitigationActionsTaskTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetUndefined: Self = StObject.set(x, "target", js.undefined)
    
    @scala.inline
    def setTaskStatistics(value: AuditMitigationActionsTaskStatistics): Self = StObject.set(x, "taskStatistics", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatisticsUndefined: Self = StObject.set(x, "taskStatistics", js.undefined)
    
    @scala.inline
    def setTaskStatus(value: AuditMitigationActionsTaskStatus): Self = StObject.set(x, "taskStatus", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStatusUndefined: Self = StObject.set(x, "taskStatus", js.undefined)
  }
}
