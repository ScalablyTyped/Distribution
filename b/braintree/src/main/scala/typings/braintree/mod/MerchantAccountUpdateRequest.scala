package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountUpdateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusinessRequest] = js.undefined
  var funding: MerchantFunding
  var id: String
  var individual: MerchantIndividualRequest
  var masterMerchantAccountId: String
}

object MerchantAccountUpdateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: String,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String,
    business: MerchantBusinessRequest = null
  ): MerchantAccountUpdateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any])
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
}

