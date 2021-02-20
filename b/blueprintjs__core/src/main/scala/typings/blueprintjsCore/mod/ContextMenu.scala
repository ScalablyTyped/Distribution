package typings.blueprintjsCore.mod

import typings.blueprintjsCore.contextMenuMod.IOffset
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenu {
  
  @JSImport("@blueprintjs/core", "ContextMenu.hide")
  @js.native
  def hide(): Unit = js.native
  
  @JSImport("@blueprintjs/core", "ContextMenu.isOpen")
  @js.native
  def isOpen(): Boolean = js.native
  
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: Element, offset: IOffset): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.UndefOr[scala.Nothing], isDarkTheme: Boolean): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = js.native
  @JSImport("@blueprintjs/core", "ContextMenu.show")
  @js.native
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = js.native
}
