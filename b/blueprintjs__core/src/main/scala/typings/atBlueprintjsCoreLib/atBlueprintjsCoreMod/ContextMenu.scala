package typings
package atBlueprintjsCoreLib.atBlueprintjsCoreMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "ContextMenu")
@js.native
object ContextMenu extends js.Object {
  def hide(): scala.Unit = js.native
  def isOpen(): scala.Boolean = js.native
  def show(
    menu: reactLib.reactMod.Global.JSXNs.Element,
    offset: atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuMod.IOffset
  ): scala.Unit = js.native
  def show(
    menu: reactLib.reactMod.Global.JSXNs.Element,
    offset: atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuMod.IOffset,
    onClose: js.Function0[scala.Unit]
  ): scala.Unit = js.native
  def show(
    menu: reactLib.reactMod.Global.JSXNs.Element,
    offset: atBlueprintjsCoreLib.libEsmComponentsContextDashMenuContextMenuMod.IOffset,
    onClose: js.Function0[scala.Unit],
    isDarkTheme: scala.Boolean
  ): scala.Unit = js.native
}

