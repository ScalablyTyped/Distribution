package typings.bizcharts.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Items extends js.Object {
  var items: js.Any = js.native
  var tooltip: js.Any = js.native
  var x: Double = js.native
  var y: Double = js.native
}

object Items {
  @scala.inline
  def apply(items: js.Any, tooltip: js.Any, x: Double, y: Double): Items = {
    val __obj = js.Dynamic.literal(items = items.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any], x = x.asInstanceOf[js.Any], y = y.asInstanceOf[js.Any])
    __obj.asInstanceOf[Items]
  }
  @scala.inline
  implicit class ItemsOps[Self <: Items] (val x: Self) extends AnyVal {
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
    def setItems(value: js.Any): Self = this.set("items", value.asInstanceOf[js.Any])
    @scala.inline
    def setTooltip(value: js.Any): Self = this.set("tooltip", value.asInstanceOf[js.Any])
    @scala.inline
    def setX(value: Double): Self = this.set("x", value.asInstanceOf[js.Any])
    @scala.inline
    def setY(value: Double): Self = this.set("y", value.asInstanceOf[js.Any])
  }
  
}

