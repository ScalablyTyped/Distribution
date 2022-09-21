package typings.awsSdk.greengrassv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelDeploymentRequest extends StObject {
  
  /**
    * The ID of the deployment.
    */
  var deploymentId: NonEmptyString
}
object CancelDeploymentRequest {
  
  inline def apply(deploymentId: NonEmptyString): CancelDeploymentRequest = {
    val __obj = js.Dynamic.literal(deploymentId = deploymentId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelDeploymentRequest]
  }
  
  extension [Self <: CancelDeploymentRequest](x: Self) {
    
    inline def setDeploymentId(value: NonEmptyString): Self = StObject.set(x, "deploymentId", value.asInstanceOf[js.Any])
  }
}
