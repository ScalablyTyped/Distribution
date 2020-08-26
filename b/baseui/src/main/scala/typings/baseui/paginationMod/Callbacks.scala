package typings.baseui.paginationMod

import typings.baseui.anon.EventAny
import typings.baseui.anon.NextPage
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Callbacks extends js.Object {
  var onNextClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
  var onPageChange: js.UndefOr[js.Function1[/* args */ NextPage, _]] = js.native
  var onPrevClick: js.UndefOr[js.Function1[/* args */ EventAny, _]] = js.native
}

object Callbacks {
  @scala.inline
  def apply(): Callbacks = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Callbacks]
  }
  @scala.inline
  implicit class CallbacksOps[Self <: Callbacks] (val x: Self) extends AnyVal {
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
    def setOnNextClick(value: /* args */ EventAny => _): Self = this.set("onNextClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnNextClick: Self = this.set("onNextClick", js.undefined)
    @scala.inline
    def setOnPageChange(value: /* args */ NextPage => _): Self = this.set("onPageChange", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPageChange: Self = this.set("onPageChange", js.undefined)
    @scala.inline
    def setOnPrevClick(value: /* args */ EventAny => _): Self = this.set("onPrevClick", js.Any.fromFunction1(value))
    @scala.inline
    def deleteOnPrevClick: Self = this.set("onPrevClick", js.undefined)
  }
  
}

