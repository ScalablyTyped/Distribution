package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Nonce extends StObject {
  
  var nonce: js.UndefOr[String] = js.undefined
  
  var token: js.UndefOr[String] = js.undefined
}
object Nonce {
  
  inline def apply(): Nonce = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Nonce]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Nonce] (val x: Self) extends AnyVal {
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
    
    inline def setNonceUndefined: Self = StObject.set(x, "nonce", js.undefined)
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
  }
}
