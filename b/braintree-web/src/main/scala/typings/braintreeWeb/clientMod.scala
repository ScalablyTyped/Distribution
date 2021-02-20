package typings.braintreeWeb

import typings.braintreeWeb.anon.Authorization
import typings.braintreeWeb.anon.Data
import typings.braintreeWeb.anon.PostalCode
import typings.braintreeWeb.coreMod.callback
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object clientMod {
  
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
    def create(options: Authorization): js.Promise[Client] = js.native
    def create(options: Authorization, callback: callback[_]): Unit = js.native
    
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
    def request(options: Data, callback: callback[_]): Unit = js.native
  }
  
  @js.native
  trait ClientAnalyticsMetadata extends StObject {
    
    var merchantAppId: String = js.native
    
    var sdkVersion: String = js.native
    
    var sessionId: String = js.native
  }
  object ClientAnalyticsMetadata {
    
    @scala.inline
    def apply(merchantAppId: String, sdkVersion: String, sessionId: String): ClientAnalyticsMetadata = {
      val __obj = js.Dynamic.literal(merchantAppId = merchantAppId.asInstanceOf[js.Any], sdkVersion = sdkVersion.asInstanceOf[js.Any], sessionId = sessionId.asInstanceOf[js.Any])
      __obj.asInstanceOf[ClientAnalyticsMetadata]
    }
    
    @scala.inline
    implicit class ClientAnalyticsMetadataMutableBuilder[Self <: ClientAnalyticsMetadata] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setMerchantAppId(value: String): Self = StObject.set(x, "merchantAppId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSdkVersion(value: String): Self = StObject.set(x, "sdkVersion", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSessionId(value: String): Self = StObject.set(x, "sessionId", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Configuration extends StObject {
    
    var analyticsMetadata: ClientAnalyticsMetadata = js.native
    
    var client: Client = js.native
    
    var gatewayConfiguration: js.Any = js.native
  }
  object Configuration {
    
    @scala.inline
    def apply(analyticsMetadata: ClientAnalyticsMetadata, client: Client, gatewayConfiguration: js.Any): Configuration = {
      val __obj = js.Dynamic.literal(analyticsMetadata = analyticsMetadata.asInstanceOf[js.Any], client = client.asInstanceOf[js.Any], gatewayConfiguration = gatewayConfiguration.asInstanceOf[js.Any])
      __obj.asInstanceOf[Configuration]
    }
    
    @scala.inline
    implicit class ConfigurationMutableBuilder[Self <: Configuration] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnalyticsMetadata(value: ClientAnalyticsMetadata): Self = StObject.set(x, "analyticsMetadata", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setClient(value: Client): Self = StObject.set(x, "client", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setGatewayConfiguration(value: js.Any): Self = StObject.set(x, "gatewayConfiguration", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CreditCardInfo extends StObject {
    
    var billingAddress: PostalCode = js.native
    
    var cvv: String = js.native
    
    var expirationDate: String = js.native
    
    var number: String = js.native
  }
  object CreditCardInfo {
    
    @scala.inline
    def apply(billingAddress: PostalCode, cvv: String, expirationDate: String, number: String): CreditCardInfo = {
      val __obj = js.Dynamic.literal(billingAddress = billingAddress.asInstanceOf[js.Any], cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[CreditCardInfo]
    }
    
    @scala.inline
    implicit class CreditCardInfoMutableBuilder[Self <: CreditCardInfo] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingAddress(value: PostalCode): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvv(value: String): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDate(value: String): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumber(value: String): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
    }
  }
}
