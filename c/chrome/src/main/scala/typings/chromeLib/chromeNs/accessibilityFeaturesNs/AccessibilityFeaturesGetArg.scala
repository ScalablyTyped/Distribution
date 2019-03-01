package typings
package chromeLib.chromeNs.accessibilityFeaturesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessibilityFeaturesGetArg extends js.Object {
  /** Optional. Whether to return the value that applies to the incognito session (default false).  */
  var incognito: js.UndefOr[scala.Boolean] = js.undefined
}

object AccessibilityFeaturesGetArg {
  @scala.inline
  def apply(incognito: js.UndefOr[scala.Boolean] = js.undefined): AccessibilityFeaturesGetArg = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    __obj.asInstanceOf[AccessibilityFeaturesGetArg]
  }
}

