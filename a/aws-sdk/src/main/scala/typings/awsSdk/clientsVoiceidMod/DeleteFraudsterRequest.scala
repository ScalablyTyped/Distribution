package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DeleteFraudsterRequest extends StObject {
  
  /**
    * The identifier of the domain containing the fraudster.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the fraudster you want to delete.
    */
  var FraudsterId: typings.awsSdk.clientsVoiceidMod.FraudsterId
}
object DeleteFraudsterRequest {
  
  inline def apply(DomainId: DomainId, FraudsterId: FraudsterId): DeleteFraudsterRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], FraudsterId = FraudsterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeleteFraudsterRequest]
  }
  
  extension [Self <: DeleteFraudsterRequest](x: Self) {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setFraudsterId(value: FraudsterId): Self = StObject.set(x, "FraudsterId", value.asInstanceOf[js.Any])
  }
}
