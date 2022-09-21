package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateOpsItemRelatedItemRequest extends StObject {
  
  /**
    * The type of association that you want to create between an OpsItem and a resource. OpsCenter supports IsParentOf and RelatesTo association types.
    */
  var AssociationType: OpsItemRelatedItemAssociationType
  
  /**
    * The ID of the OpsItem to which you want to associate a resource as a related item.
    */
  var OpsItemId: typings.awsSdk.ssmMod.OpsItemId
  
  /**
    * The type of resource that you want to associate with an OpsItem. OpsCenter supports the following types:  AWS::SSMIncidents::IncidentRecord: an Incident Manager incident.   AWS::SSM::Document: a Systems Manager (SSM) document.
    */
  var ResourceType: OpsItemRelatedItemAssociationResourceType
  
  /**
    * The Amazon Resource Name (ARN) of the Amazon Web Services resource that you want to associate with the OpsItem.
    */
  var ResourceUri: OpsItemRelatedItemAssociationResourceUri
}
object AssociateOpsItemRelatedItemRequest {
  
  inline def apply(
    AssociationType: OpsItemRelatedItemAssociationType,
    OpsItemId: OpsItemId,
    ResourceType: OpsItemRelatedItemAssociationResourceType,
    ResourceUri: OpsItemRelatedItemAssociationResourceUri
  ): AssociateOpsItemRelatedItemRequest = {
    val __obj = js.Dynamic.literal(AssociationType = AssociationType.asInstanceOf[js.Any], OpsItemId = OpsItemId.asInstanceOf[js.Any], ResourceType = ResourceType.asInstanceOf[js.Any], ResourceUri = ResourceUri.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssociateOpsItemRelatedItemRequest]
  }
  
  extension [Self <: AssociateOpsItemRelatedItemRequest](x: Self) {
    
    inline def setAssociationType(value: OpsItemRelatedItemAssociationType): Self = StObject.set(x, "AssociationType", value.asInstanceOf[js.Any])
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
    
    inline def setResourceType(value: OpsItemRelatedItemAssociationResourceType): Self = StObject.set(x, "ResourceType", value.asInstanceOf[js.Any])
    
    inline def setResourceUri(value: OpsItemRelatedItemAssociationResourceUri): Self = StObject.set(x, "ResourceUri", value.asInstanceOf[js.Any])
  }
}
