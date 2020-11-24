package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CommandInvocation extends js.Object {
  
  /**
    * CloudWatch Logs information where you want Systems Manager to send the command output.
    */
  var CloudWatchOutputConfig: js.UndefOr[typings.awsSdk.ssmMod.CloudWatchOutputConfig] = js.native
  
  /**
    * The command against which this invocation was requested.
    */
  var CommandId: js.UndefOr[typings.awsSdk.ssmMod.CommandId] = js.native
  
  var CommandPlugins: js.UndefOr[CommandPluginList] = js.native
  
  /**
    * User-specified information about the command, such as a brief description of what the command should do.
    */
  var Comment: js.UndefOr[typings.awsSdk.ssmMod.Comment] = js.native
  
  /**
    * The document name that was requested for execution.
    */
  var DocumentName: js.UndefOr[typings.awsSdk.ssmMod.DocumentName] = js.native
  
  /**
    * The SSM document version.
    */
  var DocumentVersion: js.UndefOr[typings.awsSdk.ssmMod.DocumentVersion] = js.native
  
  /**
    * The instance ID in which this invocation was requested.
    */
  var InstanceId: js.UndefOr[typings.awsSdk.ssmMod.InstanceId] = js.native
  
  /**
    * The name of the invocation target. For EC2 instances this is the value for the aws:Name tag. For on-premises instances, this is the name of the instance.
    */
  var InstanceName: js.UndefOr[InstanceTagName] = js.native
  
  /**
    * Configurations for sending notifications about command status changes on a per instance basis.
    */
  var NotificationConfig: js.UndefOr[typings.awsSdk.ssmMod.NotificationConfig] = js.native
  
  /**
    * The time and date the request was sent to this instance.
    */
  var RequestedDateTime: js.UndefOr[DateTime] = js.native
  
  /**
    * The IAM service role that Run Command uses to act on your behalf when sending notifications about command status changes on a per instance basis.
    */
  var ServiceRole: js.UndefOr[typings.awsSdk.ssmMod.ServiceRole] = js.native
  
  /**
    * The URL to the plugin's StdErr file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardErrorUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.native
  
  /**
    * The URL to the plugin's StdOut file in Amazon S3, if the S3 bucket was defined for the parent command. For an invocation, StandardOutputUrl is populated if there is just one plugin defined for the command, and the S3 bucket was defined for the command.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  
  /**
    * Whether or not the invocation succeeded, failed, or is pending.
    */
  var Status: js.UndefOr[CommandInvocationStatus] = js.native
  
  /**
    * A detailed status of the command execution for each invocation (each instance targeted by the command). StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist or might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit and don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.ssmMod.StatusDetails] = js.native
  
  /**
    *  Gets the trace output sent by the agent. 
    */
  var TraceOutput: js.UndefOr[InvocationTraceOutput] = js.native
}
object CommandInvocation {
  
  @scala.inline
  def apply(): CommandInvocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandInvocation]
  }
  
  @scala.inline
  implicit class CommandInvocationOps[Self <: CommandInvocation] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: java.lang.String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setCloudWatchOutputConfig(value: CloudWatchOutputConfig): Self = this.set("CloudWatchOutputConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCloudWatchOutputConfig: Self = this.set("CloudWatchOutputConfig", js.undefined)
    
    @scala.inline
    def setCommandId(value: CommandId): Self = this.set("CommandId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandId: Self = this.set("CommandId", js.undefined)
    
    @scala.inline
    def setCommandPluginsVarargs(value: CommandPlugin*): Self = this.set("CommandPlugins", js.Array(value :_*))
    
    @scala.inline
    def setCommandPlugins(value: CommandPluginList): Self = this.set("CommandPlugins", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCommandPlugins: Self = this.set("CommandPlugins", js.undefined)
    
    @scala.inline
    def setComment(value: Comment): Self = this.set("Comment", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteComment: Self = this.set("Comment", js.undefined)
    
    @scala.inline
    def setDocumentName(value: DocumentName): Self = this.set("DocumentName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentName: Self = this.set("DocumentName", js.undefined)
    
    @scala.inline
    def setDocumentVersion(value: DocumentVersion): Self = this.set("DocumentVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDocumentVersion: Self = this.set("DocumentVersion", js.undefined)
    
    @scala.inline
    def setInstanceId(value: InstanceId): Self = this.set("InstanceId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceId: Self = this.set("InstanceId", js.undefined)
    
    @scala.inline
    def setInstanceName(value: InstanceTagName): Self = this.set("InstanceName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInstanceName: Self = this.set("InstanceName", js.undefined)
    
    @scala.inline
    def setNotificationConfig(value: NotificationConfig): Self = this.set("NotificationConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteNotificationConfig: Self = this.set("NotificationConfig", js.undefined)
    
    @scala.inline
    def setRequestedDateTime(value: DateTime): Self = this.set("RequestedDateTime", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRequestedDateTime: Self = this.set("RequestedDateTime", js.undefined)
    
    @scala.inline
    def setServiceRole(value: ServiceRole): Self = this.set("ServiceRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteServiceRole: Self = this.set("ServiceRole", js.undefined)
    
    @scala.inline
    def setStandardErrorUrl(value: Url): Self = this.set("StandardErrorUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardErrorUrl: Self = this.set("StandardErrorUrl", js.undefined)
    
    @scala.inline
    def setStandardOutputUrl(value: Url): Self = this.set("StandardOutputUrl", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStandardOutputUrl: Self = this.set("StandardOutputUrl", js.undefined)
    
    @scala.inline
    def setStatus(value: CommandInvocationStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
    
    @scala.inline
    def setTraceOutput(value: InvocationTraceOutput): Self = this.set("TraceOutput", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTraceOutput: Self = this.set("TraceOutput", js.undefined)
  }
}
