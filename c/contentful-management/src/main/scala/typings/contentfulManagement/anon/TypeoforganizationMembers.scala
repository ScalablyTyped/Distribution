package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembership
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembershipProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeoforganizationMembers extends StObject {
  
  def wrapOrganizationMembership(http: AxiosInstance, data: OrganizationMembershipProps): OrganizationMembership
  
  def wrapOrganizationMembershipCollection(http: AxiosInstance, data: CollectionProp[OrganizationMembershipProps]): Collection[OrganizationMembership, OrganizationMembershipProps]
}
object TypeoforganizationMembers {
  
  @scala.inline
  def apply(
    wrapOrganizationMembership: (AxiosInstance, OrganizationMembershipProps) => OrganizationMembership,
    wrapOrganizationMembershipCollection: (AxiosInstance, CollectionProp[OrganizationMembershipProps]) => Collection[OrganizationMembership, OrganizationMembershipProps]
  ): TypeoforganizationMembers = {
    val __obj = js.Dynamic.literal(wrapOrganizationMembership = js.Any.fromFunction2(wrapOrganizationMembership), wrapOrganizationMembershipCollection = js.Any.fromFunction2(wrapOrganizationMembershipCollection))
    __obj.asInstanceOf[TypeoforganizationMembers]
  }
  
  @scala.inline
  implicit class TypeoforganizationMembersMutableBuilder[Self <: TypeoforganizationMembers] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setWrapOrganizationMembership(value: (AxiosInstance, OrganizationMembershipProps) => OrganizationMembership): Self = StObject.set(x, "wrapOrganizationMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapOrganizationMembershipCollection(
      value: (AxiosInstance, CollectionProp[OrganizationMembershipProps]) => Collection[OrganizationMembership, OrganizationMembershipProps]
    ): Self = StObject.set(x, "wrapOrganizationMembershipCollection", js.Any.fromFunction2(value))
  }
}
