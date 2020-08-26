package typings.datejs.sugarpak

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ITimeLiteral extends js.Object {
  var hour: Double = js.native
  var millisecond: Double = js.native
  var minute: Double = js.native
  var second: Double = js.native
}

object ITimeLiteral {
  @scala.inline
  def apply(hour: Double, millisecond: Double, minute: Double, second: Double): ITimeLiteral = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], millisecond = millisecond.asInstanceOf[js.Any], minute = minute.asInstanceOf[js.Any], second = second.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimeLiteral]
  }
  @scala.inline
  implicit class ITimeLiteralOps[Self <: ITimeLiteral] (val x: Self) extends AnyVal {
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
    def setHour(value: Double): Self = this.set("hour", value.asInstanceOf[js.Any])
    @scala.inline
    def setMillisecond(value: Double): Self = this.set("millisecond", value.asInstanceOf[js.Any])
    @scala.inline
    def setMinute(value: Double): Self = this.set("minute", value.asInstanceOf[js.Any])
    @scala.inline
    def setSecond(value: Double): Self = this.set("second", value.asInstanceOf[js.Any])
  }
  
}

