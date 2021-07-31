package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentOutput extends StObject {
  
  /**
    * Information about the deployment.
    */
  var deploymentInfo: js.UndefOr[DeploymentInfo] = js.undefined
}
object GetDeploymentOutput {
  
  @scala.inline
  def apply(): GetDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentOutput]
  }
  
  @scala.inline
  implicit class GetDeploymentOutputMutableBuilder[Self <: GetDeploymentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentInfo(value: DeploymentInfo): Self = StObject.set(x, "deploymentInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentInfoUndefined: Self = StObject.set(x, "deploymentInfo", js.undefined)
  }
}
