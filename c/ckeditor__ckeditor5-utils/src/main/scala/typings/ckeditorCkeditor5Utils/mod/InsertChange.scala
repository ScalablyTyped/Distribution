package typings.ckeditorCkeditor5Utils.mod

import typings.ckeditorCkeditor5Utils.ckeditorCkeditor5UtilsStrings.insert
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait InsertChange extends js.Object {
  var index: Double = js.native
  var `type`: insert = js.native
  var values: js.Array[String] = js.native
}

object InsertChange {
  @scala.inline
  def apply(index: Double, `type`: insert, values: js.Array[String]): InsertChange = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InsertChange]
  }
  @scala.inline
  implicit class InsertChangeOps[Self <: InsertChange] (val x: Self) extends AnyVal {
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
    def setIndex(value: Double): Self = this.set("index", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: insert): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: String*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

