package typings.consumerDataStandards.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Date
  extends StObject
     with /* k */ StringDictionary[Any] {
  
  /**
    * The date by which the invoice must be paid to receive the pay on time discount
    */
  var date: String
  
  /**
    * The amount that will be discounted if the invoice is paid by the date specified
    */
  var discountAmount: String
  
  /**
    * The GST amount that will be discounted if the invoice is paid by the date specified.  If absent then zero is assumed
    */
  var gstAmount: js.UndefOr[String | Null] = js.undefined
}
object Date {
  
  inline def apply(date: String, discountAmount: String): Date = {
    val __obj = js.Dynamic.literal(date = date.asInstanceOf[js.Any], discountAmount = discountAmount.asInstanceOf[js.Any])
    __obj.asInstanceOf[Date]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Date] (val x: Self) extends AnyVal {
    
    inline def setDate(value: String): Self = StObject.set(x, "date", value.asInstanceOf[js.Any])
    
    inline def setDiscountAmount(value: String): Self = StObject.set(x, "discountAmount", value.asInstanceOf[js.Any])
    
    inline def setGstAmount(value: String): Self = StObject.set(x, "gstAmount", value.asInstanceOf[js.Any])
    
    inline def setGstAmountNull: Self = StObject.set(x, "gstAmount", null)
    
    inline def setGstAmountUndefined: Self = StObject.set(x, "gstAmount", js.undefined)
  }
}
