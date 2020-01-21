package typings.braintreeWeb

import typings.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonCard extends js.Object {
  var card: js.Any
  var hostedFields: HostedFields_
}

object AnonCard {
  @scala.inline
  def apply(card: js.Any, hostedFields: HostedFields_): AnonCard = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonCard]
  }
}

