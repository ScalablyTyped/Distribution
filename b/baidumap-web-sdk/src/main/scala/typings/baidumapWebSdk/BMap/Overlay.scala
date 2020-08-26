package typings.baidumapWebSdk.BMap

import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Overlay extends js.Object {
  var draw: js.UndefOr[js.Function0[Unit]] = js.native
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  var initialize: js.UndefOr[js.Function1[/* map */ Map, HTMLElement]] = js.native
  var isVisible: js.UndefOr[js.Function0[Boolean]] = js.native
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}

object Overlay {
  @scala.inline
  def apply(): Overlay = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Overlay]
  }
  @scala.inline
  implicit class OverlayOps[Self <: Overlay] (val x: Self) extends AnyVal {
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
    def setDraw(value: () => Unit): Self = this.set("draw", js.Any.fromFunction0(value))
    @scala.inline
    def deleteDraw: Self = this.set("draw", js.undefined)
    @scala.inline
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setInitialize(value: /* map */ Map => HTMLElement): Self = this.set("initialize", js.Any.fromFunction1(value))
    @scala.inline
    def deleteInitialize: Self = this.set("initialize", js.undefined)
    @scala.inline
    def setIsVisible(value: () => Boolean): Self = this.set("isVisible", js.Any.fromFunction0(value))
    @scala.inline
    def deleteIsVisible: Self = this.set("isVisible", js.undefined)
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

