package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociationDescription extends StObject {
  
  /**
    * By default, when you create a new associations, the system runs it immediately after it is created and then according to the schedule you specified. Specify this option if you don't want an association to run immediately after you create it.
    */
  var ApplyOnlyAtCronInterval: js.UndefOr[typings.awsSdk.ssmMod.ApplyOnlyAtCronInterval] = js.undefined
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[typings.awsSdk.ssmMod.AssociationId] = js.undefined
  
  /**
    * The association name.
    */
  var AssociationName: js.UndefOr[typings.awsSdk.ssmMod.AssociationName] = js.undefined
  
  /**
    * The association version.
    */
  var AssociationVersion: js.UndefOr[typings.awsSdk.ssmMod.AssociationVersion] = js.undefined
  
  /**
    * Specify the target for the association. This target is required for associations that use an Automation document and target resources by using rate controls.
    */
  var AutomationTargetParameterName: js.UndefOr[typings.awsSdk.ssmMod.AutomationTargetParameterName] = js.undefined
  
  /**
    * The severity level that is assigned to the association.
    */
  var ComplianceSeverity: js.UndefOr[AssociationComplianceSeverity] = js.undefined
  
  /**
    * The date when the association was made.
    */
  var Date: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The ID of the instance.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The date on which the association was last run.
    */
  var LastExecutionDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The last date on which the association was successfully run.
    */
  var LastSuccessfulExecutionDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The date when the association was last updated.
    */
  var LastUpdateAssociationDate: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The maximum number of targets allowed to run the association at the same time. You can specify a number, for example 10, or a percentage of the target set, for example 10%. The default value is 100%, which means all targets run the association at the same time. If a new instance starts and attempts to run an association while Systems Manager is running MaxConcurrency associations, the association is allowed to run. During the next association interval, the new instance will process its association within the limit specified for MaxConcurrency.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.undefined
  
  /**
    * The number of errors that are allowed before the system stops sending requests to run the association on additional targets. You can specify either an absolute number of errors, for example 10, or a percentage of the target set, for example 10%. If you specify 3, for example, the system stops sending requests when the fourth error is received. If you specify 0, then the system stops sending requests after the first error is returned. If you run an association on 50 instances and set MaxError to 10%, then the system stops sending the request when the sixth error is received. Executions that are already running an association when MaxErrors is reached are allowed to complete, but some of these executions may fail as well. If you need to ensure that there won't be more than max-errors failed executions, set MaxConcurrency to 1 so that executions proceed one at a time.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.undefined
  
  /**
    * The name of the Systems Manager document.
    */
  var Name: js.UndefOr[DocumentARN] = js.undefined
  
  /**
    * An S3 bucket where you want to store the output details of the request.
    */
  var OutputLocation: js.UndefOr[InstanceAssociationOutputLocation] = js.undefined
  
  /**
    * Information about the association.
    */
  var Overview: js.UndefOr[AssociationOverview] = js.undefined
  
  /**
    * A description of the parameters for a document. 
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.undefined
  
  /**
    * A cron expression that specifies a schedule when the association runs.
    */
  var ScheduleExpression: js.UndefOr[typings.awsSdk.ssmMod.ScheduleExpression] = js.undefined
  
  /**
    * The association status.
    */
  var Status: js.UndefOr[AssociationStatus] = js.undefined
  
  /**
    * The mode for generating association compliance. You can specify AUTO or MANUAL. In AUTO mode, the system uses the status of the association execution to determine the compliance status. If the association execution runs successfully, then the association is COMPLIANT. If the association execution doesn't run successfully, the association is NON-COMPLIANT. In MANUAL mode, you must specify the AssociationId as a parameter for the PutComplianceItems API action. In this case, compliance data is not managed by State Manager. It is managed by your direct call to the PutComplianceItems API action. By default, all associations use AUTO mode.
    */
  var SyncCompliance: js.UndefOr[AssociationSyncCompliance] = js.undefined
  
  /**
    * The instances targeted by the request. 
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.undefined
}
object AssociationDescription {
  
  inline def apply(): AssociationDescription = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociationDescription]
  }
  
  extension [Self <: AssociationDescription](x: Self) {
    
    inline def setApplyOnlyAtCronInterval(value: ApplyOnlyAtCronInterval): Self = StObject.set(x, "ApplyOnlyAtCronInterval", value.asInstanceOf[js.Any])
    
    inline def setApplyOnlyAtCronIntervalUndefined: Self = StObject.set(x, "ApplyOnlyAtCronInterval", js.undefined)
    
    inline def setAssociationId(value: AssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
    
    inline def setAssociationName(value: AssociationName): Self = StObject.set(x, "AssociationName", value.asInstanceOf[js.Any])
    
    inline def setAssociationNameUndefined: Self = StObject.set(x, "AssociationName", js.undefined)
    
    inline def setAssociationVersion(value: AssociationVersion): Self = StObject.set(x, "AssociationVersion", value.asInstanceOf[js.Any])
    
    inline def setAssociationVersionUndefined: Self = StObject.set(x, "AssociationVersion", js.undefined)
    
    inline def setAutomationTargetParameterName(value: AutomationTargetParameterName): Self = StObject.set(x, "AutomationTargetParameterName", value.asInstanceOf[js.Any])
    
    inline def setAutomationTargetParameterNameUndefined: Self = StObject.set(x, "AutomationTargetParameterName", js.undefined)
    
    inline def setComplianceSeverity(value: AssociationComplianceSeverity): Self = StObject.set(x, "ComplianceSeverity", value.asInstanceOf[js.Any])
    
    inline def setComplianceSeverityUndefined: Self = StObject.set(x, "ComplianceSeverity", js.undefined)
    
    inline def setDate(value: DateTime): Self = StObject.set(x, "Date", value.asInstanceOf[js.Any])
    
    inline def setDateUndefined: Self = StObject.set(x, "Date", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setLastExecutionDate(value: DateTime): Self = StObject.set(x, "LastExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastExecutionDateUndefined: Self = StObject.set(x, "LastExecutionDate", js.undefined)
    
    inline def setLastSuccessfulExecutionDate(value: DateTime): Self = StObject.set(x, "LastSuccessfulExecutionDate", value.asInstanceOf[js.Any])
    
    inline def setLastSuccessfulExecutionDateUndefined: Self = StObject.set(x, "LastSuccessfulExecutionDate", js.undefined)
    
    inline def setLastUpdateAssociationDate(value: DateTime): Self = StObject.set(x, "LastUpdateAssociationDate", value.asInstanceOf[js.Any])
    
    inline def setLastUpdateAssociationDateUndefined: Self = StObject.set(x, "LastUpdateAssociationDate", js.undefined)
    
    inline def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    inline def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    inline def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    inline def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    inline def setName(value: DocumentARN): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "Name", js.undefined)
    
    inline def setOutputLocation(value: InstanceAssociationOutputLocation): Self = StObject.set(x, "OutputLocation", value.asInstanceOf[js.Any])
    
    inline def setOutputLocationUndefined: Self = StObject.set(x, "OutputLocation", js.undefined)
    
    inline def setOverview(value: AssociationOverview): Self = StObject.set(x, "Overview", value.asInstanceOf[js.Any])
    
    inline def setOverviewUndefined: Self = StObject.set(x, "Overview", js.undefined)
    
    inline def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    inline def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    inline def setScheduleExpression(value: ScheduleExpression): Self = StObject.set(x, "ScheduleExpression", value.asInstanceOf[js.Any])
    
    inline def setScheduleExpressionUndefined: Self = StObject.set(x, "ScheduleExpression", js.undefined)
    
    inline def setStatus(value: AssociationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setSyncCompliance(value: AssociationSyncCompliance): Self = StObject.set(x, "SyncCompliance", value.asInstanceOf[js.Any])
    
    inline def setSyncComplianceUndefined: Self = StObject.set(x, "SyncCompliance", js.undefined)
    
    inline def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    inline def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    inline def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
  }
}
