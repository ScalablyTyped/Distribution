package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait TransferMoneyOpts extends js.Object {
  /**
    * Amount to be transferred
    */
  var amount: java.lang.String
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * Notes to be included in the transfer
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * ID of the receiving account
    */
  var to: java.lang.String
  /**
    * Type transfer is required when transferring bitcoin or ethereum between accounts
    */
  var `type`: coinbaseLib.coinbaseLibStrings.transfer
}

object TransferMoneyOpts {
  @scala.inline
  def apply(
    amount: java.lang.String,
    currency: java.lang.String,
    to: java.lang.String,
    `type`: coinbaseLib.coinbaseLibStrings.transfer,
    description: java.lang.String = null
  ): TransferMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, to = to)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[TransferMoneyOpts]
  }
}

