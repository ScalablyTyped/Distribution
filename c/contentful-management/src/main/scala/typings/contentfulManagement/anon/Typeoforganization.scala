package typings.contentfulManagement.anon

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.organizationMod.Organization
import typings.contentfulManagement.organizationMod.OrganizationProp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Typeoforganization extends StObject {
  
  def wrapOrganization(http: AxiosInstance, data: OrganizationProp): Organization
  
  def wrapOrganizationCollection(http: AxiosInstance, data: CollectionProp[OrganizationProp]): Collection[Organization, OrganizationProp]
}
object Typeoforganization {
  
  inline def apply(
    wrapOrganization: (AxiosInstance, OrganizationProp) => Organization,
    wrapOrganizationCollection: (AxiosInstance, CollectionProp[OrganizationProp]) => Collection[Organization, OrganizationProp]
  ): Typeoforganization = {
    val __obj = js.Dynamic.literal(wrapOrganization = js.Any.fromFunction2(wrapOrganization), wrapOrganizationCollection = js.Any.fromFunction2(wrapOrganizationCollection))
    __obj.asInstanceOf[Typeoforganization]
  }
  
  extension [Self <: Typeoforganization](x: Self) {
    
    inline def setWrapOrganization(value: (AxiosInstance, OrganizationProp) => Organization): Self = StObject.set(x, "wrapOrganization", js.Any.fromFunction2(value))
    
    inline def setWrapOrganizationCollection(
      value: (AxiosInstance, CollectionProp[OrganizationProp]) => Collection[Organization, OrganizationProp]
    ): Self = StObject.set(x, "wrapOrganizationCollection", js.Any.fromFunction2(value))
  }
}
