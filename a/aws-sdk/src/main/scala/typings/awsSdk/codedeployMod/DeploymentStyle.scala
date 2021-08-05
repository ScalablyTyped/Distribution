package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeploymentStyle extends StObject {
  
  /**
    * Indicates whether to route deployment traffic behind a load balancer.
    */
  var deploymentOption: js.UndefOr[DeploymentOption] = js.undefined
  
  /**
    * Indicates whether to run an in-place deployment or a blue/green deployment.
    */
  var deploymentType: js.UndefOr[DeploymentType] = js.undefined
}
object DeploymentStyle {
  
  inline def apply(): DeploymentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStyle]
  }
  
  extension [Self <: DeploymentStyle](x: Self) {
    
    inline def setDeploymentOption(value: DeploymentOption): Self = StObject.set(x, "deploymentOption", value.asInstanceOf[js.Any])
    
    inline def setDeploymentOptionUndefined: Self = StObject.set(x, "deploymentOption", js.undefined)
    
    inline def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    inline def setDeploymentTypeUndefined: Self = StObject.set(x, "deploymentType", js.undefined)
  }
}
