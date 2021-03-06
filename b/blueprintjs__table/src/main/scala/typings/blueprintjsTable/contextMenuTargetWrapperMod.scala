package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object contextMenuTargetWrapperMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  class ContextMenuTargetWrapper protected ()
    extends PureComponent[IContextMenuTargetWrapper, js.Object, js.Any] {
    def this(props: IContextMenuTargetWrapper) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IContextMenuTargetWrapper, context: js.Any) = this()
    
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
  }
  
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
    implicit class IContextMenuTargetWrapperMutableBuilder[Self <: IContextMenuTargetWrapper] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRenderContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => Element): Self = StObject.set(x, "renderContextMenu", js.Any.fromFunction1(value))
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
