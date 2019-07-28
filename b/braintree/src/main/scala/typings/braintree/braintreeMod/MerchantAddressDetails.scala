package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAddressDetails extends js.Object {
  var locality: String
  var postalCode: String
  var region: String
  var streetAddress: String
}

object MerchantAddressDetails {
  @scala.inline
  def apply(locality: String, postalCode: String, region: String, streetAddress: String): MerchantAddressDetails = {
    val __obj = js.Dynamic.literal(locality = locality, postalCode = postalCode, region = region, streetAddress = streetAddress)
  
    __obj.asInstanceOf[MerchantAddressDetails]
  }
}

