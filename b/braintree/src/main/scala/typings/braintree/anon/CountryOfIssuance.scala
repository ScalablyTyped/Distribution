package typings.braintree.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CountryOfIssuance extends StObject {
  
  var CountryOfIssuance: String
  
  var IssuingBank: String
}
object CountryOfIssuance {
  
  inline def apply(CountryOfIssuance: String, IssuingBank: String): CountryOfIssuance = {
    val __obj = js.Dynamic.literal(CountryOfIssuance = CountryOfIssuance.asInstanceOf[js.Any], IssuingBank = IssuingBank.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountryOfIssuance]
  }
  
  extension [Self <: CountryOfIssuance](x: Self) {
    
    inline def setCountryOfIssuance(value: String): Self = StObject.set(x, "CountryOfIssuance", value.asInstanceOf[js.Any])
    
    inline def setIssuingBank(value: String): Self = StObject.set(x, "IssuingBank", value.asInstanceOf[js.Any])
  }
}
