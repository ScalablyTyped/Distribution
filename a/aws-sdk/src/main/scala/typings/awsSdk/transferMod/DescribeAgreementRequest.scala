package typings.awsSdk.transferMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeAgreementRequest extends StObject {
  
  /**
    * A unique identifier for the agreement. This identifier is returned when you create an agreement.
    */
  var AgreementId: typings.awsSdk.transferMod.AgreementId
  
  /**
    * The server ID that's associated with the agreement.
    */
  var ServerId: typings.awsSdk.transferMod.ServerId
}
object DescribeAgreementRequest {
  
  inline def apply(AgreementId: AgreementId, ServerId: ServerId): DescribeAgreementRequest = {
    val __obj = js.Dynamic.literal(AgreementId = AgreementId.asInstanceOf[js.Any], ServerId = ServerId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeAgreementRequest]
  }
  
  extension [Self <: DescribeAgreementRequest](x: Self) {
    
    inline def setAgreementId(value: AgreementId): Self = StObject.set(x, "AgreementId", value.asInstanceOf[js.Any])
    
    inline def setServerId(value: ServerId): Self = StObject.set(x, "ServerId", value.asInstanceOf[js.Any])
  }
}
