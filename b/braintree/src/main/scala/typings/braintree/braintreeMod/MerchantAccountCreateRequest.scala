package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountCreateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusiness] = js.undefined
  var funding: MerchantFunding
  var id: String
  var individual: MerchantIndividual
  var masterMerchantAccountId: String
  var status: MerchantAccountStatus
  var tosAccepted: Boolean
}

object MerchantAccountCreateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: String,
    individual: MerchantIndividual,
    masterMerchantAccountId: String,
    status: MerchantAccountStatus,
    tosAccepted: Boolean,
    business: MerchantBusiness = null
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any], tosAccepted = tosAccepted.asInstanceOf[js.Any])
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
}

