package typings.cesium.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Toggled extends js.Object {
  var toggled: js.UndefOr[Boolean] = js.native
  var tooltip: js.UndefOr[String] = js.native
}

object Toggled {
  @scala.inline
  def apply(): Toggled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Toggled]
  }
  @scala.inline
  implicit class ToggledOps[Self <: Toggled] (val x: Self) extends AnyVal {
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
    def setToggled(value: Boolean): Self = this.set("toggled", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteToggled: Self = this.set("toggled", js.undefined)
    @scala.inline
    def setTooltip(value: String): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTooltip: Self = this.set("tooltip", js.undefined)
  }
  
}

