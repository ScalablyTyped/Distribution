package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CreateDeploymentResult extends StObject {
  
  /**
    * The deployment ID, which can be used with other requests to identify the deployment.
    */
  var DeploymentId: js.UndefOr[String] = js.native
}
object CreateDeploymentResult {
  
  @scala.inline
  def apply(): CreateDeploymentResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateDeploymentResult]
  }
  
  @scala.inline
  implicit class CreateDeploymentResultMutableBuilder[Self <: CreateDeploymentResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeploymentId(value: String): Self = StObject.set(x, "DeploymentId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentIdUndefined: Self = StObject.set(x, "DeploymentId", js.undefined)
  }
}
