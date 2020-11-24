package typings.chrome.anon

import typings.chrome.chrome.input.ime.AssistiveWindowButton
import typings.chrome.chrome.input.ime.AssistiveWindowType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AnnounceString extends js.Object {
  
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
  implicit class AnnounceStringOps[Self <: AnnounceString] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setButtonID(value: AssistiveWindowButton): Self = this.set("buttonID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setContextID(value: Double): Self = this.set("contextID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlighted(value: Boolean): Self = this.set("highlighted", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWindowType(value: AssistiveWindowType): Self = this.set("windowType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnounceString(value: String): Self = this.set("announceString", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAnnounceString: Self = this.set("announceString", js.undefined)
  }
}
