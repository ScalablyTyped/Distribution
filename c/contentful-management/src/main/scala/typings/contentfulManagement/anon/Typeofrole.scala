package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.roleMod.Role
import typings.contentfulManagement.roleMod.RoleProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeofrole extends StObject {
  
  def wrapRole(http: AxiosInstance, data: RoleProps): Role
  
  def wrapRoleCollection(http: AxiosInstance, data: CollectionProp[RoleProps]): Collection[Role, RoleProps]
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
  implicit class TypeofroleMutableBuilder[Self <: Typeofrole] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapRole(value: (AxiosInstance, RoleProps) => Role): Self = StObject.set(x, "wrapRole", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapRoleCollection(value: (AxiosInstance, CollectionProp[RoleProps]) => Collection[Role, RoleProps]): Self = StObject.set(x, "wrapRoleCollection", js.Any.fromFunction2(value))
  }
}
