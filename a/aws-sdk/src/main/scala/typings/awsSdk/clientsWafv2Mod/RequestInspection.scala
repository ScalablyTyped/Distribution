package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RequestInspection extends StObject {
  
  /**
    * Details about your login page password field.  How you specify this depends on the payload type.   For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation JavaScript Object Notation (JSON) Pointer.  For example, for the JSON payload { "login": { "username": "THE_USERNAME", "password": "THE_PASSWORD" } }, the username field specification is /login/username and the password field specification is /login/password.   For form encoded payload types, use the HTML form names. For example, for an HTML form with input elements named username1 and password1, the username field specification is username1 and the password field specification is password1.  
    */
  var PasswordField: typings.awsSdk.clientsWafv2Mod.PasswordField
  
  /**
    * The payload type for your login endpoint, either JSON or form encoded.
    */
  var PayloadType: typings.awsSdk.clientsWafv2Mod.PayloadType
  
  /**
    * Details about your login page username field.  How you specify this depends on the payload type.   For JSON payloads, specify the field name in JSON pointer syntax. For information about the JSON Pointer syntax, see the Internet Engineering Task Force (IETF) documentation JavaScript Object Notation (JSON) Pointer.  For example, for the JSON payload { "login": { "username": "THE_USERNAME", "password": "THE_PASSWORD" } }, the username field specification is /login/username and the password field specification is /login/password.   For form encoded payload types, use the HTML form names. For example, for an HTML form with input elements named username1 and password1, the username field specification is username1 and the password field specification is password1.  
    */
  var UsernameField: typings.awsSdk.clientsWafv2Mod.UsernameField
}
object RequestInspection {
  
  inline def apply(PasswordField: PasswordField, PayloadType: PayloadType, UsernameField: UsernameField): RequestInspection = {
    val __obj = js.Dynamic.literal(PasswordField = PasswordField.asInstanceOf[js.Any], PayloadType = PayloadType.asInstanceOf[js.Any], UsernameField = UsernameField.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestInspection]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: RequestInspection] (val x: Self) extends AnyVal {
    
    inline def setPasswordField(value: PasswordField): Self = StObject.set(x, "PasswordField", value.asInstanceOf[js.Any])
    
    inline def setPayloadType(value: PayloadType): Self = StObject.set(x, "PayloadType", value.asInstanceOf[js.Any])
    
    inline def setUsernameField(value: UsernameField): Self = StObject.set(x, "UsernameField", value.asInstanceOf[js.Any])
  }
}
