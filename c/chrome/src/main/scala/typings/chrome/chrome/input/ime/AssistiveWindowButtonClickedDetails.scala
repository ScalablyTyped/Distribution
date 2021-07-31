package typings.chrome.chrome.input.ime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AssistiveWindowButtonClickedDetails extends StObject {
  
  /** The ID of the button clicked. */
  var buttonID: AssistiveWindowButton
  
  /** The type of the assistive window. */
  var windowType: AssistiveWindowType
}
object AssistiveWindowButtonClickedDetails {
  
  @scala.inline
  def apply(buttonID: AssistiveWindowButton, windowType: AssistiveWindowType): AssistiveWindowButtonClickedDetails = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AssistiveWindowButtonClickedDetails]
  }
  
  @scala.inline
  implicit class AssistiveWindowButtonClickedDetailsMutableBuilder[Self <: AssistiveWindowButtonClickedDetails] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setButtonID(value: AssistiveWindowButton): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowType(value: AssistiveWindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
  }
}
