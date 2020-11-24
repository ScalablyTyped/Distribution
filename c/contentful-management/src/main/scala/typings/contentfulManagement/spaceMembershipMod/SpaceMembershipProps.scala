package typings.contentfulManagement.spaceMembershipMod

import typings.contentfulManagement.commonTypesMod.MetaLinkProps
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait SpaceMembershipProps extends js.Object {
  
  /**
    * User is an admin
    */
  var admin: Boolean = js.native
  
  var name: String = js.native
  
  var roles: js.Array[MetaLinkProps] = js.native
  
  var sys: MetaSysProps = js.native
}
object SpaceMembershipProps {
  
  @scala.inline
  def apply(admin: Boolean, name: String, roles: js.Array[MetaLinkProps], sys: MetaSysProps): SpaceMembershipProps = {
    val __obj = js.Dynamic.literal(admin = admin.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], roles = roles.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[SpaceMembershipProps]
  }
  
  @scala.inline
  implicit class SpaceMembershipPropsOps[Self <: SpaceMembershipProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRolesVarargs(value: MetaLinkProps*): Self = this.set("roles", js.Array(value :_*))
    
    @scala.inline
    def setRoles(value: js.Array[MetaLinkProps]): Self = this.set("roles", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
