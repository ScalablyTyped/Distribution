package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DepositOpts extends js.Object {
  /**
    * Deposit amount
    */
  var amount: java.lang.String
  /**
    * If set to false, this deposit will not be immediately completed. Use the commit call to complete it. Default value: true
    */
  var commit: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * The ID of the payment method that should be used for the buy. (todo get payment methods)
    */
  var payment_method: js.UndefOr[java.lang.String] = js.undefined
}

object DepositOpts {
  @scala.inline
  def apply(
    amount: java.lang.String,
    currency: java.lang.String,
    commit: js.UndefOr[scala.Boolean] = js.undefined,
    payment_method: java.lang.String = null
  ): DepositOpts = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency)
    if (!js.isUndefined(commit)) __obj.updateDynamic("commit")(commit)
    if (payment_method != null) __obj.updateDynamic("payment_method")(payment_method)
    __obj.asInstanceOf[DepositOpts]
  }
}

