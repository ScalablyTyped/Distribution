package typings.chrome.anon

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TypeofaccessibilityFeatur extends js.Object {
  var animationPolicy: ChromeSetting = js.native
  var autoclick: ChromeSetting = js.native
  var caretHighlight: ChromeSetting = js.native
  var cursorHighlight: ChromeSetting = js.native
  var focusHighlight: ChromeSetting = js.native
  var highContrast: ChromeSetting = js.native
  var largeCursor: ChromeSetting = js.native
  var screenMagnifier: ChromeSetting = js.native
  var selectToSpeak: ChromeSetting = js.native
  var spokenFeedback: ChromeSetting = js.native
  var stickyKeys: ChromeSetting = js.native
  var switchAccess: ChromeSetting = js.native
  var virtualKeyboard: ChromeSetting = js.native
}

object TypeofaccessibilityFeatur {
  @scala.inline
  def apply(
    animationPolicy: ChromeSetting,
    autoclick: ChromeSetting,
    caretHighlight: ChromeSetting,
    cursorHighlight: ChromeSetting,
    focusHighlight: ChromeSetting,
    highContrast: ChromeSetting,
    largeCursor: ChromeSetting,
    screenMagnifier: ChromeSetting,
    selectToSpeak: ChromeSetting,
    spokenFeedback: ChromeSetting,
    stickyKeys: ChromeSetting,
    switchAccess: ChromeSetting,
    virtualKeyboard: ChromeSetting
  ): TypeofaccessibilityFeatur = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy.asInstanceOf[js.Any], autoclick = autoclick.asInstanceOf[js.Any], caretHighlight = caretHighlight.asInstanceOf[js.Any], cursorHighlight = cursorHighlight.asInstanceOf[js.Any], focusHighlight = focusHighlight.asInstanceOf[js.Any], highContrast = highContrast.asInstanceOf[js.Any], largeCursor = largeCursor.asInstanceOf[js.Any], screenMagnifier = screenMagnifier.asInstanceOf[js.Any], selectToSpeak = selectToSpeak.asInstanceOf[js.Any], spokenFeedback = spokenFeedback.asInstanceOf[js.Any], stickyKeys = stickyKeys.asInstanceOf[js.Any], switchAccess = switchAccess.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaccessibilityFeatur]
  }
  @scala.inline
  implicit class TypeofaccessibilityFeaturOps[Self <: TypeofaccessibilityFeatur] (val x: Self) extends AnyVal {
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
    def setAnimationPolicy(value: ChromeSetting): Self = this.set("animationPolicy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAutoclick(value: ChromeSetting): Self = this.set("autoclick", value.asInstanceOf[js.Any])
    @scala.inline
    def setCaretHighlight(value: ChromeSetting): Self = this.set("caretHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setCursorHighlight(value: ChromeSetting): Self = this.set("cursorHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setFocusHighlight(value: ChromeSetting): Self = this.set("focusHighlight", value.asInstanceOf[js.Any])
    @scala.inline
    def setHighContrast(value: ChromeSetting): Self = this.set("highContrast", value.asInstanceOf[js.Any])
    @scala.inline
    def setLargeCursor(value: ChromeSetting): Self = this.set("largeCursor", value.asInstanceOf[js.Any])
    @scala.inline
    def setScreenMagnifier(value: ChromeSetting): Self = this.set("screenMagnifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setSelectToSpeak(value: ChromeSetting): Self = this.set("selectToSpeak", value.asInstanceOf[js.Any])
    @scala.inline
    def setSpokenFeedback(value: ChromeSetting): Self = this.set("spokenFeedback", value.asInstanceOf[js.Any])
    @scala.inline
    def setStickyKeys(value: ChromeSetting): Self = this.set("stickyKeys", value.asInstanceOf[js.Any])
    @scala.inline
    def setSwitchAccess(value: ChromeSetting): Self = this.set("switchAccess", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualKeyboard(value: ChromeSetting): Self = this.set("virtualKeyboard", value.asInstanceOf[js.Any])
  }
  
}

