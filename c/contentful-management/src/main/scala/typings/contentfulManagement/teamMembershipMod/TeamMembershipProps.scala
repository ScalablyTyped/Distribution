package typings.contentfulManagement.teamMembershipMod

import typings.contentfulManagement.anon.MetaSysPropsteamsysMetaLi
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TeamMembershipProps extends js.Object {
  
  /**
    * Is admin
    */
  var admin: Boolean = js.native
  
  /**
    * Organization membership id
    */
  var organizationMembershipId: String = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysPropsteamsysMetaLi = js.native
}
object TeamMembershipProps {
  
  @scala.inline
  def apply(admin: Boolean, organizationMembershipId: String, sys: MetaSysPropsteamsysMetaLi): TeamMembershipProps = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], organizationMembershipId = organizationMembershipId.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[TeamMembershipProps]
  }
  
  @scala.inline
  implicit class TeamMembershipPropsOps[Self <: TeamMembershipProps] (val x: Self) extends AnyVal {
    
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
    
    @scala.inline
    def setSys(value: MetaSysPropsteamsysMetaLi): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
