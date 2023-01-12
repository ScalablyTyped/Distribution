package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReadFileRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** Number of bytes to be returned. */
  var length: double
  
  /** Position in the file (in bytes) to start reading from. */
  var offset: double
  
  /** A request ID used to open the file. */
  var openRequestId: integer
}
object ReadFileRequestedEventOptions {
  
  inline def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReadFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    inline def setLength(value: double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    inline def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    inline def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
