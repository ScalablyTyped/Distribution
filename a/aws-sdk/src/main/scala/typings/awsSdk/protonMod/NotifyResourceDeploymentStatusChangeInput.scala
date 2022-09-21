package typings.awsSdk.protonMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NotifyResourceDeploymentStatusChangeInput extends StObject {
  
  /**
    * The deployment ID for your provisioned resource.
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
  
  /**
    * The provisioned resource state change detail data that's returned by Proton.
    */
  var outputs: js.UndefOr[NotifyResourceDeploymentStatusChangeInputOutputsList] = js.undefined
  
  /**
    * The provisioned resource Amazon Resource Name (ARN).
    */
  var resourceArn: Arn
  
  /**
    * The status of your provisioned resource.
    */
  var status: ResourceDeploymentStatus
  
  /**
    * The deployment status message for your provisioned resource.
    */
  var statusMessage: js.UndefOr[NotifyResourceDeploymentStatusChangeInputStatusMessageString] = js.undefined
}
object NotifyResourceDeploymentStatusChangeInput {
  
  inline def apply(resourceArn: Arn, status: ResourceDeploymentStatus): NotifyResourceDeploymentStatusChangeInput = {
    val __obj = js.Dynamic.literal(resourceArn = resourceArn.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    __obj.asInstanceOf[NotifyResourceDeploymentStatusChangeInput]
  }
  
  extension [Self <: NotifyResourceDeploymentStatusChangeInput](x: Self) {
    
    inline def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    inline def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
    
    inline def setOutputs(value: NotifyResourceDeploymentStatusChangeInputOutputsList): Self = StObject.set(x, "outputs", value.asInstanceOf[js.Any])
    
    inline def setOutputsUndefined: Self = StObject.set(x, "outputs", js.undefined)
    
    inline def setOutputsVarargs(value: Output*): Self = StObject.set(x, "outputs", js.Array(value*))
    
    inline def setResourceArn(value: Arn): Self = StObject.set(x, "resourceArn", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: ResourceDeploymentStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setStatusMessage(value: NotifyResourceDeploymentStatusChangeInputStatusMessageString): Self = StObject.set(x, "statusMessage", value.asInstanceOf[js.Any])
    
    inline def setStatusMessageUndefined: Self = StObject.set(x, "statusMessage", js.undefined)
  }
}
