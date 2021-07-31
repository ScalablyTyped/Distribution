package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.spaceMembershipMod.SpaceMembership
import typings.contentfulManagement.spaceMembershipMod.SpaceMembershipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofspaceMembership extends StObject {
  
  def wrapSpaceMembership(http: AxiosInstance, data: SpaceMembershipProps): SpaceMembership
  
  def wrapSpaceMembershipCollection(http: AxiosInstance, data: CollectionProp[SpaceMembershipProps]): Collection[SpaceMembership, SpaceMembershipProps]
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
  implicit class TypeofspaceMembershipMutableBuilder[Self <: TypeofspaceMembership] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapSpaceMembership(value: (AxiosInstance, SpaceMembershipProps) => SpaceMembership): Self = StObject.set(x, "wrapSpaceMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapSpaceMembershipCollection(
      value: (AxiosInstance, CollectionProp[SpaceMembershipProps]) => Collection[SpaceMembership, SpaceMembershipProps]
    ): Self = StObject.set(x, "wrapSpaceMembershipCollection", js.Any.fromFunction2(value))
  }
}
