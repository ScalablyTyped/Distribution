package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentTargetOutput extends StObject {
  
  /**
    *  A deployment target that contains information about a deployment such as its status, lifecycle events, and when it was last updated. It also contains metadata about the deployment target. The deployment target metadata depends on the deployment target's type (instanceTarget, lambdaTarget, or ecsTarget). 
    */
  var deploymentTarget: js.UndefOr[DeploymentTarget] = js.native
}
object GetDeploymentTargetOutput {
  
  @scala.inline
  def apply(): GetDeploymentTargetOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentTargetOutput]
  }
  
  @scala.inline
  implicit class GetDeploymentTargetOutputMutableBuilder[Self <: GetDeploymentTargetOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentTarget(value: DeploymentTarget): Self = StObject.set(x, "deploymentTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentTargetUndefined: Self = StObject.set(x, "deploymentTarget", js.undefined)
  }
}
