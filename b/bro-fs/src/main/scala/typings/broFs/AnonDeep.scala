package typings.broFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDeep extends js.Object {
  var deep: js.UndefOr[Boolean] = js.undefined
}

object AnonDeep {
  @scala.inline
  def apply(deep: js.UndefOr[Boolean] = js.undefined): AnonDeep = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(deep)) __obj.updateDynamic("deep")(deep.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDeep]
  }
}

