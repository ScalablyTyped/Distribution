package typings.chartjsPluginCrosshair.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SnapOptions extends js.Object {
  var enabled: js.UndefOr[Boolean] = js.undefined
}

object SnapOptions {
  @scala.inline
  def apply(enabled: js.UndefOr[Boolean] = js.undefined): SnapOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(enabled)) __obj.updateDynamic("enabled")(enabled.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[SnapOptions]
  }
}

