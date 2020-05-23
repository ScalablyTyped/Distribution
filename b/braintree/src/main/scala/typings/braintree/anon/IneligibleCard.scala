package typings.braintree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IneligibleCard extends js.Object {
  var IneligibleCard: String
  var InsufficientPoints: String
  var Success: String
}

object IneligibleCard {
  @scala.inline
  def apply(IneligibleCard: String, InsufficientPoints: String, Success: String): IneligibleCard = {
    val __obj = js.Dynamic.literal(IneligibleCard = IneligibleCard.asInstanceOf[js.Any], InsufficientPoints = InsufficientPoints.asInstanceOf[js.Any], Success = Success.asInstanceOf[js.Any])
    __obj.asInstanceOf[IneligibleCard]
  }
}

