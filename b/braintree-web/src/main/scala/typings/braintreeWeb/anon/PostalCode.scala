package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PostalCode extends StObject {
  
  var postalCode: js.UndefOr[String] = js.undefined
}
object PostalCode {
  
  inline def apply(): PostalCode = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PostalCode]
  }
  
  extension [Self <: PostalCode](x: Self) {
    
    inline def setPostalCode(value: String): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    
    inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
  }
}
