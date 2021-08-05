package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TransactionRiskData extends StObject {
  
  var decision: String
  
  var deviceDataCaptured: Boolean
  
  var fraudServiceProvider: String
  
  var id: String
}
object TransactionRiskData {
  
  inline def apply(decision: String, deviceDataCaptured: Boolean, fraudServiceProvider: String, id: String): TransactionRiskData = {
    val __obj = js.Dynamic.literal(decision = decision.asInstanceOf[js.Any], deviceDataCaptured = deviceDataCaptured.asInstanceOf[js.Any], fraudServiceProvider = fraudServiceProvider.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransactionRiskData]
  }
  
  extension [Self <: TransactionRiskData](x: Self) {
    
    inline def setDecision(value: String): Self = StObject.set(x, "decision", value.asInstanceOf[js.Any])
    
    inline def setDeviceDataCaptured(value: Boolean): Self = StObject.set(x, "deviceDataCaptured", value.asInstanceOf[js.Any])
    
    inline def setFraudServiceProvider(value: String): Self = StObject.set(x, "fraudServiceProvider", value.asInstanceOf[js.Any])
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
  }
}
