package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonAmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: AnonIneligibleCard
  var CardTypeIndicators: AnonDebit
  var Dispute: AnonChargeback
}

object AnonAmexPayWithPoints {
  @scala.inline
  def apply(AmexPayWithPoints: AnonIneligibleCard, CardTypeIndicators: AnonDebit, Dispute: AnonChargeback): AnonAmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonAmexPayWithPoints]
  }
}

