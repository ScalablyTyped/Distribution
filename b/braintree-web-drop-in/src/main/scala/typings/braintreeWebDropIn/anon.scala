package typings.braintreeWebDropIn

import typings.applepayjs.ApplePayJS.ApplePayPayment
import typings.braintreeWeb.hostedFieldsMod.HostedFieldsField
import typings.braintreeWebDropIn.mod.Address
import typings.braintreeWebDropIn.mod.Dropin
import typings.braintreeWebDropIn.mod.Options
import typings.googlepay.google.payments.api.PaymentData
import typings.paypalCheckoutComponents.configurationMod.ButtonColorOption
import typings.paypalCheckoutComponents.configurationMod.ButtonLabelOption
import typings.paypalCheckoutComponents.configurationMod.ButtonShapeOption
import typings.paypalCheckoutComponents.configurationMod.ButtonSizeOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait AllowVaultCardOverride extends StObject {
    
    var allowVaultCardOverride: js.UndefOr[Boolean] = js.native
    
    var vaultCard: js.UndefOr[Boolean] = js.native
  }
  object AllowVaultCardOverride {
    
    @scala.inline
    def apply(): AllowVaultCardOverride = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[AllowVaultCardOverride]
    }
    
    @scala.inline
    implicit class AllowVaultCardOverrideMutableBuilder[Self <: AllowVaultCardOverride] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAllowVaultCardOverride(value: Boolean): Self = StObject.set(x, "allowVaultCardOverride", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAllowVaultCardOverrideUndefined: Self = StObject.set(x, "allowVaultCardOverride", js.undefined)
      
      @scala.inline
      def setVaultCard(value: Boolean): Self = StObject.set(x, "vaultCard", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVaultCardUndefined: Self = StObject.set(x, "vaultCard", js.undefined)
    }
  }
  
  @js.native
  trait BillingAddress extends StObject {
    
    var billingAddress: js.UndefOr[Address] = js.native
    
    var countryCode: js.UndefOr[String] = js.native
    
    var email: String = js.native
    
    var firstName: String = js.native
    
    var lastName: String = js.native
    
    var payerId: String = js.native
    
    var phone: js.UndefOr[String] = js.native
    
    var shippingAddress: js.UndefOr[Address] = js.native
  }
  object BillingAddress {
    
    @scala.inline
    def apply(email: String, firstName: String, lastName: String, payerId: String): BillingAddress = {
      val __obj = js.Dynamic.literal(email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], payerId = payerId.asInstanceOf[js.Any])
      __obj.asInstanceOf[BillingAddress]
    }
    
    @scala.inline
    implicit class BillingAddressMutableBuilder[Self <: BillingAddress] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBillingAddress(value: Address): Self = StObject.set(x, "billingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBillingAddressUndefined: Self = StObject.set(x, "billingAddress", js.undefined)
      
      @scala.inline
      def setCountryCode(value: String): Self = StObject.set(x, "countryCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCountryCodeUndefined: Self = StObject.set(x, "countryCode", js.undefined)
      
      @scala.inline
      def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstName(value: String): Self = StObject.set(x, "firstName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastName(value: String): Self = StObject.set(x, "lastName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPayerId(value: String): Self = StObject.set(x, "payerId", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhone(value: String): Self = StObject.set(x, "phone", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPhoneUndefined: Self = StObject.set(x, "phone", js.undefined)
      
      @scala.inline
      def setShippingAddress(value: Address): Self = StObject.set(x, "shippingAddress", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShippingAddressUndefined: Self = StObject.set(x, "shippingAddress", js.undefined)
    }
  }
  
  @js.native
  trait Bin extends StObject {
    
    var bin: String = js.native
    
    var cardType: String = js.native
    
    var cardholderName: String = js.native
    
    var expirationMonth: String = js.native
    
    var expirationYear: String = js.native
    
    var lastFour: String = js.native
    
    var lastTwo: String = js.native
  }
  object Bin {
    
    @scala.inline
    def apply(
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
    implicit class BinMutableBuilder[Self <: Bin] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardholderName(value: String): Self = StObject.set(x, "cardholderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationMonth(value: String): Self = StObject.set(x, "expirationMonth", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationYear(value: String): Self = StObject.set(x, "expirationYear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardHolderName extends StObject {
    
    var cardHolderName: String = js.native
    
    var cardType: String = js.native
    
    var dpanLastTwo: String = js.native
    
    var rawPaymentData: ApplePayPayment = js.native
  }
  object CardHolderName {
    
    @scala.inline
    def apply(cardHolderName: String, cardType: String, dpanLastTwo: String, rawPaymentData: ApplePayPayment): CardHolderName = {
      val __obj = js.Dynamic.literal(cardHolderName = cardHolderName.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], dpanLastTwo = dpanLastTwo.asInstanceOf[js.Any], rawPaymentData = rawPaymentData.asInstanceOf[js.Any])
      __obj.asInstanceOf[CardHolderName]
    }
    
    @scala.inline
    implicit class CardHolderNameMutableBuilder[Self <: CardHolderName] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCardHolderName(value: String): Self = StObject.set(x, "cardHolderName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDpanLastTwo(value: String): Self = StObject.set(x, "dpanLastTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPaymentData(value: ApplePayPayment): Self = StObject.set(x, "rawPaymentData", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CardType extends StObject {
    
    var bin: String = js.native
    
    var cardType: String = js.native
    
    var isNetworkTokenized: Boolean = js.native
    
    var lastFour: String = js.native
    
    var lastTwo: String = js.native
    
    var rawPaymentData: PaymentData = js.native
  }
  object CardType {
    
    @scala.inline
    def apply(
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
    implicit class CardTypeMutableBuilder[Self <: CardType] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBin(value: String): Self = StObject.set(x, "bin", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCardType(value: String): Self = StObject.set(x, "cardType", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsNetworkTokenized(value: Boolean): Self = StObject.set(x, "isNetworkTokenized", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastFour(value: String): Self = StObject.set(x, "lastFour", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLastTwo(value: String): Self = StObject.set(x, "lastTwo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRawPaymentData(value: PaymentData): Self = StObject.set(x, "rawPaymentData", value.asInstanceOf[js.Any])
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
  
  @js.native
  trait Cvv extends StObject {
    
    var cvv: js.UndefOr[HostedFieldsField] = js.native
    
    var expirationDate: js.UndefOr[HostedFieldsField] = js.native
    
    var number: js.UndefOr[HostedFieldsField] = js.native
    
    var postalCode: js.UndefOr[HostedFieldsField] = js.native
  }
  object Cvv {
    
    @scala.inline
    def apply(): Cvv = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Cvv]
    }
    
    @scala.inline
    implicit class CvvMutableBuilder[Self <: Cvv] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setCvv(value: HostedFieldsField): Self = StObject.set(x, "cvv", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCvvUndefined: Self = StObject.set(x, "cvv", js.undefined)
      
      @scala.inline
      def setExpirationDate(value: HostedFieldsField): Self = StObject.set(x, "expirationDate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setExpirationDateUndefined: Self = StObject.set(x, "expirationDate", js.undefined)
      
      @scala.inline
      def setNumber(value: HostedFieldsField): Self = StObject.set(x, "number", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNumberUndefined: Self = StObject.set(x, "number", js.undefined)
      
      @scala.inline
      def setPostalCode(value: HostedFieldsField): Self = StObject.set(x, "postalCode", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPostalCodeUndefined: Self = StObject.set(x, "postalCode", js.undefined)
    }
  }
  
  @js.native
  trait Fields extends StObject {
    
    var fields: js.UndefOr[Cvv] = js.native
    
    var styles: js.UndefOr[js.Object] = js.native
  }
  object Fields {
    
    @scala.inline
    def apply(): Fields = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Fields]
    }
    
    @scala.inline
    implicit class FieldsMutableBuilder[Self <: Fields] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFields(value: Cvv): Self = StObject.set(x, "fields", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFieldsUndefined: Self = StObject.set(x, "fields", js.undefined)
      
      @scala.inline
      def setStyles(value: js.Object): Self = StObject.set(x, "styles", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStylesUndefined: Self = StObject.set(x, "styles", js.undefined)
    }
  }
  
  /* Inlined std.Partial<paypal-checkout-components.paypal-checkout-components.ButtonStyle> */
  @js.native
  trait PartialButtonStyle extends StObject {
    
    var color: js.UndefOr[ButtonColorOption] = js.native
    
    var label: js.UndefOr[ButtonLabelOption] = js.native
    
    var shape: js.UndefOr[ButtonShapeOption] = js.native
    
    var size: js.UndefOr[ButtonSizeOption] = js.native
    
    var tagline: js.UndefOr[Boolean] = js.native
  }
  object PartialButtonStyle {
    
    @scala.inline
    def apply(): PartialButtonStyle = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[PartialButtonStyle]
    }
    
    @scala.inline
    implicit class PartialButtonStyleMutableBuilder[Self <: PartialButtonStyle] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setColor(value: ButtonColorOption): Self = StObject.set(x, "color", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setColorUndefined: Self = StObject.set(x, "color", js.undefined)
      
      @scala.inline
      def setLabel(value: ButtonLabelOption): Self = StObject.set(x, "label", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLabelUndefined: Self = StObject.set(x, "label", js.undefined)
      
      @scala.inline
      def setShape(value: ButtonShapeOption): Self = StObject.set(x, "shape", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShapeUndefined: Self = StObject.set(x, "shape", js.undefined)
      
      @scala.inline
      def setSize(value: ButtonSizeOption): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSizeUndefined: Self = StObject.set(x, "size", js.undefined)
      
      @scala.inline
      def setTagline(value: Boolean): Self = StObject.set(x, "tagline", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTaglineUndefined: Self = StObject.set(x, "tagline", js.undefined)
    }
  }
  
  @js.native
  trait Required extends StObject {
    
    var required: js.UndefOr[Boolean] = js.native
  }
  object Required {
    
    @scala.inline
    def apply(): Required = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Required]
    }
    
    @scala.inline
    implicit class RequiredMutableBuilder[Self <: Required] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRequired(value: Boolean): Self = StObject.set(x, "required", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRequiredUndefined: Self = StObject.set(x, "required", js.undefined)
    }
  }
  
  @js.native
  trait Username extends StObject {
    
    var username: String = js.native
  }
  object Username {
    
    @scala.inline
    def apply(username: String): Username = {
      val __obj = js.Dynamic.literal(username = username.asInstanceOf[js.Any])
      __obj.asInstanceOf[Username]
    }
    
    @scala.inline
    implicit class UsernameMutableBuilder[Self <: Username] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUsername(value: String): Self = StObject.set(x, "username", value.asInstanceOf[js.Any])
    }
  }
}
