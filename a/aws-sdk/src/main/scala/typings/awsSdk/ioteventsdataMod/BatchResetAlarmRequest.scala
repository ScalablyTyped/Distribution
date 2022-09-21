package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchResetAlarmRequest extends StObject {
  
  /**
    * The list of reset action requests. You can specify up to 10 requests per operation.
    */
  var resetActionRequests: ResetAlarmActionRequests
}
object BatchResetAlarmRequest {
  
  inline def apply(resetActionRequests: ResetAlarmActionRequests): BatchResetAlarmRequest = {
    val __obj = js.Dynamic.literal(resetActionRequests = resetActionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchResetAlarmRequest]
  }
  
  extension [Self <: BatchResetAlarmRequest](x: Self) {
    
    inline def setResetActionRequests(value: ResetAlarmActionRequests): Self = StObject.set(x, "resetActionRequests", value.asInstanceOf[js.Any])
    
    inline def setResetActionRequestsVarargs(value: ResetAlarmActionRequest*): Self = StObject.set(x, "resetActionRequests", js.Array(value*))
  }
}
