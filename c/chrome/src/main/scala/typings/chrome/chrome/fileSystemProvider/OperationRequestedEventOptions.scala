package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OperationRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** An ID of the request to which this operation is related. */
  var operationRequestId: Double
}
object OperationRequestedEventOptions {
  
  inline def apply(fileSystemId: String, operationRequestId: Double, requestId: Double): OperationRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OperationRequestedEventOptions]
  }
  
  extension [Self <: OperationRequestedEventOptions](x: Self) {
    
    inline def setOperationRequestId(value: Double): Self = StObject.set(x, "operationRequestId", value.asInstanceOf[js.Any])
  }
}
