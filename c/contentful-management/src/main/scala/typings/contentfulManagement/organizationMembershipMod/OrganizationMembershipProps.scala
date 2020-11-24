package typings.contentfulManagement.organizationMembershipMod

import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OrganizationMembershipProps extends js.Object {
  
  /**
    * Role
    */
  var role: String = js.native
  
  /**
    * status
    */
  var status: Boolean = js.native
  
  /**
    * System metadata
    */
  var sys: MetaSysProps = js.native
}
object OrganizationMembershipProps {
  
  @scala.inline
  def apply(role: String, status: Boolean, sys: MetaSysProps): OrganizationMembershipProps = {
    val __obj = js.Dynamic.literal(role = role.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[OrganizationMembershipProps]
  }
  
  @scala.inline
  implicit class OrganizationMembershipPropsOps[Self <: OrganizationMembershipProps] (val x: Self) extends AnyVal {
    
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
    def setRole(value: String): Self = this.set("role", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: Boolean): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
