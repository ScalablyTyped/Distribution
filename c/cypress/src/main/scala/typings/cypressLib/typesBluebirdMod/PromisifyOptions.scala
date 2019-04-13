package typings
package cypressLib.typesBluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var multiArgs: js.UndefOr[scala.Boolean] = js.undefined
}

object PromisifyOptions {
  @scala.inline
  def apply(context: js.Any = null, multiArgs: js.UndefOr[scala.Boolean] = js.undefined): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context)
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs)
    __obj.asInstanceOf[PromisifyOptions]
  }
}

