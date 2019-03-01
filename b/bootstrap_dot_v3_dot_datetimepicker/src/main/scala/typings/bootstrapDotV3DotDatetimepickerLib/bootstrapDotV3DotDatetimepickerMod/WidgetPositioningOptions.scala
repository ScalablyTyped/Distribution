package typings
package bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait WidgetPositioningOptions extends js.Object {
  var horizontal: js.UndefOr[
    bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.auto | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.left | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.right
  ] = js.undefined
  var vertical: js.UndefOr[
    bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.auto | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.top | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.bottom
  ] = js.undefined
}

object WidgetPositioningOptions {
  @scala.inline
  def apply(
    horizontal: bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.auto | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.left | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.right = null,
    vertical: bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.auto | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.top | bootstrapDotV3DotDatetimepickerLib.bootstrapDotV3DotDatetimepickerLibStrings.bottom = null
  ): WidgetPositioningOptions = {
    val __obj = js.Dynamic.literal()
    if (horizontal != null) __obj.updateDynamic("horizontal")(horizontal.asInstanceOf[js.Any])
    if (vertical != null) __obj.updateDynamic("vertical")(vertical.asInstanceOf[js.Any])
    __obj.asInstanceOf[WidgetPositioningOptions]
  }
}

