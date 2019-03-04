package typings
package chromeDashAppsLib.chromeNs.accessibilityFeaturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityFeaturesCallbackArg extends js.Object {
  /** Whether the effective value is specific to the incognito session. This property will only be present if the incognito property in the details parameter of get() was true.  */
  var incognitoSpecific: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * One of
    * • not_controllable: cannot be controlled by any extension
    * • controlled_by_other_extensions: controlled by extensions with higher precedence
    * • controllable_by_this_extension: can be controlled by this app
    * • controlled_by_this_extension: controlled by this app
    */
  var levelOfControl: LevelOfControl
  /** The value of the setting. */
  var value: js.Any
}

object AccessibilityFeaturesCallbackArg {
  @scala.inline
  def apply(
    levelOfControl: LevelOfControl,
    value: js.Any,
    incognitoSpecific: js.UndefOr[scala.Boolean] = js.undefined
  ): AccessibilityFeaturesCallbackArg = {
    val __obj = js.Dynamic.literal(levelOfControl = levelOfControl, value = value)
    if (!js.isUndefined(incognitoSpecific)) __obj.updateDynamic("incognitoSpecific")(incognitoSpecific)
    __obj.asInstanceOf[AccessibilityFeaturesCallbackArg]
  }
}

