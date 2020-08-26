package typings.bricksJs.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SizeDetail extends js.Object {
  var columns: Double = js.native
  var gutter: Double = js.native
  var mq: js.UndefOr[String] = js.native
}

object SizeDetail {
  @scala.inline
  def apply(columns: Double, gutter: Double): SizeDetail = {
    val __obj = js.Dynamic.literal(columns = columns.asInstanceOf[js.Any], gutter = gutter.asInstanceOf[js.Any])
    __obj.asInstanceOf[SizeDetail]
  }
  @scala.inline
  implicit class SizeDetailOps[Self <: SizeDetail] (val x: Self) extends AnyVal {
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
    def setColumns(value: Double): Self = this.set("columns", value.asInstanceOf[js.Any])
    @scala.inline
    def setGutter(value: Double): Self = this.set("gutter", value.asInstanceOf[js.Any])
    @scala.inline
    def setMq(value: String): Self = this.set("mq", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMq: Self = this.set("mq", js.undefined)
  }
  
}

