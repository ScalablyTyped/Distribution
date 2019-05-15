package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
  var id: java.lang.String
  /**
    * Price in local fiat currency.
    */
  var local_price: js.UndefOr[Price[FiatCurrency]] = js.undefined
  /**
    * Checkout image URL.
    */
  var logo_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Resource name.
    */
  var resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.checkout
}

object CheckoutResource {
  @scala.inline
  def apply(
    description: java.lang.String,
    id: java.lang.String,
    name: java.lang.String,
    pricing_type: PricingType,
    resource: coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.checkout,
    local_price: Price[FiatCurrency] = null,
    logo_url: java.lang.String = null,
    requested_info: js.Array[
      coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.email | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.name
    ] = null
  ): CheckoutResource = {
    val __obj = js.Dynamic.literal(description = description, id = id, name = name, pricing_type = pricing_type, resource = resource)
    if (local_price != null) __obj.updateDynamic("local_price")(local_price)
    if (logo_url != null) __obj.updateDynamic("logo_url")(logo_url)
    if (requested_info != null) __obj.updateDynamic("requested_info")(requested_info)
    __obj.asInstanceOf[CheckoutResource]
  }
}

