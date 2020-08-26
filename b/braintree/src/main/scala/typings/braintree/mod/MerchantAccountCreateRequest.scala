package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAccountCreateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusinessRequest] = js.native
  var funding: MerchantFunding = js.native
  var id: js.UndefOr[String] = js.native
  var individual: MerchantIndividualRequest = js.native
  var masterMerchantAccountId: String = js.native
  var tosAccepted: Boolean = js.native
}

object MerchantAccountCreateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String,
    tosAccepted: Boolean
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], tosAccepted = tosAccepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
  @scala.inline
  implicit class MerchantAccountCreateRequestOps[Self <: MerchantAccountCreateRequest] (val x: Self) extends AnyVal {
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
    def setFunding(value: MerchantFunding): Self = this.set("funding", value.asInstanceOf[js.Any])
    @scala.inline
    def setIndividual(value: MerchantIndividualRequest): Self = this.set("individual", value.asInstanceOf[js.Any])
    @scala.inline
    def setMasterMerchantAccountId(value: String): Self = this.set("masterMerchantAccountId", value.asInstanceOf[js.Any])
    @scala.inline
    def setTosAccepted(value: Boolean): Self = this.set("tosAccepted", value.asInstanceOf[js.Any])
    @scala.inline
    def setBusiness(value: MerchantBusinessRequest): Self = this.set("business", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteBusiness: Self = this.set("business", js.undefined)
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId: Self = this.set("id", js.undefined)
  }
  
}

