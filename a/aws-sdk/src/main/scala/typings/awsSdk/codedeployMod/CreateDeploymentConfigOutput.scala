package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentConfigOutput extends StObject {
  
  /**
    * A unique deployment configuration ID.
    */
  var deploymentConfigId: js.UndefOr[DeploymentConfigId] = js.native
}
object CreateDeploymentConfigOutput {
  
  @scala.inline
  def apply(): CreateDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentConfigOutput]
  }
  
  @scala.inline
  implicit class CreateDeploymentConfigOutputMutableBuilder[Self <: CreateDeploymentConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfigId(value: DeploymentConfigId): Self = StObject.set(x, "deploymentConfigId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigIdUndefined: Self = StObject.set(x, "deploymentConfigId", js.undefined)
  }
}
