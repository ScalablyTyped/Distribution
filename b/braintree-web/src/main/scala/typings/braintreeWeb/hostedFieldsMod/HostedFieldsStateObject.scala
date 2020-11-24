package typings.braintreeWeb.hostedFieldsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait HostedFieldsStateObject extends js.Object {
  
  var cards: js.Array[HostedFieldsHostedFieldsCard] = js.native
  
  var emittedBy: HostedFieldsHostedFieldsFieldName = js.native
  
  var fields: HostedFieldsFieldDataFields = js.native
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
  
  @scala.inline
  implicit class HostedFieldsStateObjectOps[Self <: HostedFieldsStateObject] (val x: Self) extends AnyVal {
    
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
    def setCardsVarargs(value: HostedFieldsHostedFieldsCard*): Self = this.set("cards", js.Array(value :_*))
    
    @scala.inline
    def setCards(value: js.Array[HostedFieldsHostedFieldsCard]): Self = this.set("cards", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmittedBy(value: HostedFieldsHostedFieldsFieldName): Self = this.set("emittedBy", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFields(value: HostedFieldsFieldDataFields): Self = this.set("fields", value.asInstanceOf[js.Any])
  }
}
