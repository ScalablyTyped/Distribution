package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Command extends js.Object {
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
    * The maximum number of instances that are allowed to run the command at the same time. You can specify a number of instances, such as 10, or a percentage of instances, such as 10%. The default value is 50. For more information about how to use MaxConcurrency, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
    */
  var MaxConcurrency: js.UndefOr[typings.awsSdk.ssmMod.MaxConcurrency] = js.native
  /**
    * The maximum number of errors allowed before the system stops sending the command to additional targets. You can specify a number of errors, such as 10, or a percentage or errors, such as 10%. The default value is 0. For more information about how to use MaxErrors, see Running Commands Using Systems Manager Run Command in the AWS Systems Manager User Guide.
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
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
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
    * A detailed status of the command execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to any instances.   In Progress: The command has been sent to at least one instance but has not reached a final state on all instances.   Success: The command successfully ran on all invocations. This is a terminal state.   Delivery Timed Out: The value of MaxErrors or more command invocations shows a status of Delivery Timed Out. This is a terminal state.   Execution Timed Out: The value of MaxErrors or more command invocations shows a status of Execution Timed Out. This is a terminal state.   Failed: The value of MaxErrors or more command invocations shows a status of Failed. This is a terminal state.   Incomplete: The command was attempted on all instances and one or more invocations does not have a value of Success but not enough invocations failed for the status to be Failed. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Rate Exceeded: The number of instances targeted by the command exceeded the account limit for pending invocations. The system has canceled the command before running it on any instance. This is a terminal state.  
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
}

object Command {
  @scala.inline
  def apply(
    CloudWatchOutputConfig: CloudWatchOutputConfig = null,
    CommandId: CommandId = null,
    Comment: Comment = null,
    CompletedCount: Int | Double = null,
    DeliveryTimedOutCount: Int | Double = null,
    DocumentName: DocumentName = null,
    DocumentVersion: DocumentVersion = null,
    ErrorCount: Int | Double = null,
    ExpiresAfter: DateTime = null,
    InstanceIds: InstanceIdList = null,
    MaxConcurrency: MaxConcurrency = null,
    MaxErrors: MaxErrors = null,
    NotificationConfig: NotificationConfig = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    OutputS3Region: S3Region = null,
    Parameters: Parameters = null,
    RequestedDateTime: DateTime = null,
    ServiceRole: ServiceRole = null,
    Status: CommandStatus = null,
    StatusDetails: StatusDetails = null,
    TargetCount: Int | Double = null,
    Targets: Targets = null
  ): Command = {
    val __obj = js.Dynamic.literal()
    if (CloudWatchOutputConfig != null) __obj.updateDynamic("CloudWatchOutputConfig")(CloudWatchOutputConfig.asInstanceOf[js.Any])
    if (CommandId != null) __obj.updateDynamic("CommandId")(CommandId.asInstanceOf[js.Any])
    if (Comment != null) __obj.updateDynamic("Comment")(Comment.asInstanceOf[js.Any])
    if (CompletedCount != null) __obj.updateDynamic("CompletedCount")(CompletedCount.asInstanceOf[js.Any])
    if (DeliveryTimedOutCount != null) __obj.updateDynamic("DeliveryTimedOutCount")(DeliveryTimedOutCount.asInstanceOf[js.Any])
    if (DocumentName != null) __obj.updateDynamic("DocumentName")(DocumentName.asInstanceOf[js.Any])
    if (DocumentVersion != null) __obj.updateDynamic("DocumentVersion")(DocumentVersion.asInstanceOf[js.Any])
    if (ErrorCount != null) __obj.updateDynamic("ErrorCount")(ErrorCount.asInstanceOf[js.Any])
    if (ExpiresAfter != null) __obj.updateDynamic("ExpiresAfter")(ExpiresAfter.asInstanceOf[js.Any])
    if (InstanceIds != null) __obj.updateDynamic("InstanceIds")(InstanceIds.asInstanceOf[js.Any])
    if (MaxConcurrency != null) __obj.updateDynamic("MaxConcurrency")(MaxConcurrency.asInstanceOf[js.Any])
    if (MaxErrors != null) __obj.updateDynamic("MaxErrors")(MaxErrors.asInstanceOf[js.Any])
    if (NotificationConfig != null) __obj.updateDynamic("NotificationConfig")(NotificationConfig.asInstanceOf[js.Any])
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName.asInstanceOf[js.Any])
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix.asInstanceOf[js.Any])
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region.asInstanceOf[js.Any])
    if (Parameters != null) __obj.updateDynamic("Parameters")(Parameters.asInstanceOf[js.Any])
    if (RequestedDateTime != null) __obj.updateDynamic("RequestedDateTime")(RequestedDateTime.asInstanceOf[js.Any])
    if (ServiceRole != null) __obj.updateDynamic("ServiceRole")(ServiceRole.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    if (TargetCount != null) __obj.updateDynamic("TargetCount")(TargetCount.asInstanceOf[js.Any])
    if (Targets != null) __obj.updateDynamic("Targets")(Targets.asInstanceOf[js.Any])
    __obj.asInstanceOf[Command]
  }
}

