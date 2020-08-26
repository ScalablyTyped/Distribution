package typings.braintreeWeb.americanExpressMod

import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.Nonce
import typings.braintreeWeb.coreMod.callback
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmericanExpress extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    */
  var VERSION: String = js.native
  def create(options: Client, callback: callback): Unit = js.native
  /**
    * Gets the Express Checkout nonce profile given a nonce from American Express.     * @example
    * var americanExpress = require('braintree-web/american-express');
    *
    * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
    *   var options = {nonce: existingAmericanExpressNonce};
    *   americanExpressInstance.getExpressCheckoutProfile(options, function (getErr, payload) {
    *     if (getErr) {
    *       // Handle error
    *       return;
    *     }
    *
    *     console.log('Number of cards: ' + payload.amexExpressCheckoutCards.length);
    *   });
    * });
    */
  def getExpressCheckoutProfile(options: Nonce, callback: callback): Unit = js.native
  /**
    * Gets the rewards balance associated with a Braintree nonce.     * @example
    * var americanExpress = require('braintree-web/american-express');
    *
    * americanExpress.create({client: clientInstance}, function (createErr, americanExpressInstance) {
    *   var options = {nonce: existingBraintreeNonce};
    *   americanExpressInstance.getRewardsBalance(options, function (getErr, payload) {
    *     if (getErr || payload.error) {
    *       // Handle error
    *       return;
    *     }
    *
    *     console.log('Rewards amount: ' + payload.rewardsAmount);
    *   });
    * });
    */
  def getRewardsBalance(options: Nonce, callback: callback): Unit = js.native
}

object AmericanExpress {
  @scala.inline
  def apply(
    VERSION: String,
    create: (Client, callback) => Unit,
    getExpressCheckoutProfile: (Nonce, callback) => Unit,
    getRewardsBalance: (Nonce, callback) => Unit
  ): AmericanExpress = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), getExpressCheckoutProfile = js.Any.fromFunction2(getExpressCheckoutProfile), getRewardsBalance = js.Any.fromFunction2(getRewardsBalance))
    __obj.asInstanceOf[AmericanExpress]
  }
  @scala.inline
  implicit class AmericanExpressOps[Self <: AmericanExpress] (val x: Self) extends AnyVal {
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
    def setVERSION(value: String): Self = this.set("VERSION", value.asInstanceOf[js.Any])
    @scala.inline
    def setCreate(value: (Client, callback) => Unit): Self = this.set("create", js.Any.fromFunction2(value))
    @scala.inline
    def setGetExpressCheckoutProfile(value: (Nonce, callback) => Unit): Self = this.set("getExpressCheckoutProfile", js.Any.fromFunction2(value))
    @scala.inline
    def setGetRewardsBalance(value: (Nonce, callback) => Unit): Self = this.set("getRewardsBalance", js.Any.fromFunction2(value))
  }
  
}

