package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PanOptions extends js.Object {
  var noAnimation: js.UndefOr[Boolean] = js.undefined
}

object PanOptions {
  @scala.inline
  def apply(noAnimation: js.UndefOr[Boolean] = js.undefined): PanOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(noAnimation)) __obj.updateDynamic("noAnimation")(noAnimation.asInstanceOf[js.Any])
    __obj.asInstanceOf[PanOptions]
  }
}

