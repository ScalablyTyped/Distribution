package typings.checCommerceJs.anon

import typings.checCommerceJs.checCommerceJsStrings.off_session
import typings.checCommerceJs.checCommerceJsStrings.on_session
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Paymentintentid extends StObject {
  
  var customer_id: js.UndefOr[String] = js.undefined
  
  var payment_intent_id: js.UndefOr[String] = js.undefined
  
  var payment_method_id: js.UndefOr[String] = js.undefined
  
  var setup_future_usage: js.UndefOr[on_session | off_session] = js.undefined
}
object Paymentintentid {
  
  inline def apply(): Paymentintentid = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Paymentintentid]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Paymentintentid] (val x: Self) extends AnyVal {
    
    inline def setCustomer_id(value: String): Self = StObject.set(x, "customer_id", value.asInstanceOf[js.Any])
    
    inline def setCustomer_idUndefined: Self = StObject.set(x, "customer_id", js.undefined)
    
    inline def setPayment_intent_id(value: String): Self = StObject.set(x, "payment_intent_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_intent_idUndefined: Self = StObject.set(x, "payment_intent_id", js.undefined)
    
    inline def setPayment_method_id(value: String): Self = StObject.set(x, "payment_method_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_method_idUndefined: Self = StObject.set(x, "payment_method_id", js.undefined)
    
    inline def setSetup_future_usage(value: on_session | off_session): Self = StObject.set(x, "setup_future_usage", value.asInstanceOf[js.Any])
    
    inline def setSetup_future_usageUndefined: Self = StObject.set(x, "setup_future_usage", js.undefined)
  }
}
