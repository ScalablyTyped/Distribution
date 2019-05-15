package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

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
  var description: java.lang.String
  /**
    * Checkout name.
    * 100 characters or less.
    */
  var name: java.lang.String
  /**
    * Checkout pricing type.
    */
  var pricing_type: PricingType
  /**
    * Information to collect from the customer.
    */
  var requested_info: js.UndefOr[
    js.Array[
      coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.email | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.name
    ]
  ] = js.undefined
}

object BaseCheckout {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    pricing_type: PricingType,
    requested_info: js.Array[
      coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.email | coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeLibStrings.name
    ] = null
  ): BaseCheckout = {
    val __obj = js.Dynamic.literal(description = description, name = name, pricing_type = pricing_type)
    if (requested_info != null) __obj.updateDynamic("requested_info")(requested_info)
    __obj.asInstanceOf[BaseCheckout]
  }
}

