package typings.base32Encode.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var padding: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(padding: js.UndefOr[Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(padding)) __obj.updateDynamic("padding")(padding.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

