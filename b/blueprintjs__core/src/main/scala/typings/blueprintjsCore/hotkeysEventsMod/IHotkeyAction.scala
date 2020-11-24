package typings.blueprintjsCore.hotkeysEventsMod

import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import typings.blueprintjsCore.hotkeyParserMod.IKeyCombo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IHotkeyAction extends js.Object {
  
  var combo: IKeyCombo = js.native
  
  var props: IHotkeyProps = js.native
}
object IHotkeyAction {
  
  @scala.inline
  def apply(combo: IKeyCombo, props: IHotkeyProps): IHotkeyAction = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyAction]
  }
  
  @scala.inline
  implicit class IHotkeyActionOps[Self <: IHotkeyAction] (val x: Self) extends AnyVal {
    
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
    def setCombo(value: IKeyCombo): Self = this.set("combo", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setProps(value: IHotkeyProps): Self = this.set("props", value.asInstanceOf[js.Any])
  }
}
