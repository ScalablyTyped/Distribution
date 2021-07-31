package typings.azureMobileApps.Azure.MobileApps

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Auth extends StObject {
  
  def decode(token: String): User
  
  def sign(payload: js.Any): String
  
  def validate(token: String): Thenable[User]
}
object Auth {
  
  @scala.inline
  def apply(decode: String => User, sign: js.Any => String, validate: String => Thenable[User]): Auth = {
    val __obj = js.Dynamic.literal(decode = js.Any.fromFunction1(decode), sign = js.Any.fromFunction1(sign), validate = js.Any.fromFunction1(validate))
    __obj.asInstanceOf[Auth]
  }
  
  @scala.inline
  implicit class AuthMutableBuilder[Self <: Auth] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDecode(value: String => User): Self = StObject.set(x, "decode", js.Any.fromFunction1(value))
    
    @scala.inline
    def setSign(value: js.Any => String): Self = StObject.set(x, "sign", js.Any.fromFunction1(value))
    
    @scala.inline
    def setValidate(value: String => Thenable[User]): Self = StObject.set(x, "validate", js.Any.fromFunction1(value))
  }
}
