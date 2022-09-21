package typings.awsSdk.outpostsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderInput extends StObject {
  
  /**
    * The ID of the order.
    */
  var OrderId: typings.awsSdk.outpostsMod.OrderId
}
object GetOrderInput {
  
  inline def apply(OrderId: OrderId): GetOrderInput = {
    val __obj = js.Dynamic.literal(OrderId = OrderId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderInput]
  }
  
  extension [Self <: GetOrderInput](x: Self) {
    
    inline def setOrderId(value: OrderId): Self = StObject.set(x, "OrderId", value.asInstanceOf[js.Any])
  }
}
