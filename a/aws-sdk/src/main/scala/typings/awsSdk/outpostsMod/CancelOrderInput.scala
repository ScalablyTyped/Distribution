package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CancelOrderInput extends StObject {
  
  /**
    *  The ID of the order to cancel. 
    */
  var OrderId: typings.awsSdk.outpostsMod.OrderId
}
object CancelOrderInput {
  
  inline def apply(OrderId: OrderId): CancelOrderInput = {
    val __obj = js.Dynamic.literal(OrderId = OrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CancelOrderInput]
  }
  
  extension [Self <: CancelOrderInput](x: Self) {
    
    inline def setOrderId(value: OrderId): Self = StObject.set(x, "OrderId", value.asInstanceOf[js.Any])
  }
}
