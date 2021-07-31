package typings.awsSdk.codedeployMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SkipWaitTimeForInstanceTerminationInput extends StObject {
  
  /**
    *  The unique ID of a blue/green deployment for which you want to skip the instance termination wait time. 
    */
  var deploymentId: js.UndefOr[DeploymentId] = js.undefined
}
object SkipWaitTimeForInstanceTerminationInput {
  
  @scala.inline
  def apply(): SkipWaitTimeForInstanceTerminationInput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SkipWaitTimeForInstanceTerminationInput]
  }
  
  @scala.inline
  implicit class SkipWaitTimeForInstanceTerminationInputMutableBuilder[Self <: SkipWaitTimeForInstanceTerminationInput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: DeploymentId): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "deploymentId", js.undefined)
  }
}
