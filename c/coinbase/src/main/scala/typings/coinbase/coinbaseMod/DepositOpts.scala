package typings.coinbase.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepositOpts extends js.Object {
  /**
    * Deposit amount
    */
  var amount: String
  /**
    * If set to false, this deposit will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[Boolean] = js.undefined
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[String] = js.undefined
}

object DepositOpts {
  @scala.inline
  def apply(
    amount: String,
    currency: String,
    commit: js.UndefOr[Boolean] = js.undefined,
    payment_method: String = null
  ): DepositOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any])
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit.asInstanceOf[js.Any])
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method.asInstanceOf[js.Any])
    __obj.asInstanceOf[DepositOpts]
  }
}

