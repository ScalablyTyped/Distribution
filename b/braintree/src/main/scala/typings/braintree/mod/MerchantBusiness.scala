package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantBusiness extends js.Object {
  var address: js.UndefOr[MerchantAddressDetails] = js.undefined
  var addressDetails: js.UndefOr[MerchantAddressDetails] = js.undefined
  var dbaName: js.UndefOr[String] = js.undefined
  var legalName: js.UndefOr[String] = js.undefined
  var taxId: js.UndefOr[String] = js.undefined
}

object MerchantBusiness {
  @scala.inline
  def apply(
    address: MerchantAddressDetails = null,
    addressDetails: MerchantAddressDetails = null,
    dbaName: String = null,
    legalName: String = null,
    taxId: String = null
  ): MerchantBusiness = {
    val __obj = js.Dynamic.literal()
    if (address != null) __obj.updateDynamic("address")(address.asInstanceOf[js.Any])
    if (addressDetails != null) __obj.updateDynamic("addressDetails")(addressDetails.asInstanceOf[js.Any])
    if (dbaName != null) __obj.updateDynamic("dbaName")(dbaName.asInstanceOf[js.Any])
    if (legalName != null) __obj.updateDynamic("legalName")(legalName.asInstanceOf[js.Any])
    if (taxId != null) __obj.updateDynamic("taxId")(taxId.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantBusiness]
  }
}

