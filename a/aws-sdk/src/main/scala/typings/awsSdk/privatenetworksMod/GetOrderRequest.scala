package typings.awsSdk.privatenetworksMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetOrderRequest extends StObject {
  
  /**
    * The Amazon Resource Name (ARN) of the order.
    */
  var orderArn: Arn
}
object GetOrderRequest {
  
  inline def apply(orderArn: Arn): GetOrderRequest = {
    val __obj = js.Dynamic.literal(orderArn = orderArn.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetOrderRequest]
  }
  
  extension [Self <: GetOrderRequest](x: Self) {
    
    inline def setOrderArn(value: Arn): Self = StObject.set(x, "orderArn", value.asInstanceOf[js.Any])
  }
}
