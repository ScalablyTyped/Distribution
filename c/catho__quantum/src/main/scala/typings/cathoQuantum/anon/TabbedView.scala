package typings.cathoQuantum.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TabbedView extends js.Object {
  var tabbedView: js.UndefOr[js.Object] = js.native
}

object TabbedView {
  @scala.inline
  def apply(): TabbedView = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TabbedView]
  }
  @scala.inline
  implicit class TabbedViewOps[Self <: TabbedView] (val x: Self) extends AnyVal {
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
    def setTabbedView(value: js.Object): Self = this.set("tabbedView", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTabbedView: Self = this.set("tabbedView", js.undefined)
  }
  
}

