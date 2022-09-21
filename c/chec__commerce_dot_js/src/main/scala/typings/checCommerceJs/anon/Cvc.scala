package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Cvc extends StObject {
  
  var cvc: String
  
  var expiry_month: String
  
  var expiry_year: String
  
  var number: String
  
  var postal_zip_code: String
}
object Cvc {
  
  inline def apply(cvc: String, expiry_month: String, expiry_year: String, number: String, postal_zip_code: String): Cvc = {
    val __obj = js.Dynamic.literal(cvc = cvc.asInstanceOf[js.Any], expiry_month = expiry_month.asInstanceOf[js.Any], expiry_year = expiry_year.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postal_zip_code = postal_zip_code.asInstanceOf[js.Any])
    __obj.asInstanceOf[Cvc]
  }
  
  extension [Self <: Cvc](x: Self) {
    
    inline def setCvc(value: String): Self = StObject.set(x, "cvc", value.asInstanceOf[js.Any])
    
    inline def setExpiry_month(value: String): Self = StObject.set(x, "expiry_month", value.asInstanceOf[js.Any])
    
    inline def setExpiry_year(value: String): Self = StObject.set(x, "expiry_year", value.asInstanceOf[js.Any])
    
    inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    
    inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
  }
}
