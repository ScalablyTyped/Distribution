package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AcknowledgeOrderReceiptRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the order.
    */
  var orderArn: Arn
}
object AcknowledgeOrderReceiptRequest {
  
  inline def apply(orderArn: Arn): AcknowledgeOrderReceiptRequest = {
    val __obj = js.Dynamic.literal(orderArn = orderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[AcknowledgeOrderReceiptRequest]
  }
  
  extension [Self <: AcknowledgeOrderReceiptRequest](x: Self) {
    
    inline def setOrderArn(value: Arn): Self = StObject.set(x, "orderArn", value.asInstanceOf[js.Any])
  }
}
