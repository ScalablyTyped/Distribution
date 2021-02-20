package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentGroupOutput extends StObject {
  
  /**
    * A unique deployment group ID.
    */
  var deploymentGroupId: js.UndefOr[DeploymentGroupId] = js.native
}
object CreateDeploymentGroupOutput {
  
  @scala.inline
  def apply(): CreateDeploymentGroupOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentGroupOutput]
  }
  
  @scala.inline
  implicit class CreateDeploymentGroupOutputMutableBuilder[Self <: CreateDeploymentGroupOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentGroupId(value: DeploymentGroupId): Self = StObject.set(x, "deploymentGroupId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentGroupIdUndefined: Self = StObject.set(x, "deploymentGroupId", js.undefined)
  }
}
