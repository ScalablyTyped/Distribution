package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DoNotInheritAddOnsOrDiscounts extends js.Object {
  var doNotInheritAddOnsOrDiscounts: js.UndefOr[Boolean] = js.native
  var paypal: js.UndefOr[Description] = js.native
  var startImmediately: js.UndefOr[Boolean] = js.native
}

object DoNotInheritAddOnsOrDiscounts {
  @scala.inline
  def apply(): DoNotInheritAddOnsOrDiscounts = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DoNotInheritAddOnsOrDiscounts]
  }
  @scala.inline
  implicit class DoNotInheritAddOnsOrDiscountsOps[Self <: DoNotInheritAddOnsOrDiscounts] (val x: Self) extends AnyVal {
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
    def setDoNotInheritAddOnsOrDiscounts(value: Boolean): Self = this.set("doNotInheritAddOnsOrDiscounts", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDoNotInheritAddOnsOrDiscounts: Self = this.set("doNotInheritAddOnsOrDiscounts", js.undefined)
    @scala.inline
    def setPaypal(value: Description): Self = this.set("paypal", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePaypal: Self = this.set("paypal", js.undefined)
    @scala.inline
    def setStartImmediately(value: Boolean): Self = this.set("startImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStartImmediately: Self = this.set("startImmediately", js.undefined)
  }
  
}

