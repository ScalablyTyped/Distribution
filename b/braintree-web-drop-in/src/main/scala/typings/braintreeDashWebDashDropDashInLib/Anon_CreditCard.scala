package typings
package braintreeDashWebDashDropDashInLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_CreditCard extends js.Object {
  var paymentMethodIsSelected: scala.Boolean
  var `type`: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.CreditCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.PayPalAccount
}

object Anon_CreditCard {
  @scala.inline
  def apply(
    paymentMethodIsSelected: scala.Boolean,
    `type`: braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.CreditCard | braintreeDashWebDashDropDashInLib.braintreeDashWebDashDropDashInLibStrings.PayPalAccount
  ): Anon_CreditCard = {
    val __obj = js.Dynamic.literal(paymentMethodIsSelected = paymentMethodIsSelected)
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_CreditCard]
  }
}

