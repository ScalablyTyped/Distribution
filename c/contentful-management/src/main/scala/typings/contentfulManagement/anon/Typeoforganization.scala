package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.organizationMod.Organization
import typings.contentfulManagement.organizationMod.OrganizationProp
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Typeoforganization extends js.Object {
  
  def wrapOrganization(http: AxiosInstance, data: OrganizationProp): Organization = js.native
  
  def wrapOrganizationCollection(http: AxiosInstance, data: CollectionProp[OrganizationProp]): Collection[Organization, OrganizationProp] = js.native
}
object Typeoforganization {
  
  @scala.inline
  def apply(
    wrapOrganization: (AxiosInstance, OrganizationProp) => Organization,
    wrapOrganizationCollection: (AxiosInstance, CollectionProp[OrganizationProp]) => Collection[Organization, OrganizationProp]
  ): Typeoforganization = {
    val __obj = js.Dynamic.literal(wrapOrganization = js.Any.fromFunction2(wrapOrganization), wrapOrganizationCollection = js.Any.fromFunction2(wrapOrganizationCollection))
    __obj.asInstanceOf[Typeoforganization]
  }
  
  @scala.inline
  implicit class TypeoforganizationOps[Self <: Typeoforganization] (val x: Self) extends AnyVal {
    
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
    def setWrapOrganization(value: (AxiosInstance, OrganizationProp) => Organization): Self = this.set("wrapOrganization", js.Any.fromFunction2(value))
    
    @scala.inline
    def setWrapOrganizationCollection(
      value: (AxiosInstance, CollectionProp[OrganizationProp]) => Collection[Organization, OrganizationProp]
    ): Self = this.set("wrapOrganizationCollection", js.Any.fromFunction2(value))
  }
}
