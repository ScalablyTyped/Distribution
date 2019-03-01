package typings
package cssDashTreeLib.cssDashTreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateOptions extends js.Object {
  var decorator: js.UndefOr[js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers]] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
}

object GenerateOptions {
  @scala.inline
  def apply(
    decorator: js.Function1[/* handlers */ GenerateHandlers, GenerateHandlers] = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  ): GenerateOptions = {
    val __obj = js.Dynamic.literal()
    if (decorator != null) __obj.updateDynamic("decorator")(decorator)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    __obj.asInstanceOf[GenerateOptions]
  }
}

