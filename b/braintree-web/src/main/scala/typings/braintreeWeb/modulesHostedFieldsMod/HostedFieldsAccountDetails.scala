package typings.braintreeWeb.modulesHostedFieldsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait HostedFieldsAccountDetails extends StObject {
  
  var bin: String
  
  var cardType: String
  
  var cardholderName: String
  
  var expirationMonth: String
  
  var expirationYear: String
  
  var lastFour: String
  
  var lastTwo: String
}
object HostedFieldsAccountDetails {
  
  inline def apply(
    bin: String,
    cardType: String,
    cardholderName: String,
    expirationMonth: String,
    expirationYear: String,
    lastFour: String,
    lastTwo: String
  ): HostedFieldsAccountDetails = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsAccountDetails]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: HostedFieldsAccountDetails] (val x: Self) extends AnyVal {
    
    inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
    
    inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
    
    inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
    
    inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
    
    inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
    
    inline def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
    
    inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
  }
}
