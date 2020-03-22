package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRaw extends js.Object {
  var cooked: js.UndefOr[String] = js.undefined
  var raw: js.UndefOr[String] = js.undefined
}

object AnonRaw {
  @scala.inline
  def apply(cooked: String = null, raw: String = null): AnonRaw = {
    val __obj = js.Dynamic.literal()
    if (cooked != null) __obj.updateDynamic("cooked")(cooked.asInstanceOf[js.Any])
    if (raw != null) __obj.updateDynamic("raw")(raw.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonRaw]
  }
}

