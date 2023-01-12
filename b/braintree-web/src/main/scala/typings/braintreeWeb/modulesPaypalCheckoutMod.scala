package typings.braintreeWeb

import typings.braintreeWeb.anon.Cspnonce
import typings.braintreeWeb.anon.MerchantAccountId
import typings.braintreeWeb.anon.OptOutOfModalBackdrop
import typings.braintreeWeb.braintreeWebStrings.authorize
import typings.braintreeWeb.braintreeWebStrings.buttons
import typings.braintreeWeb.braintreeWebStrings.buttonsCommamessages
import typings.braintreeWeb.braintreeWebStrings.capture
import typings.braintreeWeb.braintreeWebStrings.messages
import typings.braintreeWeb.braintreeWebStrings.sale
import typings.braintreeWeb.braintreeWebStrings.tokenize
import typings.braintreeWeb.modulesCoreMod.callback
import typings.paypalCheckoutComponents.modulesCallbackDataMod.Address
import typings.paypalCheckoutComponents.modulesCallbackDataMod.AuthorizationResponse
import typings.paypalCheckoutComponents.modulesCallbackDataMod.FlowType
import typings.paypalCheckoutComponents.modulesCallbackDataMod.Intent
import typings.paypalCheckoutComponents.modulesCallbackDataMod.LineItem
import typings.paypalCheckoutComponents.modulesCallbackDataMod.ShippingOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object modulesPaypalCheckoutMod {
  
  @js.native
  trait PayPalCheckout extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    def create(options: MerchantAccountId): Unit = js.native
    def create(options: MerchantAccountId, callback: callback[Any]): Unit = js.native
    
    /**
      * Creates a PayPal payment ID or billing token using the given options. This is meant to be passed to PayPal's checkout.js library.
      * When a {@link callback} is defined, the function returns undefined and invokes the callback with the id to be used with the checkout.js
      * library. Otherwise, it returns a Promise that resolves with the id.
      * `authorize` - Submits the transaction for authorization but not settlement.
      * `order` - Validates the transaction without an authorization (i.e. without holding funds).
      *           Useful for authorizing and capturing funds up to 90 days after the order has been placed. Only available for Checkout flow.
      * `capture` - Payment will be immediately submitted for settlement upon creating a transaction.
      * `sale` can be used as an alias for this value.
      * Supported locales are:
      * `da_DK`,
      * `de_DE`,
      * `en_AU`,
      * `en_GB`,
      * `en_US`,
      * `es_ES`,
      * `fr_CA`,
      * `fr_FR`,
      * `id_ID`,
      * `it_IT`,
      * `ja_JP`,
      * `ko_KR`,
      * `nl_NL`,
      * `no_NO`,
      * `pl_PL`,
      * `pt_BR`,
      * `pt_PT`,
      * `ru_RU`,
      * `sv_SE`,
      * `th_TH`,
      * `zh_CN`,
      * `zh_HK`,
      * and `zh_TW`.
      *     * * `login` - A PayPal account login page is used.
      * * `billing` - A non-PayPal account landing page is used.
      * // this paypal object is created by checkout.js
      * // see https://github.com/paypal/paypal-checkout
      * paypal.Buttons({
      *   createOrder: function () {
      *     // when createPayment resolves, it is automatically passed to checkout.js
      *     return paypalCheckoutInstance.createPayment({
      *       flow: 'checkout',
      *       amount: '10.00',
      *       currency: 'USD',
      *       intent: 'capture' // this value must either be `capture` or match the intent passed into the PayPal SDK intent query parameter
      *     });
      *   },
      *   // Add other options, e.g. onApproved, onCancel, onError
      * }).render('#paypal-button');
      *
      * @example
      * // shippingOptions are passed to createPayment. You can review the result from onAuthorize to determine which shipping option id was selected.
      * ```javascript
      * braintree.client.create({
      *   authorization: 'authorization'
      * }).then(function (clientInstance) {
      *   return braintree.paypalCheckout.create({
      *     client: clientInstance
      *   });
      * }).then(function (paypalCheckoutInstance) {
      *   return paypal.Button.render({
      *     env: 'production'
      *
      *     payment: function () {
      *       return paypalCheckoutInstance.createPayment({
      *         flow: 'checkout',
      *         amount: '10.00',
      *         currency: 'USD',
      *         shippingOptions: [
      *           {
      *             id: 'UUID-9',
      *             type: 'PICKUP',
      *             label: 'Store Location Five',
      *             selected: true,
      *             amount: {
      *               value: '1.00',
      *               currency: 'USD'
      *             }
      *           },
      *           {
      *             id: 'shipping-speed-fast',
      *             type: 'SHIPPING',
      *             label: 'Fast Shipping',
      *             selected: false,
      *             amount: {
      *               value: '1.00',
      *               currency: 'USD'
      *             }
      *           },
      *           {
      *             id: 'shipping-speed-slow',
      *             type: 'SHIPPING',
      *             label: 'Slow Shipping',
      *             selected: false,
      *             amount: {
      *               value: '1.00',
      *               currency: 'USD'
      *             }
      *           }
      *         ]
      *       });
      *     },
      *
      *     onAuthorize: function (data, actions) {
      *       return paypalCheckoutInstance.tokenizePayment(data).then(function (payload) {
      *         // Submit payload.nonce to your server
      *       });
      *     }
      *   }, '#paypal-button');
      * }).catch(function (err) {
      *  console.error('Error!', err);
      * });
      * ```
      *
      */
    def createPayment(options: PayPalCheckoutCreatePaymentOptions): js.Promise[String] = js.native
    def createPayment(options: PayPalCheckoutCreatePaymentOptions, callback: callback[Any]): js.Promise[String] = js.native
    
    /**
      * @description There are two ways to integrate the PayPal Checkout component.
      * See the [PayPal Checkout constructor documentation](PayPalCheckout.html#PayPalCheckout) for more information and examples.
      * @example
      * braintree.client.create({
      *   authorization: 'authorization'
      * }).then(function (clientInstance) {
      *   return braintree.paypalCheckout.create({
      *     client: clientInstance
      *   });
      * }).then(function (paypalCheckoutInstance) {
      *   // set up checkout.js
      * }).catch(function (err) {
      *   console.error('Error!', err);
      * });
      */
    @JSName("create")
    def create_Promise(options: MerchantAccountId): js.Promise[PayPalCheckout] = js.native
    
    /**
      * Resolves with the PayPal client id to be used when loading the PayPal SDK.     * @example
      * paypalCheckoutInstance.getClientId().then(function (id) {
      *  var script = document.createElement('script');
      *
      *  script.src = 'https://www.paypal.com/sdk/js?client-id=' + id;
      *  script.onload = function () {
      *    // setup the PayPal SDK
      *  };
      *
      *  document.body.appendChild(script);
      * });
      */
    def getClientId(): js.Promise[String] = js.native
    def getClientId(callback: js.Function1[/* id */ String, Unit]): Unit = js.native
    
    def loadPayPalSDK(): Unit = js.native
    def loadPayPalSDK(options: Unit, callback: callback[Any]): Unit = js.native
    def loadPayPalSDK(options: PayPalCheckoutLoadPayPalSDKOptions): Unit = js.native
    def loadPayPalSDK(options: PayPalCheckoutLoadPayPalSDKOptions, callback: callback[Any]): Unit = js.native
    /**
      * Resolves when the PayPal SDK has been succesfully loaded onto the page.
      *
      * @link https://braintree.github.io/braintree-web/current/PayPalCheckout.html#loadPayPalSDK
      */
    @JSName("loadPayPalSDK")
    def loadPayPalSDK_Promise(): js.Promise[PayPalCheckout] = js.native
    @JSName("loadPayPalSDK")
    def loadPayPalSDK_Promise(options: PayPalCheckoutLoadPayPalSDKOptions): js.Promise[PayPalCheckout] = js.native
    
    /**
      * Initializes the PayPal checkout flow with a payment method nonce that represents a vaulted PayPal account.
      * When a {@link callback} is defined, the function returns undefined and invokes the callback with the id to be used with the checkout.js library.
      * Otherwise, it returns a Promise that resolves with the id.
      * `flow` cannot be set (will always be `'checkout'`)
      * `amount`, `currency`, and `vaultInitiatedCheckoutPaymentMethodToken` are required instead of optional
      * * Additional configuration is available (listed below)
      * @example
      * paypalCheckoutInstance.startVaultInitiatedCheckout({
      *   vaultInitiatedCheckoutPaymentMethodToken: 'nonce-that-represents-a-vaulted-paypal-account',
      *   amount: '10.00',
      *   currency: 'USD'
      * }).then(function (payload) {
      *   // send payload.nonce to your server
      * }).catch(function (err) {
      *   if (err.code === 'PAYPAL_POPUP_CLOSED') {
      *     // indicates that customer canceled by
      *     // manually closing the PayPal popup
      *   }
      *
      *   // handle other errors
      * });
      *
      */
    def startVaultInitiatedCheckout(options: OptOutOfModalBackdrop): js.Promise[Unit] = js.native
    def startVaultInitiatedCheckout(options: OptOutOfModalBackdrop, callback: callback[Any]): Unit = js.native
    
    def teardown(): js.Promise[Unit] = js.native
    /**
      * Cleanly tear down anything set up by {@link module:braintree-web/paypal-checkout.create|create}.
      * @example
      * paypalCheckoutInstance.teardown();
      * @example <caption>With callback</caption>
      * paypalCheckoutInstance.teardown(function () {
      *   // teardown is complete
      * });
      */
    def teardown(callback: js.Function0[Unit]): Unit = js.native
    
    def tokenizePayment(tokenizeOptions: PayPalCheckoutTokenizationOptions): Unit = js.native
    def tokenizePayment(tokenizeOptions: PayPalCheckoutTokenizationOptions, callback: callback[Any]): Unit = js.native
    /**
      * Tokenizes the authorize data from PayPal's checkout.js library when completing a buyer approval flow.
      * When a {@link callback} is defined, invokes the callback with {@link PayPalCheckout~tokenizePayload|tokenizePayload} and returns undefined.
      * Otherwise, returns a Promise that resolves with a {@link PayPalCheckout~tokenizePayload|tokenizePayload}.
      * @example <caption>Opt out of auto-vaulting behavior</caption>
      * // create the paypalCheckoutInstance with a client token generated with a customer id
      * paypal.Buttons({
      *   createBillingAgreement: function () {
      *     return paypalCheckoutInstance.createPayment({
      *       flow: 'vault'
      *       // your other createPayment options here
      *     });
      *   },
      *   onApproved: function (data) {
      *     data.vault = false;
      *
      *     return paypalCheckoutInstance.tokenizePayment(data);
      *   },
      *   // Add other options, e.g. onCancel, onError
      * }).render('#paypal-button');
      *
      */
    @JSName("tokenizePayment")
    def tokenizePayment_Promise(tokenizeOptions: PayPalCheckoutTokenizationOptions): js.Promise[AuthorizationResponse] = js.native
  }
  
  trait PayPalCheckoutCreatePaymentOptions extends StObject {
    
    var amount: js.UndefOr[String | Double] = js.undefined
    
    var billingAgreementDescription: js.UndefOr[String] = js.undefined
    
    var currency: js.UndefOr[String] = js.undefined
    
    var displayName: js.UndefOr[String] = js.undefined
    
    var enableShippingAddress: js.UndefOr[Boolean] = js.undefined
    
    var flow: FlowType
    
    var intent: js.UndefOr[Intent] = js.undefined
    
    var landingPageType: js.UndefOr[String] = js.undefined
    
    var lineItems: js.UndefOr[js.Array[LineItem]] = js.undefined
    
    var locale: js.UndefOr[String] = js.undefined
    
    var offerCredit: js.UndefOr[Boolean] = js.undefined
    
    var requestBillingAgreement: js.UndefOr[Boolean] = js.undefined
    
    var shippingAddressEditable: js.UndefOr[Boolean] = js.undefined
    
    var shippingAddressOverride: js.UndefOr[Address] = js.undefined
    
    var shippingOptions: js.UndefOr[js.Array[ShippingOption]] = js.undefined
    
    var vaultInitiatedCheckoutPaymentMethodToken: js.UndefOr[String] = js.undefined
  }
  object PayPalCheckoutCreatePaymentOptions {
    
    inline def apply(flow: FlowType): PayPalCheckoutCreatePaymentOptions = {
      val __obj = js.Dynamic.literal(flow = flow.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalCheckoutCreatePaymentOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalCheckoutCreatePaymentOptions] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: String | Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmountUndefined: Self = StObject.set(x, "amount", js.undefined)
      
      inline def setBillingAgreementDescription(value: String): Self = StObject.set(x, "billingAgreementDescription", value.asInstanceOf[js.Any])
      
      inline def setBillingAgreementDescriptionUndefined: Self = StObject.set(x, "billingAgreementDescription", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDisplayName(value: String): Self = StObject.set(x, "displayName", value.asInstanceOf[js.Any])
      
      inline def setDisplayNameUndefined: Self = StObject.set(x, "displayName", js.undefined)
      
      inline def setEnableShippingAddress(value: Boolean): Self = StObject.set(x, "enableShippingAddress", value.asInstanceOf[js.Any])
      
      inline def setEnableShippingAddressUndefined: Self = StObject.set(x, "enableShippingAddress", js.undefined)
      
      inline def setFlow(value: FlowType): Self = StObject.set(x, "flow", value.asInstanceOf[js.Any])
      
      inline def setIntent(value: Intent): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLandingPageType(value: String): Self = StObject.set(x, "landingPageType", value.asInstanceOf[js.Any])
      
      inline def setLandingPageTypeUndefined: Self = StObject.set(x, "landingPageType", js.undefined)
      
      inline def setLineItems(value: js.Array[LineItem]): Self = StObject.set(x, "lineItems", value.asInstanceOf[js.Any])
      
      inline def setLineItemsUndefined: Self = StObject.set(x, "lineItems", js.undefined)
      
      inline def setLineItemsVarargs(value: LineItem*): Self = StObject.set(x, "lineItems", js.Array(value*))
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def setOfferCredit(value: Boolean): Self = StObject.set(x, "offerCredit", value.asInstanceOf[js.Any])
      
      inline def setOfferCreditUndefined: Self = StObject.set(x, "offerCredit", js.undefined)
      
      inline def setRequestBillingAgreement(value: Boolean): Self = StObject.set(x, "requestBillingAgreement", value.asInstanceOf[js.Any])
      
      inline def setRequestBillingAgreementUndefined: Self = StObject.set(x, "requestBillingAgreement", js.undefined)
      
      inline def setShippingAddressEditable(value: Boolean): Self = StObject.set(x, "shippingAddressEditable", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressEditableUndefined: Self = StObject.set(x, "shippingAddressEditable", js.undefined)
      
      inline def setShippingAddressOverride(value: Address): Self = StObject.set(x, "shippingAddressOverride", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressOverrideUndefined: Self = StObject.set(x, "shippingAddressOverride", js.undefined)
      
      inline def setShippingOptions(value: js.Array[ShippingOption]): Self = StObject.set(x, "shippingOptions", value.asInstanceOf[js.Any])
      
      inline def setShippingOptionsUndefined: Self = StObject.set(x, "shippingOptions", js.undefined)
      
      inline def setShippingOptionsVarargs(value: ShippingOption*): Self = StObject.set(x, "shippingOptions", js.Array(value*))
      
      inline def setVaultInitiatedCheckoutPaymentMethodToken(value: String): Self = StObject.set(x, "vaultInitiatedCheckoutPaymentMethodToken", value.asInstanceOf[js.Any])
      
      inline def setVaultInitiatedCheckoutPaymentMethodTokenUndefined: Self = StObject.set(x, "vaultInitiatedCheckoutPaymentMethodToken", js.undefined)
    }
  }
  
  trait PayPalCheckoutLoadPayPalSDKOptions extends StObject {
    
    /**
      * The buyer country. Available in Sandbox for testing.
      */
    var `buyer-country`: js.UndefOr[String] = js.undefined
    
    /**
      * By default, this will be the client id associated with the authorization used to create the
      * Braintree component. When used in conjunction with passing authorization when creating the
      * PayPal Checkout component, you can speed up the loading of the PayPal SDK.
      */
    var `client-id`: js.UndefOr[String] = js.undefined
    
    /**
      * Set to true if the transaction is completed on the PayPal review page or false if the amount
      * captured changes after the buyer returns to your site. Not applicable for subscriptions.
      * Important: If you're integrating with a PayPal API, make sure the commit value you pass
      * in the API call matches the value you pass in the JavaScript call.
      */
    var commit: js.UndefOr[Boolean] = js.undefined
    
    /**
      * By default, the Braintree SDK will only load the PayPal smart buttons component. If you would
      * like to load just the messages component, pass messages. If you would like to load both, pass
      * buttons,messages
      *
      * @default 'buttons'
      */
    var components: js.UndefOr[buttons | messages | buttonsCommamessages] = js.undefined
    
    /**
      * If a currency is passed in createPayment, it must match the currency passed here.
      *
      * @default 'USD'
      */
    var currency: js.UndefOr[String] = js.undefined
    
    /**
      * The data attributes to apply to the script. Any data attribute can be passed. A subset of the
      * parameters are listed below. For a full list of data attributes, see the PayPal docs.
      */
    var dataAttributes: js.UndefOr[Cspnonce] = js.undefined
    
    /**
      * Enable debug mode for ease of debugging. Do not enable for production traffic.
      */
    var debug: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Funding sources to disallow from showing in the checkout buttons.
      * Do not use this query parameter to disable advanced credit and debit card payments.
      * e.g. card, credit, bancontact
      * The full list is available in the PayPal SDK docs.
      */
    var `disable-funding`: js.UndefOr[String] = js.undefined
    
    /**
      * Funding sources to allow in the checkout buttons.
      * e.g. venmo, paylater
      * The full list is available in the PayPal SDK docs.
      */
    var `enable-funding`: js.UndefOr[String] = js.undefined
    
    /**
      * The date of integration. Used to ensure backwards compatibility.
      * Format: YYYY-MM-DD
      */
    var `integration-date`: js.UndefOr[String] = js.undefined
    
    /**
      * By default, the PayPal SDK defaults to an intent of capture. Since the default intent when
      * calling createPayment is authorize, the PayPal SDK will be loaded with intent=authorize. If you
      * wish to use a different intent when calling createPayment, make sure it matches here. If sale
      * is used, it will be converted to capture for the PayPal SDK. If the vault: true param is used,
      * no default intent will be passed.
      *
      * @default 'authorize'
      */
    var intent: js.UndefOr[authorize | capture | sale | tokenize] = js.undefined
    
    /**
      * The locale used to localize any components.
      * PayPal recommends not setting this parameter, as the buyer's locale is automatically set by PayPal.
      * e.g. en_US, fr_FR, de_DE
      */
    var locale: js.UndefOr[String] = js.undefined
    
    /**
      * The merchant for whom you are facilitating a transaction.
      */
    var `merchant-id`: js.UndefOr[String] = js.undefined
    
    /**
      * Must be true when using flow: vault in createPayment.
      */
    var vault: js.UndefOr[Boolean] = js.undefined
  }
  object PayPalCheckoutLoadPayPalSDKOptions {
    
    inline def apply(): PayPalCheckoutLoadPayPalSDKOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PayPalCheckoutLoadPayPalSDKOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalCheckoutLoadPayPalSDKOptions] (val x: Self) extends AnyVal {
      
      inline def `setBuyer-country`(value: String): Self = StObject.set(x, "buyer-country", value.asInstanceOf[js.Any])
      
      inline def `setBuyer-countryUndefined`: Self = StObject.set(x, "buyer-country", js.undefined)
      
      inline def `setClient-id`(value: String): Self = StObject.set(x, "client-id", value.asInstanceOf[js.Any])
      
      inline def `setClient-idUndefined`: Self = StObject.set(x, "client-id", js.undefined)
      
      inline def setCommit(value: Boolean): Self = StObject.set(x, "commit", value.asInstanceOf[js.Any])
      
      inline def setCommitUndefined: Self = StObject.set(x, "commit", js.undefined)
      
      inline def setComponents(value: buttons | messages | buttonsCommamessages): Self = StObject.set(x, "components", value.asInstanceOf[js.Any])
      
      inline def setComponentsUndefined: Self = StObject.set(x, "components", js.undefined)
      
      inline def setCurrency(value: String): Self = StObject.set(x, "currency", value.asInstanceOf[js.Any])
      
      inline def setCurrencyUndefined: Self = StObject.set(x, "currency", js.undefined)
      
      inline def setDataAttributes(value: Cspnonce): Self = StObject.set(x, "dataAttributes", value.asInstanceOf[js.Any])
      
      inline def setDataAttributesUndefined: Self = StObject.set(x, "dataAttributes", js.undefined)
      
      inline def setDebug(value: Boolean): Self = StObject.set(x, "debug", value.asInstanceOf[js.Any])
      
      inline def setDebugUndefined: Self = StObject.set(x, "debug", js.undefined)
      
      inline def `setDisable-funding`(value: String): Self = StObject.set(x, "disable-funding", value.asInstanceOf[js.Any])
      
      inline def `setDisable-fundingUndefined`: Self = StObject.set(x, "disable-funding", js.undefined)
      
      inline def `setEnable-funding`(value: String): Self = StObject.set(x, "enable-funding", value.asInstanceOf[js.Any])
      
      inline def `setEnable-fundingUndefined`: Self = StObject.set(x, "enable-funding", js.undefined)
      
      inline def `setIntegration-date`(value: String): Self = StObject.set(x, "integration-date", value.asInstanceOf[js.Any])
      
      inline def `setIntegration-dateUndefined`: Self = StObject.set(x, "integration-date", js.undefined)
      
      inline def setIntent(value: authorize | capture | sale | tokenize): Self = StObject.set(x, "intent", value.asInstanceOf[js.Any])
      
      inline def setIntentUndefined: Self = StObject.set(x, "intent", js.undefined)
      
      inline def setLocale(value: String): Self = StObject.set(x, "locale", value.asInstanceOf[js.Any])
      
      inline def setLocaleUndefined: Self = StObject.set(x, "locale", js.undefined)
      
      inline def `setMerchant-id`(value: String): Self = StObject.set(x, "merchant-id", value.asInstanceOf[js.Any])
      
      inline def `setMerchant-idUndefined`: Self = StObject.set(x, "merchant-id", js.undefined)
      
      inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
  
  trait PayPalCheckoutTokenizationOptions extends StObject {
    
    var billingToken: js.UndefOr[String] = js.undefined
    
    var payerId: String
    
    var paymentId: js.UndefOr[String] = js.undefined
    
    var vault: js.UndefOr[Boolean] = js.undefined
  }
  object PayPalCheckoutTokenizationOptions {
    
    inline def apply(payerId: String): PayPalCheckoutTokenizationOptions = {
      val __obj = js.Dynamic.literal(payerId = payerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[PayPalCheckoutTokenizationOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PayPalCheckoutTokenizationOptions] (val x: Self) extends AnyVal {
      
      inline def setBillingToken(value: String): Self = StObject.set(x, "billingToken", value.asInstanceOf[js.Any])
      
      inline def setBillingTokenUndefined: Self = StObject.set(x, "billingToken", js.undefined)
      
      inline def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
      
      inline def setPaymentId(value: String): Self = StObject.set(x, "paymentId", value.asInstanceOf[js.Any])
      
      inline def setPaymentIdUndefined: Self = StObject.set(x, "paymentId", js.undefined)
      
      inline def setVault(value: Boolean): Self = StObject.set(x, "vault", value.asInstanceOf[js.Any])
      
      inline def setVaultUndefined: Self = StObject.set(x, "vault", js.undefined)
    }
  }
}
