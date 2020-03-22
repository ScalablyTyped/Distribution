package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountCreateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusinessRequest] = js.undefined
  var funding: MerchantFunding
  var id: js.UndefOr[String] = js.undefined
  var individual: MerchantIndividualRequest
  var masterMerchantAccountId: String
  var tosAccepted: Boolean
}

object MerchantAccountCreateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    individual: MerchantIndividualRequest,
    masterMerchantAccountId: String,
    tosAccepted: Boolean,
    business: MerchantBusinessRequest = null,
    id: String = null
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding.asInstanceOf[js.Any], individual = individual.asInstanceOf[js.Any], masterMerchantAccountId = masterMerchantAccountId.asInstanceOf[js.Any], tosAccepted = tosAccepted.asInstanceOf[js.Any])
    if (business != null) __obj.updateDynamic("business")(business.asInstanceOf[js.Any])
    if (id != null) __obj.updateDynamic("id")(id.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
}

