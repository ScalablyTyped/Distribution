package typings.blueprintjsCore.mod

import typings.blueprintjsCore.contextMenuMod.IOffset
import typings.react.mod.global.JSX.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@blueprintjs/core", "ContextMenu")
@js.native
object ContextMenu extends js.Object {
  
  def hide(): Unit = js.native
  
  def isOpen(): Boolean = js.native
  
  def show(menu: Element, offset: IOffset): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.UndefOr[scala.Nothing], isDarkTheme: Boolean): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
}
