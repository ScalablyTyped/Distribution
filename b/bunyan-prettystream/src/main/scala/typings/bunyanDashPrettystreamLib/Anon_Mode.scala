package typings
package bunyanDashPrettystreamLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Mode extends js.Object {
  var mode: js.UndefOr[java.lang.String] = js.undefined
  var useColor: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Mode {
  @scala.inline
  def apply(mode: java.lang.String = null, useColor: js.UndefOr[scala.Boolean] = js.undefined): Anon_Mode = {
    val __obj = js.Dynamic.literal()
    if (mode != null) __obj.updateDynamic("mode")(mode)
    if (!js.isUndefined(useColor)) __obj.updateDynamic("useColor")(useColor)
    __obj.asInstanceOf[Anon_Mode]
  }
}

