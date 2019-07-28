package typings.bunyanDashPrettystream

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[String] = js.undefined
  var useColor: js.UndefOr[Boolean] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: String = null, useColor: js.UndefOr[Boolean] = js.undefined): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(useColor)) __obj.updateDynamic("useColor")(useColor)
    __obj.asInstanceOf[Anon_Mode]
  }
}

