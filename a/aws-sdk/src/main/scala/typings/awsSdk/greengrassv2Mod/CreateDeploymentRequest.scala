package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentRequest extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you can provide to ensure that the request is idempotent. Idempotency means that the request is successfully processed only once, even if you send the request multiple times. When a request succeeds, and you specify the same client token for subsequent successful requests, the IoT Greengrass V2 service returns the successful response that it caches from the previous request. IoT Greengrass V2 caches successful responses for idempotent requests for up to 8 hours.
    */
  var clientToken: js.UndefOr[ClientTokenString] = js.undefined
  
  /**
    * The components to deploy. This is a dictionary, where each key is the name of a component, and each key's value is the version and configuration to deploy for that component.
    */
  var components: js.UndefOr[ComponentDeploymentSpecifications] = js.undefined
  
  /**
    * The name of the deployment.
    */
  var deploymentName: js.UndefOr[DeploymentNameString] = js.undefined
  
  /**
    * The deployment policies for the deployment. These policies define how the deployment updates components and handles failure.
    */
  var deploymentPolicies: js.UndefOr[DeploymentPolicies] = js.undefined
  
  /**
    * The job configuration for the deployment configuration. The job configuration specifies the rollout, timeout, and stop configurations for the deployment configuration.
    */
  var iotJobConfiguration: js.UndefOr[DeploymentIoTJobConfiguration] = js.undefined
  
  /**
    * A list of key-value pairs that contain metadata for the resource. For more information, see Tag your resources in the IoT Greengrass V2 Developer Guide.
    */
  var tags: js.UndefOr[TagMap] = js.undefined
  
  /**
    * The ARN of the target IoT thing or thing group.
    */
  var targetArn: TargetARN
}
object CreateDeploymentRequest {
  
  inline def apply(targetArn: TargetARN): CreateDeploymentRequest = {
    val __obj = js.Dynamic.literal(targetArn = targetArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateDeploymentRequest]
  }
  
  extension [Self <: CreateDeploymentRequest](x: Self) {
    
    inline def setClientToken(value: ClientTokenString): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setComponents(value: ComponentDeploymentSpecifications): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
    
    inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
    
    inline def setDeploymentName(value: DeploymentNameString): Self = StObject.set(x, "deploymentName", value.asInstanceOf[js.Any])
    
    inline def setDeploymentNameUndefined: Self = StObject.set(x, "deploymentName", js.undefined)
    
    inline def setDeploymentPolicies(value: DeploymentPolicies): Self = StObject.set(x, "deploymentPolicies", value.asInstanceOf[js.Any])
    
    inline def setDeploymentPoliciesUndefined: Self = StObject.set(x, "deploymentPolicies", js.undefined)
    
    inline def setIotJobConfiguration(value: DeploymentIoTJobConfiguration): Self = StObject.set(x, "iotJobConfiguration", value.asInstanceOf[js.Any])
    
    inline def setIotJobConfigurationUndefined: Self = StObject.set(x, "iotJobConfiguration", js.undefined)
    
    inline def setTags(value: TagMap): Self = StObject.set(x, "tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "tags", js.undefined)
    
    inline def setTargetArn(value: TargetARN): Self = StObject.set(x, "targetArn", value.asInstanceOf[js.Any])
  }
}
