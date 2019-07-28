package typings.braintreeDashWeb

import typings.braintreeDashWeb.braintreeDashWebMod.HostedFields
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Card extends js.Object {
  var card: js.Any
  var hostedFields: HostedFields
}

object Anon_Card {
  @scala.inline
  def apply(card: js.Any, hostedFields: HostedFields): Anon_Card = {
    val __obj = js.Dynamic.literal(card = card, hostedFields = hostedFields)
  
    __obj.asInstanceOf[Anon_Card]
  }
}

