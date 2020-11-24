package typings.azdata.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CardProperties
  extends ComponentProperties
     with ComponentWithIcon {
  
  var actions: js.UndefOr[js.Array[ActionDescriptor]] = js.native
  
  /**
    * Card Type, default: Details
    */
  var cardType: js.UndefOr[CardType] = js.native
  
  var descriptions: js.UndefOr[js.Array[CardDescriptionItem]] = js.native
  
  var label: String = js.native
  
  /**
    * Returns true if the card is selected
    */
  var selected: js.UndefOr[Boolean] = js.native
  
  var status: js.UndefOr[StatusIndicator] = js.native
  
  var value: js.UndefOr[String] = js.native
}
object CardProperties {
  
  @scala.inline
  def apply(label: String): CardProperties = {
    val __obj = js.Dynamic.literal(label = label.asInstanceOf[js.Any])
    __obj.asInstanceOf[CardProperties]
  }
  
  @scala.inline
  implicit class CardPropertiesOps[Self <: CardProperties] (val x: Self) extends AnyVal {
    
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
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setActionsVarargs(value: ActionDescriptor*): Self = this.set("actions", js.Array(value :_*))
    
    @scala.inline
    def setActions(value: js.Array[ActionDescriptor]): Self = this.set("actions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteActions: Self = this.set("actions", js.undefined)
    
    @scala.inline
    def setCardType(value: CardType): Self = this.set("cardType", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCardType: Self = this.set("cardType", js.undefined)
    
    @scala.inline
    def setDescriptionsVarargs(value: CardDescriptionItem*): Self = this.set("descriptions", js.Array(value :_*))
    
    @scala.inline
    def setDescriptions(value: js.Array[CardDescriptionItem]): Self = this.set("descriptions", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescriptions: Self = this.set("descriptions", js.undefined)
    
    @scala.inline
    def setSelected(value: Boolean): Self = this.set("selected", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteSelected: Self = this.set("selected", js.undefined)
    
    @scala.inline
    def setStatus(value: StatusIndicator): Self = this.set("status", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStatus: Self = this.set("status", js.undefined)
    
    @scala.inline
    def setValue(value: String): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteValue: Self = this.set("value", js.undefined)
  }
}
