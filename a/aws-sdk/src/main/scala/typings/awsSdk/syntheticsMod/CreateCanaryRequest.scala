package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateCanaryRequest extends StObject {
  
  /**
    * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include the log file, screenshots, and HAR files.
    */
  var ArtifactS3Location: String
  
  /**
    * A structure that includes the entry point from which the canary should start running your script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. 
    */
  var Code: CanaryCodeInput
  
  /**
    * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include lambda.amazonaws.com as a principal in the trust policy. The role must also have the following permissions:    s3:PutObject     s3:GetBucketLocation     s3:ListAllMyBuckets     cloudwatch:PutMetricData     logs:CreateLogGroup     logs:CreateLogStream     logs:PutLogEvents   
    */
  var ExecutionRoleArn: RoleArn
  
  /**
    * The number of days to retain data about failed runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * The name for this canary. Be sure to give it a descriptive name that distinguishes it from other canaries in your account. Do not include secrets or proprietary information in your canary names. The canary name makes up part of the canary ARN, and the ARN is included in outbound calls over the internet. For more information, see Security Considerations for Synthetics Canaries.
    */
  var Name: CanaryName
  
  /**
    * A structure that contains the configuration for individual canary runs, such as timeout value.
    */
  var RunConfig: js.UndefOr[CanaryRunConfigInput] = js.undefined
  
  /**
    * Specifies the runtime version to use for the canary. For a list of valid runtime versions and more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: String
  
  /**
    * A structure that contains information about how often the canary is to run and when these test runs are to stop.
    */
  var Schedule: CanaryScheduleInput
  
  /**
    * The number of days to retain data about successful runs of this canary. If you omit this field, the default of 31 days is used. The valid range is 1 to 455 days.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * A list of key-value pairs to associate with the canary. You can associate as many as 50 tags with a canary. Tags can help you organize and categorize your resources. You can also use them to scope user permissions, by granting a user permission to access or change only the resources that have certain tag values.
    */
  var Tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security groups of the VPC endpoint. For more information, see  Running a Canary in a VPC.
    */
  var VpcConfig: js.UndefOr[VpcConfigInput] = js.undefined
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
  implicit class CreateCanaryRequestMutableBuilder[Self <: CreateCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setArtifactS3Location(value: String): Self = StObject.set(x, "ArtifactS3Location", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCode(value: CanaryCodeInput): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFailureRetentionPeriodInDaysUndefined: Self = StObject.set(x, "FailureRetentionPeriodInDays", js.undefined)
    
    @scala.inline
    def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfig(value: CanaryRunConfigInput): Self = StObject.set(x, "RunConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRunConfigUndefined: Self = StObject.set(x, "RunConfig", js.undefined)
    
    @scala.inline
    def setRuntimeVersion(value: String): Self = StObject.set(x, "RuntimeVersion", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSchedule(value: CanaryScheduleInput): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRetentionPeriodInDaysUndefined: Self = StObject.set(x, "SuccessRetentionPeriodInDays", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfigInput): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
