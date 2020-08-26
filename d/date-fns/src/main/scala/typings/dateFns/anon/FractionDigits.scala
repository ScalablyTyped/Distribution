package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import typings.dateFns.dateFnsNumbers.`3`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FractionDigits extends js.Object {
  var fractionDigits: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`] = js.native
}

object FractionDigits {
  @scala.inline
  def apply(): FractionDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[FractionDigits]
  }
  @scala.inline
  implicit class FractionDigitsOps[Self <: FractionDigits] (val x: Self) extends AnyVal {
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
    def setFractionDigits(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2` | `3`): Self = this.set("fractionDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFractionDigits: Self = this.set("fractionDigits", js.undefined)
  }
  
}

