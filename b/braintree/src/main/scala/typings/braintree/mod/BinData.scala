package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait BinData extends js.Object {
  var commercial: js.UndefOr[Commercial] = js.native
  var countryOfIssuance: js.UndefOr[String] = js.native
  var debit: js.UndefOr[Debit] = js.native
  var durbinRegulated: js.UndefOr[DurbinRegulated] = js.native
  var healthcare: js.UndefOr[HealthCare] = js.native
  var issuingBank: js.UndefOr[String] = js.native
  var payroll: js.UndefOr[Payroll] = js.native
  var prepaid: js.UndefOr[Prepaid] = js.native
  var productId: js.UndefOr[String] = js.native
}

object BinData {
  @scala.inline
  def apply(): BinData = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[BinData]
  }
  @scala.inline
  implicit class BinDataOps[Self <: BinData] (val x: Self) extends AnyVal {
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
    def setCommercial(value: Commercial): Self = this.set("commercial", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommercial: Self = this.set("commercial", js.undefined)
    @scala.inline
    def setCountryOfIssuance(value: String): Self = this.set("countryOfIssuance", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCountryOfIssuance: Self = this.set("countryOfIssuance", js.undefined)
    @scala.inline
    def setDebit(value: Debit): Self = this.set("debit", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDebit: Self = this.set("debit", js.undefined)
    @scala.inline
    def setDurbinRegulated(value: DurbinRegulated): Self = this.set("durbinRegulated", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDurbinRegulated: Self = this.set("durbinRegulated", js.undefined)
    @scala.inline
    def setHealthcare(value: HealthCare): Self = this.set("healthcare", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteHealthcare: Self = this.set("healthcare", js.undefined)
    @scala.inline
    def setIssuingBank(value: String): Self = this.set("issuingBank", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuingBank: Self = this.set("issuingBank", js.undefined)
    @scala.inline
    def setPayroll(value: Payroll): Self = this.set("payroll", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePayroll: Self = this.set("payroll", js.undefined)
    @scala.inline
    def setPrepaid(value: Prepaid): Self = this.set("prepaid", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePrepaid: Self = this.set("prepaid", js.undefined)
    @scala.inline
    def setProductId(value: String): Self = this.set("productId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteProductId: Self = this.set("productId", js.undefined)
  }
  
}

