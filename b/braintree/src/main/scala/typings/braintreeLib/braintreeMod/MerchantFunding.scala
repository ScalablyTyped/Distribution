package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MerchantFunding extends js.Object {
  var accountNumber: js.UndefOr[java.lang.String] = js.undefined
  var accountNumberLast4: js.UndefOr[java.lang.String] = js.undefined
  var descriptor: js.UndefOr[java.lang.String] = js.undefined
  var destination: java.lang.String
  var email: js.UndefOr[java.lang.String] = js.undefined
  var mobilePhone: js.UndefOr[java.lang.String] = js.undefined
  var routingNumber: js.UndefOr[java.lang.String] = js.undefined
}

object MerchantFunding {
  @scala.inline
  def apply(
    destination: java.lang.String,
    accountNumber: java.lang.String = null,
    accountNumberLast4: java.lang.String = null,
    descriptor: java.lang.String = null,
    email: java.lang.String = null,
    mobilePhone: java.lang.String = null,
    routingNumber: java.lang.String = null
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

