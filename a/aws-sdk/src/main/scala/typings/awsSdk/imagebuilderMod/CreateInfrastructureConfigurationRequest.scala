package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateInfrastructureConfigurationRequest extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent. 
    */
  var clientToken: ClientToken = js.native
  
  /**
    * The description of the infrastructure configuration. 
    */
  var description: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The instance profile to associate with the instance used to customize your EC2 AMI. 
    */
  var instanceProfileName: NonEmptyString = js.native
  
  /**
    * The instance types of the infrastructure configuration. You can specify one or more instance types to use for this build. The service will pick one of these instance types based on availability. 
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.native
  
  /**
    * The key pair of the infrastructure configuration. This can be used to log on to and debug the instance used to create your image. 
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The logging configuration of the infrastructure configuration. 
    */
  var logging: js.UndefOr[Logging] = js.native
  
  /**
    * The name of the infrastructure configuration. 
    */
  var name: ResourceName = js.native
  
  /**
    * The tags attached to the resource created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.native
  
  /**
    * The security group IDs to associate with the instance used to customize your EC2 AMI. 
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.native
  
  /**
    * The SNS topic on which to send image build events. 
    */
  var snsTopicArn: js.UndefOr[SnsTopicArn] = js.native
  
  /**
    * The subnet ID in which to place the instance used to customize your EC2 AMI. 
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.native
  
  /**
    * The tags of the infrastructure configuration. 
    */
  var tags: js.UndefOr[TagMap] = js.native
  
  /**
    * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails. 
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.native
}
object CreateInfrastructureConfigurationRequest {
  
  @scala.inline
  def apply(clientToken: ClientToken, instanceProfileName: NonEmptyString, name: ResourceName): CreateInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], instanceProfileName = instanceProfileName.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateInfrastructureConfigurationRequest]
  }
  
  @scala.inline
  implicit class CreateInfrastructureConfigurationRequestMutableBuilder[Self <: CreateInfrastructureConfigurationRequest] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setInstanceProfileName(value: NonEmptyString): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypes(value: InstanceTypeList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    @scala.inline
    def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "instanceTypes", js.Array(value :_*))
    
    @scala.inline
    def setKeyPair(value: NonEmptyString): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
    
    @scala.inline
    def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    @scala.inline
    def setName(value: ResourceName): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTags(value: ResourceTagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    @scala.inline
    def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    @scala.inline
    def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value :_*))
    
    @scala.inline
    def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    
    @scala.inline
    def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    @scala.inline
    def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    @scala.inline
    def setTerminateInstanceOnFailure(value: NullableBoolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
  }
}
