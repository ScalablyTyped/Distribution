package typings.awsSdk.ssmMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CommandPlugin extends js.Object {
  /**
    * The name of the plugin. Must be one of the following: aws:updateAgent, aws:domainjoin, aws:applications, aws:runPowerShellScript, aws:psmodule, aws:cloudWatch, aws:runShellScript, or aws:updateSSMAgent. 
    */
  var Name: js.UndefOr[CommandPluginName] = js.native
  /**
    * Output of the plugin execution.
    */
  var Output: js.UndefOr[CommandPluginOutput] = js.native
  /**
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the S3 bucket; ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the S3 bucket; ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the S3 bucket region.
    */
  var OutputS3Region: js.UndefOr[S3Region] = js.native
  /**
    * A numeric response code generated after running the plugin. 
    */
  var ResponseCode: js.UndefOr[typings.awsSdk.ssmMod.ResponseCode] = js.native
  /**
    * The time the plugin stopped running. Could stop prematurely if, for example, a cancel command was sent. 
    */
  var ResponseFinishDateTime: js.UndefOr[DateTime] = js.native
  /**
    * The time the plugin started running. 
    */
  var ResponseStartDateTime: js.UndefOr[DateTime] = js.native
  /**
    * The URL for the complete text written by the plugin to stderr. If execution is not yet complete, then this string is empty.
    */
  var StandardErrorUrl: js.UndefOr[Url] = js.native
  /**
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If the S3 bucket for the command was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  /**
    * The status of this plugin. You can run a document with multiple plugins.
    */
  var Status: js.UndefOr[CommandPluginStatus] = js.native
  /**
    * A detailed status of the plugin execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding command statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.ssmMod.StatusDetails] = js.native
}

object CommandPlugin {
  @scala.inline
  def apply(): CommandPlugin = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommandPlugin]
  }
  @scala.inline
  implicit class CommandPluginOps[Self <: CommandPlugin] (val x: Self) extends AnyVal {
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
    def setName(value: CommandPluginName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("Name", js.undefined)
    @scala.inline
    def setOutput(value: CommandPluginOutput): Self = this.set("Output", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutput: Self = this.set("Output", js.undefined)
    @scala.inline
    def setOutputS3BucketName(value: S3BucketName): Self = this.set("OutputS3BucketName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3BucketName: Self = this.set("OutputS3BucketName", js.undefined)
    @scala.inline
    def setOutputS3KeyPrefix(value: S3KeyPrefix): Self = this.set("OutputS3KeyPrefix", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3KeyPrefix: Self = this.set("OutputS3KeyPrefix", js.undefined)
    @scala.inline
    def setOutputS3Region(value: S3Region): Self = this.set("OutputS3Region", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOutputS3Region: Self = this.set("OutputS3Region", js.undefined)
    @scala.inline
    def setResponseCode(value: ResponseCode): Self = this.set("ResponseCode", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseCode: Self = this.set("ResponseCode", js.undefined)
    @scala.inline
    def setResponseFinishDateTime(value: DateTime): Self = this.set("ResponseFinishDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseFinishDateTime: Self = this.set("ResponseFinishDateTime", js.undefined)
    @scala.inline
    def setResponseStartDateTime(value: DateTime): Self = this.set("ResponseStartDateTime", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResponseStartDateTime: Self = this.set("ResponseStartDateTime", js.undefined)
    @scala.inline
    def setStandardErrorUrl(value: Url): Self = this.set("StandardErrorUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardErrorUrl: Self = this.set("StandardErrorUrl", js.undefined)
    @scala.inline
    def setStandardOutputUrl(value: Url): Self = this.set("StandardOutputUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStandardOutputUrl: Self = this.set("StandardOutputUrl", js.undefined)
    @scala.inline
    def setStatus(value: CommandPluginStatus): Self = this.set("Status", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatus: Self = this.set("Status", js.undefined)
    @scala.inline
    def setStatusDetails(value: StatusDetails): Self = this.set("StatusDetails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStatusDetails: Self = this.set("StatusDetails", js.undefined)
  }
  
}

