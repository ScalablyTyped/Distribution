package typings
package braintreeDashWebLib.braintreeDashWebMod.braintreeNs

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
    val __obj = js.Dynamic.literal(cards = cards, emittedBy = emittedBy, fields = fields)
  
    __obj.asInstanceOf[HostedFieldsStateObject]
  }
}

