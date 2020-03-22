package typings.bootstrap.mod

import typings.bootstrap.PartialOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OffsetsExtend extends js.Object {
  var popper: js.UndefOr[PartialOffset] = js.undefined
  var reference: js.UndefOr[PartialOffset] = js.undefined
}

object OffsetsExtend {
  @scala.inline
  def apply(popper: PartialOffset = null, reference: PartialOffset = null): OffsetsExtend = {
    val __obj = js.Dynamic.literal()
    if (popper != null) __obj.updateDynamic("popper")(popper.asInstanceOf[js.Any])
    if (reference != null) __obj.updateDynamic("reference")(reference.asInstanceOf[js.Any])
    __obj.asInstanceOf[OffsetsExtend]
  }
}

