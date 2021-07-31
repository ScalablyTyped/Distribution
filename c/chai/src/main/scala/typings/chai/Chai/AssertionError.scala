package typings.chai.Chai

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssertionError extends StObject {
  
  var message: String
  
  var name: String
  
  var showDiff: Boolean
  
  var stack: String
}
object AssertionError {
  
  @scala.inline
  def apply(message: String, name: String, showDiff: Boolean, stack: String): AssertionError = {
    val __obj = js.Dynamic.literal(message = message.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], showDiff = showDiff.asInstanceOf[js.Any], stack = stack.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssertionError]
  }
  
  @scala.inline
  implicit class AssertionErrorMutableBuilder[Self <: AssertionError] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShowDiff(value: Boolean): Self = StObject.set(x, "showDiff", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStack(value: String): Self = StObject.set(x, "stack", value.asInstanceOf[js.Any])
  }
}
