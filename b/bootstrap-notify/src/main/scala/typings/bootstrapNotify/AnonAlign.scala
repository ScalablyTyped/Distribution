package typings.bootstrapNotify

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAlign extends js.Object {
  var align: js.UndefOr[String] = js.undefined
  var from: js.UndefOr[String] = js.undefined
}

object AnonAlign {
  @scala.inline
  def apply(align: String = null, from: String = null): AnonAlign = {
    val __obj = js.Dynamic.literal()
    if (align != null) __obj.updateDynamic("align")(align.asInstanceOf[js.Any])
    if (from != null) __obj.updateDynamic("from")(from.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAlign]
  }
}

