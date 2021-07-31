package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SendKeyEventParameters extends StObject {
  
  /** ID of the context where the key events will be sent, or zero to send key events to non-input field. */
  var contextID: Double
  
  /** Data on the key event. */
  var keyData: js.Array[KeyboardEvent]
}
object SendKeyEventParameters {
  
  @scala.inline
  def apply(contextID: Double, keyData: js.Array[KeyboardEvent]): SendKeyEventParameters = {
    val __obj = js.Dynamic.literal(contextID = contextID.asInstanceOf[js.Any], keyData = keyData.asInstanceOf[js.Any])
    __obj.asInstanceOf[SendKeyEventParameters]
  }
  
  @scala.inline
  implicit class SendKeyEventParametersMutableBuilder[Self <: SendKeyEventParameters] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyData(value: js.Array[KeyboardEvent]): Self = StObject.set(x, "keyData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setKeyDataVarargs(value: KeyboardEvent*): Self = StObject.set(x, "keyData", js.Array(value :_*))
  }
}
