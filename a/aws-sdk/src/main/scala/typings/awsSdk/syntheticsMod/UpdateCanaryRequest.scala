package typings.awsSdk.syntheticsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UpdateCanaryRequest extends StObject {
  
  /**
    * A structure that includes the entry point from which the canary should start running your script. If the script is stored in an S3 bucket, the bucket name, key, and version are also included. 
    */
  var Code: js.UndefOr[CanaryCodeInput] = js.native
  
  /**
    * The ARN of the IAM role to be used to run the canary. This role must already exist, and must include lambda.amazonaws.com as a principal in the trust policy. The role must also have the following permissions:    s3:PutObject     s3:GetBucketLocation     s3:ListAllMyBuckets     cloudwatch:PutMetricData     logs:CreateLogGroup     logs:CreateLogStream     logs:CreateLogStream   
    */
  var ExecutionRoleArn: js.UndefOr[RoleArn] = js.native
  
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
    * Specifies the runtime version to use for the canary. For a list of valid runtime versions and for more information about runtime versions, see  Canary Runtime Versions.
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
  implicit class UpdateCanaryRequestMutableBuilder[Self <: UpdateCanaryRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: CanaryCodeInput): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCodeUndefined: Self = StObject.set(x, "Code", js.undefined)
    
    @scala.inline
    def setExecutionRoleArn(value: RoleArn): Self = StObject.set(x, "ExecutionRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExecutionRoleArnUndefined: Self = StObject.set(x, "ExecutionRoleArn", js.undefined)
    
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
    def setRuntimeVersionUndefined: Self = StObject.set(x, "RuntimeVersion", js.undefined)
    
    @scala.inline
    def setSchedule(value: CanaryScheduleInput): Self = StObject.set(x, "Schedule", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScheduleUndefined: Self = StObject.set(x, "Schedule", js.undefined)
    
    @scala.inline
    def setSuccessRetentionPeriodInDays(value: MaxSize1024): Self = StObject.set(x, "SuccessRetentionPeriodInDays", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSuccessRetentionPeriodInDaysUndefined: Self = StObject.set(x, "SuccessRetentionPeriodInDays", js.undefined)
    
    @scala.inline
    def setVpcConfig(value: VpcConfigInput): Self = StObject.set(x, "VpcConfig", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVpcConfigUndefined: Self = StObject.set(x, "VpcConfig", js.undefined)
  }
}
