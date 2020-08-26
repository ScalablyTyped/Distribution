package typings.coinbaseCommerceNode.mod

import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.email
import typings.coinbaseCommerceNode.coinbaseCommerceNodeStrings.name
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Base checkout properties.
  */
@js.native
trait BaseCheckout extends js.Object {
  /**
    * More detailed description.
    * 200 characters or less.
    */
  var description: String = js.native
  /**
    * Checkout name.
    * 100 characters or less.
    */
  var name: String = js.native
  /**
    * Checkout pricing type.
    */
  var pricing_type: PricingType = js.native
  /**
    * Information to collect from the customer.
    */
  var requested_info: js.UndefOr[js.Array[email | name]] = js.native
}

object BaseCheckout {
  @scala.inline
  def apply(description: String, name: String, pricing_type: PricingType): BaseCheckout = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], pricing_type = pricing_type.asInstanceOf[js.Any])
    __obj.asInstanceOf[BaseCheckout]
  }
  @scala.inline
  implicit class BaseCheckoutOps[Self <: BaseCheckout] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPricing_type(value: PricingType): Self = this.set("pricing_type", value.asInstanceOf[js.Any])
    @scala.inline
    def setRequested_infoVarargs(value: (email | name)*): Self = this.set("requested_info", js.Array(value :_*))
    @scala.inline
    def setRequested_info(value: js.Array[email | name]): Self = this.set("requested_info", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRequested_info: Self = this.set("requested_info", js.undefined)
  }
  
}

