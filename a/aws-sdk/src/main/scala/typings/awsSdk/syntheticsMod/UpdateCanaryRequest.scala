package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait UpdateCanaryRequest extends js.Object {
  /**
    * A structure that includes the entry point from which the canary should start running your script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. 
    */
  var Code: js.UndefOr[CanaryCodeInput] = js.native
  /**
    * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include lambda.amazonaws.com as a principal in the trust policy. The role must also have the following permissions:    s3:PutObject     s3:GetBucketLocation     s3:ListAllMyBuckets     cloudwatch:PutMetricData     logs:CreateLogGroup     logs:CreateLogStream     logs:CreateLogStream   
    */
  var ExecutionRoleArn: js.UndefOr[Arn] = js.native
  /**
    * The number of days to retain data about failed runs of this canary.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  /**
    * The name of the canary that you want to update. To find the names of your canaries, use DescribeCanaries. You cannot change the name of a canary that has already been created.
    */
  var Name: CanaryName = js.native
  /**
    * A structure that contains the timeout value that is used for each individual run of the canary.
    */
  var RunConfig: js.UndefOr[CanaryRunConfigInput] = js.native
  /**
    * Specifies the runtime version to use for the canary. Currently, the only valid value is syn-1.0. For more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: js.UndefOr[String] = js.native
  /**
    * A structure that contains information about how often the canary is to run, and when these runs are to stop.
    */
  var Schedule: js.UndefOr[CanaryScheduleInput] = js.native
  /**
    * The number of days to retain data about successful runs of this canary.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security groups of the VPC endpoint. For more information, see  Running a Canary in a VPC.
    */
  var VpcConfig: js.UndefOr[VpcConfigInput] = js.native
}

object UpdateCanaryRequest {
  @scala.inline
  def apply(
    Name: CanaryName,
    Code: CanaryCodeInput = null,
    ExecutionRoleArn: Arn = null,
    FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
    RunConfig: CanaryRunConfigInput = null,
    RuntimeVersion: String = null,
    Schedule: CanaryScheduleInput = null,
    SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined,
    VpcConfig: VpcConfigInput = null
  ): UpdateCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    if (Code != null) __obj.updateDynamic("Code")(Code.asInstanceOf[js.Any])
    if (ExecutionRoleArn != null) __obj.updateDynamic("ExecutionRoleArn")(ExecutionRoleArn.asInstanceOf[js.Any])
    if (!js.isUndefined(FailureRetentionPeriodInDays)) __obj.updateDynamic("FailureRetentionPeriodInDays")(FailureRetentionPeriodInDays.get.asInstanceOf[js.Any])
    if (RunConfig != null) __obj.updateDynamic("RunConfig")(RunConfig.asInstanceOf[js.Any])
    if (RuntimeVersion != null) __obj.updateDynamic("RuntimeVersion")(RuntimeVersion.asInstanceOf[js.Any])
    if (Schedule != null) __obj.updateDynamic("Schedule")(Schedule.asInstanceOf[js.Any])
    if (!js.isUndefined(SuccessRetentionPeriodInDays)) __obj.updateDynamic("SuccessRetentionPeriodInDays")(SuccessRetentionPeriodInDays.get.asInstanceOf[js.Any])
    if (VpcConfig != null) __obj.updateDynamic("VpcConfig")(VpcConfig.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCanaryRequest]
  }
}

