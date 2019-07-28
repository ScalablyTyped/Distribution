package typings.coinbase.coinbaseMod

import typings.coinbase.coinbaseStrings.transfer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferMoneyOpts extends js.Object {
  /**
    * Amount to be transferred
    */
  var amount: String
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * Notes to be included in the transfer
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * ID of the receiving account
    */
  var to: String
  /**
    * Type transfer is required when transferring bitcoin or ethereum between accounts
    */
  var `type`: transfer
}

object TransferMoneyOpts {
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: transfer, description: String = null): TransferMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, to = to)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[TransferMoneyOpts]
  }
}

