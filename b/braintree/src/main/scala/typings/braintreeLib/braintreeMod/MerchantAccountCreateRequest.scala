package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAccountCreateRequest extends js.Object {
  var business: js.UndefOr[MerchantBusiness] = js.undefined
  var funding: MerchantFunding
  var id: java.lang.String
  var individual: MerchantIndividual
  var masterMerchantAccountId: java.lang.String
  var status: MerchantAccountStatus
  var tosAccepted: scala.Boolean
}

object MerchantAccountCreateRequest {
  @scala.inline
  def apply(
    funding: MerchantFunding,
    id: java.lang.String,
    individual: MerchantIndividual,
    masterMerchantAccountId: java.lang.String,
    status: MerchantAccountStatus,
    tosAccepted: scala.Boolean,
    business: MerchantBusiness = null
  ): MerchantAccountCreateRequest = {
    val __obj = js.Dynamic.literal(funding = funding, id = id, individual = individual, masterMerchantAccountId = masterMerchantAccountId, status = status, tosAccepted = tosAccepted)
    if (business != null) __obj.updateDynamic("business")(business)
    __obj.asInstanceOf[MerchantAccountCreateRequest]
  }
}

