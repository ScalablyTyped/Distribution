package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ListOrdersOutput extends StObject {
  
  var NextToken: js.UndefOr[Token] = js.undefined
  
  /**
    *  Information about the orders. 
    */
  var Orders: js.UndefOr[OrderSummaryListDefinition] = js.undefined
}
object ListOrdersOutput {
  
  inline def apply(): ListOrdersOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ListOrdersOutput]
  }
  
  extension [Self <: ListOrdersOutput](x: Self) {
    
    inline def setNextToken(value: Token): Self = StObject.set(x, "NextToken", value.asInstanceOf[js.Any])
    
    inline def setNextTokenUndefined: Self = StObject.set(x, "NextToken", js.undefined)
    
    inline def setOrders(value: OrderSummaryListDefinition): Self = StObject.set(x, "Orders", value.asInstanceOf[js.Any])
    
    inline def setOrdersUndefined: Self = StObject.set(x, "Orders", js.undefined)
    
    inline def setOrdersVarargs(value: OrderSummary*): Self = StObject.set(x, "Orders", js.Array(value*))
  }
}
