package typings
package baseuiLib.popoverMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Overrides extends js.Object {
  var Arrow: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var Body: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
  var Inner: js.UndefOr[baseuiLib.Override[SharedStylePropsArg]] = js.undefined
}

object Overrides {
  @scala.inline
  def apply(
    Arrow: baseuiLib.Override[SharedStylePropsArg] = null,
    Body: baseuiLib.Override[SharedStylePropsArg] = null,
    Inner: baseuiLib.Override[SharedStylePropsArg] = null
  ): Overrides = {
    val __obj = js.Dynamic.literal()
    if (Arrow != null) __obj.updateDynamic("Arrow")(Arrow.asInstanceOf[js.Any])
    if (Body != null) __obj.updateDynamic("Body")(Body.asInstanceOf[js.Any])
    if (Inner != null) __obj.updateDynamic("Inner")(Inner.asInstanceOf[js.Any])
    __obj.asInstanceOf[Overrides]
  }
}

