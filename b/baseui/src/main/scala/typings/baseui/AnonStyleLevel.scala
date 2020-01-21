package typings.baseui

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonStyleLevel extends js.Object {
  var styleLevel: js.UndefOr[Double] = js.undefined
}

object AnonStyleLevel {
  @scala.inline
  def apply(styleLevel: Int | Double = null): AnonStyleLevel = {
    val __obj = js.Dynamic.literal()
    if (styleLevel != null) __obj.updateDynamic("styleLevel")(styleLevel.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonStyleLevel]
  }
}

