package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EditCreateRowResult extends js.Object {
  var defaultValues: js.Array[String] = js.native
  var newRowId: Double = js.native
}

object EditCreateRowResult {
  @scala.inline
  def apply(defaultValues: js.Array[String], newRowId: Double): EditCreateRowResult = {
    val __obj = js.Dynamic.literal(defaultValues = defaultValues.asInstanceOf[js.Any], newRowId = newRowId.asInstanceOf[js.Any])
    __obj.asInstanceOf[EditCreateRowResult]
  }
  @scala.inline
  implicit class EditCreateRowResultOps[Self <: EditCreateRowResult] (val x: Self) extends AnyVal {
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
    def setDefaultValuesVarargs(value: String*): Self = this.set("defaultValues", js.Array(value :_*))
    @scala.inline
    def setDefaultValues(value: js.Array[String]): Self = this.set("defaultValues", value.asInstanceOf[js.Any])
    @scala.inline
    def setNewRowId(value: Double): Self = this.set("newRowId", value.asInstanceOf[js.Any])
  }
  
}

