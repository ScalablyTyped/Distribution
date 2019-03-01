package typings
package atBlueprintjsCoreLib.libEsmCommonUtilsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IThrottledReactEventOptions extends js.Object {
  var preventDefault: js.UndefOr[scala.Boolean] = js.undefined
}

object IThrottledReactEventOptions {
  @scala.inline
  def apply(preventDefault: js.UndefOr[scala.Boolean] = js.undefined): IThrottledReactEventOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(preventDefault)) __obj.updateDynamic("preventDefault")(preventDefault)
    __obj.asInstanceOf[IThrottledReactEventOptions]
  }
}

