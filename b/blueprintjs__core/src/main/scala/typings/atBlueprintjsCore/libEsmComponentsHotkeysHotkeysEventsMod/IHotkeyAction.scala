package typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeysEventsMod

import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
import typings.atBlueprintjsCore.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
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
    val __obj = js.Dynamic.literal(combo = combo, props = props)
  
    __obj.asInstanceOf[IHotkeyAction]
  }
}

