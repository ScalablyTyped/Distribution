package typings.azdata.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait FileBrowserValidatedParams extends StObject {
  
  var message: String
  
  var succeeded: Boolean
}
object FileBrowserValidatedParams {
  
  @scala.inline
  def apply(message: String, succeeded: Boolean): FileBrowserValidatedParams = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], succeeded = succeeded.asInstanceOf[js.Any])
    __obj.asInstanceOf[FileBrowserValidatedParams]
  }
  
  @scala.inline
  implicit class FileBrowserValidatedParamsMutableBuilder[Self <: FileBrowserValidatedParams] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSucceeded(value: Boolean): Self = StObject.set(x, "succeeded", value.asInstanceOf[js.Any])
  }
}
