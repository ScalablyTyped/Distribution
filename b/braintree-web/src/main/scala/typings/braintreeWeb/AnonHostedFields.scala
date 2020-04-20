package typings.braintreeWeb

import typings.braintreeWeb.mod.HostedFields_
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonHostedFields extends js.Object {
  var card: js.Any
  var hostedFields: HostedFields_
  var mobile: js.Any
}

object AnonHostedFields {
  @scala.inline
  def apply(card: js.Any, hostedFields: HostedFields_, mobile: js.Any): AnonHostedFields = {
    val __obj = js.Dynamic.literal(card = card.asInstanceOf[js.Any], hostedFields = hostedFields.asInstanceOf[js.Any], mobile = mobile.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonHostedFields]
  }
}

