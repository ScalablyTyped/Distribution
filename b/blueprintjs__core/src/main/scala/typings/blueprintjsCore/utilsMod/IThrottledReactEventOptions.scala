package typings.blueprintjsCore.utilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThrottledReactEventOptions extends js.Object {
  var preventDefault: js.UndefOr[Boolean] = js.undefined
}

object IThrottledReactEventOptions {
  @scala.inline
  def apply(preventDefault: js.UndefOr[Boolean] = js.undefined): IThrottledReactEventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault.asInstanceOf[js.Any])
    __obj.asInstanceOf[IThrottledReactEventOptions]
  }
}

