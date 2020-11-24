package typings.blueprintjsTable.contextMenuTargetWrapperMod

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IContextMenuTargetWrapper extends IProps {
  
  def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
  
  var style: CSSProperties = js.native
}
object IContextMenuTargetWrapper {
  
  @scala.inline
  def apply(renderContextMenu: MouseEvent[HTMLElement, NativeMouseEvent] => Element, style: CSSProperties): IContextMenuTargetWrapper = {
    val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
    __obj.asInstanceOf[IContextMenuTargetWrapper]
  }
  
  @scala.inline
  implicit class IContextMenuTargetWrapperOps[Self <: IContextMenuTargetWrapper] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setRenderContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Element): Self = this.set("renderContextMenu", js.Any.fromFunction1(value))
    
    @scala.inline
    def setStyle(value: CSSProperties): Self = this.set("style", value.asInstanceOf[js.Any])
  }
}
