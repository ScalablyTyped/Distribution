package typings.awsSdk.lightsailMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetContainerServiceDeploymentsResult extends StObject {
  
  /**
    * An array of objects that describe deployments for a container service.
    */
  var deployments: js.UndefOr[ContainerServiceDeploymentList] = js.undefined
}
object GetContainerServiceDeploymentsResult {
  
  @scala.inline
  def apply(): GetContainerServiceDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetContainerServiceDeploymentsResult]
  }
  
  @scala.inline
  implicit class GetContainerServiceDeploymentsResultMutableBuilder[Self <: GetContainerServiceDeploymentsResult] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDeployments(value: ContainerServiceDeploymentList): Self = StObject.set(x, "deployments", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDeploymentsUndefined: Self = StObject.set(x, "deployments", js.undefined)
    
    @scala.inline
    def setDeploymentsVarargs(value: ContainerServiceDeployment*): Self = StObject.set(x, "deployments", js.Array(value :_*))
  }
}
