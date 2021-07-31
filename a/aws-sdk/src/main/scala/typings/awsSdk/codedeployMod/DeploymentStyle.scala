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
  
  @scala.inline
  def apply(): DeploymentStyle = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DeploymentStyle]
  }
  
  @scala.inline
  implicit class DeploymentStyleMutableBuilder[Self <: DeploymentStyle] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentOption(value: DeploymentOption): Self = StObject.set(x, "deploymentOption", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentOptionUndefined: Self = StObject.set(x, "deploymentOption", js.undefined)
    
    @scala.inline
    def setDeploymentType(value: DeploymentType): Self = StObject.set(x, "deploymentType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTypeUndefined: Self = StObject.set(x, "deploymentType", js.undefined)
  }
}
