package typings.chromeDashApps

import typings.chromeDashApps.chrome.accessibilityFeatures.AccessibilityFeaturesSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaccessibilityFeatures extends js.Object {
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

object TypeofaccessibilityFeatures {
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
  ): TypeofaccessibilityFeatures = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy, autoclick = autoclick, caretHighlight = caretHighlight, cursorHighlight = cursorHighlight, focusHighlight = focusHighlight, highContrast = highContrast, largeCursor = largeCursor, screenMagnifier = screenMagnifier, selectToSpeak = selectToSpeak, spokenFeedback = spokenFeedback, stickyKeys = stickyKeys, switchAccess = switchAccess, virtualKeyboard = virtualKeyboard)
  
    __obj.asInstanceOf[TypeofaccessibilityFeatures]
  }
}

