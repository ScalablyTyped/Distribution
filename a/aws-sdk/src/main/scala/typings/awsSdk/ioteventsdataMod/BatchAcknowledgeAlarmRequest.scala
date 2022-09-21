package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchAcknowledgeAlarmRequest extends StObject {
  
  /**
    * The list of acknowledge action requests. You can specify up to 10 requests per operation.
    */
  var acknowledgeActionRequests: AcknowledgeAlarmActionRequests
}
object BatchAcknowledgeAlarmRequest {
  
  inline def apply(acknowledgeActionRequests: AcknowledgeAlarmActionRequests): BatchAcknowledgeAlarmRequest = {
    val __obj = js.Dynamic.literal(acknowledgeActionRequests = acknowledgeActionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchAcknowledgeAlarmRequest]
  }
  
  extension [Self <: BatchAcknowledgeAlarmRequest](x: Self) {
    
    inline def setAcknowledgeActionRequests(value: AcknowledgeAlarmActionRequests): Self = StObject.set(x, "acknowledgeActionRequests", value.asInstanceOf[js.Any])
    
    inline def setAcknowledgeActionRequestsVarargs(value: AcknowledgeAlarmActionRequest*): Self = StObject.set(x, "acknowledgeActionRequests", js.Array(value*))
  }
}
