package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateDeploymentOutput extends StObject {
  
  /**
    *  The unique ID of a deployment. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
}
object CreateDeploymentOutput {
  
  @scala.inline
  def apply(): CreateDeploymentOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentOutput]
  }
  
  @scala.inline
  implicit class CreateDeploymentOutputMutableBuilder[Self <: CreateDeploymentOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
  }
}
