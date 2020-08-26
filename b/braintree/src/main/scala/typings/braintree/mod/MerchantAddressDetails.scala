package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MerchantAddressDetails extends js.Object {
  var locality: String = js.native
  var postalCode: String = js.native
  var region: String = js.native
  var streetAddress: String = js.native
}

object MerchantAddressDetails {
  @scala.inline
  def apply(locality: String, postalCode: String, region: String, streetAddress: String): MerchantAddressDetails = {
    val __obj = js.Dynamic.literal(locality = locality.asInstanceOf[js.Any], postalCode = postalCode.asInstanceOf[js.Any], region = region.asInstanceOf[js.Any], streetAddress = streetAddress.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantAddressDetails]
  }
  @scala.inline
  implicit class MerchantAddressDetailsOps[Self <: MerchantAddressDetails] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    @scala.inline
    def setRegion(value: String): Self = this.set("region", value.asInstanceOf[js.Any])
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
  }
  
}

