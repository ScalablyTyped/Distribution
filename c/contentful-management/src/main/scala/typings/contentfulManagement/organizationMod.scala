package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.createOrganizationApiMod.ContentfulOrganizationAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMod {
  
  @JSImport("contentful-management/dist/typings/entities/organization", "wrapOrganization")
  @js.native
  def wrapOrganization(http: AxiosInstance, data: OrganizationProp): Organization = js.native
  
  @JSImport("contentful-management/dist/typings/entities/organization", "wrapOrganizationCollection")
  @js.native
  def wrapOrganizationCollection(http: AxiosInstance, data: CollectionProp[OrganizationProp]): Collection[Organization, OrganizationProp] = js.native
  
  type Organization = DefaultElements[OrganizationProp] with OrganizationProp with ContentfulOrganizationAPI
  
  @js.native
  trait OrganizationProp extends StObject {
    
    /**
      * Name
      */
    var name: String = js.native
    
    /**
      * System metadata
      */
    var sys: MetaSysProps = js.native
  }
  object OrganizationProp {
    
    @scala.inline
    def apply(name: String, sys: MetaSysProps): OrganizationProp = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationProp]
    }
    
    @scala.inline
    implicit class OrganizationPropMutableBuilder[Self <: OrganizationProp] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
