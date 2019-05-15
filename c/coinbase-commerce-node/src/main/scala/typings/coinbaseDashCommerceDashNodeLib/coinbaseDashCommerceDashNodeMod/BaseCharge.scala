package typings
package coinbaseDashCommerceDashNodeLib.coinbaseDashCommerceDashNodeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base charge properties.
  */
trait BaseCharge extends js.Object {
  /**
    * Redirect the user to this URL on cancel.
    */
  var cancel_url: js.UndefOr[java.lang.String] = js.undefined
  /**
    * More detailed description of the charge.
    * 200 characters or less.
    */
  var description: java.lang.String
  /**
    * Optional key value pairs for your own use.
    */
  var metadata: js.UndefOr[KeyVal] = js.undefined
  /**
    * Charge name.
    * 100 characters or less.
    */
  var name: java.lang.String
  /**
    * Charge pricing type.
    */
  var pricing_type: PricingType
  /**
    * Redirect the user to this URL on completion.
    */
  var redirect_url: js.UndefOr[java.lang.String] = js.undefined
}

object BaseCharge {
  @scala.inline
  def apply(
    description: java.lang.String,
    name: java.lang.String,
    pricing_type: PricingType,
    cancel_url: java.lang.String = null,
    metadata: KeyVal = null,
    redirect_url: java.lang.String = null
  ): BaseCharge = {
    val __obj = js.Dynamic.literal(description = description, name = name, pricing_type = pricing_type)
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url)
    if (metadata != null) __obj.updateDynamic("metadata")(metadata)
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url)
    __obj.asInstanceOf[BaseCharge]
  }
}

