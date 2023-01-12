package typings.braintreeWeb

import typings.braintreeWeb.anon.Client
import typings.braintreeWeb.anon.Nonce
import typings.braintreeWeb.modulesCoreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesAmericanExpressMod {
  
  trait AmericanExpress extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String
    
    def create(options: Client, callback: callback[Any]): Unit
    
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
    def getExpressCheckoutProfile(options: Nonce, callback: callback[Any]): Unit
    
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
    def getRewardsBalance(options: Nonce, callback: callback[Any]): Unit
  }
  object AmericanExpress {
    
    inline def apply(
      VERSION: String,
      create: (Client, callback[Any]) => Unit,
      getExpressCheckoutProfile: (Nonce, callback[Any]) => Unit,
      getRewardsBalance: (Nonce, callback[Any]) => Unit
    ): AmericanExpress = {
      val __obj = js.Dynamic.literal(VERSION = VERSION.asInstanceOf[js.Any], create = js.Any.fromFunction2(create), getExpressCheckoutProfile = js.Any.fromFunction2(getExpressCheckoutProfile), getRewardsBalance = js.Any.fromFunction2(getRewardsBalance))
      __obj.asInstanceOf[AmericanExpress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AmericanExpress] (val x: Self) extends AnyVal {
      
      inline def setCreate(value: (Client, callback[Any]) => Unit): Self = StObject.set(x, "create", js.Any.fromFunction2(value))
      
      inline def setGetExpressCheckoutProfile(value: (Nonce, callback[Any]) => Unit): Self = StObject.set(x, "getExpressCheckoutProfile", js.Any.fromFunction2(value))
      
      inline def setGetRewardsBalance(value: (Nonce, callback[Any]) => Unit): Self = StObject.set(x, "getRewardsBalance", js.Any.fromFunction2(value))
      
      inline def setVERSION(value: String): Self = StObject.set(x, "VERSION", value.asInstanceOf[js.Any])
    }
  }
}
