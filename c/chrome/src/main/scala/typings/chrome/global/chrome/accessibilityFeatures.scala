package typings.chrome.global.chrome

import typings.chrome.chrome.types.ChromeSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
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
@JSGlobal("chrome.accessibilityFeatures")
@js.native
object accessibilityFeatures extends js.Object {
  
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
