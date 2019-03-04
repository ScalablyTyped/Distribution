package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationPolicy extends js.Object {
  /**
    * get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 42.
    */
  val animationPolicy: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Auto mouse click after mouse stops moving. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val autoclick: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Caret highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val caretHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Cursor highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val cursorHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Focus highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val focusHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * High contrast rendering mode. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val highContrast: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Enlarged cursor. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val largeCursor: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Full screen magnification. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val screenMagnifier: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Select-to-speak. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val selectToSpeak: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Spoken feedback (text-to-speech). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val spokenFeedback: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Sticky modifier keys (like shift or alt). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val stickyKeys: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Switch access. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  val switchAccess: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  /**
    * Virtual on-screen keyboard. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  val virtualKeyboard: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
}

object Anon_AnimationPolicy {
  @scala.inline
  def apply(
    animationPolicy: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    autoclick: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    caretHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    cursorHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    focusHighlight: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    highContrast: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    largeCursor: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    screenMagnifier: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    selectToSpeak: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    spokenFeedback: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    stickyKeys: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    switchAccess: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    virtualKeyboard: chromeDashAppsLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  ): Anon_AnimationPolicy = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy, autoclick = autoclick, caretHighlight = caretHighlight, cursorHighlight = cursorHighlight, focusHighlight = focusHighlight, highContrast = highContrast, largeCursor = largeCursor, screenMagnifier = screenMagnifier, selectToSpeak = selectToSpeak, spokenFeedback = spokenFeedback, stickyKeys = stickyKeys, switchAccess = switchAccess, virtualKeyboard = virtualKeyboard)
  
    __obj.asInstanceOf[Anon_AnimationPolicy]
  }
}

