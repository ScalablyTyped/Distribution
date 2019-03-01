package typings
package bdfjsLib.bdfjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ParseOptions extends js.Object {
  var allprops: js.UndefOr[scala.Boolean] = js.undefined
  var onlymeta: js.UndefOr[scala.Boolean] = js.undefined
}

object ParseOptions {
  @scala.inline
  def apply(
    allprops: js.UndefOr[scala.Boolean] = js.undefined,
    onlymeta: js.UndefOr[scala.Boolean] = js.undefined
  ): ParseOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allprops)) __obj.updateDynamic("allprops")(allprops)
    if (!js.isUndefined(onlymeta)) __obj.updateDynamic("onlymeta")(onlymeta)
    __obj.asInstanceOf[ParseOptions]
  }
}

