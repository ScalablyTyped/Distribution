package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateOrderOutput extends StObject {
  
  /**
    * Information about this order.
    */
  var Order: js.UndefOr[typings.awsSdk.outpostsMod.Order] = js.undefined
}
object CreateOrderOutput {
  
  inline def apply(): CreateOrderOutput = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CreateOrderOutput]
  }
  
  extension [Self <: CreateOrderOutput](x: Self) {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "Order", value.asInstanceOf[js.Any])
    
    inline def setOrderUndefined: Self = StObject.set(x, "Order", js.undefined)
  }
}
