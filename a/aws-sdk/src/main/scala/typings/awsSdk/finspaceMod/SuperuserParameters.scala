package typings.awsSdk.finspaceMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SuperuserParameters extends StObject {
  
  /**
    * The email address of the superuser.
    */
  var emailAddress: EmailId
  
  /**
    * The first name of the superuser.
    */
  var firstName: NameString
  
  /**
    * The last name of the superuser.
    */
  var lastName: NameString
}
object SuperuserParameters {
  
  inline def apply(emailAddress: EmailId, firstName: NameString, lastName: NameString): SuperuserParameters = {
    val __obj = js.Dynamic.literal(emailAddress = emailAddress.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuperuserParameters]
  }
  
  extension [Self <: SuperuserParameters](x: Self) {
    
    inline def setEmailAddress(value: EmailId): Self = StObject.set(x, "emailAddress", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: NameString): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: NameString): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
  }
}
