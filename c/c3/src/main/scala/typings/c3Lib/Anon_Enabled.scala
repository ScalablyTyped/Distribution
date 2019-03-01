package typings
package c3Lib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Enabled extends js.Object {
  /**
    * Indicate if the chart should have interactions.
    * If false is set, all of interactions (showing/hiding tooltip, selection, mouse events, etc) will be disabled.
    */
  var enabled: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Enabled {
  @scala.inline
  def apply(enabled: js.UndefOr[scala.Boolean] = js.undefined): Anon_Enabled = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled)
    __obj.asInstanceOf[Anon_Enabled]
  }
}

