package typings
package bootstrapLib.bootstrapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetsExtend extends js.Object {
  var popper: js.UndefOr[stdLib.Partial[popperDotJsLib.popperDotJsMod.Offset]] = js.undefined
  var reference: js.UndefOr[stdLib.Partial[popperDotJsLib.popperDotJsMod.Offset]] = js.undefined
}

object OffsetsExtend {
  @scala.inline
  def apply(
    popper: stdLib.Partial[popperDotJsLib.popperDotJsMod.Offset] = null,
    reference: stdLib.Partial[popperDotJsLib.popperDotJsMod.Offset] = null
  ): OffsetsExtend = {
    val __obj = js.Dynamic.literal()
    if (popper != null) __obj.updateDynamic("popper")(popper)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[OffsetsExtend]
  }
}

