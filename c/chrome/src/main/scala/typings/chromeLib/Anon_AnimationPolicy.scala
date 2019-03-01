package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AnimationPolicy extends js.Object {
  var animationPolicy: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var autoclick: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var highContrast: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var largeCursor: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var screenMagnifier: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var spokenFeedback: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var stickyKeys: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  var virtualKeyboard: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
}

object Anon_AnimationPolicy {
  @scala.inline
  def apply(
    animationPolicy: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    autoclick: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    highContrast: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    largeCursor: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    screenMagnifier: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    spokenFeedback: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    stickyKeys: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting,
    virtualKeyboard: chromeLib.chromeNs.accessibilityFeaturesNs.AccessibilityFeaturesSetting
  ): Anon_AnimationPolicy = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("animationPolicy")(animationPolicy)
    __obj.updateDynamic("autoclick")(autoclick)
    __obj.updateDynamic("highContrast")(highContrast)
    __obj.updateDynamic("largeCursor")(largeCursor)
    __obj.updateDynamic("screenMagnifier")(screenMagnifier)
    __obj.updateDynamic("spokenFeedback")(spokenFeedback)
    __obj.updateDynamic("stickyKeys")(stickyKeys)
    __obj.updateDynamic("virtualKeyboard")(virtualKeyboard)
    __obj.asInstanceOf[Anon_AnimationPolicy]
  }
}

