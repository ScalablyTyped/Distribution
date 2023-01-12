package typings.awsSdk.clientsVoiceidMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DescribeFraudsterRequest extends StObject {
  
  /**
    * The identifier of the domain containing the fraudster.
    */
  var DomainId: typings.awsSdk.clientsVoiceidMod.DomainId
  
  /**
    * The identifier of the fraudster you are describing.
    */
  var FraudsterId: typings.awsSdk.clientsVoiceidMod.FraudsterId
}
object DescribeFraudsterRequest {
  
  inline def apply(DomainId: DomainId, FraudsterId: FraudsterId): DescribeFraudsterRequest = {
    val __obj = js.Dynamic.literal(DomainId = DomainId.asInstanceOf[js.Any], FraudsterId = FraudsterId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DescribeFraudsterRequest]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: DescribeFraudsterRequest] (val x: Self) extends AnyVal {
    
    inline def setDomainId(value: DomainId): Self = StObject.set(x, "DomainId", value.asInstanceOf[js.Any])
    
    inline def setFraudsterId(value: FraudsterId): Self = StObject.set(x, "FraudsterId", value.asInstanceOf[js.Any])
  }
}
