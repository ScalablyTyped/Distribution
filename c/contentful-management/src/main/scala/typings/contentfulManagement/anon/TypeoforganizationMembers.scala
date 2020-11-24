package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembership
import typings.contentfulManagement.organizationMembershipMod.OrganizationMembershipProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait TypeoforganizationMembers extends js.Object {
  
  def wrapOrganizationMembership(http: AxiosInstance, data: OrganizationMembershipProps): OrganizationMembership = js.native
  
  def wrapOrganizationMembershipCollection(http: AxiosInstance, data: CollectionProp[OrganizationMembershipProps]): Collection[OrganizationMembership, OrganizationMembershipProps] = js.native
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
  implicit class TypeoforganizationMembersOps[Self <: TypeoforganizationMembers] (val x: Self) extends AnyVal {
    
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
    def setWrapOrganizationMembership(value: (AxiosInstance, OrganizationMembershipProps) => OrganizationMembership): Self = this.set("wrapOrganizationMembership", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapOrganizationMembershipCollection(
      value: (AxiosInstance, CollectionProp[OrganizationMembershipProps]) => Collection[OrganizationMembership, OrganizationMembershipProps]
    ): Self = this.set("wrapOrganizationMembershipCollection", js.Any.fromFunction2(value))
  }
}
