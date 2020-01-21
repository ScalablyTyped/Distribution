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
    * The S3 bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3BucketName: js.UndefOr[S3BucketName] = js.native
  /**
    * The S3 directory path inside the bucket where the responses to the command executions should be stored. This was requested when issuing the command. For example, in the following response:  test_folder/ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix/i-1234567876543/awsrunShellScript  test_folder is the name of the Amazon S3 bucket;  ab19cb99-a030-46dd-9dfc-8eSAMPLEPre-Fix is the name of the S3 prefix; i-1234567876543 is the instance ID; awsrunShellScript is the name of the plugin.
    */
  var OutputS3KeyPrefix: js.UndefOr[S3KeyPrefix] = js.native
  /**
    * (Deprecated) You can no longer specify this parameter. The system ignores it. Instead, Systems Manager automatically determines the Amazon S3 bucket region.
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
    * The URL for the complete text written by the plugin to stdout in Amazon S3. If the Amazon S3 bucket for the command was not specified, then this string is empty.
    */
  var StandardOutputUrl: js.UndefOr[Url] = js.native
  /**
    * The status of this plugin. You can run a document with multiple plugins.
    */
  var Status: js.UndefOr[CommandPluginStatus] = js.native
  /**
    * A detailed status of the plugin execution. StatusDetails includes more information than Status because it includes states resulting from error and concurrency control parameters. StatusDetails can show different results than Status. For more information about these statuses, see Understanding Command Statuses in the AWS Systems Manager User Guide. StatusDetails can be one of the following values:   Pending: The command has not been sent to the instance.   In Progress: The command has been sent to the instance but has not reached a terminal state.   Success: The execution of the command or plugin was successfully completed. This is a terminal state.   Delivery Timed Out: The command was not delivered to the instance before the delivery timeout expired. Delivery timeouts do not count against the parent command's MaxErrors limit, but they do contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Execution Timed Out: Command execution started on the instance, but the execution was not complete before the execution timeout expired. Execution timeouts count against the MaxErrors limit of the parent command. This is a terminal state.   Failed: The command was not successful on the instance. For a plugin, this indicates that the result code was not zero. For a command invocation, this indicates that the result code for one or more plugins was not zero. Invocation failures count against the MaxErrors limit of the parent command. This is a terminal state.   Canceled: The command was terminated before it was completed. This is a terminal state.   Undeliverable: The command can't be delivered to the instance. The instance might not exist, or it might not be responding. Undeliverable invocations don't count against the parent command's MaxErrors limit, and they don't contribute to whether the parent command status is Success or Incomplete. This is a terminal state.   Terminated: The parent command exceeded its MaxErrors limit and subsequent command invocations were canceled by the system. This is a terminal state.  
    */
  var StatusDetails: js.UndefOr[typings.awsSdk.ssmMod.StatusDetails] = js.native
}

object CommandPlugin {
  @scala.inline
  def apply(
    Name: CommandPluginName = null,
    Output: CommandPluginOutput = null,
    OutputS3BucketName: S3BucketName = null,
    OutputS3KeyPrefix: S3KeyPrefix = null,
    OutputS3Region: S3Region = null,
    ResponseCode: Int | Double = null,
    ResponseFinishDateTime: DateTime = null,
    ResponseStartDateTime: DateTime = null,
    StandardErrorUrl: Url = null,
    StandardOutputUrl: Url = null,
    Status: CommandPluginStatus = null,
    StatusDetails: StatusDetails = null
  ): CommandPlugin = {
    val __obj = js.Dynamic.literal()
    if (Name != null) __obj.updateDynamic("Name")(Name.asInstanceOf[js.Any])
    if (Output != null) __obj.updateDynamic("Output")(Output.asInstanceOf[js.Any])
    if (OutputS3BucketName != null) __obj.updateDynamic("OutputS3BucketName")(OutputS3BucketName.asInstanceOf[js.Any])
    if (OutputS3KeyPrefix != null) __obj.updateDynamic("OutputS3KeyPrefix")(OutputS3KeyPrefix.asInstanceOf[js.Any])
    if (OutputS3Region != null) __obj.updateDynamic("OutputS3Region")(OutputS3Region.asInstanceOf[js.Any])
    if (ResponseCode != null) __obj.updateDynamic("ResponseCode")(ResponseCode.asInstanceOf[js.Any])
    if (ResponseFinishDateTime != null) __obj.updateDynamic("ResponseFinishDateTime")(ResponseFinishDateTime.asInstanceOf[js.Any])
    if (ResponseStartDateTime != null) __obj.updateDynamic("ResponseStartDateTime")(ResponseStartDateTime.asInstanceOf[js.Any])
    if (StandardErrorUrl != null) __obj.updateDynamic("StandardErrorUrl")(StandardErrorUrl.asInstanceOf[js.Any])
    if (StandardOutputUrl != null) __obj.updateDynamic("StandardOutputUrl")(StandardOutputUrl.asInstanceOf[js.Any])
    if (Status != null) __obj.updateDynamic("Status")(Status.asInstanceOf[js.Any])
    if (StatusDetails != null) __obj.updateDynamic("StatusDetails")(StatusDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CommandPlugin]
  }
}

