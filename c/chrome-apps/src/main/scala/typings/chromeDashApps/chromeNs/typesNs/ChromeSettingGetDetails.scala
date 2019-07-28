package typings.chromeDashApps.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeSettingGetDetails extends js.Object {
  /** Whether to return the value that applies to the incognito session (default false). */
  var incognito: js.UndefOr[Boolean] = js.undefined
}

object ChromeSettingGetDetails {
  @scala.inline
  def apply(incognito: js.UndefOr[Boolean] = js.undefined): ChromeSettingGetDetails = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(incognito)) __obj.updateDynamic("incognito")(incognito)
    __obj.asInstanceOf[ChromeSettingGetDetails]
  }
}

