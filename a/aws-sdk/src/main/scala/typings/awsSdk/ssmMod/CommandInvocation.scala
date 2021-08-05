package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandInvocation extends StObject {
  
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.undefined
  
  /**
    * The command against which this invocation was requested.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.undefined
  
  var CommandPlugins: js.UndefOr[CommandPluginList] = js.undefined
  
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.undefined
  
  /**
    * The document name that was requested for execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.undefined
  
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The instance ID in which this invocation was requested.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.
    */
  var InstanceName: js.UndefOr[InstanceTagName] = js.undefined
  
  /**
    * Configurations for sending notifications about command status changes on a per instance basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.undefined
  
  /**
    * The time and date the request was sent to this instance.
    */
  var RequestedDateTime: js.UndefOr[DateTime] = js.undefined
  
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.undefined
  
  /**
    * The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * Whether or not the invocation succeeded, failed, or is pending.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
  
  /**
    * A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.ssmMod.StatusDetails] = js.undefined
  
  /**
    *  Gets the trace output sent by the agent. 
    */
  var TraceOutput: js.UndefOr[InvocationTraceOutput] = js.undefined
}
object CommandInvocation {
  
  inline def apply(): CommandInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandInvocation]
  }
  
  extension [Self <: CommandInvocation](x: Self) {
    
    inline def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = StObject.set(x, "CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    inline def setCloudWatchOutputConfigUndefined: Self = StObject.set(x, "CloudWatchOutputConfig", js.undefined)
    
    inline def setCommandId(value: CommandId): Self = StObject.set(x, "CommandId", value.asInstanceOf[js.Any])
    
    inline def setCommandIdUndefined: Self = StObject.set(x, "CommandId", js.undefined)
    
    inline def setCommandPlugins(value: CommandPluginList): Self = StObject.set(x, "CommandPlugins", value.asInstanceOf[js.Any])
    
    inline def setCommandPluginsUndefined: Self = StObject.set(x, "CommandPlugins", js.undefined)
    
    inline def setCommandPluginsVarargs(value: CommandPlugin*): Self = StObject.set(x, "CommandPlugins", js.Array(value :_*))
    
    inline def setComment(value: Comment): Self = StObject.set(x, "Comment", value.asInstanceOf[js.Any])
    
    inline def setCommentUndefined: Self = StObject.set(x, "Comment", js.undefined)
    
    inline def setDocumentName(value: DocumentName): Self = StObject.set(x, "DocumentName", value.asInstanceOf[js.Any])
    
    inline def setDocumentNameUndefined: Self = StObject.set(x, "DocumentName", js.undefined)
    
    inline def setDocumentVersion(value: DocumentVersion): Self = StObject.set(x, "DocumentVersion", value.asInstanceOf[js.Any])
    
    inline def setDocumentVersionUndefined: Self = StObject.set(x, "DocumentVersion", js.undefined)
    
    inline def setInstanceId(value: InstanceId): Self = StObject.set(x, "InstanceId", value.asInstanceOf[js.Any])
    
    inline def setInstanceIdUndefined: Self = StObject.set(x, "InstanceId", js.undefined)
    
    inline def setInstanceName(value: InstanceTagName): Self = StObject.set(x, "InstanceName", value.asInstanceOf[js.Any])
    
    inline def setInstanceNameUndefined: Self = StObject.set(x, "InstanceName", js.undefined)
    
    inline def setNotificationConfig(value: NotificationConfig): Self = StObject.set(x, "NotificationConfig", value.asInstanceOf[js.Any])
    
    inline def setNotificationConfigUndefined: Self = StObject.set(x, "NotificationConfig", js.undefined)
    
    inline def setRequestedDateTime(value: DateTime): Self = StObject.set(x, "RequestedDateTime", value.asInstanceOf[js.Any])
    
    inline def setRequestedDateTimeUndefined: Self = StObject.set(x, "RequestedDateTime", js.undefined)
    
    inline def setServiceRole(value: ServiceRole): Self = StObject.set(x, "ServiceRole", value.asInstanceOf[js.Any])
    
    inline def setServiceRoleUndefined: Self = StObject.set(x, "ServiceRole", js.undefined)
    
    inline def setStandardErrorUrl(value: Url): Self = StObject.set(x, "StandardErrorUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardErrorUrlUndefined: Self = StObject.set(x, "StandardErrorUrl", js.undefined)
    
    inline def setStandardOutputUrl(value: Url): Self = StObject.set(x, "StandardOutputUrl", value.asInstanceOf[js.Any])
    
    inline def setStandardOutputUrlUndefined: Self = StObject.set(x, "StandardOutputUrl", js.undefined)
    
    inline def setStatus(value: CommandInvocationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusDetails(value: StatusDetails): Self = StObject.set(x, "StatusDetails", value.asInstanceOf[js.Any])
    
    inline def setStatusDetailsUndefined: Self = StObject.set(x, "StatusDetails", js.undefined)
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
    
    inline def setTraceOutput(value: InvocationTraceOutput): Self = StObject.set(x, "TraceOutput", value.asInstanceOf[js.Any])
    
    inline def setTraceOutputUndefined: Self = StObject.set(x, "TraceOutput", js.undefined)
  }
}
