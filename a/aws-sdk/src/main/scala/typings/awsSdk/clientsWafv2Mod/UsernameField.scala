package typings.awsSdk.clientsWafv2Mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UsernameField extends StObject {
  
  /**
    * The name of the username field. For example /form/username.
    */
  var Identifier: FieldIdentifier
}
object UsernameField {
  
  inline def apply(Identifier: FieldIdentifier): UsernameField = {
    val __obj = js.Dynamic.literal(Identifier = Identifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[UsernameField]
  }
  
  extension [Self <: UsernameField](x: Self) {
    
    inline def setIdentifier(value: FieldIdentifier): Self = StObject.set(x, "Identifier", value.asInstanceOf[js.Any])
  }
}
