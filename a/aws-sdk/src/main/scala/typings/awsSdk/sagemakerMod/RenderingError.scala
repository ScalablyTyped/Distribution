package typings.awsSdk.sagemakerMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait RenderingError extends StObject {
  
  /**
    * A unique identifier for a specific class of errors.
    */
  var Code: String
  
  /**
    * A human-readable message describing the error.
    */
  var Message: String
}
object RenderingError {
  
  @scala.inline
  def apply(Code: String, Message: String): RenderingError = {
    val __obj = js.Dynamic.literal(Code = Code.asInstanceOf[js.Any], Message = Message.asInstanceOf[js.Any])
    __obj.asInstanceOf[RenderingError]
  }
  
  @scala.inline
  implicit class RenderingErrorMutableBuilder[Self <: RenderingError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: String): Self = StObject.set(x, "Code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "Message", value.asInstanceOf[js.Any])
  }
}
