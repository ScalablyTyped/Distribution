package typings.datatablesNet.DataTables

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AjaxDataRequestOrder extends js.Object {
  var column: Double = js.native
  var dir: String = js.native
}

object AjaxDataRequestOrder {
  @scala.inline
  def apply(column: Double, dir: String): AjaxDataRequestOrder = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], dir = dir.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjaxDataRequestOrder]
  }
  @scala.inline
  implicit class AjaxDataRequestOrderOps[Self <: AjaxDataRequestOrder] (val x: Self) extends AnyVal {
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
    def setColumn(value: Double): Self = this.set("column", value.asInstanceOf[js.Any])
    @scala.inline
    def setDir(value: String): Self = this.set("dir", value.asInstanceOf[js.Any])
  }
  
}

