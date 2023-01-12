package typings.braintreeWebDropIn

import typings.applepayjs.ApplePayJS.ApplePayPayment
import typings.braintreeWeb.modulesHostedFieldsMod.HostedFieldsField
import typings.braintreeWebDropIn.mod.Address
import typings.braintreeWebDropIn.mod.Dropin
import typings.braintreeWebDropIn.mod.Options
import typings.googlepay.google.payments.api.PaymentData
import typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonColorOption
import typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonLabelOption
import typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonShapeOption
import typings.paypalCheckoutComponents.modulesConfigurationMod.ButtonSizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  trait AdditionalInformation extends StObject {
    
    var additionalInformation: js.UndefOr[js.Object] = js.undefined
    
    var amount: String
    
    var billingAddress: js.UndefOr[js.Object] = js.undefined
    
    var challengeRequested: js.UndefOr[Boolean] = js.undefined
    
    var email: js.UndefOr[String] = js.undefined
    
    var exemptionRequested: js.UndefOr[Boolean] = js.undefined
    
    var mobilePhoneNumber: js.UndefOr[String] = js.undefined
  }
  object AdditionalInformation {
    
    inline def apply(amount: String): AdditionalInformation = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any])
      __obj.asInstanceOf[AdditionalInformation]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AdditionalInformation] (val x: Self) extends AnyVal {
      
      inline def setAdditionalInformation(value: js.Object): Self = StObject.set(x, "additionalInformation", value.asInstanceOf[js.Any])
      
      inline def setAdditionalInformationUndefined: Self = StObject.set(x, "additionalInformation", js.undefined)
      
      inline def setAmount(value: String): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setBillingAddress(value: js.Object): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
      
      inline def setChallengeRequested(value: Boolean): Self = StObject.set(x, "challengeRequested", value.asInstanceOf[js.Any])
      
      inline def setChallengeRequestedUndefined: Self = StObject.set(x, "challengeRequested", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
      
      inline def setExemptionRequested(value: Boolean): Self = StObject.set(x, "exemptionRequested", value.asInstanceOf[js.Any])
      
      inline def setExemptionRequestedUndefined: Self = StObject.set(x, "exemptionRequested", js.undefined)
      
      inline def setMobilePhoneNumber(value: String): Self = StObject.set(x, "mobilePhoneNumber", value.asInstanceOf[js.Any])
      
      inline def setMobilePhoneNumberUndefined: Self = StObject.set(x, "mobilePhoneNumber", js.undefined)
    }
  }
  
  trait AllowVaultCardOverride extends StObject {
    
    var allowVaultCardOverride: js.UndefOr[Boolean] = js.undefined
    
    var vaultCard: js.UndefOr[Boolean] = js.undefined
  }
  object AllowVaultCardOverride {
    
    inline def apply(): AllowVaultCardOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowVaultCardOverride]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: AllowVaultCardOverride] (val x: Self) extends AnyVal {
      
      inline def setAllowVaultCardOverride(value: Boolean): Self = StObject.set(x, "allowVaultCardOverride", value.asInstanceOf[js.Any])
      
      inline def setAllowVaultCardOverrideUndefined: Self = StObject.set(x, "allowVaultCardOverride", js.undefined)
      
      inline def setVaultCard(value: Boolean): Self = StObject.set(x, "vaultCard", value.asInstanceOf[js.Any])
      
      inline def setVaultCardUndefined: Self = StObject.set(x, "vaultCard", js.undefined)
    }
  }
  
  trait BillingAddress extends StObject {
    
    var billingAddress: js.UndefOr[Address] = js.undefined
    
    var countryCode: js.UndefOr[String] = js.undefined
    
    var email: String
    
    var firstName: String
    
    var lastName: String
    
    var payerId: String
    
    var phone: js.UndefOr[String] = js.undefined
    
    var shippingAddress: js.UndefOr[Address] = js.undefined
  }
  object BillingAddress {
    
    inline def apply(email: String, firstName: String, lastName: String, payerId: String): BillingAddress = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingAddress]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: BillingAddress] (val x: Self) extends AnyVal {
      
      inline def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      inline def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
      
      inline def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      inline def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      inline def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      inline def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      inline def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
      
      inline def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      inline def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      inline def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      inline def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    }
  }
  
  trait Bin extends StObject {
    
    var bin: String
    
    var cardType: String
    
    var cardholderName: String
    
    var expirationMonth: String
    
    var expirationYear: String
    
    var lastFour: String
    
    var lastTwo: String
  }
  object Bin {
    
    inline def apply(
      bin: String,
      cardType: String,
      cardholderName: String,
      expirationMonth: String,
      expirationYear: String,
      lastFour: String,
      lastTwo: String
    ): Bin = {
      val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], cardholderName = cardholderName.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any])
      __obj.asInstanceOf[Bin]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      inline def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
      
      inline def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
      
      inline def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
      
      inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardHolderName extends StObject {
    
    var cardHolderName: String
    
    var cardType: String
    
    var dpanLastTwo: String
    
    var rawPaymentData: ApplePayPayment
  }
  object CardHolderName {
    
    inline def apply(cardHolderName: String, cardType: String, dpanLastTwo: String, rawPaymentData: ApplePayPayment): CardHolderName = {
      val __obj = js.Dynamic.literal(cardHolderName = cardHolderName.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], dpanLastTwo = dpanLastTwo.asInstanceOf[js.Any], rawPaymentData = rawPaymentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHolderName]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardHolderName] (val x: Self) extends AnyVal {
      
      inline def setCardHolderName(value: String): Self = StObject.set(x, "cardHolderName", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setDpanLastTwo(value: String): Self = StObject.set(x, "dpanLastTwo", value.asInstanceOf[js.Any])
      
      inline def setRawPaymentData(value: ApplePayPayment): Self = StObject.set(x, "rawPaymentData", value.asInstanceOf[js.Any])
    }
  }
  
  trait CardType extends StObject {
    
    var bin: String
    
    var cardType: String
    
    var isNetworkTokenized: Boolean
    
    var lastFour: String
    
    var lastTwo: String
    
    var rawPaymentData: PaymentData
  }
  object CardType {
    
    inline def apply(
      bin: String,
      cardType: String,
      isNetworkTokenized: Boolean,
      lastFour: String,
      lastTwo: String,
      rawPaymentData: PaymentData
    ): CardType = {
      val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], isNetworkTokenized = isNetworkTokenized.asInstanceOf[js.Any], lastFour = lastFour.asInstanceOf[js.Any], lastTwo = lastTwo.asInstanceOf[js.Any], rawPaymentData = rawPaymentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CardType] (val x: Self) extends AnyVal {
      
      inline def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      inline def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      inline def setIsNetworkTokenized(value: Boolean): Self = StObject.set(x, "isNetworkTokenized", value.asInstanceOf[js.Any])
      
      inline def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
      
      inline def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
      
      inline def setRawPaymentData(value: PaymentData): Self = StObject.set(x, "rawPaymentData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Create extends StObject {
    
    def create(options: Options): js.Promise[Dropin] = js.native
    def create(
      options: Options,
      callback: js.Function2[/* error */ js.Object | Null, /* dropin */ js.UndefOr[Dropin], Unit]
    ): Unit = js.native
  }
  
  trait Cvv extends StObject {
    
    var cvv: js.UndefOr[HostedFieldsField] = js.undefined
    
    var expirationDate: js.UndefOr[HostedFieldsField] = js.undefined
    
    var number: js.UndefOr[HostedFieldsField] = js.undefined
    
    var postalCode: js.UndefOr[HostedFieldsField] = js.undefined
  }
  object Cvv {
    
    inline def apply(): Cvv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cvv]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Cvv] (val x: Self) extends AnyVal {
      
      inline def setCvv(value: HostedFieldsField): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      inline def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
      
      inline def setExpirationDate(value: HostedFieldsField): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      inline def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      inline def setNumber(value: HostedFieldsField): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      inline def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      inline def setPostalCode(value: HostedFieldsField): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      inline def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    }
  }
  
  trait Fields extends StObject {
    
    var fields: js.UndefOr[Cvv] = js.undefined
    
    var styles: js.UndefOr[js.Object] = js.undefined
  }
  object Fields {
    
    inline def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      inline def setFields(value: Cvv): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      inline def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      inline def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      inline def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Partial<paypal-checkout-components.paypal-checkout-components.ButtonStyle> */
  trait PartialButtonStyle extends StObject {
    
    var color: js.UndefOr[ButtonColorOption] = js.undefined
    
    var height: js.UndefOr[Double] = js.undefined
    
    var label: js.UndefOr[ButtonLabelOption] = js.undefined
    
    var shape: js.UndefOr[ButtonShapeOption] = js.undefined
    
    var size: js.UndefOr[ButtonSizeOption] = js.undefined
    
    var tagline: js.UndefOr[Boolean] = js.undefined
  }
  object PartialButtonStyle {
    
    inline def apply(): PartialButtonStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialButtonStyle]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: PartialButtonStyle] (val x: Self) extends AnyVal {
      
      inline def setColor(value: ButtonColorOption): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      inline def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      inline def setHeight(value: Double): Self = StObject.set(x, "height", value.asInstanceOf[js.Any])
      
      inline def setHeightUndefined: Self = StObject.set(x, "height", js.undefined)
      
      inline def setLabel(value: ButtonLabelOption): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      inline def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      inline def setShape(value: ButtonShapeOption): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      inline def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      inline def setSize(value: ButtonSizeOption): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      inline def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      inline def setTagline(value: Boolean): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
      
      inline def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
    }
  }
  
  trait Required extends StObject {
    
    var required: js.UndefOr[Boolean] = js.undefined
  }
  object Required {
    
    inline def apply(): Required = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Required]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
      
      inline def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      inline def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  trait Username extends StObject {
    
    var username: String
  }
  object Username {
    
    inline def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      inline def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
