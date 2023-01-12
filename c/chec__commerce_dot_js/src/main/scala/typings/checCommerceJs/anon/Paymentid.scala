package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paymentid extends StObject {
  
  var payment_id: String
}
object Paymentid {
  
  inline def apply(payment_id: String): Paymentid = {
    val __obj = js.Dynamic.literal(payment_id = payment_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[Paymentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paymentid] (val x: Self) extends AnyVal {
    
    inline def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
  }
}
