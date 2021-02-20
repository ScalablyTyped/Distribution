package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMemberMod.SpaceMemberProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeofspaceMember extends StObject {
  
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
  implicit class TypeofspaceMemberMutableBuilder[Self <: TypeofspaceMember] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapSpaceMember(value: (AxiosInstance, SpaceMemberProps) => SpaceMemberPropstoPlainOb): Self = StObject.set(x, "wrapSpaceMember", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceMemberCollection(
      value: (AxiosInstance, CollectionProp[SpaceMemberProps]) => Collection[SpaceMemberPropstoPlainOb, SpaceMemberProps]
    ): Self = StObject.set(x, "wrapSpaceMemberCollection", js.Any.fromFunction2(value))
  }
}
