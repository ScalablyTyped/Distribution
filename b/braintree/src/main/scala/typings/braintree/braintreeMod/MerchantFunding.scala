package typings.braintree.braintreeMod

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
    val __obj = js.Dynamic.literal(destination = destination)
    if (accountNumber != null) __obj.updateDynamic("accountNumber")(accountNumber)
    if (accountNumberLast4 != null) __obj.updateDynamic("accountNumberLast4")(accountNumberLast4)
    if (descriptor != null) __obj.updateDynamic("descriptor")(descriptor)
    if (email != null) __obj.updateDynamic("email")(email)
    if (mobilePhone != null) __obj.updateDynamic("mobilePhone")(mobilePhone)
    if (routingNumber != null) __obj.updateDynamic("routingNumber")(routingNumber)
    __obj.asInstanceOf[MerchantFunding]
  }
}

