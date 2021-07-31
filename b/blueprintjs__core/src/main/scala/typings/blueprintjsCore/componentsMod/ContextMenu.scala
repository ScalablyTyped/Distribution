package typings.blueprintjsCore.componentsMod

import typings.blueprintjsCore.contextMenuMod.IOffset
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object ContextMenu {
  
  @JSImport("@blueprintjs/core/lib/esm/components", "ContextMenu")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def hide(): Unit = ^.asInstanceOf[js.Dynamic].applyDynamic("hide")().asInstanceOf[Unit]
  
  @scala.inline
  def isOpen(): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isOpen")().asInstanceOf[Boolean]
  
  @scala.inline
  def show(menu: Element, offset: IOffset): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit]): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: js.Function0[Unit], isDarkTheme: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], isDarkTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
  @scala.inline
  def show(menu: Element, offset: IOffset, onClose: Unit, isDarkTheme: Boolean): Unit = (^.asInstanceOf[js.Dynamic].applyDynamic("show")(menu.asInstanceOf[js.Any], offset.asInstanceOf[js.Any], onClose.asInstanceOf[js.Any], isDarkTheme.asInstanceOf[js.Any])).asInstanceOf[Unit]
}
