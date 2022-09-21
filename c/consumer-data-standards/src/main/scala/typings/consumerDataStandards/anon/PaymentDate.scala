package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentDate
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The scheduled date for the once off payment
    */
  var paymentDate: String
}
object PaymentDate {
  
  inline def apply(paymentDate: String): PaymentDate = {
    val __obj = js.Dynamic.literal(paymentDate = paymentDate.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentDate]
  }
  
  extension [Self <: PaymentDate](x: Self) {
    
    inline def setPaymentDate(value: String): Self = StObject.set(x, "paymentDate", value.asInstanceOf[js.Any])
  }
}
