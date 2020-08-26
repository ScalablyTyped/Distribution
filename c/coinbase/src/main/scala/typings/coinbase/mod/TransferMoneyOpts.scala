package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TransferMoneyOpts extends js.Object {
  /**
    * Amount to be transferred
    */
  var amount: String = js.native
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  /**
    * Notes to be included in the transfer
    */
  var description: js.UndefOr[String] = js.native
  /**
    * ID of the receiving account
    */
  var to: String = js.native
  /**
    * Type transfer is required when transferring bitcoin or ethereum between accounts
    */
  var `type`: transfer = js.native
}

object TransferMoneyOpts {
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: transfer): TransferMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TransferMoneyOpts]
  }
  @scala.inline
  implicit class TransferMoneyOptsOps[Self <: TransferMoneyOpts] (val x: Self) extends AnyVal {
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
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setTo(value: String): Self = this.set("to", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: transfer): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
  }
  
}

