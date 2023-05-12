package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsTable.libEsmInteractionsResizeHandleMod.ResizeHandle
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersHeaderCell2Mod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/headerCell2", "HeaderCell2")
  @js.native
  open class HeaderCell2 protected () extends Component[HeaderCell2Props, HeaderCell2State, Any] {
    def this(props: HeaderCell2Props) = this()
    /**
      * @deprecated
      * @see https://legacy.reactjs.org/docs/legacy-context.html
      */
    def this(props: HeaderCell2Props, context: Any) = this()
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHeaderCell2(nextProps: HeaderCell2Props): Boolean = js.native
  }
  
  trait HeaderCell2Props
    extends StObject
       with IProps {
    
    var children: js.UndefOr[ReactNode] = js.undefined
    
    /**
      * The index of the cell in the header. If provided, this will be passed as an argument to any
      * callbacks when they are invoked.
      */
    var index: js.UndefOr[Double] = js.undefined
    
    /**
      * If `true`, will apply the active class to the header to indicate it is
      * part of an external operation.
      */
    var isActive: js.UndefOr[Boolean] = js.undefined
    
    /**
      * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
      * `resizeHandle` will not be rendered. If passing in additional children to this component, you
      * will also want to conditionally apply `Classes.SKELETON` where appropriate.
      *
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.undefined
    
    /**
      * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
      * anywhere in the header. The callback will receive the cell index if it was provided via
      * props.
      */
    var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Element]] = js.undefined
    
    /**
      * The name displayed in the header of the row/column.
      */
    var name: js.UndefOr[String] = js.undefined
    
    /**
      * A `ReorderHandle` React component that allows users to drag-reorder the column header.
      */
    var reorderHandle: js.UndefOr[Element] = js.undefined
    
    /**
      * A `ResizeHandle` React component that allows users to drag-resize the header.
      */
    var resizeHandle: js.UndefOr[ResizeHandle] = js.undefined
    
    /**
      * CSS styles for the top level element.
      */
    var style: js.UndefOr[CSSProperties] = js.undefined
  }
  object HeaderCell2Props {
    
    inline def apply(): HeaderCell2Props = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[HeaderCell2Props]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderCell2Props] (val x: Self) extends AnyVal {
      
      inline def setChildren(value: ReactNode): Self = StObject.set(x, "children", value.asInstanceOf[js.Any])
      
      inline def setChildrenUndefined: Self = StObject.set(x, "children", js.undefined)
      
      inline def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      inline def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      inline def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      inline def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      inline def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      inline def setMenuRenderer(value: /* index */ js.UndefOr[Double] => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction1(value))
      
      inline def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setReorderHandle(value: Element): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      inline def setReorderHandleUndefined: Self = StObject.set(x, "reorderHandle", js.undefined)
      
      inline def setResizeHandle(value: ResizeHandle): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      inline def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
      
      inline def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      inline def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  trait HeaderCell2State extends StObject {
    
    var isActive: Boolean
  }
  object HeaderCell2State {
    
    inline def apply(isActive: Boolean): HeaderCell2State = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[HeaderCell2State]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: HeaderCell2State] (val x: Self) extends AnyVal {
      
      inline def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
}
