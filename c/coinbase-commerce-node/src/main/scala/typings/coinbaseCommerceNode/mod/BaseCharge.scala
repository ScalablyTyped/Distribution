package typings.coinbaseCommerceNode.mod

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
  var cancel_url: js.UndefOr[String] = js.undefined
  /**
    * More detailed description of the charge.
    * 200 characters or less.
    */
  var description: String
  /**
    * Optional key value pairs for your own use.
    */
  var metadata: js.UndefOr[KeyVal] = js.undefined
  /**
    * Charge name.
    * 100 characters or less.
    */
  var name: String
  /**
    * Charge pricing type.
    */
  var pricing_type: PricingType
  /**
    * Redirect the user to this URL on completion.
    */
  var redirect_url: js.UndefOr[String] = js.undefined
}

object BaseCharge {
  @scala.inline
  def apply(
    description: String,
    name: String,
    pricing_type: PricingType,
    cancel_url: String = null,
    metadata: KeyVal = null,
    redirect_url: String = null
  ): BaseCharge = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    if (cancel_url != null) __obj.updateDynamic("cancel_url")(cancel_url.asInstanceOf[js.Any])
    if (metadata != null) __obj.updateDynamic("metadata")(metadata.asInstanceOf[js.Any])
    if (redirect_url != null) __obj.updateDynamic("redirect_url")(redirect_url.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCharge]
  }
}

