package typings.chrome.chrome.fileSystemProvider

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RequestedEventOptions extends StObject {
  
  /** The identifier of the file system related to this operation. */
  var fileSystemId: String = js.native
  
  /** The unique identifier of this request. */
  var requestId: Double = js.native
}
object RequestedEventOptions {
  
  @scala.inline
  def apply(fileSystemId: String, requestId: Double): RequestedEventOptions = {
    val __obj = js.Dynamic.literal(fileSystemId = fileSystemId.asInstanceOf[js.Any], requestId = requestId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestedEventOptions]
  }
  
  @scala.inline
  implicit class RequestedEventOptionsMutableBuilder[Self <: RequestedEventOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setFileSystemId(value: String): Self = StObject.set(x, "fileSystemId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequestId(value: Double): Self = StObject.set(x, "requestId", value.asInstanceOf[js.Any])
  }
}
