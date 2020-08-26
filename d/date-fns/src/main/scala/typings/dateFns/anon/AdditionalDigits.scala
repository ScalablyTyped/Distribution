package typings.dateFns.anon

import typings.dateFns.dateFnsNumbers.`1`
import typings.dateFns.dateFnsNumbers.`2`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AdditionalDigits extends js.Object {
  var additionalDigits: js.UndefOr[typings.dateFns.dateFnsNumbers.`0` | `1` | `2`] = js.native
}

object AdditionalDigits {
  @scala.inline
  def apply(): AdditionalDigits = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AdditionalDigits]
  }
  @scala.inline
  implicit class AdditionalDigitsOps[Self <: AdditionalDigits] (val x: Self) extends AnyVal {
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
    def setAdditionalDigits(value: typings.dateFns.dateFnsNumbers.`0` | `1` | `2`): Self = this.set("additionalDigits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAdditionalDigits: Self = this.set("additionalDigits", js.undefined)
  }
  
}

