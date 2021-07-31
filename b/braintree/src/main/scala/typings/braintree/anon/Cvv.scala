package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvv extends StObject {
  
  var cardholderName: js.UndefOr[String] = js.undefined
  
  var cvv: js.UndefOr[String] = js.undefined
  
  var expirationDate: js.UndefOr[String] = js.undefined
  
  var expirationMonth: js.UndefOr[String] = js.undefined
  
  var expirationYear: js.UndefOr[String] = js.undefined
  
  var number: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object Cvv {
  
  @scala.inline
  def apply(): Cvv = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Cvv]
  }
  
  @scala.inline
  implicit class CvvMutableBuilder[Self <: Cvv] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCardholderNameUndefined: Self = StObject.set(x, "cardholderName", js.undefined)
    
    @scala.inline
    def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
    
    @scala.inline
    def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
    
    @scala.inline
    def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
    
    @scala.inline
    def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
    
    @scala.inline
    def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
    
    @scala.inline
    def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
