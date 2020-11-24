package typings.awsSdk.syntheticsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateCanaryRequest extends js.Object {
  
  /**
    * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: String = js.native
  
  /**
    * A structure that includes the entry point from which the canary should start running your script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. 
    */
  var Code: CanaryCodeInput = js.native
  
  /**
    * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include lambda.amazonaws.com as a principal in the trust policy. The role must also have the following permissions:    s3:PutObject     s3:GetBucketLocation     s3:ListAllMyBuckets     cloudwatch:PutMetricData     logs:CreateLogGroup     logs:CreateLogStream     logs:PutLogEvents   
    */
  var ExecutionRoleArn: RoleArn = js.native
  
  /**
    * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  
  /**
    * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your account. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the canary ARN, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  var Name: CanaryName = js.native
  
  /**
    * A structure that contains the configuration for individual canary runs, such as timeout value.
    */
  var RunConfig: js.UndefOr[CanaryRunConfigInput] = js.native
  
  /**
    * Specifies the runtime version to use for the canary. For a list of valid runtime versions and more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: String = js.native
  
  /**
    * A structure that contains information about how often the canary is to run and when these test runs are to stop.
    */
  var Schedule: CanaryScheduleInput = js.native
  
  /**
    * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.native
  
  /**
    * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values.
    */
  var Tags: js.UndefOr[TagMap] = js.native
  
  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security groups of the VPC endpoint. For more information, see  Running a Canary in a VPC.
    */
  var VpcConfig: js.UndefOr[VpcConfigInput] = js.native
}
object CreateCanaryRequest {
  
  @scala.inline
  def apply(
    ArtifactS3Location: String,
    Code: CanaryCodeInput,
    ExecutionRoleArn: RoleArn,
    Name: CanaryName,
    RuntimeVersion: String,
    Schedule: CanaryScheduleInput
  ): CreateCanaryRequest = {
    val __obj = js.Dynamic.literal(ArtifactS3Location = ArtifactS3Location.asInstanceOf[js.Any], Code = Code.asInstanceOf[js.Any], ExecutionRoleArn = ExecutionRoleArn.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], RuntimeVersion = RuntimeVersion.asInstanceOf[js.Any], Schedule = Schedule.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateCanaryRequest]
  }
  
  @scala.inline
  implicit class CreateCanaryRequestOps[Self <: CreateCanaryRequest] (val x: Self) extends AnyVal {
    
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
    def setArtifactS3Location(value: String): Self = this.set("ArtifactS3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: CanaryCodeInput): Self = this.set("Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = this.set("ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: CanaryName): Self = this.set("Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = this.set("RuntimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: CanaryScheduleInput): Self = this.set("Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = this.set("FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFailureRetentionPeriodInDays: Self = this.set("FailureRetentionPeriodInDays", js.undefined)
    
    @scala.inline
    def setRunConfig(value: CanaryRunConfigInput): Self = this.set("RunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRunConfig: Self = this.set("RunConfig", js.undefined)
    
    @scala.inline
    def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = this.set("SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSuccessRetentionPeriodInDays: Self = this.set("SuccessRetentionPeriodInDays", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = this.set("Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("Tags", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfigInput): Self = this.set("VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVpcConfig: Self = this.set("VpcConfig", js.undefined)
  }
}
