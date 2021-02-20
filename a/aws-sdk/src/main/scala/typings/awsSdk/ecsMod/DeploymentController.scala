package typings.awsSdk.ecsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DeploymentController extends StObject {
  
  /**
    * The deployment controller type to use. There are three deployment controller types available:  ECS  The rolling update (ECS) deployment type involves replacing the current running version of the container with the latest version. The number of containers Amazon ECS adds or removes from the service during a rolling update is controlled by adjusting the minimum and maximum number of healthy tasks allowed during a service deployment, as specified in the DeploymentConfiguration.  CODE_DEPLOY  The blue/green (CODE_DEPLOY) deployment type uses the blue/green deployment model powered by AWS CodeDeploy, which allows you to verify a new deployment of a service before sending production traffic to it.  EXTERNAL  The external (EXTERNAL) deployment type enables you to use any third-party deployment controller for full control over the deployment process for an Amazon ECS service.  
    */
  var `type`: DeploymentControllerType = js.native
}
object DeploymentController {
  
  @scala.inline
  def apply(`type`: DeploymentControllerType): DeploymentController = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeploymentController]
  }
  
  @scala.inline
  implicit class DeploymentControllerMutableBuilder[Self <: DeploymentController] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setType(value: DeploymentControllerType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
