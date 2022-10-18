package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait PasswordField extends StObject {
  
  /**
    * The name of the password field. For example /form/password.
    */
  var Identifier: FieldIdentifier
}
object PasswordField {
  
  inline def apply(Identifier: FieldIdentifier): PasswordField = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[PasswordField]
  }
  
  extension [Self <: PasswordField](x: Self) {
    
    inline def setIdentifier(value: FieldIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
