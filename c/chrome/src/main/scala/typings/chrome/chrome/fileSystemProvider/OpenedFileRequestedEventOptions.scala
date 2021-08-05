package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenedFileRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** A request ID used to open the file. */
  var openRequestId: Double
}
object OpenedFileRequestedEventOptions {
  
  inline def apply(fileSystemId: String, openRequestId: Double, requestId: Double): OpenedFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileRequestedEventOptions]
  }
  
  extension [Self <: OpenedFileRequestedEventOptions](x: Self) {
    
    inline def setOpenRequestId(value: Double): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
