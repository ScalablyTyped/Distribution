package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UpdateAgreementResponse extends StObject {
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: typings.awsSdk.clientsTransferMod.AgreementId
}
object UpdateAgreementResponse {
  
  inline def apply(AgreementId: AgreementId): UpdateAgreementResponse = {
    val __obj = js.Dynamic.literal(AgreementId = AgreementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UpdateAgreementResponse]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UpdateAgreementResponse] (val x: Self) extends AnyVal {
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
  }
}
