package typings.babelTypes

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonComputed extends js.Object {
  var computed: Boolean | Null
}

object AnonComputed {
  @scala.inline
  def apply(computed: js.UndefOr[Boolean] = js.undefined): AnonComputed = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(computed)) __obj.updateDynamic("computed")(computed.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonComputed]
  }
}

