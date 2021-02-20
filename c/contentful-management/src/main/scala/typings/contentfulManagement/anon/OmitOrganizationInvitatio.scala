package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/organization-invitation.OrganizationInvitationProps, 'sys'> */
@js.native
trait OmitOrganizationInvitatio extends StObject {
  
  var email: String = js.native
  
  var firstName: String = js.native
  
  var lastName: String = js.native
  
  var role: String = js.native
}
object OmitOrganizationInvitatio {
  
  @scala.inline
  def apply(email: String, firstName: String, lastName: String, role: String): OmitOrganizationInvitatio = {
    val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], role = role.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitOrganizationInvitatio]
  }
  
  @scala.inline
  implicit class OmitOrganizationInvitatioMutableBuilder[Self <: OmitOrganizationInvitatio] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRole(value: String): Self = StObject.set(x, "role", value.asInstanceOf[js.Any])
  }
}
