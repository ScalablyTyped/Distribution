package typings
package chromeDashAppsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chromeos extends js.Object {
  var chromeos: js.UndefOr[java.lang.String] = js.undefined
  var default: js.UndefOr[java.lang.String] = js.undefined
  var linux: js.UndefOr[java.lang.String] = js.undefined
  var mac: js.UndefOr[java.lang.String] = js.undefined
  var windows: js.UndefOr[java.lang.String] = js.undefined
}

object Anon_Chromeos {
  @scala.inline
  def apply(
    chromeos: java.lang.String = null,
    default: java.lang.String = null,
    linux: java.lang.String = null,
    mac: java.lang.String = null,
    windows: java.lang.String = null
  ): Anon_Chromeos = {
    val __obj = js.Dynamic.literal()
    if (chromeos != null) __obj.updateDynamic("chromeos")(chromeos)
    if (default != null) __obj.updateDynamic("default")(default)
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (windows != null) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[Anon_Chromeos]
  }
}

