package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListDeploymentsResponse extends StObject {
  
  /**
    * A list of deployments for the requested groups.
    */
  var Deployments: js.UndefOr[typings.awsSdk.greengrassMod.Deployments] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListDeploymentsResponse {
  
  inline def apply(): ListDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListDeploymentsResponse]
  }
  
  extension [Self <: ListDeploymentsResponse](x: Self) {
    
    inline def setDeployments(value: Deployments): Self = StObject.set(x, "Deployments", value.asInstanceOf[js.Any])
    
    inline def setDeploymentsUndefined: Self = StObject.set(x, "Deployments", js.undefined)
    
    inline def setDeploymentsVarargs(value: Deployment*): Self = StObject.set(x, "Deployments", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
