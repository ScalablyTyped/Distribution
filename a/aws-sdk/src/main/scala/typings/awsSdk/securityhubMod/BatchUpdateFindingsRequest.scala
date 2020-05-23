package typings.awsSdk.securityhubMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BatchUpdateFindingsRequest extends js.Object {
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
  def apply(
    FindingIdentifiers: AwsSecurityFindingIdentifierList,
    Confidence: js.UndefOr[RatioScale] = js.undefined,
    Criticality: js.UndefOr[RatioScale] = js.undefined,
    Note: NoteUpdate = null,
    RelatedFindings: RelatedFindingList = null,
    Severity: SeverityUpdate = null,
    Types: TypeList = null,
    UserDefinedFields: FieldMap = null,
    VerificationState: VerificationState = null,
    Workflow: WorkflowUpdate = null
  ): BatchUpdateFindingsRequest = {
    val __obj = js.Dynamic.literal(FindingIdentifiers = FindingIdentifiers.asInstanceOf[js.Any])
    if (!js.isUndefined(Confidence)) __obj.updateDynamic("Confidence")(Confidence.get.asInstanceOf[js.Any])
    if (!js.isUndefined(Criticality)) __obj.updateDynamic("Criticality")(Criticality.get.asInstanceOf[js.Any])
    if (Note != null) __obj.updateDynamic("Note")(Note.asInstanceOf[js.Any])
    if (RelatedFindings != null) __obj.updateDynamic("RelatedFindings")(RelatedFindings.asInstanceOf[js.Any])
    if (Severity != null) __obj.updateDynamic("Severity")(Severity.asInstanceOf[js.Any])
    if (Types != null) __obj.updateDynamic("Types")(Types.asInstanceOf[js.Any])
    if (UserDefinedFields != null) __obj.updateDynamic("UserDefinedFields")(UserDefinedFields.asInstanceOf[js.Any])
    if (VerificationState != null) __obj.updateDynamic("VerificationState")(VerificationState.asInstanceOf[js.Any])
    if (Workflow != null) __obj.updateDynamic("Workflow")(Workflow.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchUpdateFindingsRequest]
  }
}

