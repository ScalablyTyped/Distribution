package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMembershipMod.SpaceMembership
import typings.contentfulManagement.spaceMembershipMod.SpaceMembershipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofspaceMembership extends js.Object {
  
  def wrapSpaceMembership(http: AxiosInstance, data: SpaceMembershipProps): SpaceMembership = js.native
  
  def wrapSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[SpaceMembershipProps]): Collection[SpaceMembership, SpaceMembershipProps] = js.native
}
object TypeofspaceMembership {
  
  @scala.inline
  def apply(
    wrapSpaceMembership: (AxiosInstance, SpaceMembershipProps) => SpaceMembership,
    wrapSpaceMembershipCollection: (AxiosInstance, CollectionProp[SpaceMembershipProps]) => Collection[SpaceMembership, SpaceMembershipProps]
  ): TypeofspaceMembership = {
    val __obj = js.Dynamic.literal(wrapSpaceMembership = js.Any.fromFunction2(wrapSpaceMembership), wrapSpaceMembershipCollection = js.Any.fromFunction2(wrapSpaceMembershipCollection))
    __obj.asInstanceOf[TypeofspaceMembership]
  }
  
  @scala.inline
  implicit class TypeofspaceMembershipOps[Self <: TypeofspaceMembership] (val x: Self) extends AnyVal {
    
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
    def setWrapSpaceMembership(value: (AxiosInstance, SpaceMembershipProps) => SpaceMembership): Self = this.set("wrapSpaceMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceMembershipCollection(
      value: (AxiosInstance, CollectionProp[SpaceMembershipProps]) => Collection[SpaceMembership, SpaceMembershipProps]
    ): Self = this.set("wrapSpaceMembershipCollection", js.Any.fromFunction2(value))
  }
}
