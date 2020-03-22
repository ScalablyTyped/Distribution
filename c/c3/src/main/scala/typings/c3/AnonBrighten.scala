package typings.c3

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBrighten extends js.Object {
  var brighten: js.UndefOr[Boolean] = js.undefined
  /**
    * Indicate if the chart should have interactions.
    * If `false` is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
    */
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object AnonBrighten {
  @scala.inline
  def apply(brighten: js.UndefOr[Boolean] = js.undefined, enabled: js.UndefOr[Boolean] = js.undefined): AnonBrighten = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(brighten)) __obj.updateDynamic("brighten")(brighten.asInstanceOf[js.Any])
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBrighten]
  }
}

