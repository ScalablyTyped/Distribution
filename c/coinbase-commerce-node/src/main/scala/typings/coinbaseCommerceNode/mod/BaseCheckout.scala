package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.email
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base checkout properties.
  */
trait BaseCheckout extends js.Object {
  /**
    * More detailed description.
    * 200 characters or less.
    */
  var description: String
  /**
    * Checkout name.
    * 100 characters or less.
    */
  var name: String
  /**
    * Checkout pricing type.
    */
  var pricing_type: PricingType
  /**
    * Information to collect from the customer.
    */
  var requested_info: js.UndefOr[js.Array[email | name]] = js.undefined
}

object BaseCheckout {
  @scala.inline
  def apply(
    description: String,
    name: String,
    pricing_type: PricingType,
    requested_info: js.Array[email | name] = null
  ): BaseCheckout = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    if (requested_info != null) __obj.updateDynamic("requested_info")(requested_info.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCheckout]
  }
}

