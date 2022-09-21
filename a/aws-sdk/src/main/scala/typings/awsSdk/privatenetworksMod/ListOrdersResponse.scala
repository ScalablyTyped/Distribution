package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrdersResponse extends StObject {
  
  /**
    * The token for the next page of results.
    */
  var nextToken: js.UndefOr[PaginationToken] = js.undefined
  
  /**
    * Information about the orders.
    */
  var orders: js.UndefOr[OrderList] = js.undefined
}
object ListOrdersResponse {
  
  inline def apply(): ListOrdersResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrdersResponse]
  }
  
  extension [Self <: ListOrdersResponse](x: Self) {
    
    inline def setNextToken(value: PaginationToken): Self = StObject.set(x, "nextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "nextToken", js.undefined)
    
    inline def setOrders(value: OrderList): Self = StObject.set(x, "orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "orders", js.undefined)
    
    inline def setOrdersVarargs(value: Order*): Self = StObject.set(x, "orders", js.Array(value*))
  }
}
