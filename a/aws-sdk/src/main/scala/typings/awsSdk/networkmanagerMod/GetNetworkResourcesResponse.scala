package typings.awsSdk.networkmanagerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetNetworkResourcesResponse extends StObject {
  
  /**
    * The network resources.
    */
  var NetworkResources: js.UndefOr[NetworkResourceList] = js.undefined
  
  /**
    * The token for the next page of results.
    */
  var NextToken: js.UndefOr[typings.awsSdk.networkmanagerMod.NextToken] = js.undefined
}
object GetNetworkResourcesResponse {
  
  inline def apply(): GetNetworkResourcesResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[GetNetworkResourcesResponse]
  }
  
  extension [Self <: GetNetworkResourcesResponse](x: Self) {
    
    inline def setNetworkResources(value: NetworkResourceList): Self = StObject.set(x, "NetworkResources", value.asInstanceOf[js.Any])
    
    inline def setNetworkResourcesUndefined: Self = StObject.set(x, "NetworkResources", js.undefined)
    
    inline def setNetworkResourcesVarargs(value: NetworkResource*): Self = StObject.set(x, "NetworkResources", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
  }
}
