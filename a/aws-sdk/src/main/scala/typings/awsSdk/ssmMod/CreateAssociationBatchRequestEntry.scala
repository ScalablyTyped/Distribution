package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAssociationBatchRequestEntry extends StObject {
  
  /**
    * By default, when you create a new associations, the system runs it immediately after it is created and then according to the schedule you specified. Specify this option if you don't want an association to run immediately after you create it.
    */
  var ApplyOnlyAtCronInterval: js.UndefOr[typings.awsSdk.ssmMod.ApplyOnlyAtCronInterval] = js.undefined
  
  /**
    * Specify a descriptive name for the association.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.undefined
  
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.ssmMod.AutomationTargetParameterName] = js.undefined
  
  /**
    * The severity level to assign to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The ID of the instance. 
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * The name of the SSM document that contains the configuration information for the instance. You can specify Command or Automation documents. You can specify AWS-predefined documents, documents you created, or a document that is shared with you from another account. For SSM documents that are shared with you from other AWS accounts, you must specify the complete SSM document ARN, in the following format:  arn:aws:ssm:region:account-id:document/document-name   For example:  arn:aws:ssm:us-east-2:12345678912:document/My-Shared-Document  For AWS-predefined documents and SSM documents you created in your account, you only need to specify the document name. For example, AWS-ApplyPatchBaseline or My-Document.
    */
  var Name: DocumentARN
  
  /**
    * An S3 bucket where you want to store the results of this request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.undefined
  
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.undefined
  
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT.  In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API action. In this case, compliance data is not managed by State Manager. It is managed by your direct call to the PutComplianceItems API action. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined
  
  /**
    * The instances targeted by the request.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
}
object CreateAssociationBatchRequestEntry {
  
  @scala.inline
  def apply(Name: DocumentARN): CreateAssociationBatchRequestEntry = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAssociationBatchRequestEntry]
  }
  
  @scala.inline
  implicit class CreateAssociationBatchRequestEntryMutableBuilder[Self <: CreateAssociationBatchRequestEntry] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setApplyOnlyAtCronInterval(value: ApplyOnlyAtCronInterval): Self = StObject.set(x, "ApplyOnlyAtCronInterval", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setApplyOnlyAtCronIntervalUndefined: Self = StObject.set(x, "ApplyOnlyAtCronInterval", js.undefined)
    
    @scala.inline
    def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    @scala.inline
    def setAutomationTargetParameterName(value: AutomationTargetParameterName): Self = StObject.set(x, "AutomationTargetParameterName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "AutomationTargetParameterName", js.undefined)
    
    @scala.inline
    def setComplianceSeverity(value: AssociationComplianceSeverity): Self = StObject.set(x, "ComplianceSeverity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setComplianceSeverityUndefined: Self = StObject.set(x, "ComplianceSeverity", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocation(value: InstanceAssociationOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    @scala.inline
    def setSyncCompliance(value: AssociationSyncCompliance): Self = StObject.set(x, "SyncCompliance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSyncComplianceUndefined: Self = StObject.set(x, "SyncCompliance", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
