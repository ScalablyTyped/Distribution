package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMemberMod.SpaceMemberProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofspaceMember extends js.Object {
  
  def wrapSpaceMember(http: AxiosInstance, data: SpaceMemberProps): SpaceMemberPropstoPlainOb = js.native
  
  def wrapSpaceMemberCollection(http: AxiosInstance, data: CollectionProp[SpaceMemberProps]): Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps] = js.native
}
object TypeofspaceMember {
  
  @scala.inline
  def apply(
    wrapSpaceMember: (AxiosInstance, SpaceMemberProps) => SpaceMemberPropstoPlainOb,
    wrapSpaceMemberCollection: (AxiosInstance, CollectionProp[SpaceMemberProps]) => Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]
  ): TypeofspaceMember = {
    val __obj = js.Dynamic.literal(wrapSpaceMember = js.Any.fromFunction2(wrapSpaceMember), wrapSpaceMemberCollection = js.Any.fromFunction2(wrapSpaceMemberCollection))
    __obj.asInstanceOf[TypeofspaceMember]
  }
  
  @scala.inline
  implicit class TypeofspaceMemberOps[Self <: TypeofspaceMember] (val x: Self) extends AnyVal {
    
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
    def setWrapSpaceMember(value: (AxiosInstance, SpaceMemberProps) => SpaceMemberPropstoPlainOb): Self = this.set("wrapSpaceMember", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceMemberCollection(
      value: (AxiosInstance, CollectionProp[SpaceMemberProps]) => Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]
    ): Self = this.set("wrapSpaceMemberCollection", js.Any.fromFunction2(value))
  }
}
