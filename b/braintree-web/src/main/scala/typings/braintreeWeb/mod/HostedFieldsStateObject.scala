package typings.braintreeWeb.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HostedFieldsStateObject extends js.Object {
  var cards: js.Array[HostedFieldsHostedFieldsCard]
  var emittedBy: HostedFieldsHostedFieldsFieldName
  var fields: HostedFieldsFieldDataFields
}

object HostedFieldsStateObject {
  @scala.inline
  def apply(
    cards: js.Array[HostedFieldsHostedFieldsCard],
    emittedBy: HostedFieldsHostedFieldsFieldName,
    fields: HostedFieldsFieldDataFields
  ): HostedFieldsStateObject = {
    val __obj = js.Dynamic.literal(cards = cards.asInstanceOf[js.Any], emittedBy = emittedBy.asInstanceOf[js.Any], fields = fields.asInstanceOf[js.Any])
    __obj.asInstanceOf[HostedFieldsStateObject]
  }
}

