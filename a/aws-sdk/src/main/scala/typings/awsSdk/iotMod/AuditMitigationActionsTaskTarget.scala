package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AuditMitigationActionsTaskTarget extends StObject {
  
  /**
    * Specifies a filter in the form of an audit check and set of reason codes that identify the findings from the audit to which the audit mitigation actions task apply.
    */
  var auditCheckToReasonCodeFilter: js.UndefOr[AuditCheckToReasonCodeFilter] = js.native
  
  /**
    * If the task will apply a mitigation action to findings from a specific audit, this value uniquely identifies the audit.
    */
  var auditTaskId: js.UndefOr[AuditTaskId] = js.native
  
  /**
    * If the task will apply a mitigation action to one or more listed findings, this value uniquely identifies those findings.
    */
  var findingIds: js.UndefOr[FindingIds] = js.native
}
object AuditMitigationActionsTaskTarget {
  
  @scala.inline
  def apply(): AuditMitigationActionsTaskTarget = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditMitigationActionsTaskTarget]
  }
  
  @scala.inline
  implicit class AuditMitigationActionsTaskTargetMutableBuilder[Self <: AuditMitigationActionsTaskTarget] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAuditCheckToReasonCodeFilter(value: AuditCheckToReasonCodeFilter): Self = StObject.set(x, "auditCheckToReasonCodeFilter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditCheckToReasonCodeFilterUndefined: Self = StObject.set(x, "auditCheckToReasonCodeFilter", js.undefined)
    
    @scala.inline
    def setAuditTaskId(value: AuditTaskId): Self = StObject.set(x, "auditTaskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAuditTaskIdUndefined: Self = StObject.set(x, "auditTaskId", js.undefined)
    
    @scala.inline
    def setFindingIds(value: FindingIds): Self = StObject.set(x, "findingIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdsUndefined: Self = StObject.set(x, "findingIds", js.undefined)
    
    @scala.inline
    def setFindingIdsVarargs(value: FindingId*): Self = StObject.set(x, "findingIds", js.Array(value :_*))
  }
}
