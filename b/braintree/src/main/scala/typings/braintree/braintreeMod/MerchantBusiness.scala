package typings.braintree.braintreeMod

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
    if (address != null) __obj.updateDynamic("address")(address)
    if (addressDetails != null) __obj.updateDynamic("addressDetails")(addressDetails)
    if (dbaName != null) __obj.updateDynamic("dbaName")(dbaName)
    if (legalName != null) __obj.updateDynamic("legalName")(legalName)
    if (taxId != null) __obj.updateDynamic("taxId")(taxId)
    __obj.asInstanceOf[MerchantBusiness]
  }
}

