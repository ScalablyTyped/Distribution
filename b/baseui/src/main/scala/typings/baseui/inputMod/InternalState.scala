package typings.baseui.inputMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InternalState extends js.Object {
  var isFocused: js.UndefOr[Boolean] = js.native
  var isMasked: js.UndefOr[Boolean] = js.native
}

object InternalState {
  @scala.inline
  def apply(): InternalState = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[InternalState]
  }
  @scala.inline
  implicit class InternalStateOps[Self <: InternalState] (val x: Self) extends AnyVal {
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
    def setIsFocused(value: Boolean): Self = this.set("isFocused", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsFocused: Self = this.set("isFocused", js.undefined)
    @scala.inline
    def setIsMasked(value: Boolean): Self = this.set("isMasked", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsMasked: Self = this.set("isMasked", js.undefined)
  }
  
}

