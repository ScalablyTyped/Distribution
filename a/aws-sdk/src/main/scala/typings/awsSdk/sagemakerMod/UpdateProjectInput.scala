package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateProjectInput extends StObject {
  
  /**
    * The description for the project.
    */
  var ProjectDescription: js.UndefOr[EntityDescription] = js.undefined
  
  /**
    * The name of the project.
    */
  var ProjectName: ProjectEntityName
  
  /**
    * The product ID and provisioning artifact ID to provision a service catalog. The provisioning artifact ID will default to the latest provisioning artifact ID of the product, if you don't provide the provisioning artifact ID. For more information, see What is Amazon Web Services Service Catalog. 
    */
  var ServiceCatalogProvisioningUpdateDetails: js.UndefOr[typings.awsSdk.sagemakerMod.ServiceCatalogProvisioningUpdateDetails] = js.undefined
  
  /**
    * An array of key-value pairs. You can use tags to categorize your Amazon Web Services resources in different ways, for example, by purpose, owner, or environment. For more information, see Tagging Amazon Web Services Resources. In addition, the project must have tag update constraints set in order to include this parameter in the request. For more information, see Amazon Web Services Service Catalog Tag Update Constraints.
    */
  var Tags: js.UndefOr[TagList] = js.undefined
}
object UpdateProjectInput {
  
  inline def apply(ProjectName: ProjectEntityName): UpdateProjectInput = {
    val __obj = js.Dynamic.literal(ProjectName = ProjectName.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateProjectInput]
  }
  
  extension [Self <: UpdateProjectInput](x: Self) {
    
    inline def setProjectDescription(value: EntityDescription): Self = StObject.set(x, "ProjectDescription", value.asInstanceOf[js.Any])
    
    inline def setProjectDescriptionUndefined: Self = StObject.set(x, "ProjectDescription", js.undefined)
    
    inline def setProjectName(value: ProjectEntityName): Self = StObject.set(x, "ProjectName", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisioningUpdateDetails(value: ServiceCatalogProvisioningUpdateDetails): Self = StObject.set(x, "ServiceCatalogProvisioningUpdateDetails", value.asInstanceOf[js.Any])
    
    inline def setServiceCatalogProvisioningUpdateDetailsUndefined: Self = StObject.set(x, "ServiceCatalogProvisioningUpdateDetails", js.undefined)
    
    inline def setTags(value: TagList): Self = StObject.set(x, "Tags", value.asInstanceOf[js.Any])
    
    inline def setTagsUndefined: Self = StObject.set(x, "Tags", js.undefined)
    
    inline def setTagsVarargs(value: Tag*): Self = StObject.set(x, "Tags", js.Array(value*))
  }
}
