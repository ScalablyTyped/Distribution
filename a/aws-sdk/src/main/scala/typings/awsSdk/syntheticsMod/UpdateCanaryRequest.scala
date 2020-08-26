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
  def apply(Name: CanaryName): UpdateCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCanaryRequest]
  }
  @scala.inline
  implicit class UpdateCanaryRequestOps[Self <: UpdateCanaryRequest] (val x: Self) extends AnyVal {
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
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setCode(value: CanaryCodeInput): Self = this.set("Code", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCode: Self = this.set("Code", js.undefined)
    @scala.inline
    def setExecutionRoleArn(value: Arn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExecutionRoleArn: Self = this.set("ExecutionRoleArn", js.undefined)
    @scala.inline
    def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = this.set("FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFailureRetentionPeriodInDays: Self = this.set("FailureRetentionPeriodInDays", js.undefined)
    @scala.inline
    def setRunConfig(value: CanaryRunConfigInput): Self = this.set("RunConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRunConfig: Self = this.set("RunConfig", js.undefined)
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("RuntimeVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRuntimeVersion: Self = this.set("RuntimeVersion", js.undefined)
    @scala.inline
    def setSchedule(value: CanaryScheduleInput): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSchedule: Self = this.set("Schedule", js.undefined)
    @scala.inline
    def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = this.set("SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSuccessRetentionPeriodInDays: Self = this.set("SuccessRetentionPeriodInDays", js.undefined)
    @scala.inline
    def setVpcConfig(value: VpcConfigInput): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
  
}

