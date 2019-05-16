package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantAddressDetails extends js.Object {
  var locality: java.lang.String
  var postalCode: java.lang.String
  var region: java.lang.String
  var streetAddress: java.lang.String
}

object MerchantAddressDetails {
  @scala.inline
  def apply(
    locality: java.lang.String,
    postalCode: java.lang.String,
    region: java.lang.String,
    streetAddress: java.lang.String
  ): MerchantAddressDetails = {
    val __obj = js.Dynamic.literal(locality = locality, postalCode = postalCode, region = region, streetAddress = streetAddress)
  
    __obj.asInstanceOf[MerchantAddressDetails]
  }
}

