package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TokenString extends StObject {
  
  var token: String
}
object TokenString {
  
  inline def apply(token: String): TokenString = {
    val __obj = js.Dynamic.literal(token = token.asInstanceOf[js.Any])
    __obj.asInstanceOf[TokenString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TokenString] (val x: Self) extends AnyVal {
    
    inline def setToken(value: String): Self = StObject.set(x, "token", value.asInstanceOf[js.Any])
  }
}
