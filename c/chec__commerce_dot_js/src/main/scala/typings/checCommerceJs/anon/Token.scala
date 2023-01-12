package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Token extends StObject {
  
  var token: js.UndefOr[String] = js.undefined
  
  var verification_token: js.UndefOr[String] = js.undefined
}
object Token {
  
  inline def apply(): Token = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Token]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Token] (val x: Self) extends AnyVal {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
    
    inline def setTokenUndefined: Self = StObject.set(x, "token", js.undefined)
    
    inline def setVerification_token(value: String): Self = StObject.set(x, "verification_token", value.asInstanceOf[js.Any])
    
    inline def setVerification_tokenUndefined: Self = StObject.set(x, "verification_token", js.undefined)
  }
}
