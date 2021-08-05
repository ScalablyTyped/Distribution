package typings.braintreeWeb

import typings.braintreeWeb.anon.BillingAddress
import typings.braintreeWeb.anon.Fields
import typings.braintreeWeb.anon.Options
import typings.braintreeWeb.coreMod.callback
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object hostedFieldsMod {
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.blur
    - typings.braintreeWeb.braintreeWebStrings.focus
    - typings.braintreeWeb.braintreeWebStrings.empty
    - typings.braintreeWeb.braintreeWebStrings.notEmpty
    - typings.braintreeWeb.braintreeWebStrings.cardTypeChange
    - typings.braintreeWeb.braintreeWebStrings.validityChange
  */
  trait HostedFieldEventType extends StObject
  object HostedFieldEventType {
    
    inline def blur: typings.braintreeWeb.braintreeWebStrings.blur = "blur".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.blur]
    
    inline def cardTypeChange: typings.braintreeWeb.braintreeWebStrings.cardTypeChange = "cardTypeChange".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.cardTypeChange]
    
    inline def empty: typings.braintreeWeb.braintreeWebStrings.empty = "empty".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.empty]
    
    inline def focus: typings.braintreeWeb.braintreeWebStrings.focus = "focus".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.focus]
    
    inline def notEmpty: typings.braintreeWeb.braintreeWebStrings.notEmpty = "notEmpty".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.notEmpty]
    
    inline def validityChange: typings.braintreeWeb.braintreeWebStrings.validityChange = "validityChange".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.validityChange]
  }
  
  trait HostedFieldFieldOptions extends StObject {
    
    var cvv: HostedFieldsField
    
    var expirationDate: js.UndefOr[HostedFieldsField] = js.undefined
    
    var expirationMonth: js.UndefOr[HostedFieldsField] = js.undefined
    
    var expirationYear: js.UndefOr[HostedFieldsField] = js.undefined
    
    var number: HostedFieldsField
    
    var postalCode: js.UndefOr[HostedFieldsField] = js.undefined
  }
  object HostedFieldFieldOptions {
    
    inline def apply(cvv: HostedFieldsField, number: HostedFieldsField): HostedFieldFieldOptions = {
      val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldFieldOptions]
    }
    
    extension [Self <: HostedFieldFieldOptions](x: Self) {
      
      inline def setCvv(value: HostedFieldsField): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: HostedFieldsField): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setExpirationMonth(value: HostedFieldsField): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
      
      inline def setExpirationMonthUndefined: Self = StObject.set(x, "expirationMonth", js.undefined)
      
      inline def setExpirationYear(value: HostedFieldsField): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
      
      inline def setExpirationYearUndefined: Self = StObject.set(x, "expirationYear", js.undefined)
      
      inline def setNumber(value: HostedFieldsField): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: HostedFieldsField): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    }
  }
  
  @js.native
  trait HostedFields extends StObject {
    
    /**
      * @description The current version of the SDK, i.e. `3.0.2`.
      */
    var VERSION: String = js.native
    
    /**
      * Add a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.     *
      * @example
      * hostedFieldsInstance.addClass('number', 'custom-class', function (addClassErr) {
      *   if (addClassErr) {
      *     console.error(addClassErr);
      *   }
      * });
      */
    def addClass(field: String, classname: String): Unit = js.native
    def addClass(field: String, classname: String, callback: callback[js.Any]): Unit = js.native
    
    /**
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
    def clear(field: String): Unit = js.native
    def clear(field: String, callback: callback[js.Any]): Unit = js.native
    
    /**
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
    def create(options: Fields): js.Promise[HostedFields] = js.native
    def create(options: Fields, callback: callback[js.Any]): Unit = js.native
    
    /**
      * Returns an {@link HostedFields~stateObject|object} that includes the state of all fields and possible card types.
      * @example <caption>Check if all fields are valid</caption>
      * var state = hostedFields.getState();
      *
      * var formValid = Object.keys(state.fields).every(function (key) {
      *   return state.fields[key].isValid;
      * });
      */
    def getState(): js.Any = js.native
    
    def on(event: HostedFieldEventType, handler: js.Function1[/* event */ HostedFieldsStateObject, Unit]): Unit = js.native
    
    /**
      * Removes a class to a {@link module:braintree-web/hosted-fields~field field}. Useful for updating field styles when events occur elsewhere in your checkout.     *
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
      */
    def removeClass(field: String, classname: String): Unit = js.native
    def removeClass(field: String, classname: String, callback: callback[js.Any]): Unit = js.native
    
    /**
      * Sets the placeholder of a {@link module:braintree-web/hosted-fields~field field}.     *
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
      */
    def setPlaceholder(field: String, placeholder: String): Unit = js.native
    def setPlaceholder(field: String, placeholder: String, callback: callback[js.Any]): Unit = js.native
    
    /**
      * An object that represents CSS that will be applied in each hosted field. This object looks similar to CSS.
      * Typically, these styles involve fonts (such as `font-family` or `color`).
      *
      * These are the CSS properties that Hosted Fields supports. Any other CSS should be specified on your
      * page and outside of any Braintree configuration. Trying to set unsupported properties will fail and put
      * a warning in the console.
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
      */
    var styleOptions: js.Any = js.native
    
    def teardown(): Unit = js.native
    def teardown(callback: callback[js.Any]): Unit = js.native
    @JSName("teardown")
    def teardown_Promise(): js.Promise[Unit] = js.native
    
    /**
      * Tokenizes fields and returns a nonce payload.     * @example <caption>Tokenize a card</caption>
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
      */
    def tokenize(): js.Promise[HostedFieldsTokenizePayload] = js.native
    def tokenize(callback: callback[js.Any]): Unit = js.native
    def tokenize(options: BillingAddress): js.Promise[HostedFieldsTokenizePayload] = js.native
    def tokenize(options: BillingAddress, callback: callback[js.Any]): Unit = js.native
  }
  
  trait HostedFieldsAccountDetails extends StObject {
    
    var bin: String
    
    var cardType: String
    
    var expirationMonth: String
    
    var expirationYear: String
    
    var lastFour: String
    
    var lastTwo: String
  }
  object HostedFieldsAccountDetails {
    
    inline def apply(
      bin: String,
      cardType: String,
      expirationMonth: String,
      expirationYear: String,
      lastFour: String,
      lastTwo: String
    ): HostedFieldsAccountDetails = {
      val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsAccountDetails]
    }
    
    extension [Self <: HostedFieldsAccountDetails](x: Self) {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
      
      inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
      
      inline def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
      
      inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsCardCode extends StObject {
    
    var name: String
    
    var size: Double
  }
  object HostedFieldsCardCode {
    
    inline def apply(name: String, size: Double): HostedFieldsCardCode = {
      val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsCardCode]
    }
    
    extension [Self <: HostedFieldsCardCode](x: Self) {
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsField extends StObject {
    
    var formatInput: js.UndefOr[Boolean] = js.undefined
    
    var maskInput: js.UndefOr[Boolean | HostedFieldsFieldMaskInput] = js.undefined
    
    var maxCardLength: js.UndefOr[Double] = js.undefined
    
    var maxlength: js.UndefOr[Double] = js.undefined
    
    var minlength: js.UndefOr[Double] = js.undefined
    
    var placeholder: js.UndefOr[String] = js.undefined
    
    var prefill: js.UndefOr[String] = js.undefined
    
    var rejectUnsupportedCards: js.UndefOr[Boolean] = js.undefined
    
    var select: js.UndefOr[Boolean | Options] = js.undefined
    
    var selector: String
    
    var `type`: js.UndefOr[String] = js.undefined
  }
  object HostedFieldsField {
    
    inline def apply(selector: String): HostedFieldsField = {
      val __obj = js.Dynamic.literal(selector = selector.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsField]
    }
    
    extension [Self <: HostedFieldsField](x: Self) {
      
      inline def setFormatInput(value: Boolean): Self = StObject.set(x, "formatInput", value.asInstanceOf[js.Any])
      
      inline def setFormatInputUndefined: Self = StObject.set(x, "formatInput", js.undefined)
      
      inline def setMaskInput(value: Boolean | HostedFieldsFieldMaskInput): Self = StObject.set(x, "maskInput", value.asInstanceOf[js.Any])
      
      inline def setMaskInputUndefined: Self = StObject.set(x, "maskInput", js.undefined)
      
      inline def setMaxCardLength(value: Double): Self = StObject.set(x, "maxCardLength", value.asInstanceOf[js.Any])
      
      inline def setMaxCardLengthUndefined: Self = StObject.set(x, "maxCardLength", js.undefined)
      
      inline def setMaxlength(value: Double): Self = StObject.set(x, "maxlength", value.asInstanceOf[js.Any])
      
      inline def setMaxlengthUndefined: Self = StObject.set(x, "maxlength", js.undefined)
      
      inline def setMinlength(value: Double): Self = StObject.set(x, "minlength", value.asInstanceOf[js.Any])
      
      inline def setMinlengthUndefined: Self = StObject.set(x, "minlength", js.undefined)
      
      inline def setPlaceholder(value: String): Self = StObject.set(x, "placeholder", value.asInstanceOf[js.Any])
      
      inline def setPlaceholderUndefined: Self = StObject.set(x, "placeholder", js.undefined)
      
      inline def setPrefill(value: String): Self = StObject.set(x, "prefill", value.asInstanceOf[js.Any])
      
      inline def setPrefillUndefined: Self = StObject.set(x, "prefill", js.undefined)
      
      inline def setRejectUnsupportedCards(value: Boolean): Self = StObject.set(x, "rejectUnsupportedCards", value.asInstanceOf[js.Any])
      
      inline def setRejectUnsupportedCardsUndefined: Self = StObject.set(x, "rejectUnsupportedCards", js.undefined)
      
      inline def setSelect(value: Boolean | Options): Self = StObject.set(x, "select", value.asInstanceOf[js.Any])
      
      inline def setSelectUndefined: Self = StObject.set(x, "select", js.undefined)
      
      inline def setSelector(value: String): Self = StObject.set(x, "selector", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
    }
  }
  
  /* Inlined {[ key in braintree-web.braintree-web/modules/hosted-fields.HostedFieldsHostedFieldsFieldName ]: braintree-web.braintree-web/modules/hosted-fields.HostedFieldsHostedFieldsFieldData} */
  trait HostedFieldsFieldDataFields extends StObject {
    
    var cvv: HostedFieldsHostedFieldsFieldData
    
    var expirationDate: HostedFieldsHostedFieldsFieldData
    
    var expirationMonth: HostedFieldsHostedFieldsFieldData
    
    var expirationYear: HostedFieldsHostedFieldsFieldData
    
    var number: HostedFieldsHostedFieldsFieldData
    
    var postalCode: HostedFieldsHostedFieldsFieldData
  }
  object HostedFieldsFieldDataFields {
    
    inline def apply(
      cvv: HostedFieldsHostedFieldsFieldData,
      expirationDate: HostedFieldsHostedFieldsFieldData,
      expirationMonth: HostedFieldsHostedFieldsFieldData,
      expirationYear: HostedFieldsHostedFieldsFieldData,
      number: HostedFieldsHostedFieldsFieldData,
      postalCode: HostedFieldsHostedFieldsFieldData
    ): HostedFieldsFieldDataFields = {
      val __obj = js.Dynamic.literal(cvv = cvv.asInstanceOf[js.Any], expirationDate = expirationDate.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsFieldDataFields]
    }
    
    extension [Self <: HostedFieldsFieldDataFields](x: Self) {
      
      inline def setCvv(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      inline def setExpirationDate(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationMonth(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
      
      inline def setExpirationYear(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
      
      inline def setNumber(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setPostalCode(value: HostedFieldsHostedFieldsFieldData): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsFieldMaskInput extends StObject {
    
    /**
      * The character to use when masking the input.
      * @default '•'
      */
    var character: js.UndefOr[String] = js.undefined
    
    /**
      * Only applicable for the credit card field. Whether or not to show the last 4 digits of the card when masking.
      */
    var showLastFour: js.UndefOr[Boolean] = js.undefined
  }
  object HostedFieldsFieldMaskInput {
    
    inline def apply(): HostedFieldsFieldMaskInput = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HostedFieldsFieldMaskInput]
    }
    
    extension [Self <: HostedFieldsFieldMaskInput](x: Self) {
      
      inline def setCharacter(value: String): Self = StObject.set(x, "character", value.asInstanceOf[js.Any])
      
      inline def setCharacterUndefined: Self = StObject.set(x, "character", js.undefined)
      
      inline def setShowLastFour(value: Boolean): Self = StObject.set(x, "showLastFour", value.asInstanceOf[js.Any])
      
      inline def setShowLastFourUndefined: Self = StObject.set(x, "showLastFour", js.undefined)
    }
  }
  
  trait HostedFieldsHostedFieldsCard extends StObject {
    
    var code: HostedFieldsCardCode
    
    var niceType: String
    
    var `type`: String
  }
  object HostedFieldsHostedFieldsCard {
    
    inline def apply(code: HostedFieldsCardCode, niceType: String, `type`: String): HostedFieldsHostedFieldsCard = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], niceType = niceType.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsHostedFieldsCard]
    }
    
    extension [Self <: HostedFieldsHostedFieldsCard](x: Self) {
      
      inline def setCode(value: HostedFieldsCardCode): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setNiceType(value: String): Self = StObject.set(x, "niceType", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsHostedFieldsFieldData extends StObject {
    
    var container: HTMLElement
    
    var isEmpty: Boolean
    
    var isFocused: Boolean
    
    var isPotentiallyValid: Boolean
    
    var isValid: Boolean
  }
  object HostedFieldsHostedFieldsFieldData {
    
    inline def apply(
      container: HTMLElement,
      isEmpty: Boolean,
      isFocused: Boolean,
      isPotentiallyValid: Boolean,
      isValid: Boolean
    ): HostedFieldsHostedFieldsFieldData = {
      val __obj = js.Dynamic.literal(container = container.asInstanceOf[js.Any], isEmpty = isEmpty.asInstanceOf[js.Any], isFocused = isFocused.asInstanceOf[js.Any], isPotentiallyValid = isPotentiallyValid.asInstanceOf[js.Any], isValid = isValid.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsHostedFieldsFieldData]
    }
    
    extension [Self <: HostedFieldsHostedFieldsFieldData](x: Self) {
      
      inline def setContainer(value: HTMLElement): Self = StObject.set(x, "container", value.asInstanceOf[js.Any])
      
      inline def setIsEmpty(value: Boolean): Self = StObject.set(x, "isEmpty", value.asInstanceOf[js.Any])
      
      inline def setIsFocused(value: Boolean): Self = StObject.set(x, "isFocused", value.asInstanceOf[js.Any])
      
      inline def setIsPotentiallyValid(value: Boolean): Self = StObject.set(x, "isPotentiallyValid", value.asInstanceOf[js.Any])
      
      inline def setIsValid(value: Boolean): Self = StObject.set(x, "isValid", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.braintreeWeb.braintreeWebStrings.number
    - typings.braintreeWeb.braintreeWebStrings.cvv
    - typings.braintreeWeb.braintreeWebStrings.expirationDate
    - typings.braintreeWeb.braintreeWebStrings.expirationMonth
    - typings.braintreeWeb.braintreeWebStrings.expirationYear
    - typings.braintreeWeb.braintreeWebStrings.postalCode
  */
  trait HostedFieldsHostedFieldsFieldName extends StObject
  object HostedFieldsHostedFieldsFieldName {
    
    inline def cvv: typings.braintreeWeb.braintreeWebStrings.cvv = "cvv".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.cvv]
    
    inline def expirationDate: typings.braintreeWeb.braintreeWebStrings.expirationDate = "expirationDate".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.expirationDate]
    
    inline def expirationMonth: typings.braintreeWeb.braintreeWebStrings.expirationMonth = "expirationMonth".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.expirationMonth]
    
    inline def expirationYear: typings.braintreeWeb.braintreeWebStrings.expirationYear = "expirationYear".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.expirationYear]
    
    inline def number: typings.braintreeWeb.braintreeWebStrings.number = "number".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.number]
    
    inline def postalCode: typings.braintreeWeb.braintreeWebStrings.postalCode = "postalCode".asInstanceOf[typings.braintreeWeb.braintreeWebStrings.postalCode]
  }
  
  trait HostedFieldsStateObject extends StObject {
    
    var cards: js.Array[HostedFieldsHostedFieldsCard]
    
    var emittedBy: HostedFieldsHostedFieldsFieldName
    
    var fields: HostedFieldsFieldDataFields
  }
  object HostedFieldsStateObject {
    
    inline def apply(
      cards: js.Array[HostedFieldsHostedFieldsCard],
      emittedBy: HostedFieldsHostedFieldsFieldName,
      fields: HostedFieldsFieldDataFields
    ): HostedFieldsStateObject = {
      val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], emittedBy = emittedBy.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsStateObject]
    }
    
    extension [Self <: HostedFieldsStateObject](x: Self) {
      
      inline def setCards(value: js.Array[HostedFieldsHostedFieldsCard]): Self = StObject.set(x, "cards", value.asInstanceOf[js.Any])
      
      inline def setCardsVarargs(value: HostedFieldsHostedFieldsCard*): Self = StObject.set(x, "cards", js.Array(value :_*))
      
      inline def setEmittedBy(value: HostedFieldsHostedFieldsFieldName): Self = StObject.set(x, "emittedBy", value.asInstanceOf[js.Any])
      
      inline def setFields(value: HostedFieldsFieldDataFields): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
    }
  }
  
  trait HostedFieldsTokenizePayload extends StObject {
    
    var description: String
    
    var details: HostedFieldsAccountDetails
    
    var nonce: String
    
    var `type`: String
  }
  object HostedFieldsTokenizePayload {
    
    inline def apply(description: String, details: HostedFieldsAccountDetails, nonce: String, `type`: String): HostedFieldsTokenizePayload = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], details = details.asInstanceOf[js.Any], nonce = nonce.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[HostedFieldsTokenizePayload]
    }
    
    extension [Self <: HostedFieldsTokenizePayload](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setDetails(value: HostedFieldsAccountDetails): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setNonce(value: String): Self = StObject.set(x, "nonce", value.asInstanceOf[js.Any])
      
      inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    }
  }
}
