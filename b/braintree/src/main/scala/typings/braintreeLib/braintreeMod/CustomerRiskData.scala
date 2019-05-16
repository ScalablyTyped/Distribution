package typings
package braintreeLib.braintreeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait CustomerRiskData extends js.Object {
  var customerBrowser: js.UndefOr[java.lang.String] = js.undefined
  var customerIp: js.UndefOr[java.lang.String] = js.undefined
}

object CustomerRiskData {
  @scala.inline
  def apply(customerBrowser: java.lang.String = null, customerIp: java.lang.String = null): CustomerRiskData = {
    val __obj = js.Dynamic.literal()
    if (customerBrowser != null) __obj.updateDynamic("customerBrowser")(customerBrowser)
    if (customerIp != null) __obj.updateDynamic("customerIp")(customerIp)
    __obj.asInstanceOf[CustomerRiskData]
  }
}

