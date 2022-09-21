package typings.awsSdk.imagebuilderMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateInfrastructureConfigurationRequest extends StObject {
  
  /**
    * The idempotency token used to make this request idempotent.
    */
  var clientToken: ClientToken
  
  /**
    * The description of the infrastructure configuration.
    */
  var description: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) of the infrastructure configuration that you want to update.
    */
  var infrastructureConfigurationArn: InfrastructureConfigurationArn
  
  /**
    * The instance metadata options that you can set for the HTTP requests that pipeline builds use to launch EC2 build and test instances. For more information about instance metadata options, see one of the following links:    Configure the instance metadata options in the  Amazon EC2 User Guide  for Linux instances.    Configure the instance metadata options in the  Amazon EC2 Windows Guide  for Windows instances.  
    */
  var instanceMetadataOptions: js.UndefOr[InstanceMetadataOptions] = js.undefined
  
  /**
    * The instance profile to associate with the instance used to customize your Amazon EC2 AMI.
    */
  var instanceProfileName: InstanceProfileNameType
  
  /**
    * The instance types of the infrastructure configuration. You can specify one or more instance types to use for this build. The service will pick one of these instance types based on availability.
    */
  var instanceTypes: js.UndefOr[InstanceTypeList] = js.undefined
  
  /**
    * The key pair of the infrastructure configuration. You can use this to log on to and debug the instance used to create your image.
    */
  var keyPair: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The logging configuration of the infrastructure configuration.
    */
  var logging: js.UndefOr[Logging] = js.undefined
  
  /**
    * The tags attached to the resource created by Image Builder.
    */
  var resourceTags: js.UndefOr[ResourceTagMap] = js.undefined
  
  /**
    * The security group IDs to associate with the instance used to customize your Amazon EC2 AMI.
    */
  var securityGroupIds: js.UndefOr[SecurityGroupIds] = js.undefined
  
  /**
    * The Amazon Resource Name (ARN) for the SNS topic to which we send image build event notifications.  EC2 Image Builder is unable to send notifications to SNS topics that are encrypted using keys from other accounts. The key that is used to encrypt the SNS topic must reside in the account that the Image Builder service runs under. 
    */
  var snsTopicArn: js.UndefOr[SnsTopicArn] = js.undefined
  
  /**
    * The subnet ID to place the instance used to customize your Amazon EC2 AMI in.
    */
  var subnetId: js.UndefOr[NonEmptyString] = js.undefined
  
  /**
    * The terminate instance on failure setting of the infrastructure configuration. Set to false if you want Image Builder to retain the instance used to configure your AMI if the build or test phase of your workflow fails.
    */
  var terminateInstanceOnFailure: js.UndefOr[NullableBoolean] = js.undefined
}
object UpdateInfrastructureConfigurationRequest {
  
  inline def apply(
    clientToken: ClientToken,
    infrastructureConfigurationArn: InfrastructureConfigurationArn,
    instanceProfileName: InstanceProfileNameType
  ): UpdateInfrastructureConfigurationRequest = {
    val __obj = js.Dynamic.literal(clientToken = clientToken.asInstanceOf[js.Any], infrastructureConfigurationArn = infrastructureConfigurationArn.asInstanceOf[js.Any], instanceProfileName = instanceProfileName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateInfrastructureConfigurationRequest]
  }
  
  extension [Self <: UpdateInfrastructureConfigurationRequest](x: Self) {
    
    inline def setClientToken(value: ClientToken): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setDescription(value: NonEmptyString): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    inline def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    inline def setInfrastructureConfigurationArn(value: InfrastructureConfigurationArn): Self = StObject.set(x, "infrastructureConfigurationArn", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataOptions(value: InstanceMetadataOptions): Self = StObject.set(x, "instanceMetadataOptions", value.asInstanceOf[js.Any])
    
    inline def setInstanceMetadataOptionsUndefined: Self = StObject.set(x, "instanceMetadataOptions", js.undefined)
    
    inline def setInstanceProfileName(value: InstanceProfileNameType): Self = StObject.set(x, "instanceProfileName", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypes(value: InstanceTypeList): Self = StObject.set(x, "instanceTypes", value.asInstanceOf[js.Any])
    
    inline def setInstanceTypesUndefined: Self = StObject.set(x, "instanceTypes", js.undefined)
    
    inline def setInstanceTypesVarargs(value: InstanceType*): Self = StObject.set(x, "instanceTypes", js.Array(value*))
    
    inline def setKeyPair(value: NonEmptyString): Self = StObject.set(x, "keyPair", value.asInstanceOf[js.Any])
    
    inline def setKeyPairUndefined: Self = StObject.set(x, "keyPair", js.undefined)
    
    inline def setLogging(value: Logging): Self = StObject.set(x, "logging", value.asInstanceOf[js.Any])
    
    inline def setLoggingUndefined: Self = StObject.set(x, "logging", js.undefined)
    
    inline def setResourceTags(value: ResourceTagMap): Self = StObject.set(x, "resourceTags", value.asInstanceOf[js.Any])
    
    inline def setResourceTagsUndefined: Self = StObject.set(x, "resourceTags", js.undefined)
    
    inline def setSecurityGroupIds(value: SecurityGroupIds): Self = StObject.set(x, "securityGroupIds", value.asInstanceOf[js.Any])
    
    inline def setSecurityGroupIdsUndefined: Self = StObject.set(x, "securityGroupIds", js.undefined)
    
    inline def setSecurityGroupIdsVarargs(value: NonEmptyString*): Self = StObject.set(x, "securityGroupIds", js.Array(value*))
    
    inline def setSnsTopicArn(value: SnsTopicArn): Self = StObject.set(x, "snsTopicArn", value.asInstanceOf[js.Any])
    
    inline def setSnsTopicArnUndefined: Self = StObject.set(x, "snsTopicArn", js.undefined)
    
    inline def setSubnetId(value: NonEmptyString): Self = StObject.set(x, "subnetId", value.asInstanceOf[js.Any])
    
    inline def setSubnetIdUndefined: Self = StObject.set(x, "subnetId", js.undefined)
    
    inline def setTerminateInstanceOnFailure(value: NullableBoolean): Self = StObject.set(x, "terminateInstanceOnFailure", value.asInstanceOf[js.Any])
    
    inline def setTerminateInstanceOnFailureUndefined: Self = StObject.set(x, "terminateInstanceOnFailure", js.undefined)
  }
}
