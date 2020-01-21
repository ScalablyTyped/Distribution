package typings.convertSourceMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonMultiline extends js.Object {
  var multiline: js.UndefOr[Boolean] = js.undefined
}

object AnonMultiline {
  @scala.inline
  def apply(multiline: js.UndefOr[Boolean] = js.undefined): AnonMultiline = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(multiline)) __obj.updateDynamic("multiline")(multiline.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonMultiline]
  }
}

