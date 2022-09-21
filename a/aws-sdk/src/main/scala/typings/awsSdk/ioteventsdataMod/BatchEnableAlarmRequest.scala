package typings.awsSdk.ioteventsdataMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BatchEnableAlarmRequest extends StObject {
  
  /**
    * The list of enable action requests. You can specify up to 10 requests per operation.
    */
  var enableActionRequests: EnableAlarmActionRequests
}
object BatchEnableAlarmRequest {
  
  inline def apply(enableActionRequests: EnableAlarmActionRequests): BatchEnableAlarmRequest = {
    val __obj = js.Dynamic.literal(enableActionRequests = enableActionRequests.asInstanceOf[js.Any])
    __obj.asInstanceOf[BatchEnableAlarmRequest]
  }
  
  extension [Self <: BatchEnableAlarmRequest](x: Self) {
    
    inline def setEnableActionRequests(value: EnableAlarmActionRequests): Self = StObject.set(x, "enableActionRequests", value.asInstanceOf[js.Any])
    
    inline def setEnableActionRequestsVarargs(value: EnableAlarmActionRequest*): Self = StObject.set(x, "enableActionRequests", js.Array(value*))
  }
}
