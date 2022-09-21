package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeOrderReceiptResponse extends StObject {
  
  /**
    * Information about the order.
    */
  var order: Order
}
object AcknowledgeOrderReceiptResponse {
  
  inline def apply(order: Order): AcknowledgeOrderReceiptResponse = {
    val __obj = js.Dynamic.literal(order = order.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeOrderReceiptResponse]
  }
  
  extension [Self <: AcknowledgeOrderReceiptResponse](x: Self) {
    
    inline def setOrder(value: Order): Self = StObject.set(x, "order", value.asInstanceOf[js.Any])
  }
}
