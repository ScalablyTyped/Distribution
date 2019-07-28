package typings.braintree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_IneligibleCard extends js.Object {
  var IneligibleCard: String
  var InsufficientPoints: String
  var Success: String
}

object Anon_IneligibleCard {
  @scala.inline
  def apply(IneligibleCard: String, InsufficientPoints: String, Success: String): Anon_IneligibleCard = {
    val __obj = js.Dynamic.literal(IneligibleCard = IneligibleCard, InsufficientPoints = InsufficientPoints, Success = Success)
  
    __obj.asInstanceOf[Anon_IneligibleCard]
  }
}

