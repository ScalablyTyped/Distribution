package typings.cleanCss.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Opacity extends js.Object {
  /**
    * Controls `rgba()` / `hsla()` color support; defaults to `true`
    */
  var opacity: js.UndefOr[Boolean] = js.undefined
}

object Opacity {
  @scala.inline
  def apply(opacity: js.UndefOr[Boolean] = js.undefined): Opacity = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(opacity)) __obj.updateDynamic("opacity")(opacity.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Opacity]
  }
}

