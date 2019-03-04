package typings
package chromeDashAppsLib.chromeNs.typesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ChromeSettingSetDetails extends ChromeSettingClearDetails {
  /**
    * The value of the setting.
    * Note that every setting has a specific value type,
    * which is described together with the setting.
    * An app should not set a value of a different type.
    */
  var value: js.Any
}

object ChromeSettingSetDetails {
  @scala.inline
  def apply(value: js.Any, scope: ChromeSettingScope = null): ChromeSettingSetDetails = {
    val __obj = js.Dynamic.literal(value = value)
    if (scope != null) __obj.updateDynamic("scope")(scope)
    __obj.asInstanceOf[ChromeSettingSetDetails]
  }
}

