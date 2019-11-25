package typings.braintreeDashWeb.braintreeDashWebMod

import org.scalablytyped.runtime.TopLevel
import typings.braintreeDashWeb.Anon_Client
import typings.braintreeDashWeb.Anon_Nonce
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmericanExpress extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: String
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {Client} options.client A {@link Client} instance.
    * @param {callback} callback The second argument, `data`, is the {@link AmericanExpress} instance.
    * @returns {void}
    */
  def create(options: Anon_Client, callback: callback): Unit
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
  def getExpressCheckoutProfile(options: Anon_Nonce, callback: callback): Unit
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
  def getRewardsBalance(options: Anon_Nonce, callback: callback): Unit
}

object AmericanExpress {
  @scala.inline
  def apply(
    VERSION: String,
    create: (Anon_Client, callback) => Unit,
    getExpressCheckoutProfile: (Anon_Nonce, callback) => Unit,
    getRewardsBalance: (Anon_Nonce, callback) => Unit
  ): AmericanExpress = {
    val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), getExpressCheckoutProfile = js.Any.fromFunction2(getExpressCheckoutProfile), getRewardsBalance = js.Any.fromFunction2(getRewardsBalance))
  
    __obj.asInstanceOf[AmericanExpress]
  }
}

@JSImport("braintree-web", "americanExpress")
@js.native
object americanExpress extends TopLevel[AmericanExpress]

