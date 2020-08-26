package typings.braintree.anon

import typings.braintree.mod.DurbinRegulated
import typings.braintree.mod.HealthCare
import typings.braintree.mod.Payroll
import typings.braintree.mod.Prepaid
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait CardholderName extends js.Object {
  var bin: String = js.native
  var cardType: String = js.native
  var cardholderName: js.UndefOr[String] = js.native
  var commercial: typings.braintree.mod.Commercial = js.native
  var countryOfIssuance: String = js.native
  var customerLocation: typings.braintree.mod.CustomerLocation = js.native
  var debit: String = js.native
  var durbinRegulated: DurbinRegulated = js.native
  var expirationDate: js.UndefOr[String] = js.native
  var expirationMonth: js.UndefOr[String] = js.native
  var expirationYear: js.UndefOr[String] = js.native
  var healthcare: HealthCare = js.native
  var imageUrl: js.UndefOr[String] = js.native
  var issuingBank: String = js.native
  var last4: String = js.native
  var maskedNumber: js.UndefOr[String] = js.native
  var payroll: Payroll = js.native
  var prepaid: Prepaid = js.native
  var productId: String = js.native
  var token: String = js.native
  var uniqueNumberIdentifier: String = js.native
}

object CardholderName {
  @scala.inline
  def apply(
    bin: String,
    cardType: String,
    commercial: typings.braintree.mod.Commercial,
    countryOfIssuance: String,
    customerLocation: typings.braintree.mod.CustomerLocation,
    debit: String,
    durbinRegulated: DurbinRegulated,
    healthcare: HealthCare,
    issuingBank: String,
    last4: String,
    payroll: Payroll,
    prepaid: Prepaid,
    productId: String,
    token: String,
    uniqueNumberIdentifier: String
  ): CardholderName = {
    val __obj = js.Dynamic.literal(bin = bin.asInstanceOf[js.Any], cardType = cardType.asInstanceOf[js.Any], commercial = commercial.asInstanceOf[js.Any], countryOfIssuance = countryOfIssuance.asInstanceOf[js.Any], customerLocation = customerLocation.asInstanceOf[js.Any], debit = debit.asInstanceOf[js.Any], durbinRegulated = durbinRegulated.asInstanceOf[js.Any], healthcare = healthcare.asInstanceOf[js.Any], issuingBank = issuingBank.asInstanceOf[js.Any], last4 = last4.asInstanceOf[js.Any], payroll = payroll.asInstanceOf[js.Any], prepaid = prepaid.asInstanceOf[js.Any], productId = productId.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], uniqueNumberIdentifier = uniqueNumberIdentifier.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardholderName]
  }
  @scala.inline
  implicit class CardholderNameOps[Self <: CardholderName] (val x: Self) extends AnyVal {
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
    def setCardType(value: String): Self = this.set("cardType", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommercial(value: typings.braintree.mod.Commercial): Self = this.set("commercial", value.asInstanceOf[js.Any])
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    @scala.inline
    def setCustomerLocation(value: typings.braintree.mod.CustomerLocation): Self = this.set("customerLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setDebit(value: String): Self = this.set("debit", value.asInstanceOf[js.Any])
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    @scala.inline
    def setHealthcare(value: HealthCare): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("issuingBank", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast4(value: String): Self = this.set("last4", value.asInstanceOf[js.Any])
    @scala.inline
    def setPayroll(value: Payroll): Self = this.set("payroll", value.asInstanceOf[js.Any])
    @scala.inline
    def setPrepaid(value: Prepaid): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setUniqueNumberIdentifier(value: String): Self = this.set("uniqueNumberIdentifier", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardholderName(value: String): Self = this.set("cardholderName", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCardholderName: Self = this.set("cardholderName", js.undefined)
    @scala.inline
    def setExpirationDate(value: String): Self = this.set("expirationDate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationDate: Self = this.set("expirationDate", js.undefined)
    @scala.inline
    def setExpirationMonth(value: String): Self = this.set("expirationMonth", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationMonth: Self = this.set("expirationMonth", js.undefined)
    @scala.inline
    def setExpirationYear(value: String): Self = this.set("expirationYear", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExpirationYear: Self = this.set("expirationYear", js.undefined)
    @scala.inline
    def setImageUrl(value: String): Self = this.set("imageUrl", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImageUrl: Self = this.set("imageUrl", js.undefined)
    @scala.inline
    def setMaskedNumber(value: String): Self = this.set("maskedNumber", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaskedNumber: Self = this.set("maskedNumber", js.undefined)
  }
  
}

