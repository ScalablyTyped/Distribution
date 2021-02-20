package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Command extends StObject {
  
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  
  /**
    * A unique identifier for this command.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.native
  
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.native
  
  /**
    * The number of targets for which the command invocation reached a terminal state. Terminal states include the following: Success, Failed, Execution Timed Out, Delivery Timed Out, Canceled, Terminated, or Undeliverable.
    */
  var CompletedCount: js.UndefOr[typings.awsSdk.ssmMod.CompletedCount] = js.native
  
  /**
    * The number of targets for which the status is Delivery Timed Out.
    */
  var DeliveryTimedOutCount: js.UndefOr[typings.awsSdk.ssmMod.DeliveryTimedOutCount] = js.native
  
  /**
    * The name of the document requested for execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.native
  
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The number of targets for which the status is Failed or Execution Timed Out.
    */
  var ErrorCount: js.UndefOr[typings.awsSdk.ssmMod.ErrorCount] = js.native
  
  /**
    * If this time is reached and the command has not already started running, it will not run. Calculated based on the ExpiresAfter user input provided as part of the SendCommand API.
    */
  var ExpiresAfter: js.UndefOr[DateTime] = js.native
  
  /**
    * The instance IDs against which this command was requested.
    */
  var InstanceIds: js.UndefOr[InstanceIdList] = js.native
  
  /**
    * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Running commands using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  
  /**
    * The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see Running commands using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxErrors: js.UndefOr[typings.awsSdk.ssmMod.MaxErrors] = js.native
  
  /**
    * Configurations for sending notifications about command status changes. 
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.native
  
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Region of the S3 bucket.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  
  /**
    * The parameter values to be inserted in the document when running the command.
    */
  var Parameters: js.UndefOr[typings.awsSdk.ssmMod.Parameters] = js.native
  
  /**
    * The date and time the command was requested.
    */
  var RequestedDateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes. 
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.native
  
  /**
    * The status of the command.
    */
  var Status: js.UndefOr[CommandStatus] = js.native
  
  /**
    * A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to any instances.   In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.   Success: The command successfully ran on all invocations. This is a terminal state.   Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.   Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.   Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.   Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.ssmMod.StatusDetails] = js.native
  
  /**
    * The number of targets for the command.
    */
  var TargetCount: js.UndefOr[typings.awsSdk.ssmMod.TargetCount] = js.native
  
  /**
    * An array of search criteria that targets instances using a Key,Value combination that you specify. Targets is required if you don't provide one or more instance IDs in the call.
    */
  var Targets: js.UndefOr[typings.awsSdk.ssmMod.Targets] = js.native
  
  /**
    * The TimeoutSeconds value specified for a command.
    */
  var TimeoutSeconds: js.UndefOr[typings.awsSdk.ssmMod.TimeoutSeconds] = js.native
}
object Command {
  
  @scala.inline
  def apply(): Command = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Command]
  }
  
  @scala.inline
  implicit class CommandMutableBuilder[Self <: Command] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    @scala.inline
    def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    @scala.inline
    def setCompletedCount(value: CompletedCount): Self = StObject.set(x, "CompletedCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCompletedCountUndefined: Self = StObject.set(x, "CompletedCount", js.undefined)
    
    @scala.inline
    def setDeliveryTimedOutCount(value: DeliveryTimedOutCount): Self = StObject.set(x, "DeliveryTimedOutCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeliveryTimedOutCountUndefined: Self = StObject.set(x, "DeliveryTimedOutCount", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    @scala.inline
    def setErrorCount(value: ErrorCount): Self = StObject.set(x, "ErrorCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setErrorCountUndefined: Self = StObject.set(x, "ErrorCount", js.undefined)
    
    @scala.inline
    def setExpiresAfter(value: DateTime): Self = StObject.set(x, "ExpiresAfter", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpiresAfterUndefined: Self = StObject.set(x, "ExpiresAfter", js.undefined)
    
    @scala.inline
    def setInstanceIds(value: InstanceIdList): Self = StObject.set(x, "InstanceIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceIdsUndefined: Self = StObject.set(x, "InstanceIds", js.undefined)
    
    @scala.inline
    def setInstanceIdsVarargs(value: InstanceId*): Self = StObject.set(x, "InstanceIds", js.Array(value :_*))
    
    @scala.inline
    def setMaxConcurrency(value: MaxConcurrency): Self = StObject.set(x, "MaxConcurrency", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxConcurrencyUndefined: Self = StObject.set(x, "MaxConcurrency", js.undefined)
    
    @scala.inline
    def setMaxErrors(value: MaxErrors): Self = StObject.set(x, "MaxErrors", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxErrorsUndefined: Self = StObject.set(x, "MaxErrors", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    @scala.inline
    def setOutputS3BucketName(value: S3BucketName): Self = StObject.set(x, "OutputS3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3BucketNameUndefined: Self = StObject.set(x, "OutputS3BucketName", js.undefined)
    
    @scala.inline
    def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = StObject.set(x, "OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3KeyPrefixUndefined: Self = StObject.set(x, "OutputS3KeyPrefix", js.undefined)
    
    @scala.inline
    def setOutputS3Region(value: S3Region): Self = StObject.set(x, "OutputS3Region", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOutputS3RegionUndefined: Self = StObject.set(x, "OutputS3Region", js.undefined)
    
    @scala.inline
    def setParameters(value: Parameters): Self = StObject.set(x, "Parameters", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setParametersUndefined: Self = StObject.set(x, "Parameters", js.undefined)
    
    @scala.inline
    def setRequestedDateTime(value: DateTime): Self = StObject.set(x, "RequestedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestedDateTimeUndefined: Self = StObject.set(x, "RequestedDateTime", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ServiceRole): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    @scala.inline
    def setStatus(value: CommandStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    @scala.inline
    def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    @scala.inline
    def setTargetCount(value: TargetCount): Self = StObject.set(x, "TargetCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetCountUndefined: Self = StObject.set(x, "TargetCount", js.undefined)
    
    @scala.inline
    def setTargets(value: Targets): Self = StObject.set(x, "Targets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTargetsUndefined: Self = StObject.set(x, "Targets", js.undefined)
    
    @scala.inline
    def setTargetsVarargs(value: Target*): Self = StObject.set(x, "Targets", js.Array(value :_*))
    
    @scala.inline
    def setTimeoutSeconds(value: TimeoutSeconds): Self = StObject.set(x, "TimeoutSeconds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimeoutSecondsUndefined: Self = StObject.set(x, "TimeoutSeconds", js.undefined)
  }
}
