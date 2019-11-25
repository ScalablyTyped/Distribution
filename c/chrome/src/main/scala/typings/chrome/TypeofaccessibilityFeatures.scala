package typings.chrome

import typings.chrome.chrome.accessibilityFeatures.AccessibilityFeaturesSetting
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
    val __obj = js.Dynamic.literal(animationPolicy = animationPolicy.asInstanceOf[js.Any], autoclick = autoclick.asInstanceOf[js.Any], highContrast = highContrast.asInstanceOf[js.Any], largeCursor = largeCursor.asInstanceOf[js.Any], screenMagnifier = screenMagnifier.asInstanceOf[js.Any], spokenFeedback = spokenFeedback.asInstanceOf[js.Any], stickyKeys = stickyKeys.asInstanceOf[js.Any], virtualKeyboard = virtualKeyboard.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[TypeofaccessibilityFeatures]
  }
}

