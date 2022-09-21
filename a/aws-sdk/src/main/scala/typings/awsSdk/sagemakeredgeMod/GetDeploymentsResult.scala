package typings.awsSdk.sagemakeredgeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetDeploymentsResult extends StObject {
  
  /**
    * Returns a list of the configurations of the active deployments on the device.
    */
  var Deployments: js.UndefOr[EdgeDeployments] = js.undefined
}
object GetDeploymentsResult {
  
  inline def apply(): GetDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetDeploymentsResult]
  }
  
  extension [Self <: GetDeploymentsResult](x: Self) {
    
    inline def setDeployments(value: EdgeDeployments): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: EdgeDeployment*): Self = StObject.set(x, "Deployments", js.Array(value*))
  }
}
