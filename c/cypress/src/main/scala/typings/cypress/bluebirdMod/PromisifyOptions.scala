package typings.cypress.bluebirdMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PromisifyOptions extends js.Object {
  var context: js.UndefOr[js.Any] = js.undefined
  var multiArgs: js.UndefOr[Boolean] = js.undefined
}

object PromisifyOptions {
  @scala.inline
  def apply(context: js.Any = null, multiArgs: js.UndefOr[Boolean] = js.undefined): PromisifyOptions = {
    val __obj = js.Dynamic.literal()
    if (context != null) __obj.updateDynamic("context")(context.asInstanceOf[js.Any])
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[PromisifyOptions]
  }
}

