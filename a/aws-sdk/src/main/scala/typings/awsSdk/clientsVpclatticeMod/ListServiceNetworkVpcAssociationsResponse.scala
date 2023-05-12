package typings.awsSdk.clientsVpclatticeMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListServiceNetworkVpcAssociationsResponse extends StObject {
  
  /**
    * Information about the associations.
    */
  var items: ServiceNetworkVpcAssociationList
  
  /**
    * If there are additional results, a pagination token for the next page of results.
    */
  var nextToken: js.UndefOr[NextToken] = js.undefined
}
object ListServiceNetworkVpcAssociationsResponse {
  
  inline def apply(items: ServiceNetworkVpcAssociationList): ListServiceNetworkVpcAssociationsResponse = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any])
    __obj.asInstanceOf[ListServiceNetworkVpcAssociationsResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ListServiceNetworkVpcAssociationsResponse] (val x: Self) extends AnyVal {
    
    inline def setItems(value: ServiceNetworkVpcAssociationList): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    inline def setItemsVarargs(value: ServiceNetworkVpcAssociationSummary*): Self = StObject.set(x, "items", js.Array(value*))
    
    inline def setNextToken(value: NextToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
  }
}
