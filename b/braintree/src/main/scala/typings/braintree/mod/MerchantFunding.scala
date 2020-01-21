package typings.braintree.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantFunding extends js.Object {
  var accountNumber: js.UndefOr[String] = js.undefined
  var accountNumberLast4: js.UndefOr[String] = js.undefined
  var descriptor: js.UndefOr[String] = js.undefined
  var destination: String
  var email: js.UndefOr[String] = js.undefined
  var mobilePhone: js.UndefOr[String] = js.undefined
  var routingNumber: js.UndefOr[String] = js.undefined
}

object MerchantFunding {
  @scala.inline
  def apply(
    destination: String,
    accountNumber: String = null,
    accountNumberLast4: String = null,
    descriptor: String = null,
    email: String = null,
    mobilePhone: String = null,
    routingNumber: String = null
  ): MerchantFunding = {
    val __obj = js.Dynamic.literal(destination = destination.asInstanceOf[js.Any])
    if (accountNumber != null) __obj.updateDynamic("accountNumber")(accountNumber.asInstanceOf[js.Any])
    if (accountNumberLast4 != null) __obj.updateDynamic("accountNumberLast4")(accountNumberLast4.asInstanceOf[js.Any])
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone.asInstanceOf[js.Any])
    if (routingNumber != null) __obj.updateDynamic("routingNumber")(routingNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[MerchantFunding]
  }
}

