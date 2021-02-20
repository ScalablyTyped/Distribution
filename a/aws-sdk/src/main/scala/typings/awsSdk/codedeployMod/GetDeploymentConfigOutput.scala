package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetDeploymentConfigOutput extends StObject {
  
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.native
}
object GetDeploymentConfigOutput {
  
  @scala.inline
  def apply(): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
  
  @scala.inline
  implicit class GetDeploymentConfigOutputMutableBuilder[Self <: GetDeploymentConfigOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentConfigInfo(value: DeploymentConfigInfo): Self = StObject.set(x, "deploymentConfigInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentConfigInfoUndefined: Self = StObject.set(x, "deploymentConfigInfo", js.undefined)
  }
}
