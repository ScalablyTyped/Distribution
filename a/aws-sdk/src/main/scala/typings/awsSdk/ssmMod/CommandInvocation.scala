package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommandInvocation extends StObject {
  
  /**
    * Amazon CloudWatch Logs information where you want Amazon Web Services Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.undefined
  
  /**
    * The command against which this invocation was requested.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.undefined
  
  /**
    * Plugins processed by the command.
    */
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
    * The Systems Manager document (SSM document) version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.undefined
  
  /**
    * The managed node ID in which this invocation was requested.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.undefined
  
  /**
    * The fully qualified host name of the managed node.
    */
  var InstanceName: js.UndefOr[InstanceTagName] = js.undefined
  
  /**
    * Configurations for sending notifications about command status changes on a per managed node basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.undefined
  
  /**
    * The time and date the request was sent to this managed node.
    */
  var RequestedDateTime: js.UndefOr[js.Date] = js.undefined
  
  /**
    * The Identity and Access Management (IAM) service role that Run Command, a capability of Amazon Web Services Systems Manager, uses to act on your behalf when sending notifications about command status changes on a per managed node basis.
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.undefined
  
  /**
    * The URL to the plugin's StdErr file in Amazon Simple Storage Service (Amazon S3), if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * The URL to the plugin's StdOut file in Amazon Simple Storage Service (Amazon S3), if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.undefined
  
  /**
    * Whether or not the invocation succeeded, failed, or is pending.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.undefined
  
  /**
    * A detailed status of the command execution for each invocation (each managed node targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the Amazon Web Services Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command hasn't been sent to the managed node.   In Progress: The command has been sent to the managed node but hasn't reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command wasn't delivered to the managed node before the delivery timeout expired. Delivery timeouts don't count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the managed node, but the execution wasn't complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command wasn't successful on the managed node. For a plugin, this indicates that the result code wasn't zero. For a command invocation, this indicates that the result code for one or more plugins wasn't zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Cancelled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the managed node. The managed node might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.   Delayed: The system attempted to send the command to the managed node but wasn't successful. The system retries again.  
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
    
    inline def setCommandPluginsVarargs(value: CommandPlugin*): Self = StObject.set(x, "CommandPlugins", js.Array(value*))
    
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
    
    inline def setRequestedDateTime(value: js.Date): Self = StObject.set(x, "RequestedDateTime", value.asInstanceOf[js.Any])
    
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
