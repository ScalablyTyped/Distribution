package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import typings.dateFns.dateFnsNumbers.`4`
import typings.dateFns.dateFnsNumbers.`5`
import typings.dateFns.dateFnsNumbers.`6`
import typings.dateFns.dateFnsNumbers.`7`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FirstWeekContainsDateWeekStartsOn extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  var weekStartsOn: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object FirstWeekContainsDateWeekStartsOn {
  @scala.inline
  def apply(): FirstWeekContainsDateWeekStartsOn = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FirstWeekContainsDateWeekStartsOn]
  }
  @scala.inline
  implicit class FirstWeekContainsDateWeekStartsOnOps[Self <: FirstWeekContainsDateWeekStartsOn] (val x: Self) extends AnyVal {
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
    def setFirstWeekContainsDate(value: `1` | `2` | `3` | `4` | `5` | `6` | `7`): Self = this.set("firstWeekContainsDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirstWeekContainsDate: Self = this.set("firstWeekContainsDate", js.undefined)
    @scala.inline
    def setWeekStartsOn(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekStartsOn: Self = this.set("weekStartsOn", js.undefined)
  }
  
}

