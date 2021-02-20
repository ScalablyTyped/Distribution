package typings.awsSdk.securityhubMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait BatchUpdateFindingsRequest extends StObject {
  
  /**
    * The updated value for the finding confidence. Confidence is defined as the likelihood that a finding accurately identifies the behavior or issue that it was intended to identify. Confidence is scored on a 0-100 basis using a ratio scale, where 0 means zero percent confidence and 100 means 100 percent confidence.
    */
  var Confidence: js.UndefOr[RatioScale] = js.native
  
  /**
    * The updated value for the level of importance assigned to the resources associated with the findings. A score of 0 means that the underlying resources have no criticality, and a score of 100 is reserved for the most critical resources. 
    */
  var Criticality: js.UndefOr[RatioScale] = js.native
  
  /**
    * The list of findings to update. BatchUpdateFindings can be used to update up to 100 findings at a time. For each finding, the list provides the finding identifier and the ARN of the finding provider.
    */
  var FindingIdentifiers: AwsSecurityFindingIdentifierList = js.native
  
  var Note: js.UndefOr[NoteUpdate] = js.native
  
  /**
    * A list of findings that are related to the updated findings.
    */
  var RelatedFindings: js.UndefOr[RelatedFindingList] = js.native
  
  /**
    * Used to update the finding severity.
    */
  var Severity: js.UndefOr[SeverityUpdate] = js.native
  
  /**
    * One or more finding types in the format of namespace/category/classifier that classify a finding. Valid namespace values are as follows.   Software and Configuration Checks   TTPs   Effects   Unusual Behaviors   Sensitive Data Identifications   
    */
  var Types: js.UndefOr[TypeList] = js.native
  
  /**
    * A list of name/value string pairs associated with the finding. These are custom, user-defined fields added to a finding.
    */
  var UserDefinedFields: js.UndefOr[FieldMap] = js.native
  
  /**
    * Indicates the veracity of a finding. The available values for VerificationState are as follows.    UNKNOWN – The default disposition of a security finding    TRUE_POSITIVE – The security finding is confirmed    FALSE_POSITIVE – The security finding was determined to be a false alarm    BENIGN_POSITIVE – A special case of TRUE_POSITIVE where the finding doesn't pose any threat, is expected, or both  
    */
  var VerificationState: js.UndefOr[typings.awsSdk.securityhubMod.VerificationState] = js.native
  
  /**
    * Used to update the workflow status of a finding. The workflow status indicates the progress of the investigation into the finding. 
    */
  var Workflow: js.UndefOr[WorkflowUpdate] = js.native
}
object BatchUpdateFindingsRequest {
  
  @scala.inline
  def apply(FindingIdentifiers: AwsSecurityFindingIdentifierList): BatchUpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(FindingIdentifiers = FindingIdentifiers.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsRequest]
  }
  
  @scala.inline
  implicit class BatchUpdateFindingsRequestMutableBuilder[Self <: BatchUpdateFindingsRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: RatioScale): Self = StObject.set(x, "Confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "Confidence", js.undefined)
    
    @scala.inline
    def setCriticality(value: RatioScale): Self = StObject.set(x, "Criticality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCriticalityUndefined: Self = StObject.set(x, "Criticality", js.undefined)
    
    @scala.inline
    def setFindingIdentifiers(value: AwsSecurityFindingIdentifierList): Self = StObject.set(x, "FindingIdentifiers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFindingIdentifiersVarargs(value: AwsSecurityFindingIdentifier*): Self = StObject.set(x, "FindingIdentifiers", js.Array(value :_*))
    
    @scala.inline
    def setNote(value: NoteUpdate): Self = StObject.set(x, "Note", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNoteUndefined: Self = StObject.set(x, "Note", js.undefined)
    
    @scala.inline
    def setRelatedFindings(value: RelatedFindingList): Self = StObject.set(x, "RelatedFindings", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRelatedFindingsUndefined: Self = StObject.set(x, "RelatedFindings", js.undefined)
    
    @scala.inline
    def setRelatedFindingsVarargs(value: RelatedFinding*): Self = StObject.set(x, "RelatedFindings", js.Array(value :_*))
    
    @scala.inline
    def setSeverity(value: SeverityUpdate): Self = StObject.set(x, "Severity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSeverityUndefined: Self = StObject.set(x, "Severity", js.undefined)
    
    @scala.inline
    def setTypes(value: TypeList): Self = StObject.set(x, "Types", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypesUndefined: Self = StObject.set(x, "Types", js.undefined)
    
    @scala.inline
    def setTypesVarargs(value: NonEmptyString*): Self = StObject.set(x, "Types", js.Array(value :_*))
    
    @scala.inline
    def setUserDefinedFields(value: FieldMap): Self = StObject.set(x, "UserDefinedFields", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserDefinedFieldsUndefined: Self = StObject.set(x, "UserDefinedFields", js.undefined)
    
    @scala.inline
    def setVerificationState(value: VerificationState): Self = StObject.set(x, "VerificationState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVerificationStateUndefined: Self = StObject.set(x, "VerificationState", js.undefined)
    
    @scala.inline
    def setWorkflow(value: WorkflowUpdate): Self = StObject.set(x, "Workflow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkflowUndefined: Self = StObject.set(x, "Workflow", js.undefined)
  }
}
