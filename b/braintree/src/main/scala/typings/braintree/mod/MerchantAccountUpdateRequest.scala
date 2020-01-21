package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountUpdateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusiness] = js.undefined
  var funding: MerchantFunding
  var id: String
  var individual: MerchantIndividual
  var masterMerchantAccountId: String
  var status: MerchantAccountStatus
}

object MerchantAccountUpdateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: String,
    individual: MerchantIndividual,
    masterMerchantAccountId: String,
    status: MerchantAccountStatus,
    business: MerchantBusiness = null
  ): MerchantAccountUpdateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
}

