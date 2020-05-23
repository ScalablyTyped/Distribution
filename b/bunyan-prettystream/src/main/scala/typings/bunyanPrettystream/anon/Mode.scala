package typings.bunyanPrettystream.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Mode extends js.Object {
  var mode: js.UndefOr[String] = js.undefined
  var useColor: js.UndefOr[Boolean] = js.undefined
}

object Mode {
  @scala.inline
  def apply(mode: String = null, useColor: js.UndefOr[Boolean] = js.undefined): Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode.asInstanceOf[js.Any])
    if (!js.isUndefined(useColor)) __obj.updateDynamic("useColor")(useColor.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Mode]
  }
}

