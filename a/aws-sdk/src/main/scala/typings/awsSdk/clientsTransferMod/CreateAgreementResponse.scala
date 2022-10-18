package typings.awsSdk.clientsTransferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CreateAgreementResponse extends StObject {
  
  /**
    * The unique identifier for the agreement. Use this ID for deleting, or updating an agreement, as well as in any other API calls that require that you specify the agreement ID.
    */
  var AgreementId: typings.awsSdk.clientsTransferMod.AgreementId
}
object CreateAgreementResponse {
  
  inline def apply(AgreementId: AgreementId): CreateAgreementResponse = {
    val __obj = js.Dynamic.literal(AgreementId = AgreementId.asInstanceOf[js.Any])
    __obj.asInstanceOf[CreateAgreementResponse]
  }
  
  extension [Self <: CreateAgreementResponse](x: Self) {
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
  }
}
