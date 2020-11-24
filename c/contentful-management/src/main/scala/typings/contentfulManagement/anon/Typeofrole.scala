package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.roleMod.Role
import typings.contentfulManagement.roleMod.RoleProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeofrole extends js.Object {
  
  def wrapRole(http: AxiosInstance, data: RoleProps): Role = js.native
  
  def wrapRoleCollection(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps] = js.native
}
object Typeofrole {
  
  @scala.inline
  def apply(
    wrapRole: (AxiosInstance, RoleProps) => Role,
    wrapRoleCollection: (AxiosInstance, CollectionProp[RoleProps]) => Collection[Role, RoleProps]
  ): Typeofrole = {
    val __obj = js.Dynamic.literal(wrapRole = js.Any.fromFunction2(wrapRole), wrapRoleCollection = js.Any.fromFunction2(wrapRoleCollection))
    __obj.asInstanceOf[Typeofrole]
  }
  
  @scala.inline
  implicit class TypeofroleOps[Self <: Typeofrole] (val x: Self) extends AnyVal {
    
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
    def setWrapRole(value: (AxiosInstance, RoleProps) => Role): Self = this.set("wrapRole", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapRoleCollection(value: (AxiosInstance, CollectionProp[RoleProps]) => Collection[Role, RoleProps]): Self = this.set("wrapRoleCollection", js.Any.fromFunction2(value))
  }
}
