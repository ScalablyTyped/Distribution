package typings.braintreeWeb

import typings.braintreeWeb.anon.AuthorizationString
import typings.braintreeWeb.anon.Data
import typings.braintreeWeb.anon.PostalCode
import typings.braintreeWeb.modulesCoreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesClientMod {
  
  @js.native
  trait Client extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    var authorization: String = js.native
    
    /**
      * @description This function is the entry point for the <code>braintree.client</code> module.
      * It is used for creating {@link Client} instances that service communication to Braintree servers.
      *
      * @example
      * var createClient = require('braintree-web/client').create;
      *
      * createClient({
      *   authorization: CLIENT_AUTHORIZATION
      * }, function (createErr, clientInstance) {
      *   ...
      * });
      */
    def create(options: AuthorizationString): js.Promise[Client] = js.native
    def create(options: AuthorizationString, callback: callback[Any]): Unit = js.native
    
    /**
      * Returns a copy of the configuration values.
      */
    def getConfiguration(): Configuration = js.native
    
    /**
      * Used by other modules to formulate all network requests to the Braintree gateway.
      * It is also capable of being used directly from your own form to tokenize credit card information.
      * However, be sure to satisfy PCI compliance if you use direct card tokenization.
      *     * @example
      *
      * <caption>Direct Credit Card Tokenization</caption>
      * var createClient = require('braintree-web/client').create;
      *
      * createClient({
      *   authorization: CLIENT_AUTHORIZATION
      * }, function (createErr, clientInstance) {
      *   var form = document.getElementById('my-form-id');
      *   var data = {
      *     creditCard: {
      *       number: form['cc-number'].value,
      *       cvv: form['cc-cvv'].value,
      *       expirationDate: form['cc-date'].value,
      *       billingAddress: {
      *         postalCode: form['cc-postal'].value
      *       },
      *       options: {
      *         validate: false
      *       }
      *     }
      *   };
      *
      *   // Warning: For a merchant to be eligible for the easiest level of PCI compliance (SAQ A),
      *   // payment fields cannot be hosted on your checkout page.
      *   // For an alternative to the following, use Hosted Fields.
      *   clientInstance.request({
      *     endpoint: 'payment_methods/credit_cards',
      *     method: 'post',
      *     data: data
      *   }, function (requestErr, response) {
      *  // More detailed example of handling API errors: https://codepen.io/braintree/pen/MbwjdM
      *     if (requestErr) { throw new Error(requestErr); }
      *
      *     console.log('Got nonce:', response.creditCards[0].nonce);
      *   });
      * });
      */
    def request(options: Data, callback: callback[Any]): Unit = js.native
    
    /**
      * Cleanly tear down anything set up by {@link Client#getConfiguration|create}.
      * @param [callback] Called once teardown is complete. No data is returned if teardown completes successfully.
      * @example
      * clientInstance.teardown();
      * @example <caption>With callback</caption>
      * clientInstance.teardown(function () {
      *   // teardown is complete
      * });
      * @returns Returns a promise if no callback is provided.
      */
    def teardown(callback: callback[Unit]): js.Promise[Unit] = js.native
  }
  
  trait ClientAnalyticsMetadata extends StObject {
    
    var merchantAppId: String
    
    var sdkVersion: String
    
    var sessionId: String
  }
  object ClientAnalyticsMetadata {
    
    inline def apply(merchantAppId: String, sdkVersion: String, sessionId: String): ClientAnalyticsMetadata = {
      val __obj = js.Dynamic.literal(merchantAppId = merchantAppId.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAnalyticsMetadata]
    }
    
    extension [Self <: ClientAnalyticsMetadata](x: Self) {
      
      inline def setMerchantAppId(value: String): Self = StObject.set(x, "merchantAppId", value.asInstanceOf[js.Any])
      
      inline def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      inline def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  trait Configuration extends StObject {
    
    var analyticsMetadata: ClientAnalyticsMetadata
    
    var client: Client
    
    var gatewayConfiguration: Any
  }
  object Configuration {
    
    inline def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client, gatewayConfiguration: Any): Configuration = {
      val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], gatewayConfiguration = gatewayConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    extension [Self <: Configuration](x: Self) {
      
      inline def setAnalyticsMetadata(value: ClientAnalyticsMetadata): Self = StObject.set(x, "analyticsMetadata", value.asInstanceOf[js.Any])
      
      inline def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      inline def setGatewayConfiguration(value: Any): Self = StObject.set(x, "gatewayConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  trait CreditCardInfo extends StObject {
    
    var billingAddress: PostalCode
    
    var cvv: String
    
    var expirationDate: String
    
    var number: String
  }
  object CreditCardInfo {
    
    inline def apply(billingAddress: PostalCode, cvv: String, expirationDate: String, number: String): CreditCardInfo = {
      val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCardInfo]
    }
    
    extension [Self <: CreditCardInfo](x: Self) {
      
      inline def setBillingAddress(value: PostalCode): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      inline def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
