package typings.awsSdk.ssmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisassociateOpsItemRelatedItemRequest extends StObject {
  
  /**
    * The ID of the association for which you want to delete an association between the OpsItem and a related item.
    */
  var AssociationId: OpsItemRelatedItemAssociationId
  
  /**
    * The ID of the OpsItem for which you want to delete an association between the OpsItem and a related item.
    */
  var OpsItemId: typings.awsSdk.ssmMod.OpsItemId
}
object DisassociateOpsItemRelatedItemRequest {
  
  inline def apply(AssociationId: OpsItemRelatedItemAssociationId, OpsItemId: OpsItemId): DisassociateOpsItemRelatedItemRequest = {
    val __obj = js.Dynamic.literal(AssociationId = AssociationId.asInstanceOf[js.Any], OpsItemId = OpsItemId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisassociateOpsItemRelatedItemRequest]
  }
  
  extension [Self <: DisassociateOpsItemRelatedItemRequest](x: Self) {
    
    inline def setAssociationId(value: OpsItemRelatedItemAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setOpsItemId(value: OpsItemId): Self = StObject.set(x, "OpsItemId", value.asInstanceOf[js.Any])
  }
}
