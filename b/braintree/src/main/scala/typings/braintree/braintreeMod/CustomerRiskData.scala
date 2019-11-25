package typings.braintree.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerRiskData extends js.Object {
  var customerBrowser: js.UndefOr[String] = js.undefined
  var customerIp: js.UndefOr[String] = js.undefined
}

object CustomerRiskData {
  @scala.inline
  def apply(customerBrowser: String = null, customerIp: String = null): CustomerRiskData = {
    val __obj = js.Dynamic.literal()
    if (customerBrowser != null) __obj.updateDynamic("customerBrowser")(customerBrowser.asInstanceOf[js.Any])
    if (customerIp != null) __obj.updateDynamic("customerIp")(customerIp.asInstanceOf[js.Any])
    __obj.asInstanceOf[CustomerRiskData]
  }
}

