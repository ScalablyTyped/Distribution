package typings.braintree.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DisputeStatusHistory extends StObject {
  
  var disbursementDate: js.Date
  
  var effectiveDate: js.Date
  
  var status: DisputeStatus
  
  var timestamp: js.Date
}
object DisputeStatusHistory {
  
  inline def apply(disbursementDate: js.Date, effectiveDate: js.Date, status: DisputeStatus, timestamp: js.Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeStatusHistory]
  }
  
  extension [Self <: DisputeStatusHistory](x: Self) {
    
    inline def setDisbursementDate(value: js.Date): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    inline def setEffectiveDate(value: js.Date): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    inline def setStatus(value: DisputeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    inline def setTimestamp(value: js.Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
