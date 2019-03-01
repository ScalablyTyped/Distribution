package typings
package d3pieLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurved extends js.Object {
  var color: js.UndefOr[java.lang.String] = js.undefined
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
  var style: js.UndefOr[d3pieLib.d3pieLibStrings.curved | d3pieLib.d3pieLibStrings.straight] = js.undefined
}

object Anon_ColorCurved {
  @scala.inline
  def apply(
    color: java.lang.String = null,
    enabled: js.UndefOr[scala.Boolean] = js.undefined,
    style: d3pieLib.d3pieLibStrings.curved | d3pieLib.d3pieLibStrings.straight = null
  ): Anon_ColorCurved = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorCurved]
  }
}

