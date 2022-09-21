package typings.checCommerceJs

import org.scalablytyped.runtime.StringDictionary
import typings.checCommerceJs.anon.Code
import typings.checCommerceJs.anon.Country
import typings.checCommerceJs.anon.CountryRegion
import typings.checCommerceJs.anon.Customersetprice
import typings.checCommerceJs.anon.Digits
import typings.checCommerceJs.anon.Ipaddress
import typings.checCommerceJs.anon.Region
import typings.checCommerceJs.checCommerceJsBooleans.`true`
import typings.checCommerceJs.checkoutCaptureMod.CheckoutCapture
import typings.checCommerceJs.checkoutCaptureResponseMod.CheckoutCaptureResponse
import typings.checCommerceJs.checkoutTokenMod.CheckoutToken
import typings.checCommerceJs.discountMod.DiscountType
import typings.checCommerceJs.liveMod.Live
import typings.checCommerceJs.mod.^
import typings.checCommerceJs.priceMod.Price
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object checkoutMod {
  
  @JSImport("@chec/commerce.js/features/checkout", "Checkout")
  @js.native
  open class Checkout protected () extends StObject {
    def this(commerce: ^) = this()
    
    def capture(token: String, data: CheckoutCapture): js.Promise[CheckoutCaptureResponse] = js.native
    
    def checkDiscount(token: String, data: Code): js.Promise[CheckDiscountResponse] = js.native
    
    def checkGiftcard(token: String, params: Code): js.Promise[CheckGiftcardResponse] = js.native
    
    def checkPayWhatYouWant(token: String, data: Customersetprice): js.Promise[CheckPayWhatYouWantResponse] = js.native
    
    def checkQuantity(token: String, lineItemId: String, data: js.Object): js.Promise[CheckQuantityResponse] = js.native
    
    def checkShippingOption(token: String, data: Region): js.Promise[CheckShippingOptionResponse] = js.native
    
    def checkVariant(token: String, lineItemId: String, data: js.Object): js.Promise[CheckVariantResponse] = js.native
    
    def fields(identifier: String): js.Promise[Any] = js.native
    
    def generateToken(identifier: String, data: js.Object): js.Promise[CheckoutToken] = js.native
    
    def generateTokenFrom(`type`: IdentifierType, identifier: String): js.Promise[CheckoutToken] = js.native
    
    def getLive(token: String): js.Promise[Live] = js.native
    
    def getLocationFromIP(token: String): js.Promise[GetLocationFromIPResponse] = js.native
    def getLocationFromIP(token: String, ipAddress: String): js.Promise[GetLocationFromIPResponse] = js.native
    
    def getShippingOptions(token: String, data: CountryRegion): js.Promise[js.Array[GetShippingOptionsResponse]] = js.native
    
    def getToken(token: String): js.Promise[CheckoutToken] = js.native
    
    def helperValidation(token: String): js.Promise[HelperValidationResponse] = js.native
    
    def isFree(token: String): js.Promise[IsFreeResponse] = js.native
    
    /** @deprecated */
    def protect(token: String): js.Promise[Any] = js.native
    
    def receipt(token: String): js.Promise[Any] = js.native
    
    def setTaxZone(token: String, data: Ipaddress): js.Promise[SetTaxZoneResponse] = js.native
  }
  
  trait CheckDiscountResponse extends StObject {
    
    var amount_saved: Price
    
    var code: String
    
    var live: Live
    
    var `type`: DiscountType
    
    var valid: Boolean
    
    var value: Double
  }
  object CheckDiscountResponse {
    
    inline def apply(amount_saved: Price, code: String, live: Live, `type`: DiscountType, valid: Boolean, value: Double): CheckDiscountResponse = {
      val __obj = js.Dynamic.literal(amount_saved = amount_saved.asInstanceOf[js.Any], code = code.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckDiscountResponse]
    }
    
    extension [Self <: CheckDiscountResponse](x: Self) {
      
      inline def setAmount_saved(value: Price): Self = StObject.set(x, "amount_saved", value.asInstanceOf[js.Any])
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setType(value: DiscountType): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
      
      inline def setValue(value: Double): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckGiftcardResponse extends StObject {
    
    var code: String
    
    var credit: Double
    
    var live: Live
    
    var valid: Boolean
  }
  object CheckGiftcardResponse {
    
    inline def apply(code: String, credit: Double, live: Live, valid: Boolean): CheckGiftcardResponse = {
      val __obj = js.Dynamic.literal(code = code.asInstanceOf[js.Any], credit = credit.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckGiftcardResponse]
    }
    
    extension [Self <: CheckGiftcardResponse](x: Self) {
      
      inline def setCode(value: String): Self = StObject.set(x, "code", value.asInstanceOf[js.Any])
      
      inline def setCredit(value: Double): Self = StObject.set(x, "credit", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckPayWhatYouWantResponse extends StObject {
    
    var customer_set_price: Price
    
    var live: Live
    
    var message: String
    
    var valid: Boolean
  }
  object CheckPayWhatYouWantResponse {
    
    inline def apply(customer_set_price: Price, live: Live, message: String, valid: Boolean): CheckPayWhatYouWantResponse = {
      val __obj = js.Dynamic.literal(customer_set_price = customer_set_price.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckPayWhatYouWantResponse]
    }
    
    extension [Self <: CheckPayWhatYouWantResponse](x: Self) {
      
      inline def setCustomer_set_price(value: Price): Self = StObject.set(x, "customer_set_price", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckQuantityResponse extends StObject {
    
    var available: Boolean
    
    var line_item_id: String
    
    var live: Live
    
    var requested_quantity: Double
  }
  object CheckQuantityResponse {
    
    inline def apply(available: Boolean, line_item_id: String, live: Live, requested_quantity: Double): CheckQuantityResponse = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], line_item_id = line_item_id.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], requested_quantity = requested_quantity.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckQuantityResponse]
    }
    
    extension [Self <: CheckQuantityResponse](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setLine_item_id(value: String): Self = StObject.set(x, "line_item_id", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setRequested_quantity(value: Double): Self = StObject.set(x, "requested_quantity", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckShippingOptionResponse extends StObject {
    
    var description: String
    
    var id: String
    
    var live: Live
    
    var price: Price
    
    var valid: Boolean
  }
  object CheckShippingOptionResponse {
    
    inline def apply(description: String, id: String, live: Live, price: Price, valid: Boolean): CheckShippingOptionResponse = {
      val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], valid = valid.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckShippingOptionResponse]
    }
    
    extension [Self <: CheckShippingOptionResponse](x: Self) {
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setValid(value: Boolean): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
  
  trait CheckVariantResponse extends StObject {
    
    var available: Boolean
    
    var line_item_id: String
    
    var live: Live
    
    var name: String
    
    var option_id: String
    
    var price: Price
    
    var requested_quantity: Double
    
    var variant_id: String
  }
  object CheckVariantResponse {
    
    inline def apply(
      available: Boolean,
      line_item_id: String,
      live: Live,
      name: String,
      option_id: String,
      price: Price,
      requested_quantity: Double,
      variant_id: String
    ): CheckVariantResponse = {
      val __obj = js.Dynamic.literal(available = available.asInstanceOf[js.Any], line_item_id = line_item_id.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], option_id = option_id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any], requested_quantity = requested_quantity.asInstanceOf[js.Any], variant_id = variant_id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckVariantResponse]
    }
    
    extension [Self <: CheckVariantResponse](x: Self) {
      
      inline def setAvailable(value: Boolean): Self = StObject.set(x, "available", value.asInstanceOf[js.Any])
      
      inline def setLine_item_id(value: String): Self = StObject.set(x, "line_item_id", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setOption_id(value: String): Self = StObject.set(x, "option_id", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
      
      inline def setRequested_quantity(value: Double): Self = StObject.set(x, "requested_quantity", value.asInstanceOf[js.Any])
      
      inline def setVariant_id(value: String): Self = StObject.set(x, "variant_id", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetLocationFromIPResponse extends StObject {
    
    var city: String
    
    var country_code: String
    
    var country_name: String
    
    var ip_address: String
    
    var postal_zip_code: String
    
    var region_code: String
    
    var region_name: String
  }
  object GetLocationFromIPResponse {
    
    inline def apply(
      city: String,
      country_code: String,
      country_name: String,
      ip_address: String,
      postal_zip_code: String,
      region_code: String,
      region_name: String
    ): GetLocationFromIPResponse = {
      val __obj = js.Dynamic.literal(city = city.asInstanceOf[js.Any], country_code = country_code.asInstanceOf[js.Any], country_name = country_name.asInstanceOf[js.Any], ip_address = ip_address.asInstanceOf[js.Any], postal_zip_code = postal_zip_code.asInstanceOf[js.Any], region_code = region_code.asInstanceOf[js.Any], region_name = region_name.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetLocationFromIPResponse]
    }
    
    extension [Self <: GetLocationFromIPResponse](x: Self) {
      
      inline def setCity(value: String): Self = StObject.set(x, "city", value.asInstanceOf[js.Any])
      
      inline def setCountry_code(value: String): Self = StObject.set(x, "country_code", value.asInstanceOf[js.Any])
      
      inline def setCountry_name(value: String): Self = StObject.set(x, "country_name", value.asInstanceOf[js.Any])
      
      inline def setIp_address(value: String): Self = StObject.set(x, "ip_address", value.asInstanceOf[js.Any])
      
      inline def setPostal_zip_code(value: String): Self = StObject.set(x, "postal_zip_code", value.asInstanceOf[js.Any])
      
      inline def setRegion_code(value: String): Self = StObject.set(x, "region_code", value.asInstanceOf[js.Any])
      
      inline def setRegion_name(value: String): Self = StObject.set(x, "region_name", value.asInstanceOf[js.Any])
    }
  }
  
  trait GetShippingOptionsResponse extends StObject {
    
    var countries: js.Array[String]
    
    var description: String
    
    var id: String
    
    var price: Price
  }
  object GetShippingOptionsResponse {
    
    inline def apply(countries: js.Array[String], description: String, id: String, price: Price): GetShippingOptionsResponse = {
      val __obj = js.Dynamic.literal(countries = countries.asInstanceOf[js.Any], description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], price = price.asInstanceOf[js.Any])
      __obj.asInstanceOf[GetShippingOptionsResponse]
    }
    
    extension [Self <: GetShippingOptionsResponse](x: Self) {
      
      inline def setCountries(value: js.Array[String]): Self = StObject.set(x, "countries", value.asInstanceOf[js.Any])
      
      inline def setCountriesVarargs(value: String*): Self = StObject.set(x, "countries", js.Array(value*))
      
      inline def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
      
      inline def setPrice(value: Price): Self = StObject.set(x, "price", value.asInstanceOf[js.Any])
    }
  }
  
  trait HelperValidationResponse extends StObject {
    
    var rules: StringDictionary[Digits]
  }
  object HelperValidationResponse {
    
    inline def apply(rules: StringDictionary[Digits]): HelperValidationResponse = {
      val __obj = js.Dynamic.literal(rules = rules.asInstanceOf[js.Any])
      __obj.asInstanceOf[HelperValidationResponse]
    }
    
    extension [Self <: HelperValidationResponse](x: Self) {
      
      inline def setRules(value: StringDictionary[Digits]): Self = StObject.set(x, "rules", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.checCommerceJs.checCommerceJsStrings.product_id
    - typings.checCommerceJs.checCommerceJsStrings.cart
    - typings.checCommerceJs.checCommerceJsStrings.permalink
  */
  trait IdentifierType extends StObject
  object IdentifierType {
    
    inline def cart: typings.checCommerceJs.checCommerceJsStrings.cart = "cart".asInstanceOf[typings.checCommerceJs.checCommerceJsStrings.cart]
    
    inline def permalink: typings.checCommerceJs.checCommerceJsStrings.permalink = "permalink".asInstanceOf[typings.checCommerceJs.checCommerceJsStrings.permalink]
    
    inline def product_id: typings.checCommerceJs.checCommerceJsStrings.product_id = "product_id".asInstanceOf[typings.checCommerceJs.checCommerceJsStrings.product_id]
  }
  
  trait IsFreeResponse extends StObject {
    
    var is_free: Boolean
    
    var live: Live
  }
  object IsFreeResponse {
    
    inline def apply(is_free: Boolean, live: Live): IsFreeResponse = {
      val __obj = js.Dynamic.literal(is_free = is_free.asInstanceOf[js.Any], live = live.asInstanceOf[js.Any])
      __obj.asInstanceOf[IsFreeResponse]
    }
    
    extension [Self <: IsFreeResponse](x: Self) {
      
      inline def setIs_free(value: Boolean): Self = StObject.set(x, "is_free", value.asInstanceOf[js.Any])
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
    }
  }
  
  trait SetTaxZoneResponse extends StObject {
    
    var live: Live
    
    var tax_region: Country
    
    var valid: `true`
  }
  object SetTaxZoneResponse {
    
    inline def apply(live: Live, tax_region: Country): SetTaxZoneResponse = {
      val __obj = js.Dynamic.literal(live = live.asInstanceOf[js.Any], tax_region = tax_region.asInstanceOf[js.Any], valid = true)
      __obj.asInstanceOf[SetTaxZoneResponse]
    }
    
    extension [Self <: SetTaxZoneResponse](x: Self) {
      
      inline def setLive(value: Live): Self = StObject.set(x, "live", value.asInstanceOf[js.Any])
      
      inline def setTax_region(value: Country): Self = StObject.set(x, "tax_region", value.asInstanceOf[js.Any])
      
      inline def setValid(value: `true`): Self = StObject.set(x, "valid", value.asInstanceOf[js.Any])
    }
  }
}
