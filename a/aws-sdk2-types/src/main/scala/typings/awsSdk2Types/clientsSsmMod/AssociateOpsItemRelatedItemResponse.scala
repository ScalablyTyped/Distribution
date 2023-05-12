package typings.awsSdk2Types.clientsSsmMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssociateOpsItemRelatedItemResponse extends StObject {
  
  /**
    * The association ID.
    */
  var AssociationId: js.UndefOr[OpsItemRelatedItemAssociationId] = js.undefined
}
object AssociateOpsItemRelatedItemResponse {
  
  inline def apply(): AssociateOpsItemRelatedItemResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AssociateOpsItemRelatedItemResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AssociateOpsItemRelatedItemResponse] (val x: Self) extends AnyVal {
    
    inline def setAssociationId(value: OpsItemRelatedItemAssociationId): Self = StObject.set(x, "AssociationId", value.asInstanceOf[js.Any])
    
    inline def setAssociationIdUndefined: Self = StObject.set(x, "AssociationId", js.undefined)
  }
}
