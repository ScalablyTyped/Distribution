package typings.blessed.mod.Widgets

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BoxOptions extends ScrollableTextOptions {
  var bindings: js.UndefOr[js.Any] = js.native
}

object BoxOptions {
  @scala.inline
  def apply(): BoxOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BoxOptions]
  }
  @scala.inline
  implicit class BoxOptionsOps[Self <: BoxOptions] (val x: Self) extends AnyVal {
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
    def setBindings(value: js.Any): Self = this.set("bindings", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBindings: Self = this.set("bindings", js.undefined)
  }
  
}

