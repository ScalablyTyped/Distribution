package typings.blueprintjsCore.hotkeysEventsMod

import typings.blueprintjsCore.hotkeyMod.IHotkeyProps
import typings.blueprintjsCore.hotkeyParserMod.IKeyCombo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeyAction extends js.Object {
  var combo: IKeyCombo
  var props: IHotkeyProps
}

object IHotkeyAction {
  @scala.inline
  def apply(combo: IKeyCombo, props: IHotkeyProps): IHotkeyAction = {
    val __obj = js.Dynamic.literal(combo = combo.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHotkeyAction]
  }
}

