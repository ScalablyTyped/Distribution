package typings.betterScroll.mod

import typings.betterScroll.anon.Fn
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EaseOption extends js.Object {
  var bounce: js.UndefOr[Fn] = js.native
  var swipe: js.UndefOr[Fn] = js.native
  var swipeBounce: js.UndefOr[Fn] = js.native
}

object EaseOption {
  @scala.inline
  def apply(): EaseOption = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EaseOption]
  }
  @scala.inline
  implicit class EaseOptionOps[Self <: EaseOption] (val x: Self) extends AnyVal {
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
    def setBounce(value: Fn): Self = this.set("bounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBounce: Self = this.set("bounce", js.undefined)
    @scala.inline
    def setSwipe(value: Fn): Self = this.set("swipe", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipe: Self = this.set("swipe", js.undefined)
    @scala.inline
    def setSwipeBounce(value: Fn): Self = this.set("swipeBounce", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSwipeBounce: Self = this.set("swipeBounce", js.undefined)
  }
  
}

