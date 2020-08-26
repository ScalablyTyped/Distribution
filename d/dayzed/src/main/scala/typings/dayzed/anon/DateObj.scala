package typings.dayzed.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateObj extends js.Object {
  var dateObj: typings.dayzed.mod.DateObj = js.native
}

object DateObj {
  @scala.inline
  def apply(dateObj: typings.dayzed.mod.DateObj): DateObj = {
    val __obj = js.Dynamic.literal(dateObj = dateObj.asInstanceOf[js.Any])
    __obj.asInstanceOf[DateObj]
  }
  @scala.inline
  implicit class DateObjOps[Self <: DateObj] (val x: Self) extends AnyVal {
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
    def setDateObj(value: typings.dayzed.mod.DateObj): Self = this.set("dateObj", value.asInstanceOf[js.Any])
  }
  
}

