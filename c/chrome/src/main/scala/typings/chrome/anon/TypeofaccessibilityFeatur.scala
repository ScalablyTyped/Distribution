package typings.chrome.anon

import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofaccessibilityFeatur extends StObject {
  
  var animationPolicy: ChromeSetting
  
  var autoclick: ChromeSetting
  
  var caretHighlight: ChromeSetting
  
  var cursorHighlight: ChromeSetting
  
  var focusHighlight: ChromeSetting
  
  var highContrast: ChromeSetting
  
  var largeCursor: ChromeSetting
  
  var screenMagnifier: ChromeSetting
  
  var selectToSpeak: ChromeSetting
  
  var spokenFeedback: ChromeSetting
  
  var stickyKeys: ChromeSetting
  
  var switchAccess: ChromeSetting
  
  var virtualKeyboard: ChromeSetting
}
object TypeofaccessibilityFeatur {
  
  inline def apply(
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
  implicit open class MutableBuilder[Self <: TypeofaccessibilityFeatur] (val x: Self) extends AnyVal {
    
    inline def setAnimationPolicy(value: ChromeSetting): Self = StObject.set(x, "animationPolicy", value.asInstanceOf[js.Any])
    
    inline def setAutoclick(value: ChromeSetting): Self = StObject.set(x, "autoclick", value.asInstanceOf[js.Any])
    
    inline def setCaretHighlight(value: ChromeSetting): Self = StObject.set(x, "caretHighlight", value.asInstanceOf[js.Any])
    
    inline def setCursorHighlight(value: ChromeSetting): Self = StObject.set(x, "cursorHighlight", value.asInstanceOf[js.Any])
    
    inline def setFocusHighlight(value: ChromeSetting): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    inline def setHighContrast(value: ChromeSetting): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
    
    inline def setLargeCursor(value: ChromeSetting): Self = StObject.set(x, "largeCursor", value.asInstanceOf[js.Any])
    
    inline def setScreenMagnifier(value: ChromeSetting): Self = StObject.set(x, "screenMagnifier", value.asInstanceOf[js.Any])
    
    inline def setSelectToSpeak(value: ChromeSetting): Self = StObject.set(x, "selectToSpeak", value.asInstanceOf[js.Any])
    
    inline def setSpokenFeedback(value: ChromeSetting): Self = StObject.set(x, "spokenFeedback", value.asInstanceOf[js.Any])
    
    inline def setStickyKeys(value: ChromeSetting): Self = StObject.set(x, "stickyKeys", value.asInstanceOf[js.Any])
    
    inline def setSwitchAccess(value: ChromeSetting): Self = StObject.set(x, "switchAccess", value.asInstanceOf[js.Any])
    
    inline def setVirtualKeyboard(value: ChromeSetting): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
  }
}
