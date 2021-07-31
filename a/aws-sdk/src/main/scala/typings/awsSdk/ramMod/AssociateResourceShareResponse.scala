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
  
  @scala.inline
  def apply(): AssociateResourceShareResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateResourceShareResponse]
  }
  
  @scala.inline
  implicit class AssociateResourceShareResponseMutableBuilder[Self <: AssociateResourceShareResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClientToken(value: String): Self = StObject.set(x, "clientToken", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClientTokenUndefined: Self = StObject.set(x, "clientToken", js.undefined)
    
    @scala.inline
    def setResourceShareAssociations(value: ResourceShareAssociationList): Self = StObject.set(x, "resourceShareAssociations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setResourceShareAssociationsUndefined: Self = StObject.set(x, "resourceShareAssociations", js.undefined)
    
    @scala.inline
    def setResourceShareAssociationsVarargs(value: ResourceShareAssociation*): Self = StObject.set(x, "resourceShareAssociations", js.Array(value :_*))
  }
}
