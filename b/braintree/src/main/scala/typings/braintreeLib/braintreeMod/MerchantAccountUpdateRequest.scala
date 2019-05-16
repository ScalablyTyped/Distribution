package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountUpdateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusiness] = js.undefined
  var funding: MerchantFunding
  var id: java.lang.String
  var individual: MerchantIndividual
  var masterMerchantAccountId: java.lang.String
  var status: MerchantAccountStatus
}

object MerchantAccountUpdateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: java.lang.String,
    individual: MerchantIndividual,
    masterMerchantAccountId: java.lang.String,
    status: MerchantAccountStatus,
    business: MerchantBusiness = null
  ): MerchantAccountUpdateRequest = {
    val __obj = js.Dynamic.literal(funding = funding, id = id, individual = individual, masterMerchantAccountId = masterMerchantAccountId, status = status)
    if (business != null) __obj.updateDynamic("business")(business)
    __obj.asInstanceOf[MerchantAccountUpdateRequest]
  }
}

