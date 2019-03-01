package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmericanExpress extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: java.lang.String
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {Client} options.client A {@link Client} instance.
    * @param {callback} callback The second argument, `data`, is the {@link AmericanExpress} instance.
    * @returns {void}
    */
  def create(options: braintreeDashWebLib.Anon_Client, callback: callback): scala.Unit
  /**
    * Gets the Express Checkout nonce profile given a nonce from American Express.
    * @public
    * @param {object} options Request options
    * @param {string} options.nonce An existing nonce from American Express (note that this is <em>not</em> a nonce from Braintree).
    * @param {callback} callback The second argument, <code>data</code>, is the returned server data.
    * @returns {void}
    * @example
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
  def getExpressCheckoutProfile(options: braintreeDashWebLib.Anon_Nonce, callback: callback): scala.Unit
  /**
    * Gets the rewards balance associated with a Braintree nonce.
    * @public
    * @param {object} options Request options
    * @param {string} options.nonce An existing Braintree nonce.
    * @param {callback} callback The second argument, <code>data</code>, is the returned server data.
    * @returns {void}
    * @example
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
  def getRewardsBalance(options: braintreeDashWebLib.Anon_Nonce, callback: callback): scala.Unit
}

object AmericanExpress {
  @scala.inline
  def apply(
    VERSION: java.lang.String,
    create: js.Function2[braintreeDashWebLib.Anon_Client, callback, scala.Unit],
    getExpressCheckoutProfile: js.Function2[braintreeDashWebLib.Anon_Nonce, callback, scala.Unit],
    getRewardsBalance: js.Function2[braintreeDashWebLib.Anon_Nonce, callback, scala.Unit]
  ): AmericanExpress = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("VERSION")(VERSION)
    __obj.updateDynamic("create")(create)
    __obj.updateDynamic("getExpressCheckoutProfile")(getExpressCheckoutProfile)
    __obj.updateDynamic("getRewardsBalance")(getRewardsBalance)
    __obj.asInstanceOf[AmericanExpress]
  }
}

