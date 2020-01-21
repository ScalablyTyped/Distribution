package typings.broFs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCreate extends js.Object {
  var create: js.UndefOr[Boolean] = js.undefined
}

object AnonCreate {
  @scala.inline
  def apply(create: js.UndefOr[Boolean] = js.undefined): AnonCreate = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonCreate]
  }
}

