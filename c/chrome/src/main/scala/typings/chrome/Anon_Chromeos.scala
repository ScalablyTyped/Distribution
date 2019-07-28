package typings.chrome

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
    if (chromeos != null) __obj.updateDynamic("chromeos")(chromeos)
    if (default != null) __obj.updateDynamic("default")(default)
    if (linux != null) __obj.updateDynamic("linux")(linux)
    if (mac != null) __obj.updateDynamic("mac")(mac)
    if (windows != null) __obj.updateDynamic("windows")(windows)
    __obj.asInstanceOf[Anon_Chromeos]
  }
}

