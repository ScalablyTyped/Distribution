package typings.cleanCss

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonOpacity extends js.Object {
  /**
    * Controls `rgba()` / `hsla()` color support; defaults to `true`
    */
  var opacity: js.UndefOr[Boolean] = js.undefined
}

object AnonOpacity {
  @scala.inline
  def apply(opacity: js.UndefOr[Boolean] = js.undefined): AnonOpacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonOpacity]
  }
}

