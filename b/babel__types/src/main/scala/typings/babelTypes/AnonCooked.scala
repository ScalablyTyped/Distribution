package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCooked extends js.Object {
  var cooked: js.UndefOr[String] = js.undefined
  var raw: String
}

object AnonCooked {
  @scala.inline
  def apply(raw: String, cooked: String = null): AnonCooked = {
    val __obj = js.Dynamic.literal(raw = raw.asInstanceOf[js.Any])
    if (cooked != null) __obj.updateDynamic("cooked")(cooked.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCooked]
  }
}

