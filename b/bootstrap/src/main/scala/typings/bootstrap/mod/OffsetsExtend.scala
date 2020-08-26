package typings.bootstrap.mod

import typings.bootstrap.anon.PartialOffset
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OffsetsExtend extends js.Object {
  var popper: js.UndefOr[PartialOffset] = js.native
  var reference: js.UndefOr[PartialOffset] = js.native
}

object OffsetsExtend {
  @scala.inline
  def apply(): OffsetsExtend = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OffsetsExtend]
  }
  @scala.inline
  implicit class OffsetsExtendOps[Self <: OffsetsExtend] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setPopper(value: PartialOffset): Self = this.set("popper", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePopper: Self = this.set("popper", js.undefined)
    @scala.inline
    def setReference(value: PartialOffset): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReference: Self = this.set("reference", js.undefined)
  }
  
}

