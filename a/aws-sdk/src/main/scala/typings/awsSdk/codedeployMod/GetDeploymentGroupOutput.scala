package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentGroupOutput extends StObject {
  
  /**
    * Information about the deployment group.
    */
  var deploymentGroupInfo: js.UndefOr[DeploymentGroupInfo] = js.undefined
}
object GetDeploymentGroupOutput {
  
  @scala.inline
  def apply(): GetDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit class GetDeploymentGroupOutputMutableBuilder[Self <: GetDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentGroupInfo(value: DeploymentGroupInfo): Self = StObject.set(x, "deploymentGroupInfo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupInfoUndefined: Self = StObject.set(x, "deploymentGroupInfo", js.undefined)
  }
}
