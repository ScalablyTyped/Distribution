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

