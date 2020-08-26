package typings.coinbase.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fee extends js.Object {
  /**
    * Amount associated to this fee
    */
  var amount: MoneyHash = js.native
  /**
    * Fee beneficiary ("bank", "coinbase", ...)
    */
  var `type`: String = js.native
}

object Fee {
  @scala.inline
  def apply(amount: MoneyHash, `type`: String): Fee = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fee]
  }
  @scala.inline
  implicit class FeeOps[Self <: Fee] (val x: Self) extends AnyVal {
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
    def setAmount(value: MoneyHash): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: String): Self = this.set("type", value.asInstanceOf[js.Any])
  }
  
}

