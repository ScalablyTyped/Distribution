package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/organization-invitation.OrganizationInvitationProps, 'sys'> */
trait OmitOrganizationInvitatio extends StObject {
  
  var email: String
  
  var firstName: String
  
  var lastName: String
  
  var role: String
}
object OmitOrganizationInvitatio {
  
  inline def apply(email: String, firstName: String, lastName: String, role: String): OmitOrganizationInvitatio = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOrganizationInvitatio]
  }
  
  extension [Self <: OmitOrganizationInvitatio](x: Self) {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    inline def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
