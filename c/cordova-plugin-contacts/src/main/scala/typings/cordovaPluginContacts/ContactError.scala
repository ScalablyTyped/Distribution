package typings.cordovaPluginContacts

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/** The ContactError object is returned to the user through the contactError callback function when an error occurs. */
trait ContactError extends StObject {
  
  /** Error code */
  var code: Double
  
  /** Error message */
  var message: String
}
object ContactError {
  
  @scala.inline
  def apply(code: Double, message: String): ContactError = {
    val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContactError]
  }
  
  @scala.inline
  implicit class ContactErrorMutableBuilder[Self <: ContactError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCode(value: Double): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
  }
}
