package typings.atBlueprintjsTable.libEsmCommonContextMenuTargetWrapperMod

import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.MouseEvent
import typings.react.reactMod.NativeMouseEvent
import typings.react.reactMod._Global_.JSX.Element
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

