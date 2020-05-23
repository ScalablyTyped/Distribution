package typings.broFs.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Create extends js.Object {
  var create: js.UndefOr[Boolean] = js.undefined
}

object Create {
  @scala.inline
  def apply(create: js.UndefOr[Boolean] = js.undefined): Create = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(create)) __obj.updateDynamic("create")(create.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Create]
  }
}

