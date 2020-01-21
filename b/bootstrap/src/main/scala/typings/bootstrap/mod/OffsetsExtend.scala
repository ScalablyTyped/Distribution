package typings.bootstrap.mod

import typings.popperJs.mod.Offset
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
    if (popper != null) __obj.updateDynamic("popper")(popper.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetsExtend]
  }
}

