package typings.chrome

import typings.chrome.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TypeofaccessibilityFeatures extends js.Object {
  var animationPolicy: AccessibilityFeaturesSetting
  var autoclick: AccessibilityFeaturesSetting
  var highContrast: AccessibilityFeaturesSetting
  var largeCursor: AccessibilityFeaturesSetting
  var screenMagnifier: AccessibilityFeaturesSetting
  var spokenFeedback: AccessibilityFeaturesSetting
  var stickyKeys: AccessibilityFeaturesSetting
  var virtualKeyboard: AccessibilityFeaturesSetting
}

object TypeofaccessibilityFeatures {
  @scala.inline
  def apply(
    animationPolicy: AccessibilityFeaturesSetting,
    autoclick: AccessibilityFeaturesSetting,
    highContrast: AccessibilityFeaturesSetting,
    largeCursor: AccessibilityFeaturesSetting,
    screenMagnifier: AccessibilityFeaturesSetting,
    spokenFeedback: AccessibilityFeaturesSetting,
    stickyKeys: AccessibilityFeaturesSetting,
    virtualKeyboard: AccessibilityFeaturesSetting
  ): TypeofaccessibilityFeatures = {
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy, autoclick = autoclick, highContrast = highContrast, largeCursor = largeCursor, screenMagnifier = screenMagnifier, spokenFeedback = spokenFeedback, stickyKeys = stickyKeys, virtualKeyboard = virtualKeyboard)
  
    __obj.asInstanceOf[TypeofaccessibilityFeatures]
  }
}

