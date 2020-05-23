package typings.chrome.chrome.cast

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Volume extends js.Object {
  var level: js.UndefOr[Double] = js.undefined
  var muted: js.UndefOr[Boolean] = js.undefined
}

object Volume {
  @scala.inline
  def apply(level: js.UndefOr[Double] = js.undefined, muted: js.UndefOr[Boolean] = js.undefined): Volume = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(level)) __obj.updateDynamic("level")(level.get.asInstanceOf[js.Any])
    if (!js.isUndefined(muted)) __obj.updateDynamic("muted")(muted.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Volume]
  }
}

