package typings.awsSdk.greengrassMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListBulkDeploymentsResponse extends StObject {
  
  /**
    * A list of bulk deployments.
    */
  var BulkDeployments: js.UndefOr[typings.awsSdk.greengrassMod.BulkDeployments] = js.undefined
  
  /**
    * The token for the next set of results, or ''null'' if there are no additional results.
    */
  var NextToken: js.UndefOr[string] = js.undefined
}
object ListBulkDeploymentsResponse {
  
  inline def apply(): ListBulkDeploymentsResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListBulkDeploymentsResponse]
  }
  
  extension [Self <: ListBulkDeploymentsResponse](x: Self) {
    
    inline def setBulkDeployments(value: BulkDeployments): Self = StObject.set(x, "BulkDeployments", value.asInstanceOf[js.Any])
    
    inline def setBulkDeploymentsUndefined: Self = StObject.set(x, "BulkDeployments", js.undefined)
    
    inline def setBulkDeploymentsVarargs(value: BulkDeployment*): Self = StObject.set(x, "BulkDeployments", js.Array(value*))
    
    inline def setNextToken(value: string): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
