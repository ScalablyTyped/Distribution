package typings.c3.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Class extends js.Object {
  /** Class to apply to the line. */
  var `class`: js.UndefOr[String] = js.native
  var value_x1: js.UndefOr[Double] = js.native
  var value_x2: js.UndefOr[Double] = js.native
  var value_y1: js.UndefOr[Double] = js.native
  var value_y2: js.UndefOr[Double] = js.native
}

object Class {
  @scala.inline
  def apply(): Class = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Class]
  }
  @scala.inline
  implicit class ClassOps[Self <: Class] (val x: Self) extends AnyVal {
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
    def setClass(value: String): Self = this.set("class", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteClass: Self = this.set("class", js.undefined)
    @scala.inline
    def setValue_x1(value: Double): Self = this.set("value_x1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue_x1: Self = this.set("value_x1", js.undefined)
    @scala.inline
    def setValue_x2(value: Double): Self = this.set("value_x2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue_x2: Self = this.set("value_x2", js.undefined)
    @scala.inline
    def setValue_y1(value: Double): Self = this.set("value_y1", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue_y1: Self = this.set("value_y1", js.undefined)
    @scala.inline
    def setValue_y2(value: Double): Self = this.set("value_y2", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteValue_y2: Self = this.set("value_y2", js.undefined)
  }
  
}

