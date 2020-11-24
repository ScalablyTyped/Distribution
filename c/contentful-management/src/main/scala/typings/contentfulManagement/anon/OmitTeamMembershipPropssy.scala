package typings.contentfulManagement.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team-membership.TeamMembershipProps, 'sys'> */
@js.native
trait OmitTeamMembershipPropssy extends js.Object {
  
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
  implicit class OmitTeamMembershipPropssyOps[Self <: OmitTeamMembershipPropssy] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setAdmin(value: Boolean): Self = this.set("admin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganizationMembershipId(value: String): Self = this.set("organizationMembershipId", value.asInstanceOf[js.Any])
  }
}
