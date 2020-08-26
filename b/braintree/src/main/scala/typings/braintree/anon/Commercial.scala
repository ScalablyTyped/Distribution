package typings.braintree.anon

import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Commercial extends js.Object {
  var bin: String = js.native
  var commercial: typings.braintree.mod.Commercial = js.native
  var countryOfIssuance: String = js.native
  var debit: typings.braintree.mod.Debit = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationMonth: String = js.native
  var expirationYear: String = js.native
  var googleTransactionId: String = js.native
  var healthcare: HealthCare = js.native
  var imageUrl: String = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: String = js.native
  var sourceCardLast4: String = js.native
  var sourceCardType: String = js.native
  var sourceDescription: String = js.native
  var token: String = js.native
  var virtualCardLast4: String = js.native
  var virtualCardType: String = js.native
}

object Commercial {
  @scala.inline
  def apply(
    bin: String,
    commercial: typings.braintree.mod.Commercial,
    countryOfIssuance: String,
    debit: typings.braintree.mod.Debit,
    durbinRegulated: DurbinRegulated,
    expirationMonth: String,
    expirationYear: String,
    googleTransactionId: String,
    healthcare: HealthCare,
    imageUrl: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    sourceCardLast4: String,
    sourceCardType: String,
    sourceDescription: String,
    token: String,
    virtualCardLast4: String,
    virtualCardType: String
  ): Commercial = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], expirationMonth = expirationMonth.asInstanceOf[js.Any], expirationYear = expirationYear.asInstanceOf[js.Any], googleTransactionId = googleTransactionId.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], imageUrl = imageUrl.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], sourceCardLast4 = sourceCardLast4.asInstanceOf[js.Any], sourceCardType = sourceCardType.asInstanceOf[js.Any], sourceDescription = sourceDescription.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], virtualCardLast4 = virtualCardLast4.asInstanceOf[js.Any], virtualCardType = virtualCardType.asInstanceOf[js.Any])
    __obj.asInstanceOf[Commercial]
  }
  @scala.inline
  implicit class CommercialOps[Self <: Commercial] (val x: Self) extends AnyVal {
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
    def setBin(value: String): Self = this.set("bin", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommercial(value: typings.braintree.mod.Commercial): Self = this.set("commercial", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebit(value: typings.braintree.mod.Debit): Self = this.set("debit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def setGoogleTransactionId(value: String): Self = this.set("googleTransactionId", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthcare(value: HealthCare): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayroll(value: Payroll): Self = this.set("payroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepaid(value: Prepaid): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCardLast4(value: String): Self = this.set("sourceCardLast4", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceCardType(value: String): Self = this.set("sourceCardType", value.asInstanceOf[js.Any])
    @scala.inline
    def setSourceDescription(value: String): Self = this.set("sourceDescription", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualCardLast4(value: String): Self = this.set("virtualCardLast4", value.asInstanceOf[js.Any])
    @scala.inline
    def setVirtualCardType(value: String): Self = this.set("virtualCardType", value.asInstanceOf[js.Any])
  }
  
}

