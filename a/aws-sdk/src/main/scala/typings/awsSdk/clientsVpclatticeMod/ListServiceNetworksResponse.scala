package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceNetworksResponse extends StObject {
  
  /**
    * Information about the service networks.
    */
  var items: ServiceNetworkList
  
  /**
    * If there are additional results, a pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListServiceNetworksResponse {
  
  inline def apply(items: ServiceNetworkList): ListServiceNetworksResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceNetworksResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceNetworksResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ServiceNetworkList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ServiceNetworkSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
