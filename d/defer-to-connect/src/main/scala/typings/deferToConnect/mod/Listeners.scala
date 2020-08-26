package typings.deferToConnect.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Listeners extends js.Object {
  var close: js.UndefOr[js.Function1[/* hadError */ Boolean, Unit]] = js.native
  var connect: js.UndefOr[js.Function0[Unit]] = js.native
  var secureConnect: js.UndefOr[js.Function0[Unit]] = js.native
}

object Listeners {
  @scala.inline
  def apply(): Listeners = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Listeners]
  }
  @scala.inline
  implicit class ListenersOps[Self <: Listeners] (val x: Self) extends AnyVal {
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
    def setClose(value: /* hadError */ Boolean => Unit): Self = this.set("close", js.Any.fromFunction1(value))
    @scala.inline
    def deleteClose: Self = this.set("close", js.undefined)
    @scala.inline
    def setConnect(value: () => Unit): Self = this.set("connect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteConnect: Self = this.set("connect", js.undefined)
    @scala.inline
    def setSecureConnect(value: () => Unit): Self = this.set("secureConnect", js.Any.fromFunction0(value))
    @scala.inline
    def deleteSecureConnect: Self = this.set("secureConnect", js.undefined)
  }
  
}

