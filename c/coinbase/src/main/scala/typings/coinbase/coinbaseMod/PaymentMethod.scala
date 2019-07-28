package typings.coinbase.coinbaseMod

import typings.coinbase.coinbaseStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethod extends Resource {
  /**
    * Is buying allowed with this method?
    */
  var allow_buy: Boolean
  /**
    * Is selling allowed with this method?
    */
  var allow_sell: Boolean
  /**
    * Payment method’s native currency (see Client#getCurrencies() for available strings)
    */
  var currency: String
  /**
    * Does this method allow for instant buys?
    */
  var instant_buy: Boolean
  /**
    * Does this method allow for instant sells?
    */
  var instant_sell: Boolean
  /**
    * If the user has obtained optional wallet:payment-methods:limits permission, an additional field, limits, will be embedded into payment
    * method data. It will contain information about buy, instant buy, sell and deposit limits (there’s no limits for withdrawals at this time).
    * As each one of these can have several limits you should always look for the lowest remaining value when performing the relevant action.
    */
  var limits: js.UndefOr[PaymentMethodLimits] = js.undefined
  /**
    * Method name
    */
  var name: String
  /**
    * Is primary buying method?
    */
  var primary_buy: Boolean
  /**
    * Is primary selling method?
    */
  var primary_sell: Boolean
  /**
    * Resource type, constant "payment_method"
    */
  @JSName("resource")
  var resource_PaymentMethod: payment_method
  /**
    * Payment method type
    */
  var `type`: PaymentMethodType
}

object PaymentMethod {
  @scala.inline
  def apply(
    allow_buy: Boolean,
    allow_sell: Boolean,
    currency: String,
    instant_buy: Boolean,
    instant_sell: Boolean,
    name: String,
    primary_buy: Boolean,
    primary_sell: Boolean,
    resource: payment_method,
    `type`: PaymentMethodType,
    limits: PaymentMethodLimits = null
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(allow_buy = allow_buy, allow_sell = allow_sell, currency = currency, instant_buy = instant_buy, instant_sell = instant_sell, name = name, primary_buy = primary_buy, primary_sell = primary_sell, resource = resource)
    __obj.updateDynamic("type")(`type`)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    __obj.asInstanceOf[PaymentMethod]
  }
}

