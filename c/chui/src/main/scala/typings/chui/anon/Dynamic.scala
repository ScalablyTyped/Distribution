package typings.chui.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Dynamic extends js.Object {
  var callback: js.UndefOr[js.Function1[/* args */ js.UndefOr[js.Any], _]] = js.native
  var dynamic: js.UndefOr[Boolean] = js.native
}

object Dynamic {
  @scala.inline
  def apply(): Dynamic = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Dynamic]
  }
  @scala.inline
  implicit class DynamicOps[Self <: Dynamic] (val x: Self) extends AnyVal {
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
    def setCallback(value: /* args */ js.UndefOr[js.Any] => _): Self = this.set("callback", js.Any.fromFunction1(value))
    @scala.inline
    def deleteCallback: Self = this.set("callback", js.undefined)
    @scala.inline
    def setDynamic(value: Boolean): Self = this.set("dynamic", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDynamic: Self = this.set("dynamic", js.undefined)
  }
  
}

