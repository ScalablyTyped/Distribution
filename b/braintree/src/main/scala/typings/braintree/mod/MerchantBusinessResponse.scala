package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantBusinessResponse extends js.Object {
  var addressDetails: js.UndefOr[MerchantAddressDetails] = js.undefined
  var dbaName: js.UndefOr[String] = js.undefined
  var legalName: js.UndefOr[String] = js.undefined
  var taxId: js.UndefOr[String] = js.undefined
}

object MerchantBusinessResponse {
  @scala.inline
  def apply(
    addressDetails: MerchantAddressDetails = null,
    dbaName: String = null,
    legalName: String = null,
    taxId: String = null
  ): MerchantBusinessResponse = {
    val __obj = js.Dynamic.literal()
    if (addressDetails != null) __obj.updateDynamic("addressDetails")(addressDetails.asInstanceOf[js.Any])
    if (dbaName != null) __obj.updateDynamic("dbaName")(dbaName.asInstanceOf[js.Any])
    if (legalName != null) __obj.updateDynamic("legalName")(legalName.asInstanceOf[js.Any])
    if (taxId != null) __obj.updateDynamic("taxId")(taxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantBusinessResponse]
  }
}

