package typings.bull.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CronRepeatOptions extends RepeatOptions {
  /**
    * Cron pattern specifying when the job should execute
    */
  var cron: String = js.native
  /**
    * Start date when the repeat job should start repeating (only with cron).
    */
  var startDate: js.UndefOr[Date | String | Double] = js.native
}

object CronRepeatOptions {
  @scala.inline
  def apply(cron: String): CronRepeatOptions = {
    val __obj = js.Dynamic.literal(cron = cron.asInstanceOf[js.Any])
    __obj.asInstanceOf[CronRepeatOptions]
  }
  @scala.inline
  implicit class CronRepeatOptionsOps[Self <: CronRepeatOptions] (val x: Self) extends AnyVal {
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
    def setCron(value: String): Self = this.set("cron", value.asInstanceOf[js.Any])
    @scala.inline
    def setStartDate(value: Date | String | Double): Self = this.set("startDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartDate: Self = this.set("startDate", js.undefined)
  }
  
}

