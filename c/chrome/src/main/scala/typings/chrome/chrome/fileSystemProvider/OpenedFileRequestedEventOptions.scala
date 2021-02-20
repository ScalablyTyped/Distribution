package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait OpenedFileRequestedEventOptions extends RequestedEventOptions {
  
  /** A request ID used to open the file. */
  var openRequestId: Double = js.native
}
object OpenedFileRequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, openRequestId: Double, requestId: Double): OpenedFileRequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], openRequestId = openRequestId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[OpenedFileRequestedEventOptions]
  }
  
  @scala.inline
  implicit class OpenedFileRequestedEventOptionsMutableBuilder[Self <: OpenedFileRequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOpenRequestId(value: Double): Self = StObject.set(x, "openRequestId", value.asInstanceOf[js.Any])
  }
}
