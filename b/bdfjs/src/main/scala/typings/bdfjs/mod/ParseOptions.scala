package typings.bdfjs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allprops: js.UndefOr[Boolean] = js.undefined
  var onlymeta: js.UndefOr[Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(allprops: js.UndefOr[Boolean] = js.undefined, onlymeta: js.UndefOr[Boolean] = js.undefined): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allprops)) __obj.updateDynamic("allprops")(allprops.get.asInstanceOf[js.Any])
    if (!js.isUndefined(onlymeta)) __obj.updateDynamic("onlymeta")(onlymeta.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[ParseOptions]
  }
}

