package typings.awsSdk.servicediscoveryMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationSummary extends StObject {
  
  /**
    * The ID for an operation.
    */
  var Id: js.UndefOr[OperationId] = js.undefined
  
  /**
    * The status of the operation. Values include the following:    SUBMITTED: This is the initial state immediately after you submit a request.    PENDING: AWS Cloud Map is performing the operation.    SUCCESS: The operation succeeded.    FAIL: The operation failed. For the failure reason, see ErrorMessage.  
    */
  var Status: js.UndefOr[OperationStatus] = js.undefined
}
object OperationSummary {
  
  inline def apply(): OperationSummary = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OperationSummary]
  }
  
  extension [Self <: OperationSummary](x: Self) {
    
    inline def setId(value: OperationId): Self = StObject.set(x, "Id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "Id", js.undefined)
    
    inline def setStatus(value: OperationStatus): Self = StObject.set(x, "Status", value.asInstanceOf[js.Any])
    
    inline def setStatusUndefined: Self = StObject.set(x, "Status", js.undefined)
  }
}
