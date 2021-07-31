package typings.chrome.global.chrome

import typings.chrome.chrome.types.ChromeSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

////////////////////
// Accessibility Features
////////////////////
/**
  * Use the chrome.accessibilityFeatures API to manage Chrome's accessibility features. This API relies on the ChromeSetting prototype of the type API for getting and setting individual accessibility features. In order to get feature states the extension must request accessibilityFeatures.read permission. For modifying feature state, the extension needs accessibilityFeatures.modify permission. Note that accessibilityFeatures.modify does not imply accessibilityFeatures.read permission.
  * Availability: Since Chrome 37.
  * Permissions: "accessibilityFeatures.read"
  * Important: This API works only on Chrome OS.
  */
object accessibilityFeatures {
  
  @JSGlobal("chrome.accessibilityFeatures")
  @js.native
  val ^ : js.Any = js.native
  
  @JSGlobal("chrome.accessibilityFeatures.animationPolicy")
  @js.native
  def animationPolicy: ChromeSetting = js.native
  @scala.inline
  def animationPolicy_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("animationPolicy")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.autoclick")
  @js.native
  def autoclick: ChromeSetting = js.native
  @scala.inline
  def autoclick_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("autoclick")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.caretHighlight")
  @js.native
  def caretHighlight: ChromeSetting = js.native
  @scala.inline
  def caretHighlight_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("caretHighlight")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.cursorHighlight")
  @js.native
  def cursorHighlight: ChromeSetting = js.native
  @scala.inline
  def cursorHighlight_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("cursorHighlight")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.focusHighlight")
  @js.native
  def focusHighlight: ChromeSetting = js.native
  @scala.inline
  def focusHighlight_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("focusHighlight")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.highContrast")
  @js.native
  def highContrast: ChromeSetting = js.native
  @scala.inline
  def highContrast_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("highContrast")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.largeCursor")
  @js.native
  def largeCursor: ChromeSetting = js.native
  @scala.inline
  def largeCursor_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("largeCursor")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.screenMagnifier")
  @js.native
  def screenMagnifier: ChromeSetting = js.native
  @scala.inline
  def screenMagnifier_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("screenMagnifier")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.selectToSpeak")
  @js.native
  def selectToSpeak: ChromeSetting = js.native
  @scala.inline
  def selectToSpeak_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("selectToSpeak")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.spokenFeedback")
  @js.native
  def spokenFeedback: ChromeSetting = js.native
  @scala.inline
  def spokenFeedback_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("spokenFeedback")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.stickyKeys")
  @js.native
  def stickyKeys: ChromeSetting = js.native
  @scala.inline
  def stickyKeys_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("stickyKeys")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.switchAccess")
  @js.native
  def switchAccess: ChromeSetting = js.native
  @scala.inline
  def switchAccess_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("switchAccess")(x.asInstanceOf[js.Any])
  
  @JSGlobal("chrome.accessibilityFeatures.virtualKeyboard")
  @js.native
  def virtualKeyboard: ChromeSetting = js.native
  @scala.inline
  def virtualKeyboard_=(x: ChromeSetting): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("virtualKeyboard")(x.asInstanceOf[js.Any])
}
