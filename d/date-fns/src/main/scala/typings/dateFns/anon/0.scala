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
trait `0` extends js.Object {
  var firstWeekContainsDate: js.UndefOr[`1` | `2` | `3` | `4` | `5` | `6` | `7`] = js.native
  var locale: js.UndefOr[typings.dateFns.Locale] = js.native
  var weekStartsOn: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`] = js.native
}

object `0` {
  @scala.inline
  def apply(): `0` = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[`0`]
  }
  @scala.inline
  implicit class `0Ops`[Self <: `0`] (val x: Self) extends AnyVal {
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
    def setLocale(value: typings.dateFns.Locale): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLocale: Self = this.set("locale", js.undefined)
    @scala.inline
    def setWeekStartsOn(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3` | `4` | `5` | `6`): Self = this.set("weekStartsOn", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWeekStartsOn: Self = this.set("weekStartsOn", js.undefined)
  }
  
}

