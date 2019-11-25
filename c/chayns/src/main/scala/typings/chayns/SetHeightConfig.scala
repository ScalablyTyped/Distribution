package typings.chayns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// chayns.setHeight()
trait SetHeightConfig extends js.Object {
  var full: js.UndefOr[Boolean] = js.undefined
  var fullViewport: js.UndefOr[Boolean] = js.undefined
  var growOnly: js.UndefOr[Boolean] = js.undefined
  var height: Double
}

object SetHeightConfig {
  @scala.inline
  def apply(
    height: Double,
    full: js.UndefOr[Boolean] = js.undefined,
    fullViewport: js.UndefOr[Boolean] = js.undefined,
    growOnly: js.UndefOr[Boolean] = js.undefined
  ): SetHeightConfig = {
    val __obj = js.Dynamic.literal(height = height.asInstanceOf[js.Any])
    if (!js.isUndefined(full)) __obj.updateDynamic("full")(full.asInstanceOf[js.Any])
    if (!js.isUndefined(fullViewport)) __obj.updateDynamic("fullViewport")(fullViewport.asInstanceOf[js.Any])
    if (!js.isUndefined(growOnly)) __obj.updateDynamic("growOnly")(growOnly.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetHeightConfig]
  }
}

