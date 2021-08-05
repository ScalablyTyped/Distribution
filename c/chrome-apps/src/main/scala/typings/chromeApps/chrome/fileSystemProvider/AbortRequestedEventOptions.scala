package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbortRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** An ID of the request to which this operation is related. */
  var operationRequestId: integer
}
object AbortRequestedEventOptions {
  
  inline def apply(fileSystemId: String, operationRequestId: integer, requestId: integer): AbortRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], operationRequestId = operationRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[AbortRequestedEventOptions]
  }
  
  extension [Self <: AbortRequestedEventOptions](x: Self) {
    
    inline def setOperationRequestId(value: integer): Self = StObject.set(x, "operationRequestId", value.asInstanceOf[js.Any])
  }
}
