package typings
package chaynsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setHeight()
trait SetHeightConfig extends js.Object {
  var full: js.UndefOr[scala.Boolean] = js.undefined
  var fullViewport: js.UndefOr[scala.Boolean] = js.undefined
  var growOnly: js.UndefOr[scala.Boolean] = js.undefined
  var height: scala.Double
}

object SetHeightConfig {
  @scala.inline
  def apply(
    height: scala.Double,
    full: js.UndefOr[scala.Boolean] = js.undefined,
    fullViewport: js.UndefOr[scala.Boolean] = js.undefined,
    growOnly: js.UndefOr[scala.Boolean] = js.undefined
  ): SetHeightConfig = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("height")(height)
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full)
    if (!js.isUndefined(fullViewport)) __obj.updateDynamic("fullViewport")(fullViewport)
    if (!js.isUndefined(growOnly)) __obj.updateDynamic("growOnly")(growOnly)
    __obj.asInstanceOf[SetHeightConfig]
  }
}

