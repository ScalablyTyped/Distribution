package typings.checCommerceJs.anon

import typings.checCommerceJs.checCommerceJsStrings.authorize
import typings.checCommerceJs.checCommerceJsStrings.capture
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Action extends StObject {
  
  var action: capture | authorize
  
  var payer_id: js.UndefOr[String] = js.undefined
  
  var payment_id: js.UndefOr[String] = js.undefined
}
object Action {
  
  inline def apply(action: capture | authorize): Action = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any])
    __obj.asInstanceOf[Action]
  }
  
  extension [Self <: Action](x: Self) {
    
    inline def setAction(value: capture | authorize): Self = StObject.set(x, "action", value.asInstanceOf[js.Any])
    
    inline def setPayer_id(value: String): Self = StObject.set(x, "payer_id", value.asInstanceOf[js.Any])
    
    inline def setPayer_idUndefined: Self = StObject.set(x, "payer_id", js.undefined)
    
    inline def setPayment_id(value: String): Self = StObject.set(x, "payment_id", value.asInstanceOf[js.Any])
    
    inline def setPayment_idUndefined: Self = StObject.set(x, "payment_id", js.undefined)
  }
}
