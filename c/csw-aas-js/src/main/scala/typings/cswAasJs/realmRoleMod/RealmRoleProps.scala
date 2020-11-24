package typings.cswAasJs.realmRoleMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RealmRoleProps extends js.Object {
  
  var children: ReactNode = js.native
  
  var error: ReactNode = js.native
  
  var realmRole: String = js.native
}
object RealmRoleProps {
  
  @scala.inline
  def apply(realmRole: String): RealmRoleProps = {
    val __obj = js.Dynamic.literal(realmRole = realmRole.asInstanceOf[js.Any])
    __obj.asInstanceOf[RealmRoleProps]
  }
  
  @scala.inline
  implicit class RealmRolePropsOps[Self <: RealmRoleProps] (val x: Self) extends AnyVal {
    
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
    def setRealmRole(value: String): Self = this.set("realmRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setChildren(value: ReactNode): Self = this.set("children", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteChildren: Self = this.set("children", js.undefined)
    
    @scala.inline
    def setError(value: ReactNode): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
  }
}
