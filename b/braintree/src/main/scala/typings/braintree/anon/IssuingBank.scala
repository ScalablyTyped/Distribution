package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IssuingBank extends StObject {
  
  var CountryOfIssuance: String
  
  var IssuingBank: String
}
object IssuingBank {
  
  @scala.inline
  def apply(CountryOfIssuance: String, IssuingBank: String): IssuingBank = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
    __obj.asInstanceOf[IssuingBank]
  }
  
  @scala.inline
  implicit class IssuingBankMutableBuilder[Self <: IssuingBank] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCountryOfIssuance(value: String): Self = StObject.set(x, "CountryOfIssuance", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIssuingBank(value: String): Self = StObject.set(x, "IssuingBank", value.asInstanceOf[js.Any])
  }
}
