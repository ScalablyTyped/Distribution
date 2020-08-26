package typings.baidumapWebSdk.BMap

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PredictDate extends js.Object {
  var hour: Double = js.native
  var weekday: Double = js.native
}

object PredictDate {
  @scala.inline
  def apply(hour: Double, weekday: Double): PredictDate = {
    val __obj = js.Dynamic.literal(hour = hour.asInstanceOf[js.Any], weekday = weekday.asInstanceOf[js.Any])
    __obj.asInstanceOf[PredictDate]
  }
  @scala.inline
  implicit class PredictDateOps[Self <: PredictDate] (val x: Self) extends AnyVal {
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
    def setWeekday(value: Double): Self = this.set("weekday", value.asInstanceOf[js.Any])
  }
  
}

