package typings.bootstrap.bootstrapMod

import typings.popperDotJs.popperDotJsMod.Offset
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetsExtend extends js.Object {
  var popper: js.UndefOr[Partial[Offset]] = js.undefined
  var reference: js.UndefOr[Partial[Offset]] = js.undefined
}

object OffsetsExtend {
  @scala.inline
  def apply(popper: Partial[Offset] = null, reference: Partial[Offset] = null): OffsetsExtend = {
    val __obj = js.Dynamic.literal()
    if (popper != null) __obj.updateDynamic("popper")(popper)
    if (reference != null) __obj.updateDynamic("reference")(reference)
    __obj.asInstanceOf[OffsetsExtend]
  }
}

