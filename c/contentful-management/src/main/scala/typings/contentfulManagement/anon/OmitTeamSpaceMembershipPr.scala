package typings.contentfulManagement.anon

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Omit<contentful-management.contentful-management/dist/typings/entities/team-space-membership.TeamSpaceMembershipProps, 'sys'> */
@js.native
trait OmitTeamSpaceMembershipPr extends js.Object {
  
  var admin: Boolean = js.native
  
  var roles: js.Array[MetaLinkProps] = js.native
}
object OmitTeamSpaceMembershipPr {
  
  @scala.inline
  def apply(admin: Boolean, roles: js.Array[MetaLinkProps]): OmitTeamSpaceMembershipPr = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any])
    __obj.asInstanceOf[OmitTeamSpaceMembershipPr]
  }
  
  @scala.inline
  implicit class OmitTeamSpaceMembershipPrOps[Self <: OmitTeamSpaceMembershipPr] (val x: Self) extends AnyVal {
    
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
    def setRolesVarargs(value: MetaLinkProps*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = this.set("roles", value.asInstanceOf[js.Any])
  }
}
