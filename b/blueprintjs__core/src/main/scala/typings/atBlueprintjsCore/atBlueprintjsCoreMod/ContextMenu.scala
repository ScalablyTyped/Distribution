package typings.atBlueprintjsCore.atBlueprintjsCoreMod

import typings.atBlueprintjsCore.libEsmComponentsContextDashMenuContextMenuMod.IOffset
import typings.react.reactMod.Global.JSXNs.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/core", "ContextMenu")
@js.native
object ContextMenu extends js.Object {
  def hide(): Unit = js.native
  def isOpen(): Boolean = js.native
  def show(menu: Element, offset: IOffset): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
}

