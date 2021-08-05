package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentConfigOutput extends StObject {
  
  /**
    * Information about the deployment configuration.
    */
  var deploymentConfigInfo: js.UndefOr[DeploymentConfigInfo] = js.undefined
}
object GetDeploymentConfigOutput {
  
  inline def apply(): GetDeploymentConfigOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentConfigOutput]
  }
  
  extension [Self <: GetDeploymentConfigOutput](x: Self) {
    
    inline def setDeploymentConfigInfo(value: DeploymentConfigInfo): Self = StObject.set(x, "deploymentConfigInfo", value.asInstanceOf[js.Any])
    
    inline def setDeploymentConfigInfoUndefined: Self = StObject.set(x, "deploymentConfigInfo", js.undefined)
  }
}
