package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateProjectInput extends StObject {
  
  /**
    * A description for the project.
    */
  var ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the project.
    */
  var ProjectName: ProjectEntityName
  
  /**
    * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID. For more information, see What is Amazon Web Services Service Catalog.
    */
  var ServiceCatalogProvisioningDetails: typings.awsSdk.sagemakerMod.ServiceCatalogProvisioningDetails
  
  /**
    * An array of key-value pairs that you want to use to organize and track your Amazon Web Services resource costs. For more information, see Tagging Amazon Web Services resources in the Amazon Web Services General Reference Guide.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object CreateProjectInput {
  
  inline def apply(
    ProjectName: ProjectEntityName,
    ServiceCatalogProvisioningDetails: ServiceCatalogProvisioningDetails
  ): CreateProjectInput = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any], ServiceCatalogProvisioningDetails = ServiceCatalogProvisioningDetails.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateProjectInput]
  }
  
  extension [Self <: CreateProjectInput](x: Self) {
    
    inline def setProjectDescription(value: EntityDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisioningDetails(value: ServiceCatalogProvisioningDetails): Self = StObject.set(x, "ServiceCatalogProvisioningDetails", value.asInstanceOf[js.Any])
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
