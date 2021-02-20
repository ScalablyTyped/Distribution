package typings.braintree.mod

import typings.std.Date
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DisputeStatusHistory extends StObject {
  
  var disbursementDate: Date = js.native
  
  var effectiveDate: Date = js.native
  
  var status: DisputeStatus = js.native
  
  var timestamp: Date = js.native
}
object DisputeStatusHistory {
  
  @scala.inline
  def apply(disbursementDate: Date, effectiveDate: Date, status: DisputeStatus, timestamp: Date): DisputeStatusHistory = {
    val __obj = js.Dynamic.literal(disbursementDate = disbursementDate.asInstanceOf[js.Any], effectiveDate = effectiveDate.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], timestamp = timestamp.asInstanceOf[js.Any])
    __obj.asInstanceOf[DisputeStatusHistory]
  }
  
  @scala.inline
  implicit class DisputeStatusHistoryMutableBuilder[Self <: DisputeStatusHistory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDisbursementDate(value: Date): Self = StObject.set(x, "disbursementDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEffectiveDate(value: Date): Self = StObject.set(x, "effectiveDate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStatus(value: DisputeStatus): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimestamp(value: Date): Self = StObject.set(x, "timestamp", value.asInstanceOf[js.Any])
  }
}
