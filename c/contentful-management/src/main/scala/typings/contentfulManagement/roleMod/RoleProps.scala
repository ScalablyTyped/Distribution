package typings.contentfulManagement.roleMod

import typings.contentfulManagement.anon.Actions
import typings.contentfulManagement.anon.ContentDelivery
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RoleProps extends js.Object {
  
  var name: String = js.native
  
  /**
    * Permissions for application sections
    */
  var permissions: ContentDelivery = js.native
  
  var policies: js.Array[Actions] = js.native
  
  var sys: MetaSysProps = js.native
}
object RoleProps {
  
  @scala.inline
  def apply(name: String, permissions: ContentDelivery, policies: js.Array[Actions], sys: MetaSysProps): RoleProps = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], permissions = permissions.asInstanceOf[js.Any], policies = policies.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
    __obj.asInstanceOf[RoleProps]
  }
  
  @scala.inline
  implicit class RolePropsOps[Self <: RoleProps] (val x: Self) extends AnyVal {
    
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
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPermissions(value: ContentDelivery): Self = this.set("permissions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPoliciesVarargs(value: Actions*): Self = this.set("policies", js.Array(value :_*))
    
    @scala.inline
    def setPolicies(value: js.Array[Actions]): Self = this.set("policies", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSys(value: MetaSysProps): Self = this.set("sys", value.asInstanceOf[js.Any])
  }
}
