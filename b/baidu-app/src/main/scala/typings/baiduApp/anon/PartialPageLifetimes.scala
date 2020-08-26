package typings.baiduApp.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined std.Partial<baidu-app.swan.PageLifetimes> */
@js.native
trait PartialPageLifetimes extends js.Object {
  var hide: js.UndefOr[js.Function0[Unit]] = js.native
  var show: js.UndefOr[js.Function0[Unit]] = js.native
}

object PartialPageLifetimes {
  @scala.inline
  def apply(): PartialPageLifetimes = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialPageLifetimes]
  }
  @scala.inline
  implicit class PartialPageLifetimesOps[Self <: PartialPageLifetimes] (val x: Self) extends AnyVal {
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
    def setHide(value: () => Unit): Self = this.set("hide", js.Any.fromFunction0(value))
    @scala.inline
    def deleteHide: Self = this.set("hide", js.undefined)
    @scala.inline
    def setShow(value: () => Unit): Self = this.set("show", js.Any.fromFunction0(value))
    @scala.inline
    def deleteShow: Self = this.set("show", js.undefined)
  }
  
}

