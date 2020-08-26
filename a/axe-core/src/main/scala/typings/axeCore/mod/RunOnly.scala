package typings.axeCore.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RunOnly extends js.Object {
  var `type`: RunOnlyType = js.native
  var values: js.Array[String | TagValue] = js.native
}

object RunOnly {
  @scala.inline
  def apply(`type`: RunOnlyType, values: js.Array[String | TagValue]): RunOnly = {
    val __obj = js.Dynamic.literal(values = values.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RunOnly]
  }
  @scala.inline
  implicit class RunOnlyOps[Self <: RunOnly] (val x: Self) extends AnyVal {
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
    def setType(value: RunOnlyType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setValuesVarargs(value: (String | TagValue)*): Self = this.set("values", js.Array(value :_*))
    @scala.inline
    def setValues(value: js.Array[String | TagValue]): Self = this.set("values", value.asInstanceOf[js.Any])
  }
  
}

