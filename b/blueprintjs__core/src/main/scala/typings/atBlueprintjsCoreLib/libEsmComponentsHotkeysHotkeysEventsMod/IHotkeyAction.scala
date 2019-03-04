package typings
package atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeysEventsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHotkeyAction extends js.Object {
  var combo: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo
  var props: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
}

object IHotkeyAction {
  @scala.inline
  def apply(
    combo: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyParserMod.IKeyCombo,
    props: atBlueprintjsCoreLib.libEsmComponentsHotkeysHotkeyMod.IHotkeyProps
  ): IHotkeyAction = {
    val __obj = js.Dynamic.literal(combo = combo, props = props)
  
    __obj.asInstanceOf[IHotkeyAction]
  }
}

