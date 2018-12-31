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

