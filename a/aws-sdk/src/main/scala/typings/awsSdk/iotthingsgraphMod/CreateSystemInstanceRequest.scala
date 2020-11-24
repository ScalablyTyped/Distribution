package typings.awsSdk.iotthingsgraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateSystemInstanceRequest extends js.Object {
  
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
  implicit class CreateSystemInstanceRequestOps[Self <: CreateSystemInstanceRequest] (val x: Self) extends AnyVal {
    
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
    def setDefinition(value: DefinitionDocument): Self = this.set("definition", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTarget(value: DeploymentTarget): Self = this.set("target", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFlowActionsRoleArn(value: RoleArn): Self = this.set("flowActionsRoleArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlowActionsRoleArn: Self = this.set("flowActionsRoleArn", js.undefined)
    
    @scala.inline
    def setGreengrassGroupName(value: GroupName): Self = this.set("greengrassGroupName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGreengrassGroupName: Self = this.set("greengrassGroupName", js.undefined)
    
    @scala.inline
    def setMetricsConfiguration(value: MetricsConfiguration): Self = this.set("metricsConfiguration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMetricsConfiguration: Self = this.set("metricsConfiguration", js.undefined)
    
    @scala.inline
    def setS3BucketName(value: S3BucketName): Self = this.set("s3BucketName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteS3BucketName: Self = this.set("s3BucketName", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: Tag*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: TagList): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
