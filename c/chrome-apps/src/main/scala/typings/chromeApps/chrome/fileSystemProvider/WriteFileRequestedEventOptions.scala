package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import typings.std.ArrayBuffer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait WriteFileRequestedEventOptions
  extends StObject
     with RequestedEventOptions {
  
  /** Buffer of bytes to be operated on the file. */
  var data: ArrayBuffer
  
  /** Position in the file (in bytes) to start operating from. */
  var offset: integer
  
  /** A request ID used to open the file. */
  var openRequestId: integer
}
object WriteFileRequestedEventOptions {
  
  @scala.inline
  def apply(
    data: ArrayBuffer,
    fileSystemId: String,
    offset: integer,
    openRequestId: integer,
    requestId: integer
  ): WriteFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], fileSystemId = fileSystemId.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[WriteFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit class WriteFileRequestedEventOptionsMutableBuilder[Self <: WriteFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setData(value: ArrayBuffer): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: integer): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
