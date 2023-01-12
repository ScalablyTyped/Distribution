package typings.chromeApps.chrome.networking.onc

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PaymentPortal extends StObject {
  
  /** The HTTP method to use for the payment portal. */
  var Method: String
  
  /** The payment portal URL. */
  var Url: js.UndefOr[String] = js.undefined
}
object PaymentPortal {
  
  inline def apply(Method: String): PaymentPortal = {
    val __obj = js.Dynamic.literal(Method = Method.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentPortal]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: PaymentPortal] (val x: Self) extends AnyVal {
    
    inline def setMethod(value: String): Self = StObject.set(x, "Method", value.asInstanceOf[js.Any])
    
    inline def setUrl(value: String): Self = StObject.set(x, "Url", value.asInstanceOf[js.Any])
    
    inline def setUrlUndefined: Self = StObject.set(x, "Url", js.undefined)
  }
}
