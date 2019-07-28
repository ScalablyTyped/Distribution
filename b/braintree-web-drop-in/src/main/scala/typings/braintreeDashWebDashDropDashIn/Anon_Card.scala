package typings.braintreeDashWebDashDropDashIn

import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.card
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.paypal
import typings.braintreeDashWebDashDropDashIn.braintreeDashWebDashDropDashInStrings.paypalCredit
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Card extends js.Object {
  var paymentOption: card | paypal | paypalCredit
}

object Anon_Card {
  @scala.inline
  def apply(paymentOption: card | paypal | paypalCredit): Anon_Card = {
    val __obj = js.Dynamic.literal(paymentOption = paymentOption.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Card]
  }
}

