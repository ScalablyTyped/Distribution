package typings.checCommerceJs

import typings.checCommerceJs.featuresCartMod.Cart
import typings.checCommerceJs.featuresCartMod.RequestMethod
import typings.checCommerceJs.featuresCategoriesMod.Categories
import typings.checCommerceJs.featuresCheckoutMod.Checkout
import typings.checCommerceJs.featuresCustomerMod.Customer
import typings.checCommerceJs.featuresMerchantsMod.Merchants
import typings.checCommerceJs.featuresProductsMod.Products
import typings.checCommerceJs.featuresServicesMod.Services
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@chec/commerce.js", JSImport.Namespace)
  @js.native
  open class ^ protected ()
    extends StObject
       with Commerce {
    def this(publicKey: String) = this()
    def this(publicKey: String, debug: Boolean) = this()
    def this(publicKey: String, debug: Boolean, config: CommerceConfig) = this()
    def this(publicKey: String, debug: Unit, config: CommerceConfig) = this()
  }
  
  @js.native
  trait Commerce extends StObject {
    
    var cart: Cart = js.native
    
    var categories: Categories = js.native
    
    var checkout: Checkout = js.native
    
    var customer: Customer = js.native
    
    def error(response: Any): Unit | js.Array[Double] = js.native
    
    var merchants: Merchants = js.native
    
    var products: Products = js.native
    
    def request(endpoint: String): Any = js.native
    def request(endpoint: String, method: Unit, data: js.Object): Any = js.native
    def request(endpoint: String, method: Unit, data: js.Object, extraHeaders: Any): Any = js.native
    def request(endpoint: String, method: Unit, data: js.Object, extraHeaders: Any, returnFullResponse: Boolean): Any = js.native
    def request(endpoint: String, method: Unit, data: js.Object, extraHeaders: Unit, returnFullResponse: Boolean): Any = js.native
    def request(endpoint: String, method: Unit, data: Unit, extraHeaders: Any): Any = js.native
    def request(endpoint: String, method: Unit, data: Unit, extraHeaders: Any, returnFullResponse: Boolean): Any = js.native
    def request(endpoint: String, method: Unit, data: Unit, extraHeaders: Unit, returnFullResponse: Boolean): Any = js.native
    def request(endpoint: String, method: RequestMethod): Any = js.native
    def request(endpoint: String, method: RequestMethod, data: js.Object): Any = js.native
    def request(endpoint: String, method: RequestMethod, data: js.Object, extraHeaders: Any): Any = js.native
    def request(
      endpoint: String,
      method: RequestMethod,
      data: js.Object,
      extraHeaders: Any,
      returnFullResponse: Boolean
    ): Any = js.native
    def request(
      endpoint: String,
      method: RequestMethod,
      data: js.Object,
      extraHeaders: Unit,
      returnFullResponse: Boolean
    ): Any = js.native
    def request(endpoint: String, method: RequestMethod, data: Unit, extraHeaders: Any): Any = js.native
    def request(
      endpoint: String,
      method: RequestMethod,
      data: Unit,
      extraHeaders: Any,
      returnFullResponse: Boolean
    ): Any = js.native
    def request(
      endpoint: String,
      method: RequestMethod,
      data: Unit,
      extraHeaders: Unit,
      returnFullResponse: Boolean
    ): Any = js.native
    
    var services: Services = js.native
  }
  
  trait CommerceConfig extends StObject {
    
    var axiosConfig: js.UndefOr[Any] = js.undefined
    
    var cartLifetime: js.UndefOr[Double] = js.undefined
    
    var disableStorage: js.UndefOr[Boolean] = js.undefined
    
    var timeoutMs: js.UndefOr[Double] = js.undefined
  }
  object CommerceConfig {
    
    inline def apply(): CommerceConfig = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommerceConfig]
    }
    
    extension [Self <: CommerceConfig](x: Self) {
      
      inline def setAxiosConfig(value: Any): Self = StObject.set(x, "axiosConfig", value.asInstanceOf[js.Any])
      
      inline def setAxiosConfigUndefined: Self = StObject.set(x, "axiosConfig", js.undefined)
      
      inline def setCartLifetime(value: Double): Self = StObject.set(x, "cartLifetime", value.asInstanceOf[js.Any])
      
      inline def setCartLifetimeUndefined: Self = StObject.set(x, "cartLifetime", js.undefined)
      
      inline def setDisableStorage(value: Boolean): Self = StObject.set(x, "disableStorage", value.asInstanceOf[js.Any])
      
      inline def setDisableStorageUndefined: Self = StObject.set(x, "disableStorage", js.undefined)
      
      inline def setTimeoutMs(value: Double): Self = StObject.set(x, "timeoutMs", value.asInstanceOf[js.Any])
      
      inline def setTimeoutMsUndefined: Self = StObject.set(x, "timeoutMs", js.undefined)
    }
  }
}
