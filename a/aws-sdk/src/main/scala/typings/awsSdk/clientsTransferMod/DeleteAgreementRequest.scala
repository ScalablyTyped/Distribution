package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteAgreementRequest extends StObject {
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: typings.awsSdk.clientsTransferMod.AgreementId
  
  /**
    * The server identifier associated with the agreement that you are deleting.
    */
  var ServerId: typings.awsSdk.clientsTransferMod.ServerId
}
object DeleteAgreementRequest {
  
  inline def apply(AgreementId: AgreementId, ServerId: ServerId): DeleteAgreementRequest = {
    val __obj = js.Dynamic.literal(AgreementId = AgreementId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteAgreementRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DeleteAgreementRequest] (val x: Self) extends AnyVal {
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
