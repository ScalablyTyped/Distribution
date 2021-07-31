package typings.chromeApps.anon

import typings.chromeApps.chrome.accessibilityFeatures.AccessibilityFeaturesSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TypeofaccessibilityFeatur extends StObject {
  
  /**
    * get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 42.
    */
  val animationPolicy: AccessibilityFeaturesSetting
  
  /**
    * Auto mouse click after mouse stops moving. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val autoclick: AccessibilityFeaturesSetting
  
  /**
    * Caret highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val caretHighlight: AccessibilityFeaturesSetting
  
  /**
    * Cursor highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val cursorHighlight: AccessibilityFeaturesSetting
  
  /**
    * Focus highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val focusHighlight: AccessibilityFeaturesSetting
  
  /**
    * High contrast rendering mode. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val highContrast: AccessibilityFeaturesSetting
  
  /**
    * Enlarged cursor. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val largeCursor: AccessibilityFeaturesSetting
  
  /**
    * Full screen magnification. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val screenMagnifier: AccessibilityFeaturesSetting
  
  /**
    * Select-to-speak. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val selectToSpeak: AccessibilityFeaturesSetting
  
  /**
    * Spoken feedback (text-to-speech). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val spokenFeedback: AccessibilityFeaturesSetting
  
  /**
    * Sticky modifier keys (like shift or alt). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val stickyKeys: AccessibilityFeaturesSetting
  
  /**
    * Switch access. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val switchAccess: AccessibilityFeaturesSetting
  
  /**
    * Virtual on-screen keyboard. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val virtualKeyboard: AccessibilityFeaturesSetting
}
object TypeofaccessibilityFeatur {
  
  @scala.inline
  def apply(
    animationPolicy: AccessibilityFeaturesSetting,
    autoclick: AccessibilityFeaturesSetting,
    caretHighlight: AccessibilityFeaturesSetting,
    cursorHighlight: AccessibilityFeaturesSetting,
    focusHighlight: AccessibilityFeaturesSetting,
    highContrast: AccessibilityFeaturesSetting,
    largeCursor: AccessibilityFeaturesSetting,
    screenMagnifier: AccessibilityFeaturesSetting,
    selectToSpeak: AccessibilityFeaturesSetting,
    spokenFeedback: AccessibilityFeaturesSetting,
    stickyKeys: AccessibilityFeaturesSetting,
    switchAccess: AccessibilityFeaturesSetting,
    virtualKeyboard: AccessibilityFeaturesSetting
  ): TypeofaccessibilityFeatur = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy.asInstanceOf[js.Any], autoclick = autoclick.asInstanceOf[js.Any], caretHighlight = caretHighlight.asInstanceOf[js.Any], cursorHighlight = cursorHighlight.asInstanceOf[js.Any], focusHighlight = focusHighlight.asInstanceOf[js.Any], highContrast = highContrast.asInstanceOf[js.Any], largeCursor = largeCursor.asInstanceOf[js.Any], screenMagnifier = screenMagnifier.asInstanceOf[js.Any], selectToSpeak = selectToSpeak.asInstanceOf[js.Any], spokenFeedback = spokenFeedback.asInstanceOf[js.Any], stickyKeys = stickyKeys.asInstanceOf[js.Any], switchAccess = switchAccess.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
    __obj.asInstanceOf[TypeofaccessibilityFeatur]
  }
  
  @scala.inline
  implicit class TypeofaccessibilityFeaturMutableBuilder[Self <: TypeofaccessibilityFeatur] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationPolicy(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "animationPolicy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAutoclick(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "autoclick", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCaretHighlight(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "caretHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCursorHighlight(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "cursorHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFocusHighlight(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "focusHighlight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighContrast(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "highContrast", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLargeCursor(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "largeCursor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setScreenMagnifier(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "screenMagnifier", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectToSpeak(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "selectToSpeak", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSpokenFeedback(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "spokenFeedback", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStickyKeys(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "stickyKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSwitchAccess(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "switchAccess", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setVirtualKeyboard(value: AccessibilityFeaturesSetting): Self = StObject.set(x, "virtualKeyboard", value.asInstanceOf[js.Any])
  }
}
