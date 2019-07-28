package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(funding = funding, id = id, individual = individual, masterMerchantAccountId = masterMerchantAccountId, status = status)
    if (business != null) __obj.updateDynamic("business")(business)
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
}

