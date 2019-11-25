package typings.baidumapDashWebDashSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LocalCityOptions extends js.Object {
  var renderOptions: js.UndefOr[RenderOptions] = js.undefined
}

object LocalCityOptions {
  @scala.inline
  def apply(renderOptions: RenderOptions = null): LocalCityOptions = {
    val __obj = js.Dynamic.literal()
    if (renderOptions != null) __obj.updateDynamic("renderOptions")(renderOptions.asInstanceOf[js.Any])
    __obj.asInstanceOf[LocalCityOptions]
  }
}

