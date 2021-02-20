package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.checkout
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Checkout Resource.
  *
  * @link https://commerce.coinbase.com/docs/api/#checkout-resource
  */
@js.native
trait CheckoutResource extends BaseCheckout {
  
  /**
    * Checkout UUID.
    */
  var id: String = js.native
  
  /**
    * Price in local fiat currency.
    */
  var local_price: js.UndefOr[Price[FiatCurrency]] = js.native
  
  /**
    * Checkout image URL.
    */
  var logo_url: js.UndefOr[String] = js.native
  
  /**
    * Resource name.
    */
  var resource: checkout = js.native
}
object CheckoutResource {
  
  @scala.inline
  def apply(description: String, id: String, name: String, pricing_type: PricingType, resource: checkout): CheckoutResource = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutResource]
  }
  
  @scala.inline
  implicit class CheckoutResourceMutableBuilder[Self <: CheckoutResource] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_price(value: Price[FiatCurrency]): Self = StObject.set(x, "local_price", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLocal_priceUndefined: Self = StObject.set(x, "local_price", js.undefined)
    
    @scala.inline
    def setLogo_url(value: String): Self = StObject.set(x, "logo_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLogo_urlUndefined: Self = StObject.set(x, "logo_url", js.undefined)
    
    @scala.inline
    def setResource(value: checkout): Self = StObject.set(x, "resource", value.asInstanceOf[js.Any])
  }
}
