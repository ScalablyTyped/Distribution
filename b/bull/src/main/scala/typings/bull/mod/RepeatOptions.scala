package typings.bull.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RepeatOptions extends js.Object {
  /**
    * End date when the repeat job should stop repeating
    */
  var endDate: js.UndefOr[Date | String | Double] = js.native
  /**
    * Number of times the job should repeat at max.
    */
  var limit: js.UndefOr[Double] = js.native
  /**
    * Timezone
    */
  var tz: js.UndefOr[String] = js.native
}

object RepeatOptions {
  @scala.inline
  def apply(): RepeatOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[RepeatOptions]
  }
  @scala.inline
  implicit class RepeatOptionsOps[Self <: RepeatOptions] (val x: Self) extends AnyVal {
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
    def setEndDate(value: Date | String | Double): Self = this.set("endDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEndDate: Self = this.set("endDate", js.undefined)
    @scala.inline
    def setLimit(value: Double): Self = this.set("limit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimit: Self = this.set("limit", js.undefined)
    @scala.inline
    def setTz(value: String): Self = this.set("tz", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTz: Self = this.set("tz", js.undefined)
  }
  
}

