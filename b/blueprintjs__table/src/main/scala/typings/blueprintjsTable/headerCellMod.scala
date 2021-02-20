package typings.blueprintjsTable

import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.resizeHandleMod.ResizeHandle
import typings.react.mod.CSSProperties
import typings.react.mod.Component
import typings.react.mod.MouseEvent
import typings.react.mod.NativeMouseEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object headerCellMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/headerCell", "HeaderCell")
  @js.native
  class HeaderCell protected ()
    extends Component[IInternalHeaderCellProps, IHeaderCellState, js.Any] {
    def this(props: IInternalHeaderCellProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IInternalHeaderCellProps, context: js.Any) = this()
    
    def renderContextMenu(_event: MouseEvent[HTMLElement, NativeMouseEvent]): Element = js.native
    
    @JSName("shouldComponentUpdate")
    def shouldComponentUpdate_MHeaderCell(nextProps: IHeaderCellProps): Boolean = js.native
  }
  
  @js.native
  trait IHeaderCellProps extends IProps {
    
    /**
      * The index of the cell in the header. If provided, this will be passed as an argument to any
      * callbacks when they are invoked.
      */
    var index: js.UndefOr[Double] = js.native
    
    /**
      * If `true`, will apply the active class to the header to indicate it is
      * part of an external operation.
      */
    var isActive: js.UndefOr[Boolean] = js.native
    
    /**
      * If `true`, the row/column `name` will be replaced with a fixed-height skeleton, and the
      * `resizeHandle` will not be rendered. If passing in additional children to this component, you
      * will also want to conditionally apply `Classes.SKELETON` where appropriate.
      * @default false
      */
    var loading: js.UndefOr[Boolean] = js.native
    
    /**
      * A callback that returns an element, like a `<Menu>`, which is displayed by right-clicking
      * anywhere in the header. The callback will receive the cell index if it was provided via
      * props.
      */
    var menuRenderer: js.UndefOr[js.Function1[/* index */ js.UndefOr[Double], Element]] = js.native
    
    /**
      * The name displayed in the header of the row/column.
      */
    var name: js.UndefOr[String] = js.native
    
    /**
      * A `ReorderHandle` React component that allows users to drag-reorder the column header.
      */
    var reorderHandle: js.UndefOr[Element] = js.native
    
    /**
      * A `ResizeHandle` React component that allows users to drag-resize the header.
      */
    var resizeHandle: js.UndefOr[ResizeHandle] = js.native
    
    /**
      * CSS styles for the top level element.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
  object IHeaderCellProps {
    
    @scala.inline
    def apply(): IHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IHeaderCellProps]
    }
    
    @scala.inline
    implicit class IHeaderCellPropsMutableBuilder[Self <: IHeaderCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIndexUndefined: Self = StObject.set(x, "index", js.undefined)
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsActiveUndefined: Self = StObject.set(x, "isActive", js.undefined)
      
      @scala.inline
      def setLoading(value: Boolean): Self = StObject.set(x, "loading", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLoadingUndefined: Self = StObject.set(x, "loading", js.undefined)
      
      @scala.inline
      def setMenuRenderer(value: /* index */ js.UndefOr[Double] => Element): Self = StObject.set(x, "menuRenderer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMenuRendererUndefined: Self = StObject.set(x, "menuRenderer", js.undefined)
      
      @scala.inline
      def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      @scala.inline
      def setReorderHandle(value: Element): Self = StObject.set(x, "reorderHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setReorderHandleUndefined: Self = StObject.set(x, "reorderHandle", js.undefined)
      
      @scala.inline
      def setResizeHandle(value: ResizeHandle): Self = StObject.set(x, "resizeHandle", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResizeHandleUndefined: Self = StObject.set(x, "resizeHandle", js.undefined)
      
      @scala.inline
      def setStyle(value: CSSProperties): Self = StObject.set(x, "style", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStyleUndefined: Self = StObject.set(x, "style", js.undefined)
    }
  }
  
  @js.native
  trait IHeaderCellState extends StObject {
    
    var isActive: Boolean = js.native
  }
  object IHeaderCellState {
    
    @scala.inline
    def apply(isActive: Boolean): IHeaderCellState = {
      val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
      __obj.asInstanceOf[IHeaderCellState]
    }
    
    @scala.inline
    implicit class IHeaderCellStateMutableBuilder[Self <: IHeaderCellState] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsActive(value: Boolean): Self = StObject.set(x, "isActive", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait IInternalHeaderCellProps extends IHeaderCellProps {
    
    /**
      * Specifies if the cell is selected.
      */
    var isSelected: js.UndefOr[Boolean] = js.native
  }
  object IInternalHeaderCellProps {
    
    @scala.inline
    def apply(): IInternalHeaderCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IInternalHeaderCellProps]
    }
    
    @scala.inline
    implicit class IInternalHeaderCellPropsMutableBuilder[Self <: IInternalHeaderCellProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setIsSelected(value: Boolean): Self = StObject.set(x, "isSelected", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsSelectedUndefined: Self = StObject.set(x, "isSelected", js.undefined)
    }
  }
}
