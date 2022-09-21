package typings.checCommerceJs.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Email extends StObject {
  
  var email: String
  
  var firstname: String
  
  var lastname: String
}
object Email {
  
  inline def apply(email: String, firstname: String, lastname: String): Email = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstname = firstname.asInstanceOf[js.Any], lastname = lastname.asInstanceOf[js.Any])
    __obj.asInstanceOf[Email]
  }
  
  extension [Self <: Email](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstname(value: String): Self = StObject.set(x, "firstname", value.asInstanceOf[js.Any])
    
    inline def setLastname(value: String): Self = StObject.set(x, "lastname", value.asInstanceOf[js.Any])
  }
}
