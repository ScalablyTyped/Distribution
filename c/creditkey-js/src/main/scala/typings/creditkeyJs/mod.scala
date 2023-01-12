package typings.creditkeyJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("creditkey-js", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("creditkey-js", "Address")
  @js.native
  open class Address protected () extends StObject {
    def this(
      first_name: String,
      last_name: String,
      company_name: String,
      email: String,
      address1: String,
      address2: String,
      city: String,
      state: String,
      zip: String,
      phone_number: String
    ) = this()
    def this(
      first_name: String,
      last_name: String,
      company_name: String,
      email: String,
      address1: String,
      address2: Null,
      city: String,
      state: String,
      zip: String,
      phone_number: String
    ) = this()
    
    def is_valid_address(): Boolean = js.native
  }
  
  @JSImport("creditkey-js", "CartItem")
  @js.native
  open class CartItem protected () extends StObject {
    def this(merchantProductId: String, name: String, price: Double, sku: String, quantity: Double) = this()
    def this(merchantProductId: String, name: String, price: Double, sku: Null, quantity: Double) = this()
    def this(
      merchantProductId: String,
      name: String,
      price: Double,
      sku: String,
      quantity: Double,
      size: String
    ) = this()
    def this(merchantProductId: String, name: String, price: Double, sku: Null, quantity: Double, size: String) = this()
    def this(
      merchantProductId: String,
      name: String,
      price: Double,
      sku: String,
      quantity: Double,
      size: String,
      color: String
    ) = this()
    def this(
      merchantProductId: String,
      name: String,
      price: Double,
      sku: String,
      quantity: Double,
      size: Null,
      color: String
    ) = this()
    def this(
      merchantProductId: String,
      name: String,
      price: Double,
      sku: Null,
      quantity: Double,
      size: String,
      color: String
    ) = this()
    def this(
      merchantProductId: String,
      name: String,
      price: Double,
      sku: Null,
      quantity: Double,
      size: Null,
      color: String
    ) = this()
    
    def is_valid_item(): Boolean = js.native
  }
  
  @JSImport("creditkey-js", "Charges")
  @js.native
  open class Charges protected () extends StObject {
    def this(total: Double, shipping: Double, tax: Double, discount_amount: Double, grand_total: Double) = this()
    
    def is_valid_money_value(value: Double): Boolean = js.native
    
    def validate_charges(): Boolean = js.native
  }
  
  @JSImport("creditkey-js", "Client")
  @js.native
  open class Client protected () extends StObject {
    def this(key: String) = this()
    def this(key: String, platform: Platform) = this()
    
    def begin_checkout(
      cartItems: js.Array[CartItem],
      billingAddress: Address,
      shippingAddress: Address,
      charges: Charges,
      remoteId: String,
      customerId: String,
      returnUrl: String,
      cancelUrl: String,
      mode: Mode,
      merchantData: Any
    ): js.Promise[CheckoutResponse] = js.native
    
    def get_customer(email: String, customer_id: String): js.Promise[CustomerResponse] = js.native
    
    def get_marketing_display(charges: Charges): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Unit, display: Unit, size: Size): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Unit, display: Display): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Unit, display: Display, size: Size): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Copy): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Copy, display: Unit, size: Size): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Copy, display: Display): js.Promise[String] = js.native
    def get_marketing_display(charges: Charges, `type`: Copy, display: Display, size: Size): js.Promise[String] = js.native
    
    def is_displayed_in_checkout(cartItems: js.Array[CartItem]): js.Promise[Boolean] = js.native
  }
  
  inline def apply(key: String): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("apply")(key.asInstanceOf[js.Any]).asInstanceOf[Unit]
  inline def apply(key: String, `type`: Unit, platform: Platform): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(key: String, `type`: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  inline def apply(key: String, `type`: Mode, platform: Platform): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("apply")(key.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any], platform.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  inline def checkout(source: String, `type`: Mode): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("checkout")(source.asInstanceOf[js.Any], `type`.asInstanceOf[js.Any])).asInstanceOf[Unit]
  
  trait CheckoutResponse extends StObject {
    
    var checkout_url: String
    
    var id: String
  }
  object CheckoutResponse {
    
    inline def apply(checkout_url: String, id: String): CheckoutResponse = {
      val __obj = js.Dynamic.literal(checkout_url = checkout_url.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any])
      __obj.asInstanceOf[CheckoutResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CheckoutResponse] (val x: Self) extends AnyVal {
      
      inline def setCheckout_url(value: String): Self = StObject.set(x, "checkout_url", value.asInstanceOf[js.Any])
      
      inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.checkout
    - typings.creditkeyJs.creditkeyJsStrings.pdp
  */
  trait Copy extends StObject
  object Copy {
    
    inline def checkout: typings.creditkeyJs.creditkeyJsStrings.checkout = "checkout".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.checkout]
    
    inline def pdp: typings.creditkeyJs.creditkeyJsStrings.pdp = "pdp".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.pdp]
  }
  
  trait CustomerResponse extends StObject {
    
    var amount: Double
    
    var amount_available: Double
    
    var status: Status
  }
  object CustomerResponse {
    
    inline def apply(amount: Double, amount_available: Double, status: Status): CustomerResponse = {
      val __obj = js.Dynamic.literal(amount = amount.asInstanceOf[js.Any], amount_available = amount_available.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[CustomerResponse]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CustomerResponse] (val x: Self) extends AnyVal {
      
      inline def setAmount(value: Double): Self = StObject.set(x, "amount", value.asInstanceOf[js.Any])
      
      inline def setAmount_available(value: Double): Self = StObject.set(x, "amount_available", value.asInstanceOf[js.Any])
      
      inline def setStatus(value: Status): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.button
    - typings.creditkeyJs.creditkeyJsStrings.text
    - typings.creditkeyJs.creditkeyJsStrings.button_text
  */
  trait Display extends StObject
  object Display {
    
    inline def button: typings.creditkeyJs.creditkeyJsStrings.button = "button".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.button]
    
    inline def button_text: typings.creditkeyJs.creditkeyJsStrings.button_text = "button_text".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.button_text]
    
    inline def text: typings.creditkeyJs.creditkeyJsStrings.text = "text".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.text]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.modal
    - typings.creditkeyJs.creditkeyJsStrings.redirect
  */
  trait Mode extends StObject
  object Mode {
    
    inline def modal: typings.creditkeyJs.creditkeyJsStrings.modal = "modal".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.modal]
    
    inline def redirect: typings.creditkeyJs.creditkeyJsStrings.redirect = "redirect".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.redirect]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.production
    - typings.creditkeyJs.creditkeyJsStrings.staging
    - typings.creditkeyJs.creditkeyJsStrings.development
  */
  trait Platform extends StObject
  object Platform {
    
    inline def development: typings.creditkeyJs.creditkeyJsStrings.development = "development".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.development]
    
    inline def production: typings.creditkeyJs.creditkeyJsStrings.production = "production".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.production]
    
    inline def staging: typings.creditkeyJs.creditkeyJsStrings.staging = "staging".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.staging]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.small
    - typings.creditkeyJs.creditkeyJsStrings.medium
    - typings.creditkeyJs.creditkeyJsStrings.large
  */
  trait Size extends StObject
  object Size {
    
    inline def large: typings.creditkeyJs.creditkeyJsStrings.large = "large".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.large]
    
    inline def medium: typings.creditkeyJs.creditkeyJsStrings.medium = "medium".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.medium]
    
    inline def small: typings.creditkeyJs.creditkeyJsStrings.small = "small".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.small]
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.creditkeyJs.creditkeyJsStrings.declined
    - typings.creditkeyJs.creditkeyJsStrings.pending
    - typings.creditkeyJs.creditkeyJsStrings.approved
  */
  trait Status extends StObject
  object Status {
    
    inline def approved: typings.creditkeyJs.creditkeyJsStrings.approved = "approved".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.approved]
    
    inline def declined: typings.creditkeyJs.creditkeyJsStrings.declined = "declined".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.declined]
    
    inline def pending: typings.creditkeyJs.creditkeyJsStrings.pending = "pending".asInstanceOf[typings.creditkeyJs.creditkeyJsStrings.pending]
  }
}
