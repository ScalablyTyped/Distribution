package typings
package coinbaseLib.coinbaseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PaymentMethod extends Resource {
  /**
    * Is buying allowed with this method?
    */
  var allow_buy: scala.Boolean
  /**
    * Is selling allowed with this method?
    */
  var allow_sell: scala.Boolean
  /**
    * Payment method’s native currency (see Client#getCurrencies() for available strings)
    */
  var currency: java.lang.String
  /**
    * Does this method allow for instant buys?
    */
  var instant_buy: scala.Boolean
  /**
    * Does this method allow for instant sells?
    */
  var instant_sell: scala.Boolean
  /**
    * If the user has obtained optional wallet:payment-methods:limits permission, an additional field, limits, will be embedded into payment
    * method data. It will contain information about buy, instant buy, sell and deposit limits (there’s no limits for withdrawals at this time).
    * As each one of these can have several limits you should always look for the lowest remaining value when performing the relevant action.
    */
  var limits: js.UndefOr[PaymentMethodLimits] = js.undefined
  /**
    * Method name
    */
  var name: java.lang.String
  /**
    * Is primary buying method?
    */
  var primary_buy: scala.Boolean
  /**
    * Is primary selling method?
    */
  var primary_sell: scala.Boolean
  /**
    * Resource type, constant "payment_method"
    */
  @JSName("resource")
  var resource_PaymentMethod: coinbaseLib.coinbaseLibStrings.payment_method
  /**
    * Payment method type
    */
  var `type`: PaymentMethodType
}

object PaymentMethod {
  @scala.inline
  def apply(
    allow_buy: scala.Boolean,
    allow_sell: scala.Boolean,
    currency: java.lang.String,
    instant_buy: scala.Boolean,
    instant_sell: scala.Boolean,
    name: java.lang.String,
    primary_buy: scala.Boolean,
    primary_sell: scala.Boolean,
    resource: coinbaseLib.coinbaseLibStrings.payment_method,
    `type`: PaymentMethodType,
    limits: PaymentMethodLimits = null
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(`type` = `type`)
    __obj.updateDynamic("allow_buy")(allow_buy)
    __obj.updateDynamic("allow_sell")(allow_sell)
    __obj.updateDynamic("currency")(currency)
    __obj.updateDynamic("instant_buy")(instant_buy)
    __obj.updateDynamic("instant_sell")(instant_sell)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("primary_buy")(primary_buy)
    __obj.updateDynamic("primary_sell")(primary_sell)
    __obj.updateDynamic("resource")(resource)
    if (limits != null) __obj.updateDynamic("limits")(limits)
    __obj.asInstanceOf[PaymentMethod]
  }
}

