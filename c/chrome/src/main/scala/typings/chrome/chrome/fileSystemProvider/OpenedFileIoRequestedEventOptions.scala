package typings.chrome.chrome.fileSystemProvider

import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OpenedFileIoRequestedEventOptions
  extends StObject
     with OpenedFileRequestedEventOptions {
  
  /** Buffer of bytes to be operated on the file. */
  var data: ArrayBuffer
  
  /** Position in the file (in bytes) to start operating from. */
  var offset: Double
}
object OpenedFileIoRequestedEventOptions {
  
  inline def apply(data: ArrayBuffer, fileSystemId: String, offset: Double, openRequestId: Double, requestId: Double): OpenedFileIoRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileIoRequestedEventOptions]
  }
  
  extension [Self <: OpenedFileIoRequestedEventOptions](x: Self) {
    
    inline def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: Double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
  }
}
