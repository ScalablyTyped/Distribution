package typings.chrome.anon

import typings.chrome.chrome.input.ime.AssistiveWindowButton
import typings.chrome.chrome.input.ime.AssistiveWindowType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnounceString extends StObject {
  
  var announceString: js.UndefOr[String] = js.native
  
  var buttonID: AssistiveWindowButton = js.native
  
  var contextID: Double = js.native
  
  var highlighted: Boolean = js.native
  
  var windowType: AssistiveWindowType = js.native
}
object AnnounceString {
  
  @scala.inline
  def apply(
    buttonID: AssistiveWindowButton,
    contextID: Double,
    highlighted: Boolean,
    windowType: AssistiveWindowType
  ): AnnounceString = {
    val __obj = js.Dynamic.literal(buttonID = buttonID.asInstanceOf[js.Any], contextID = contextID.asInstanceOf[js.Any], highlighted = highlighted.asInstanceOf[js.Any], windowType = windowType.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnnounceString]
  }
  
  @scala.inline
  implicit class AnnounceStringMutableBuilder[Self <: AnnounceString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnounceString(value: String): Self = StObject.set(x, "announceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceStringUndefined: Self = StObject.set(x, "announceString", js.undefined)
    
    @scala.inline
    def setButtonID(value: AssistiveWindowButton): Self = StObject.set(x, "buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextID(value: Double): Self = StObject.set(x, "contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = StObject.set(x, "highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowType(value: AssistiveWindowType): Self = StObject.set(x, "windowType", value.asInstanceOf[js.Any])
  }
}
