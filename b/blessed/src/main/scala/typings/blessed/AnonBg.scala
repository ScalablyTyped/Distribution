package typings.blessed

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonBg extends js.Object {
  var bg: js.UndefOr[String] = js.undefined
  var fg: js.UndefOr[String] = js.undefined
}

object AnonBg {
  @scala.inline
  def apply(bg: String = null, fg: String = null): AnonBg = {
    val __obj = js.Dynamic.literal()
    if (bg != null) __obj.updateDynamic("bg")(bg.asInstanceOf[js.Any])
    if (fg != null) __obj.updateDynamic("fg")(fg.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonBg]
  }
}

