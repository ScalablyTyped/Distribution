package typings.bookshelf.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SetOptions extends js.Object {
  var unset: js.UndefOr[Boolean] = js.undefined
}

object SetOptions {
  @scala.inline
  def apply(unset: js.UndefOr[Boolean] = js.undefined): SetOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(unset)) __obj.updateDynamic("unset")(unset.asInstanceOf[js.Any])
    __obj.asInstanceOf[SetOptions]
  }
}

