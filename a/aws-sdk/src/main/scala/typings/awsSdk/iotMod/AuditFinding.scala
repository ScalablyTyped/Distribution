package typings.awsSdk.iotMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AuditFinding extends StObject {
  
  /**
    * The audit check that generated this result.
    */
  var checkName: js.UndefOr[AuditCheckName] = js.undefined
  
  /**
    * A unique identifier for this set of audit findings. This identifier is used to apply mitigation tasks to one or more sets of findings.
    */
  var findingId: js.UndefOr[FindingId] = js.undefined
  
  /**
    * The time the result (finding) was discovered.
    */
  var findingTime: js.UndefOr[Timestamp] = js.undefined
  
  /**
    *  Indicates whether the audit finding was suppressed or not during reporting. 
    */
  var isSuppressed: js.UndefOr[IsSuppressed] = js.undefined
  
  /**
    * The resource that was found to be noncompliant with the audit check.
    */
  var nonCompliantResource: js.UndefOr[NonCompliantResource] = js.undefined
  
  /**
    * The reason the resource was noncompliant.
    */
  var reasonForNonCompliance: js.UndefOr[ReasonForNonCompliance] = js.undefined
  
  /**
    * A code that indicates the reason that the resource was noncompliant.
    */
  var reasonForNonComplianceCode: js.UndefOr[ReasonForNonComplianceCode] = js.undefined
  
  /**
    * The list of related resources.
    */
  var relatedResources: js.UndefOr[RelatedResources] = js.undefined
  
  /**
    * The severity of the result (finding).
    */
  var severity: js.UndefOr[AuditFindingSeverity] = js.undefined
  
  /**
    * The ID of the audit that generated this result (finding).
    */
  var taskId: js.UndefOr[AuditTaskId] = js.undefined
  
  /**
    * The time the audit started.
    */
  var taskStartTime: js.UndefOr[Timestamp] = js.undefined
}
object AuditFinding {
  
  @scala.inline
  def apply(): AuditFinding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AuditFinding]
  }
  
  @scala.inline
  implicit class AuditFindingMutableBuilder[Self <: AuditFinding] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCheckName(value: AuditCheckName): Self = StObject.set(x, "checkName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCheckNameUndefined: Self = StObject.set(x, "checkName", js.undefined)
    
    @scala.inline
    def setFindingId(value: FindingId): Self = StObject.set(x, "findingId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdUndefined: Self = StObject.set(x, "findingId", js.undefined)
    
    @scala.inline
    def setFindingTime(value: Timestamp): Self = StObject.set(x, "findingTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingTimeUndefined: Self = StObject.set(x, "findingTime", js.undefined)
    
    @scala.inline
    def setIsSuppressed(value: IsSuppressed): Self = StObject.set(x, "isSuppressed", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuppressedUndefined: Self = StObject.set(x, "isSuppressed", js.undefined)
    
    @scala.inline
    def setNonCompliantResource(value: NonCompliantResource): Self = StObject.set(x, "nonCompliantResource", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNonCompliantResourceUndefined: Self = StObject.set(x, "nonCompliantResource", js.undefined)
    
    @scala.inline
    def setReasonForNonCompliance(value: ReasonForNonCompliance): Self = StObject.set(x, "reasonForNonCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonForNonComplianceCode(value: ReasonForNonComplianceCode): Self = StObject.set(x, "reasonForNonComplianceCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setReasonForNonComplianceCodeUndefined: Self = StObject.set(x, "reasonForNonComplianceCode", js.undefined)
    
    @scala.inline
    def setReasonForNonComplianceUndefined: Self = StObject.set(x, "reasonForNonCompliance", js.undefined)
    
    @scala.inline
    def setRelatedResources(value: RelatedResources): Self = StObject.set(x, "relatedResources", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedResourcesUndefined: Self = StObject.set(x, "relatedResources", js.undefined)
    
    @scala.inline
    def setRelatedResourcesVarargs(value: RelatedResource*): Self = StObject.set(x, "relatedResources", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: AuditFindingSeverity): Self = StObject.set(x, "severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "severity", js.undefined)
    
    @scala.inline
    def setTaskId(value: AuditTaskId): Self = StObject.set(x, "taskId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskIdUndefined: Self = StObject.set(x, "taskId", js.undefined)
    
    @scala.inline
    def setTaskStartTime(value: Timestamp): Self = StObject.set(x, "taskStartTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTaskStartTimeUndefined: Self = StObject.set(x, "taskStartTime", js.undefined)
  }
}
