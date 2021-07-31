package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserCloseResponse extends StObject {
  
  var message: String
  
  var succeeded: Boolean
}
object FileBrowserCloseResponse {
  
  @scala.inline
  def apply(message: String, succeeded: Boolean): FileBrowserCloseResponse = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserCloseResponse]
  }
  
  @scala.inline
  implicit class FileBrowserCloseResponseMutableBuilder[Self <: FileBrowserCloseResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
