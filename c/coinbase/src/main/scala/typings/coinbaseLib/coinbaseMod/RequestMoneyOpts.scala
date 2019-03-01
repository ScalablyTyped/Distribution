package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMoneyOpts extends js.Object {
  /**
    * Amount to be transferred
    */
  var amount: java.lang.String
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * An email of the recipient
    */
  var to: java.lang.String
  /**
    * Type request is required when sending money
    */
  var `type`: coinbaseLib.coinbaseLibStrings.request
}

object RequestMoneyOpts {
  @scala.inline
  def apply(
    amount: java.lang.String,
    currency: java.lang.String,
    to: java.lang.String,
    `type`: coinbaseLib.coinbaseLibStrings.request,
    description: java.lang.String = null
  ): RequestMoneyOpts = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("amount")(amount)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("to")(to)
    if (description != null) __obj.updateDynamic("description")(description)
    __obj.asInstanceOf[RequestMoneyOpts]
  }
}

