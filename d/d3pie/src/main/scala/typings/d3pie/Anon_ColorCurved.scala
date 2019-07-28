package typings.d3pie

import typings.d3pie.d3pieStrings.curved
import typings.d3pie.d3pieStrings.straight
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_ColorCurved extends js.Object {
  var color: js.UndefOr[String] = js.undefined
  var enabled: js.UndefOr[Boolean] = js.undefined
  var style: js.UndefOr[curved | straight] = js.undefined
}

object Anon_ColorCurved {
  @scala.inline
  def apply(color: String = null, enabled: js.UndefOr[Boolean] = js.undefined, style: curved | straight = null): Anon_ColorCurved = {
    val __obj = js.Dynamic.literal()
    if (color != null) __obj.updateDynamic("color")(color)
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    if (style != null) __obj.updateDynamic("style")(style.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_ColorCurved]
  }
}

