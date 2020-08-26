package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DiscountUpdateRequest extends js.Object {
  var amount: js.UndefOr[String] = js.native
  var existingId: String = js.native
  var neverExpires: js.UndefOr[Boolean] = js.native
  var numberOfBillingCycles: js.UndefOr[Double] = js.native
  var quantity: js.UndefOr[Double] = js.native
}

object DiscountUpdateRequest {
  @scala.inline
  def apply(existingId: String): DiscountUpdateRequest = {
    val __obj = js.Dynamic.literal(existingId = existingId.asInstanceOf[js.Any])
    __obj.asInstanceOf[DiscountUpdateRequest]
  }
  @scala.inline
  implicit class DiscountUpdateRequestOps[Self <: DiscountUpdateRequest] (val x: Self) extends AnyVal {
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
    def setExistingId(value: String): Self = this.set("existingId", value.asInstanceOf[js.Any])
    @scala.inline
    def setAmount(value: String): Self = this.set("amount", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAmount: Self = this.set("amount", js.undefined)
    @scala.inline
    def setNeverExpires(value: Boolean): Self = this.set("neverExpires", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNeverExpires: Self = this.set("neverExpires", js.undefined)
    @scala.inline
    def setNumberOfBillingCycles(value: Double): Self = this.set("numberOfBillingCycles", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNumberOfBillingCycles: Self = this.set("numberOfBillingCycles", js.undefined)
    @scala.inline
    def setQuantity(value: Double): Self = this.set("quantity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteQuantity: Self = this.set("quantity", js.undefined)
  }
  
}

