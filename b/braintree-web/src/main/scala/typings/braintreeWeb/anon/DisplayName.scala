package typings.braintreeWeb.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisplayName extends StObject {
  
  var displayName: js.UndefOr[String] = js.undefined
  
  var merchantIdentifier: js.UndefOr[String] = js.undefined
  
  var validationURL: String
}
object DisplayName {
  
  inline def apply(validationURL: String): DisplayName = {
    val __obj = js.Dynamic.literal(validationURL = validationURL.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisplayName]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DisplayName] (val x: Self) extends AnyVal {
    
    inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
    
    inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
    
    inline def setMerchantIdentifier(value: String): Self = StObject.set(x, "merchantIdentifier", value.asInstanceOf[js.Any])
    
    inline def setMerchantIdentifierUndefined: Self = StObject.set(x, "merchantIdentifier", js.undefined)
    
    inline def setValidationURL(value: String): Self = StObject.set(x, "validationURL", value.asInstanceOf[js.Any])
  }
}
