package typings.contentfulManagement

import typings.axios.mod.AxiosInstance
import typings.contentfulManagement.commonTypesMod.Collection
import typings.contentfulManagement.commonTypesMod.CollectionProp
import typings.contentfulManagement.commonTypesMod.DefaultElements
import typings.contentfulManagement.commonTypesMod.MetaSysProps
import typings.contentfulManagement.createOrganizationApiMod.ContentfulOrganizationAPI
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object organizationMod {
  
  @JSImport("contentful-management/dist/typings/entities/organization", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def wrapOrganization(http: AxiosInstance, data: OrganizationProp): Organization = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapOrganization")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Organization]
  
  inline def wrapOrganizationCollection(http: AxiosInstance, data: CollectionProp[OrganizationProp]): Collection[Organization, OrganizationProp] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrapOrganizationCollection")(http.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[Collection[Organization, OrganizationProp]]
  
  type Organization = DefaultElements[OrganizationProp] & OrganizationProp & ContentfulOrganizationAPI
  
  trait OrganizationProp extends StObject {
    
    /**
      * Name
      */
    var name: String
    
    /**
      * System metadata
      */
    var sys: MetaSysProps
  }
  object OrganizationProp {
    
    inline def apply(name: String, sys: MetaSysProps): OrganizationProp = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], sys = sys.asInstanceOf[js.Any])
      __obj.asInstanceOf[OrganizationProp]
    }
    
    extension [Self <: OrganizationProp](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSys(value: MetaSysProps): Self = StObject.set(x, "sys", value.asInstanceOf[js.Any])
    }
  }
}
