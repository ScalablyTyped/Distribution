package typings.chromeApps.chrome.fileSystemProvider

import typings.chromeApps.chrome.double
import typings.chromeApps.chrome.fileSystemProvider.internal.RequestedEventOptions
import typings.chromeApps.chrome.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReadFileRequestedEventOptions extends RequestedEventOptions {
  
  /** Number of bytes to be returned. */
  var length: double = js.native
  
  /** Position in the file (in bytes) to start reading from. */
  var offset: double = js.native
  
  /** A request ID used to open the file. */
  var openRequestId: integer = js.native
}
object ReadFileRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, length: double, offset: double, openRequestId: integer, requestId: integer): ReadFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReadFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit class ReadFileRequestedEventOptionsMutableBuilder[Self <: ReadFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setLength(value: double): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOffset(value: double): Self = StObject.set(x, "offset", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOpenRequestId(value: integer): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
