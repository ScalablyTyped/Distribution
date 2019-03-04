package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SendMoneyOpts extends js.Object {
  /**
    * Amount to be sent
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
    * Transaction fee in BTC/ETH/LTC if you would like to pay it. Fees can be added as a string, such as 0.0005
    */
  var fee: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The website of the financial institution or exchange. Required if to_financial_institution is true.
    */
  var financial_institution_website: js.UndefOr[java.lang.String] = js.undefined
  /**
    * *Recommended* A token to ensure idempotence. If a previous transaction with the same idem parameter already exists for this sender,
    * that previous transaction will be returned and a new one will not be created. Max length 100 characters
    */
  var idem: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Don’t send notification emails for small amounts (e.g. tips)
    */
  var skip_notifications: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * A bitcoin address, litecoin address, ethereum address, or an email of the recipient
    */
  var to: java.lang.String
  /**
    * Whether this send is to another financial institution or exchange. Required if this send is to an address and is valued at over USD$3000.
    */
  var to_financial_institution: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Type send is required when sending money
    */
  var `type`: coinbaseLib.coinbaseLibStrings.send
}

object SendMoneyOpts {
  @scala.inline
  def apply(
    amount: java.lang.String,
    currency: java.lang.String,
    to: java.lang.String,
    `type`: coinbaseLib.coinbaseLibStrings.send,
    description: java.lang.String = null,
    fee: java.lang.String = null,
    financial_institution_website: java.lang.String = null,
    idem: java.lang.String = null,
    skip_notifications: js.UndefOr[scala.Boolean] = js.undefined,
    to_financial_institution: js.UndefOr[scala.Boolean] = js.undefined
  ): SendMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount, currency = currency, to = to)
    __obj.updateDynamic("type")(`type`)
    if (description != null) __obj.updateDynamic("description")(description)
    if (fee != null) __obj.updateDynamic("fee")(fee)
    if (financial_institution_website != null) __obj.updateDynamic("financial_institution_website")(financial_institution_website)
    if (idem != null) __obj.updateDynamic("idem")(idem)
    if (!js.isUndefined(skip_notifications)) __obj.updateDynamic("skip_notifications")(skip_notifications)
    if (!js.isUndefined(to_financial_institution)) __obj.updateDynamic("to_financial_institution")(to_financial_institution)
    __obj.asInstanceOf[SendMoneyOpts]
  }
}

