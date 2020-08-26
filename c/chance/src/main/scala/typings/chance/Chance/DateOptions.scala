package typings.chance.Chance

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DateOptions extends js.Object {
  var american: js.UndefOr[Boolean] = js.native
  var day: js.UndefOr[Double] = js.native
  var max: js.UndefOr[Date] = js.native
  var min: js.UndefOr[Date] = js.native
  var month: js.UndefOr[Double] = js.native
  var string: js.UndefOr[Boolean] = js.native
  var year: js.UndefOr[Double] = js.native
}

object DateOptions {
  @scala.inline
  def apply(): DateOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DateOptions]
  }
  @scala.inline
  implicit class DateOptionsOps[Self <: DateOptions] (val x: Self) extends AnyVal {
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
    def setAmerican(value: Boolean): Self = this.set("american", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmerican: Self = this.set("american", js.undefined)
    @scala.inline
    def setDay(value: Double): Self = this.set("day", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDay: Self = this.set("day", js.undefined)
    @scala.inline
    def setMax(value: Date): Self = this.set("max", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMax: Self = this.set("max", js.undefined)
    @scala.inline
    def setMin(value: Date): Self = this.set("min", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMin: Self = this.set("min", js.undefined)
    @scala.inline
    def setMonth(value: Double): Self = this.set("month", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMonth: Self = this.set("month", js.undefined)
    @scala.inline
    def setString(value: Boolean): Self = this.set("string", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteString: Self = this.set("string", js.undefined)
    @scala.inline
    def setYear(value: Double): Self = this.set("year", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteYear: Self = this.set("year", js.undefined)
  }
  
}

