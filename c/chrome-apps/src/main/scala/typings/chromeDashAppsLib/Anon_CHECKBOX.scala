package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CHECKBOX extends js.Object {
  var CHECKBOX: chromeDashAppsLib.chromeDashAppsLibStrings.checkbox
  var NORMAL: chromeDashAppsLib.chromeDashAppsLibStrings.normal
  var RADIO: chromeDashAppsLib.chromeDashAppsLibStrings.radio
  var SEPARATOR: chromeDashAppsLib.chromeDashAppsLibStrings.separator
}

object Anon_CHECKBOX {
  @scala.inline
  def apply(
    CHECKBOX: chromeDashAppsLib.chromeDashAppsLibStrings.checkbox,
    NORMAL: chromeDashAppsLib.chromeDashAppsLibStrings.normal,
    RADIO: chromeDashAppsLib.chromeDashAppsLibStrings.radio,
    SEPARATOR: chromeDashAppsLib.chromeDashAppsLibStrings.separator
  ): Anon_CHECKBOX = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("CHECKBOX")(CHECKBOX)
    __obj.updateDynamic("NORMAL")(NORMAL)
    __obj.updateDynamic("RADIO")(RADIO)
    __obj.updateDynamic("SEPARATOR")(SEPARATOR)
    __obj.asInstanceOf[Anon_CHECKBOX]
  }
}

