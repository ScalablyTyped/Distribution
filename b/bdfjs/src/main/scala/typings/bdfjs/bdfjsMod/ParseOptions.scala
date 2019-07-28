package typings.bdfjs.bdfjsMod

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
    if (!js.isUndefined(allprops)) __obj.updateDynamic("allprops")(allprops)
    if (!js.isUndefined(onlymeta)) __obj.updateDynamic("onlymeta")(onlymeta)
    __obj.asInstanceOf[ParseOptions]
  }
}

