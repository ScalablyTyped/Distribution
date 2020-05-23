package typings.braintreeWeb.anon

import typings.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Card extends js.Object {
  var card: js.Any
  var hostedFields: HostedFields_
}

object Card {
  @scala.inline
  def apply(card: js.Any, hostedFields: HostedFields_): Card = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any])
    __obj.asInstanceOf[Card]
  }
}

