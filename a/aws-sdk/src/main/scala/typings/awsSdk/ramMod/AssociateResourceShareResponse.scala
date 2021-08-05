package typings.awsSdk.ramMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateResourceShareResponse extends StObject {
  
  /**
    * A unique, case-sensitive identifier that you provide to ensure the idempotency of the request.
    */
  var clientToken: js.UndefOr[String] = js.undefined
  
  /**
    * Information about the associations.
    */
  var resourceShareAssociations: js.UndefOr[ResourceShareAssociationList] = js.undefined
}
object AssociateResourceShareResponse {
  
  inline def apply(): AssociateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceShareResponse]
  }
  
  extension [Self <: AssociateResourceShareResponse](x: Self) {
    
    inline def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    inline def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    inline def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    inline def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    inline def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value :_*))
  }
}
