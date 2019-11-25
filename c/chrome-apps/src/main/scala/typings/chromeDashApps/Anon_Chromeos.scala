package typings.chromeDashApps

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Chromeos extends js.Object {
  var chromeos: js.UndefOr[String] = js.undefined
  var default: js.UndefOr[String] = js.undefined
  var linux: js.UndefOr[String] = js.undefined
  var mac: js.UndefOr[String] = js.undefined
  var windows: js.UndefOr[String] = js.undefined
}

object Anon_Chromeos {
  @scala.inline
  def apply(
    chromeos: String = null,
    default: String = null,
    linux: String = null,
    mac: String = null,
    windows: String = null
  ): Anon_Chromeos = {
    val __obj = js.Dynamic.literal()
    if (chromeos != null) __obj.updateDynamic("chromeos")(chromeos.asInstanceOf[js.Any])
    if (default != null) __obj.updateDynamic("default")(default.asInstanceOf[js.Any])
    if (linux != null) __obj.updateDynamic("linux")(linux.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (windows != null) __obj.updateDynamic("windows")(windows.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Chromeos]
  }
}

