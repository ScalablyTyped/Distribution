package typings.coinbase.mod

import typings.coinbase.coinbaseStrings.payment_method
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PaymentMethod extends Resource {
  /**
    * Is buying allowed with this method?
    */
  var allow_buy: Boolean = js.native
  /**
    * Is selling allowed with this method?
    */
  var allow_sell: Boolean = js.native
  /**
    * Payment method’s native currency (see Client#getCurrencies() for available strings)
    */
  var currency: String = js.native
  /**
    * Does this method allow for instant buys?
    */
  var instant_buy: Boolean = js.native
  /**
    * Does this method allow for instant sells?
    */
  var instant_sell: Boolean = js.native
  /**
    * If the user has obtained optional wallet:payment-methods:limits permission, an additional field, limits, will be embedded into payment
    * method data. It will contain information about buy, instant buy, sell and deposit limits (there’s no limits for withdrawals at this time).
    * As each one of these can have several limits you should always look for the lowest remaining value when performing the relevant action.
    */
  var limits: js.UndefOr[PaymentMethodLimits] = js.native
  /**
    * Method name
    */
  var name: String = js.native
  /**
    * Is primary buying method?
    */
  var primary_buy: Boolean = js.native
  /**
    * Is primary selling method?
    */
  var primary_sell: Boolean = js.native
  /**
    * Resource type, constant "payment_method"
    */
  @JSName("resource")
  var resource_PaymentMethod: payment_method = js.native
  /**
    * Payment method type
    */
  var `type`: PaymentMethodType = js.native
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
    `type`: PaymentMethodType
  ): PaymentMethod = {
    val __obj = js.Dynamic.literal(allow_buy = allow_buy.asInstanceOf[js.Any], allow_sell = allow_sell.asInstanceOf[js.Any], currency = currency.asInstanceOf[js.Any], instant_buy = instant_buy.asInstanceOf[js.Any], instant_sell = instant_sell.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], primary_buy = primary_buy.asInstanceOf[js.Any], primary_sell = primary_sell.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[PaymentMethod]
  }
  @scala.inline
  implicit class PaymentMethodOps[Self <: PaymentMethod] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAllow_buy(value: Boolean): Self = this.set("allow_buy", value.asInstanceOf[js.Any])
    @scala.inline
    def setAllow_sell(value: Boolean): Self = this.set("allow_sell", value.asInstanceOf[js.Any])
    @scala.inline
    def setCurrency(value: String): Self = this.set("currency", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstant_buy(value: Boolean): Self = this.set("instant_buy", value.asInstanceOf[js.Any])
    @scala.inline
    def setInstant_sell(value: Boolean): Self = this.set("instant_sell", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary_buy(value: Boolean): Self = this.set("primary_buy", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrimary_sell(value: Boolean): Self = this.set("primary_sell", value.asInstanceOf[js.Any])
    @scala.inline
    def setResource(value: payment_method): Self = this.set("resource", value.asInstanceOf[js.Any])
    @scala.inline
    def setType(value: PaymentMethodType): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def setLimits(value: PaymentMethodLimits): Self = this.set("limits", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLimits: Self = this.set("limits", js.undefined)
  }
  
}

