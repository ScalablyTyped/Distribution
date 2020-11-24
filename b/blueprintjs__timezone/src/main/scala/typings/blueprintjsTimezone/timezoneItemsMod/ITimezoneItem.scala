package typings.blueprintjsTimezone.timezoneItemsMod

import typings.blueprintjsIcons.iconNameMod.IconName
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITimezoneItem extends js.Object {
  
  /** Optional icon for the timezone. */
  var iconName: js.UndefOr[IconName] = js.native
  
  /** Key to be used as the rendered react key. */
  var key: String = js.native
  
  /** Label for the timezone. */
  var label: String = js.native
  
  /** Text for the timezone. */
  var text: String = js.native
  
  /** The actual timezone. */
  var timezone: String = js.native
}
object ITimezoneItem {
  
  @scala.inline
  def apply(key: String, label: String, text: String, timezone: String): ITimezoneItem = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], label = label.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], timezone = timezone.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITimezoneItem]
  }
  
  @scala.inline
  implicit class ITimezoneItemOps[Self <: ITimezoneItem] (val x: Self) extends AnyVal {
    
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
    def setKey(value: String): Self = this.set("key", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = this.set("text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTimezone(value: String): Self = this.set("timezone", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIconName(value: IconName): Self = this.set("iconName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIconName: Self = this.set("iconName", js.undefined)
  }
}
