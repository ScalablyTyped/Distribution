package typings.awsSdk.iotthingsgraphMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSystemInstanceRequest extends StObject {
  
  var definition: DefinitionDocument = js.native
  
  /**
    * The ARN of the IAM role that AWS IoT Things Graph will assume when it executes the flow. This role must have read and write access to AWS Lambda and AWS IoT and any other AWS services that the flow uses when it executes. This value is required if the value of the target parameter is CLOUD.
    */
  var flowActionsRoleArn: js.UndefOr[RoleArn] = js.native
  
  /**
    * The name of the Greengrass group where the system instance will be deployed. This value is required if the value of the target parameter is GREENGRASS.
    */
  var greengrassGroupName: js.UndefOr[GroupName] = js.native
  
  var metricsConfiguration: js.UndefOr[MetricsConfiguration] = js.native
  
  /**
    * The name of the Amazon Simple Storage Service bucket that will be used to store and deploy the system instance's resource file. This value is required if the value of the target parameter is GREENGRASS.
    */
  var s3BucketName: js.UndefOr[S3BucketName] = js.native
  
  /**
    * Metadata, consisting of key-value pairs, that can be used to categorize your system instances.
    */
  var tags: js.UndefOr[TagList] = js.native
  
  /**
    * The target type of the deployment. Valid values are GREENGRASS and CLOUD.
    */
  var target: DeploymentTarget = js.native
}
object CreateSystemInstanceRequest {
  
  @scala.inline
  def apply(definition: DefinitionDocument, target: DeploymentTarget): CreateSystemInstanceRequest = {
    val __obj = js.Dynamic.literal(definition = definition.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateSystemInstanceRequest]
  }
  
  @scala.inline
  implicit class CreateSystemInstanceRequestMutableBuilder[Self <: CreateSystemInstanceRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDefinition(value: DefinitionDocument): Self = StObject.set(x, "definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowActionsRoleArn(value: RoleArn): Self = StObject.set(x, "flowActionsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowActionsRoleArnUndefined: Self = StObject.set(x, "flowActionsRoleArn", js.undefined)
    
    @scala.inline
    def setGreengrassGroupName(value: GroupName): Self = StObject.set(x, "greengrassGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGreengrassGroupNameUndefined: Self = StObject.set(x, "greengrassGroupName", js.undefined)
    
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = StObject.set(x, "metricsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMetricsConfigurationUndefined: Self = StObject.set(x, "metricsConfiguration", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = StObject.set(x, "s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setS3BucketNameUndefined: Self = StObject.set(x, "s3BucketName", js.undefined)
    
    @scala.inline
    def setTags(value: TagList): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = StObject.set(x, "tags", js.Array(value :_*))
    
    @scala.inline
    def setTarget(value: DeploymentTarget): Self = StObject.set(x, "target", value.asInstanceOf[js.Any])
  }
}
