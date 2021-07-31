package typings.chromeApps.global.chrome

import typings.chromeApps.chrome.accessibilityFeatures.AccessibilityFeaturesSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// | 'double';
// #endregion internal
// #region chrome.accessibilityFeatures
////////////////////////////
// Accessibility Features //
////////////////////////////
/**
  * @requires Important: This API works only on Chrome OS.
  * @requires Permissions:
  *      'accessibilityFeatures.read' (For read access)
  *      'accessibilityFeatures.modify' (For modifications)
  *      Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  * @since Chrome 37.
  * @description
  * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features.
  * This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features.
  * In order to get feature states the extension must request accessibilityFeatures.read permission.
  * For modifying feature state, the extension needs accessibilityFeatures.modify permission.
  * Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  */
object accessibilityFeatures {
  
  /**
    * get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 42.
    */
  @JSGlobal("chrome.accessibilityFeatures.animationPolicy")
  @js.native
  val animationPolicy: AccessibilityFeaturesSetting = js.native
  
  /**
    * Auto mouse click after mouse stops moving. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.autoclick")
  @js.native
  val autoclick: AccessibilityFeaturesSetting = js.native
  
  /**
    * Caret highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  @JSGlobal("chrome.accessibilityFeatures.caretHighlight")
  @js.native
  val caretHighlight: AccessibilityFeaturesSetting = js.native
  
  /**
    * Cursor highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  @JSGlobal("chrome.accessibilityFeatures.cursorHighlight")
  @js.native
  val cursorHighlight: AccessibilityFeaturesSetting = js.native
  
  /**
    * Focus highlighting. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  @JSGlobal("chrome.accessibilityFeatures.focusHighlight")
  @js.native
  val focusHighlight: AccessibilityFeaturesSetting = js.native
  
  /**
    * High contrast rendering mode. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.highContrast")
  @js.native
  val highContrast: AccessibilityFeaturesSetting = js.native
  
  /**
    * Enlarged cursor. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.largeCursor")
  @js.native
  val largeCursor: AccessibilityFeaturesSetting = js.native
  
  /**
    * Full screen magnification. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.screenMagnifier")
  @js.native
  val screenMagnifier: AccessibilityFeaturesSetting = js.native
  
  /**
    * Select-to-speak. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  @JSGlobal("chrome.accessibilityFeatures.selectToSpeak")
  @js.native
  val selectToSpeak: AccessibilityFeaturesSetting = js.native
  
  /**
    * Spoken feedback (text-to-speech). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.spokenFeedback")
  @js.native
  val spokenFeedback: AccessibilityFeaturesSetting = js.native
  
  /**
    * Sticky modifier keys (like shift or alt). The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.stickyKeys")
  @js.native
  val stickyKeys: AccessibilityFeaturesSetting = js.native
  
  /**
    * Switch access. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    * @since Chrome 51.
    */
  @JSGlobal("chrome.accessibilityFeatures.switchAccess")
  @js.native
  val switchAccess: AccessibilityFeaturesSetting = js.native
  
  /**
    * Virtual on-screen keyboard. The value indicates whether the feature is enabled or not. get() requires accessibilityFeatures.read permission. set() and clear() require accessibilityFeatures.modify permission.
    */
  @JSGlobal("chrome.accessibilityFeatures.virtualKeyboard")
  @js.native
  val virtualKeyboard: AccessibilityFeaturesSetting = js.native
}
