package typings.awsSdk.clientsSyntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateCanaryRequest extends StObject {
  
  /**
    * A structure that contains the configuration for canary artifacts, including the encryption-at-rest settings for artifacts that the canary uploads to Amazon S3.
    */
  var ArtifactConfig: js.UndefOr[ArtifactConfigInput] = js.undefined
  
  /**
    * The location in Amazon S3 where Synthetics stores artifacts from the test runs of this canary. Artifacts include the log file, screenshots, and HAR files. The name of the S3 bucket can't include a period (.).
    */
  var ArtifactS3Location: js.UndefOr[String] = js.undefined
  
  /**
    * A structure that includes the entry point from which the canary should start running your script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. 
    */
  var Code: js.UndefOr[CanaryCodeInput] = js.undefined
  
  /**
    * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include lambda.amazonaws.com as a principal in the trust policy. The role must also have the following permissions:    s3:PutObject     s3:GetBucketLocation     s3:ListAllMyBuckets     cloudwatch:PutMetricData     logs:CreateLogGroup     logs:CreateLogStream     logs:CreateLogStream   
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.undefined
  
  /**
    * The number of days to retain data about failed runs of this canary.
    */
  var FailureRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * The name of the canary that you want to update. To find the names of your canaries, use DescribeCanaries. You cannot change the name of a canary that has already been created.
    */
  var Name: CanaryName
  
  /**
    * A structure that contains the timeout value that is used for each individual run of the canary.  The environment variables keys and values are not encrypted. Do not store sensitive information in this field. 
    */
  var RunConfig: js.UndefOr[CanaryRunConfigInput] = js.undefined
  
  /**
    * Specifies the runtime version to use for the canary. For a list of valid runtime versions and for more information about runtime versions, see  Canary Runtime Versions.
    */
  var RuntimeVersion: js.UndefOr[String] = js.undefined
  
  /**
    * A structure that contains information about how often the canary is to run, and when these runs are to stop.
    */
  var Schedule: js.UndefOr[CanaryScheduleInput] = js.undefined
  
  /**
    * The number of days to retain data about successful runs of this canary.
    */
  var SuccessRetentionPeriodInDays: js.UndefOr[MaxSize1024] = js.undefined
  
  /**
    * Defines the screenshots to use as the baseline for comparisons during visual monitoring comparisons during future runs of this canary. If you omit this parameter, no changes are made to any baseline screenshots that the canary might be using already. Visual monitoring is supported only on canaries running the syn-puppeteer-node-3.2 runtime or later. For more information, see  Visual monitoring and  Visual monitoring blueprint 
    */
  var VisualReference: js.UndefOr[VisualReferenceInput] = js.undefined
  
  /**
    * If this canary is to test an endpoint in a VPC, this structure contains information about the subnet and security groups of the VPC endpoint. For more information, see  Running a Canary in a VPC.
    */
  var VpcConfig: js.UndefOr[VpcConfigInput] = js.undefined
}
object UpdateCanaryRequest {
  
  inline def apply(Name: CanaryName): UpdateCanaryRequest = {
    val __obj = js.Dynamic.literal(Name = Name.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateCanaryRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateCanaryRequest] (val x: Self) extends AnyVal {
    
    inline def setArtifactConfig(value: ArtifactConfigInput): Self = StObject.set(x, "ArtifactConfig", value.asInstanceOf[js.Any])
    
    inline def setArtifactConfigUndefined: Self = StObject.set(x, "ArtifactConfig", js.undefined)
    
    inline def setArtifactS3Location(value: String): Self = StObject.set(x, "ArtifactS3Location", value.asInstanceOf[js.Any])
    
    inline def setArtifactS3LocationUndefined: Self = StObject.set(x, "ArtifactS3Location", js.undefined)
    
    inline def setCode(value: CanaryCodeInput): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    inline def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    inline def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    inline def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
    inline def setFailureRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "FailureRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setFailureRetentionPeriodInDaysUndefined: Self = StObject.set(x, "FailureRetentionPeriodInDays", js.undefined)
    
    inline def setName(value: CanaryName): Self = StObject.set(x, "Name", value.asInstanceOf[js.Any])
    
    inline def setRunConfig(value: CanaryRunConfigInput): Self = StObject.set(x, "RunConfig", value.asInstanceOf[js.Any])
    
    inline def setRunConfigUndefined: Self = StObject.set(x, "RunConfig", js.undefined)
    
    inline def setRuntimeVersion(value: String): Self = StObject.set(x, "RuntimeVersion", value.asInstanceOf[js.Any])
    
    inline def setRuntimeVersionUndefined: Self = StObject.set(x, "RuntimeVersion", js.undefined)
    
    inline def setSchedule(value: CanaryScheduleInput): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    inline def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    inline def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    inline def setSuccessRetentionPeriodInDaysUndefined: Self = StObject.set(x, "SuccessRetentionPeriodInDays", js.undefined)
    
    inline def setVisualReference(value: VisualReferenceInput): Self = StObject.set(x, "VisualReference", value.asInstanceOf[js.Any])
    
    inline def setVisualReferenceUndefined: Self = StObject.set(x, "VisualReference", js.undefined)
    
    inline def setVpcConfig(value: VpcConfigInput): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    inline def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
