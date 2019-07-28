package typings.chromeDashApps.chromeNs.accessibilityFeaturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityFeaturesSetArg extends js.Object {
  /**
    * The scope of the ChromeSetting. One of
    * • regular: setting for the regular profile (which is inherited by the incognito profile if not overridden elsewhere),
    * • regular_only: setting for the regular profile only (not inherited by the incognito profile),
    * • incognito_persistent: setting for the incognito profile that survives browser restarts (overrides regular preferences),
    * • incognito_session_only: setting for the incognito profile that can only be set during an incognito session and is deleted when the incognito session ends (overrides regular and incognito_persistent preferences).
    */
  var scope: js.UndefOr[Scope] = js.undefined
  /**
    * The value of the setting.
    * Note that every setting has a specific value type, which is described together with the setting. An extension should not set a value of a different type.
    */
  var value: js.Any
}

object AccessibilityFeaturesSetArg {
  @scala.inline
  def apply(value: js.Any, scope: Scope = null): AccessibilityFeaturesSetArg = {
    val __obj = js.Dynamic.literal(value = value)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[AccessibilityFeaturesSetArg]
  }
}

