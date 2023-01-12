package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OAuthCreateTokenFromCodeRequest extends StObject {
  
  var code: String
}
object OAuthCreateTokenFromCodeRequest {
  
  inline def apply(code: String): OAuthCreateTokenFromCodeRequest = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthCreateTokenFromCodeRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OAuthCreateTokenFromCodeRequest] (val x: Self) extends AnyVal {
    
    inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
  }
}
