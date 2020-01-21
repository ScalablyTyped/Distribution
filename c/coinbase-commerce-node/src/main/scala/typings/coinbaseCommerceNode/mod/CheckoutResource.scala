package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.checkout
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.email
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Checkout Resource.
  *
  * @link https://commerce.coinbase.com/docs/api/#checkout-resource
  */
trait CheckoutResource extends BaseCheckout {
  /**
    * Checkout UUID.
    */
  var id: String
  /**
    * Price in local fiat currency.
    */
  var local_price: js.UndefOr[Price[FiatCurrency]] = js.undefined
  /**
    * Checkout image URL.
    */
  var logo_url: js.UndefOr[String] = js.undefined
  /**
    * Resource name.
    */
  var resource: checkout
}

object CheckoutResource {
  @scala.inline
  def apply(
    description: String,
    id: String,
    name: String,
    pricing_type: PricingType,
    resource: checkout,
    local_price: Price[FiatCurrency] = null,
    logo_url: String = null,
    requested_info: js.Array[email | name] = null
  ): CheckoutResource = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any], resource = resource.asInstanceOf[js.Any])
    if (local_price != null) __obj.updateDynamic("local_price")(local_price.asInstanceOf[js.Any])
    if (logo_url != null) __obj.updateDynamic("logo_url")(logo_url.asInstanceOf[js.Any])
    if (requested_info != null) __obj.updateDynamic("requested_info")(requested_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[CheckoutResource]
  }
}

