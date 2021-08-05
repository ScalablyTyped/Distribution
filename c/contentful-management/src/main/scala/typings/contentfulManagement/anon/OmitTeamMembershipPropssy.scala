package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team-membership.TeamMembershipProps, 'sys'> */
trait OmitTeamMembershipPropssy extends StObject {
  
  var admin: Boolean
  
  var organizationMembershipId: String
}
object OmitTeamMembershipPropssy {
  
  inline def apply(admin: Boolean, organizationMembershipId: String): OmitTeamMembershipPropssy = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTeamMembershipPropssy]
  }
  
  extension [Self <: OmitTeamMembershipPropssy](x: Self) {
    
    inline def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    inline def setOrganizationMembershipId(value: String): Self = StObject.set(x, "organizationMembershipId", value.asInstanceOf[js.Any])
  }
}
