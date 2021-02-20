package typings.contentfulManagement.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team-membership.TeamMembershipProps, 'sys'> */
@js.native
trait OmitTeamMembershipPropssy extends StObject {
  
  var admin: Boolean = js.native
  
  var organizationMembershipId: String = js.native
}
object OmitTeamMembershipPropssy {
  
  @scala.inline
  def apply(admin: Boolean, organizationMembershipId: String): OmitTeamMembershipPropssy = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTeamMembershipPropssy]
  }
  
  @scala.inline
  implicit class OmitTeamMembershipPropssyMutableBuilder[Self <: OmitTeamMembershipPropssy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAdmin(value: Boolean): Self = StObject.set(x, "admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationMembershipId(value: String): Self = StObject.set(x, "organizationMembershipId", value.asInstanceOf[js.Any])
  }
}
