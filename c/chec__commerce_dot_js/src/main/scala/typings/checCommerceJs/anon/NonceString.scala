package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NonceString extends StObject {
  
  var nonce: String
}
object NonceString {
  
  inline def apply(nonce: String): NonceString = {
    val __obj = js.Dynamic.literal(nonce = nonce.asInstanceOf[js.Any])
    __obj.asInstanceOf[NonceString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NonceString] (val x: Self) extends AnyVal {
    
    inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
  }
}
