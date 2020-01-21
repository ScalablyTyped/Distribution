package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.request
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RequestMoneyOpts extends js.Object {
  /**
    * Amount to be transferred
    */
  var amount: String
  /**
    * Currency for the amount (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * Notes to be included in the email that the recipient receives
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * An email of the recipient
    */
  var to: String
  /**
    * Type request is required when sending money
    */
  var `type`: request
}

object RequestMoneyOpts {
  @scala.inline
  def apply(amount: String, currency: String, to: String, `type`: request, description: String = null): RequestMoneyOpts = {
    val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    __obj.asInstanceOf[RequestMoneyOpts]
  }
}

