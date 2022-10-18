package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.react.mod.CSSProperties
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmCommonContextMenuTargetWrapperMod {
  
  @JSImport("@blueprintjs/table/lib/esm/common/contextMenuTargetWrapper", "ContextMenuTargetWrapper")
  @js.native
  open class ContextMenuTargetWrapper protected ()
    extends PureComponent[IContextMenuTargetWrapper, js.Object, Any] {
    def this(props: IContextMenuTargetWrapper) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IContextMenuTargetWrapper, context: Any) = this()
    
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element] = js.native
  }
  
  trait IContextMenuTargetWrapper
    extends StObject
       with IProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    def renderContextMenu(e: MouseEvent[HTMLElement, NativeMouseEvent]): js.UndefOr[Element]
    
    var style: CSSProperties
  }
  object IContextMenuTargetWrapper {
    
    inline def apply(
      renderContextMenu: MouseEvent[HTMLElement, NativeMouseEvent] => js.UndefOr[Element],
      style: CSSProperties
    ): IContextMenuTargetWrapper = {
      val __obj = js.Dynamic.literal(renderContextMenu = js.Any.fromFunction1(renderContextMenu), style = style.asInstanceOf[js.Any])
      __obj.asInstanceOf[IContextMenuTargetWrapper]
    }
    
    extension [Self <: IContextMenuTargetWrapper](x: Self) {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setRenderContextMenu(value: MouseEvent[HTMLElement, NativeMouseEvent] => js.UndefOr[Element]): Self = StObject.set(x, "renderContextMenu", js.Any.fromFunction1(value))
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
    }
  }
}
