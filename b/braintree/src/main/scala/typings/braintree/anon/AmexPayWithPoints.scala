package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: IneligibleCard
  var CardTypeIndicators: Debit
  var Dispute: Chargeback
}

object AmexPayWithPoints {
  @scala.inline
  def apply(AmexPayWithPoints: IneligibleCard, CardTypeIndicators: Debit, Dispute: Chargeback): AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmexPayWithPoints]
  }
}

