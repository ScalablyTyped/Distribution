package typings.blueprintjsTable.contextMenuTargetWrapperMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IContextMenuTargetWrapper extends IProps {
  var style: CSSProperties
  def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): Element
}

object IContextMenuTargetWrapper {
  @scala.inline
  def apply(
    renderContextMenu: MouseEvent[HTMLElement, NativeMouseEvent] => Element,
    style: CSSProperties,
    className: String = null
  ): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
}

