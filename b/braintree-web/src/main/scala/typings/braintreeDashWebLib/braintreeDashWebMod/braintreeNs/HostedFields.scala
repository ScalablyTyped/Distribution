package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait HostedFields extends js.Object {
  /**
    * @description The current version of the SDK, i.e. `3.0.2`.
    * @type {string}
    */
  var VERSION: java.lang.String = js.native
  /**
    * An object that represents CSS that will be applied in each hosted field. This object looks similar to CSS. Typically, these styles involve fonts (such as `font-family` or `color`).
    *
    * These are the CSS properties that Hosted Fields supports. Any other CSS should be specified on your page and outside of any Braintree configuration. Trying to set unsupported properties will fail and put a warning in the console.
    *
    * Supported CSS properties are:
    * `color`
    * `font-family`
    * `font-size-adjust`
    * `font-size`
    * `font-stretch`
    * `font-style`
    * `font-variant-alternates`
    * `font-variant-caps`
    * `font-variant-east-asian`
    * `font-variant-ligatures`
    * `font-variant-numeric`
    * `font-variant`
    * `font-weight`
    * `font`
    * `letter-spacing`
    * `line-height`
    * `opacity`
    * `outline`
    * `text-shadow`
    * `transition`
    * `-moz-osx-font-smoothing`
    * `-moz-tap-highlight-color`
    * `-moz-transition`
    * `-webkit-font-smoothing`
    * `-webkit-tap-highlight-color`
    * `-webkit-transition`
    * @typedef {object} styleOptions
    */
  var styleOptions: js.Any = js.native
  /**
    * Add a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.
    * @public
    * @param {string} field The field you wish to add a class to. Must be a valid {@link module:braintree-web/hosted-fields~fieldOptions fieldOption}.
    * @param {string} classname The class to be added.
    * @param {callback} [callback] Callback executed on completion, containing an error if one occurred. No data is returned if the class is added successfully.
    *
    * @example
    * hostedFieldsInstance.addClass('number', 'custom-class', function (addClassErr) {
    *   if (addClassErr) {
    *     console.error(addClassErr);
    *   }
    * });
    * @returns {void}
    */
  def addClass(field: java.lang.String, classname: java.lang.String): scala.Unit = js.native
  def addClass(field: java.lang.String, classname: java.lang.String, callback: callback): scala.Unit = js.native
  /**
    * Clear the value of a {@link module:braintree-web/hosted-fields~field field}.
    * @public
    * @param {string} field The field whose placeholder you wish to clear. Must be a valid {@link module:braintree-web/hosted-fields~fieldOptions fieldOption}.
    * @param {callback} [callback] Callback executed on completion, containing an error if one occurred. No data is returned if the field cleared successfully.
    * @returns {void}
    * @example
    * hostedFieldsInstance.clear('number', function (clearErr) {
    *   if (clearErr) {
    *     console.error(clearErr);
    *   }
    * });
    *
    * @example <caption>Clear several fields</caption>
    * hostedFieldsInstance.clear('number');
    * hostedFieldsInstance.clear('cvv');
    * hostedFieldsInstance.clear('expirationDate');
    */
  def clear(field: java.lang.String): scala.Unit = js.native
  def clear(field: java.lang.String, callback: callback): scala.Unit = js.native
  /**
    * @static
    * @function create
    * @param {object} options Creation options:
    * @param {Client} options.client A {@link Client} instance.
    * @param {fieldOptions} options.fields A {@link module:braintree-web/hosted-fields~fieldOptions set of options for each field}.
    * @param {styleOptions} options.styles {@link module:braintree-web/hosted-fields~styleOptions Styles} applied to each field.
    * @param {callback} callback The second argument, `data`, is the {@link HostedFields} instance.
    * @returns {void}
    * @example
    * braintree.hostedFields.create({
    *   client: clientInstance,
    *   styles: {
    *     'input': {
    *       'font-size': '16pt',
    *       'color': '#3A3A3A'
    *     },
    *     '.number': {
    *       'font-family': 'monospace'
    *     },
    *     '.valid': {
    *       'color': 'green'
    *     }
    *   },
    *   fields: {
    *     number: {
    *       selector: '#card-number'
    *     },
    *     cvv: {
    *       selector: '#cvv'
    *     },
    *     expirationDate: {
    *       selector: '#expiration-date'
    *     }
    *   }
    * }, callback);
    */
  def create(options: braintreeDashWebLib.Anon_ClientFields): js.Promise[HostedFields] = js.native
  def create(options: braintreeDashWebLib.Anon_ClientFields, callback: callback): scala.Unit = js.native
  /**
    * Returns an {@link HostedFields~stateObject|object} that includes the state of all fields and possible card types.
    * @public
    * @returns {object} {@link HostedFields~stateObject|stateObject}
    * @example <caption>Check if all fields are valid</caption>
    * var state = hostedFields.getState();
    *
    * var formValid = Object.keys(state.fields).every(function (key) {
    *   return state.fields[key].isValid;
    * });
    */
  def getState(): js.Any = js.native
  /**
    * @name HostedFields#on
    * @function
    * @param {string} event The name of the event to which you are subscribing.
    * @param {function} handler A callback to handle the event.
    * @description Subscribes a handler function to a named event. `event` should be {@link HostedFields#event:blur|blur}, {@link HostedFields#event:focus|focus}, {@link HostedFields#event:empty|empty}, {@link HostedFields#event:notEmpty|notEmpty}, {@link HostedFields#event:cardTypeChange|cardTypeChange}, or {@link HostedFields#event:validityChange|validityChange}. Events will emit a {@link HostedFields~stateObject|stateObject}.
    * @example
    * <caption>Listening to a Hosted Field event, in this case 'focus'</caption>
    * hostedFields.create({ ... }, function (createErr, hostedFieldsInstance) {
    *   hostedFieldsInstance.on('focus', function (event) {
    *     console.log(event.emittedBy, 'has been focused');
    *   });
    * });
    * @returns {void}
    */
  def on(event: java.lang.String, handler: js.Function1[/* event */ HostedFieldsStateObject, scala.Unit]): scala.Unit = js.native
  /**
    * Removes a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.
    * @public
    * @param {string} field The field you wish to remove a class from. Must be a valid {@link module:braintree-web/hosted-fields~fieldOptions fieldOption}.
    * @param {string} classname The class to be removed.
    * @param {callback} [callback] Callback executed on completion, containing an error if one occurred. No data is returned if the class is removed successfully.
    *
    * @example
    * hostedFieldsInstance.addClass('number', 'custom-class', function (addClassErr) {
    *   if (addClassErr) {
    *     console.error(addClassErr);
    *     return;
    *   }
    *
    *   // some time later...
    *   hostedFieldsInstance.removeClass('number', 'custom-class');
    * });
    * @returns {void}
    */
  def removeClass(field: java.lang.String, classname: java.lang.String): scala.Unit = js.native
  def removeClass(field: java.lang.String, classname: java.lang.String, callback: callback): scala.Unit = js.native
  /**
    * Sets the placeholder of a {@link module:braintree-web/hosted-fields~field field}.
    * @public
    * @param {string} field The field whose placeholder you wish to change. Must be a valid {@link module:braintree-web/hosted-fields~fieldOptions fieldOption}.
    * @param {string} placeholder Will be used as the `placeholder` attribute of the input.
    * @param {callback} [callback] Callback executed on completion, containing an error if one occurred. No data is returned if the placeholder updated successfully.
    *
    * @example
    * hostedFieldsInstance.setPlaceholder('number', '4111 1111 1111 1111', function (placeholderErr) {
    *   if (placeholderErr) {
    *     console.error(placeholderErr);
    *   }
    * });
    *
    * @example <caption>Update CVV field on card type change</caption>
    * hostedFieldsInstance.on('cardTypeChange', function (event) {
    *   // Update the placeholder value if there is only one possible card type
    *   if (event.cards.length === 1) {
    *     hostedFields.setPlaceholder('cvv', event.cards[0].code.name, function (placeholderErr) {
    *       if (placeholderErr) {
    *         // Handle errors, such as invalid field name
    *         console.error(placeholderErr);
    *       }
    *     });
    *   }
    * });
    * @returns {void}
    */
  def setPlaceholder(field: java.lang.String, placeholder: java.lang.String): scala.Unit = js.native
  def setPlaceholder(field: java.lang.String, placeholder: java.lang.String, callback: callback): scala.Unit = js.native
  /**
    * Cleanly tear down anything set up by {@link module:braintree-web/hosted-fields.create|create}
    * @public
    * @param {callback} [callback] Callback executed on completion, containing an error if one occurred. No data is returned if teardown completes successfully.
    * @example
    * hostedFieldsInstance.teardown(function (teardownErr) {
    *   if (teardownErr) {
    *     console.error('Could not tear down Hosted Fields!');
    *   } else {
    *     console.info('Hosted Fields has been torn down!');
    *   }
    * });
    * @returns {void}
    */
  def teardown(): scala.Unit = js.native
  def teardown(callback: callback): scala.Unit = js.native
  /**
    * Tokenizes fields and returns a nonce payload.
    * @public
    * @param {object} [options] All tokenization options for the Hosted Fields component.
    * @param {boolean} [options.vault=false] When true, will vault the tokenized card. Cards will only be vaulted when using a client created with a client token that includes a customer ID.
    * @param {callback} callback The second argument, <code>data</code>, is a {@link HostedFields~tokenizePayload|tokenizePayload}
    * @example <caption>Tokenize a card</caption>
    * hostedFieldsInstance.tokenize(function (tokenizeErr, payload) {
    *   if (tokenizeErr) {
    *     switch (tokenizeErr.code) {
    *       case 'HOSTED_FIELDS_FIELDS_EMPTY':
    *         console.error('All fields are empty! Please fill out the form.');
    *         break;
    *       case 'HOSTED_FIELDS_FIELDS_INVALID':
    *         console.error('Some fields are invalid:', tokenizeErr.details.invalidFieldKeys);
    *         break;
    *       case 'HOSTED_FIELDS_FAILED_TOKENIZATION':
    *         console.error('Tokenization failed server side. Is the card valid?');
    *         break;
    *       case 'HOSTED_FIELDS_TOKENIZATION_NETWORK_ERROR':
    *         console.error('Network error occurred when tokenizing.');
    *         break;
    *       default:
    *         console.error('Something bad happened!', tokenizeErr);
    *     }
    *   } else {
    *     console.log('Got nonce:', payload.nonce);
    *   }
    * });
    * @example <caption>Tokenize and vault a card</caption>
    * hostedFieldsInstance.tokenize({
    *   vault: true
    * }, function (tokenizeErr, payload) {
    *   if (tokenizeErr) {
    *     console.error(tokenizeErr);
    *   } else {
    *     console.log('Got nonce:', payload.nonce);
    *   }
    * });
    * @returns {void}
    */
  def tokenize(): js.Promise[HostedFieldsTokenizePayload] = js.native
  def tokenize(callback: callback): scala.Unit = js.native
  def tokenize(options: braintreeDashWebLib.Anon_BillingAddress): js.Promise[HostedFieldsTokenizePayload] = js.native
  def tokenize(options: braintreeDashWebLib.Anon_BillingAddress, callback: callback): scala.Unit = js.native
}

