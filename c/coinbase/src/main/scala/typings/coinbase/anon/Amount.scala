package typings.coinbase.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Amount extends js.Object {
  /**
    * Amount as floating-point in a string
    */
  var amount: String = js.native
  /**
    * Currency e.g. "BTC" (see Client#getCurrencies() for available strings)
    */
  var base: String = js.native
  /**
    * Currency e.g. "EUR" (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
}

object Amount {
  @scala.inline
  def apply(amount: String, base: String, currency: String): Amount = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], base = base.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    __obj.asInstanceOf[Amount]
  }
  @scala.inline
  implicit class AmountOps[Self <: Amount] (val x: Self) extends AnyVal {
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
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def setBase(value: String): Self = this.set("base", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
  }
  
}

