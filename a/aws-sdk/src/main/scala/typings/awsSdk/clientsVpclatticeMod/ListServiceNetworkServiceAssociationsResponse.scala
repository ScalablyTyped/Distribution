package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceNetworkServiceAssociationsResponse extends StObject {
  
  /**
    * Information about the associations.
    */
  var items: ServiceNetworkServiceAssociationList
  
  /**
    * If there are additional results, a pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListServiceNetworkServiceAssociationsResponse {
  
  inline def apply(items: ServiceNetworkServiceAssociationList): ListServiceNetworkServiceAssociationsResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceNetworkServiceAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceNetworkServiceAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ServiceNetworkServiceAssociationList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ServiceNetworkServiceAssociationSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
