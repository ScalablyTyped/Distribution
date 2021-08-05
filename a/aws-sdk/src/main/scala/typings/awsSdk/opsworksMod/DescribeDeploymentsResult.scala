package typings.awsSdk.opsworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeDeploymentsResult extends StObject {
  
  /**
    * An array of Deployment objects that describe the deployments.
    */
  var Deployments: js.UndefOr[typings.awsSdk.opsworksMod.Deployments] = js.undefined
}
object DescribeDeploymentsResult {
  
  inline def apply(): DescribeDeploymentsResult = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DescribeDeploymentsResult]
  }
  
  extension [Self <: DescribeDeploymentsResult](x: Self) {
    
    inline def setDeployments(value: Deployments): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "Deployments", js.Array(value :_*))
  }
}
