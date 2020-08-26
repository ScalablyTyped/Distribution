package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AmexPayWithPoints extends js.Object {
  var AmexPayWithPoints: IneligibleCard = js.native
  var CardTypeIndicators: Debit = js.native
  var Dispute: Chargeback = js.native
}

object AmexPayWithPoints {
  @scala.inline
  def apply(AmexPayWithPoints: IneligibleCard, CardTypeIndicators: Debit, Dispute: Chargeback): AmexPayWithPoints = {
    val __obj = js.Dynamic.literal(AmexPayWithPoints = AmexPayWithPoints.asInstanceOf[js.Any], CardTypeIndicators = CardTypeIndicators.asInstanceOf[js.Any], Dispute = Dispute.asInstanceOf[js.Any])
    __obj.asInstanceOf[AmexPayWithPoints]
  }
  @scala.inline
  implicit class AmexPayWithPointsOps[Self <: AmexPayWithPoints] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAmexPayWithPoints(value: IneligibleCard): Self = this.set("AmexPayWithPoints", value.asInstanceOf[js.Any])
    @scala.inline
    def setCardTypeIndicators(value: Debit): Self = this.set("CardTypeIndicators", value.asInstanceOf[js.Any])
    @scala.inline
    def setDispute(value: Chargeback): Self = this.set("Dispute", value.asInstanceOf[js.Any])
  }
  
}

