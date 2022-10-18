package typings.blueprintjsTable

import typings.blueprintjsCore.libEsmCommonPropsMod.IProps
import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsTable.anon.PartialITableQuadrantProp
import typings.blueprintjsTable.libEsmCommonGridMod.Grid
import typings.react.mod.CSSProperties
import typings.react.mod.EventHandler
import typings.react.mod.NativeUIEvent
import typings.react.mod.Ref
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmQuadrantsTableQuadrantMod {
  
  @js.native
  sealed trait QuadrantType extends StObject
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "QuadrantType")
  @js.native
  object QuadrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QuadrantType & String] = js.native
    
    /**
      * The left quadrant, containing row headers and frozen columns.
      */
    @js.native
    sealed trait LEFT
      extends StObject
         with QuadrantType
    /* "left" */ val LEFT: typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.LEFT & String = js.native
    
    /**
      * The main quadrant beneath any frozen rows or columns.
      */
    @js.native
    sealed trait MAIN
      extends StObject
         with QuadrantType
    /* "main" */ val MAIN: typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.MAIN & String = js.native
    
    /**
      * The top quadrant, containing column headers and frozen rows.
      */
    @js.native
    sealed trait TOP
      extends StObject
         with QuadrantType
    /* "top" */ val TOP: typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.TOP & String = js.native
    
    /**
      * The top-left quadrant, containing the headers and cells common to both
      * the frozen columns and frozen rows.
      */
    @js.native
    sealed trait TOP_LEFT
      extends StObject
         with QuadrantType
    /* "top-left" */ val TOP_LEFT: typings.blueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.TOP_LEFT & String = js.native
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  open class TableQuadrant protected ()
    extends AbstractComponent2[ITableQuadrantProps, js.Object, js.Object] {
    def this(props: ITableQuadrantProps) = this()
    def this(props: ITableQuadrantProps, context: Any) = this()
    
    /* private */ var getQuadrantCssClass: Any = js.native
  }
  /* static members */
  object TableQuadrant {
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant.defaultProps")
    @js.native
    def defaultProps: PartialITableQuadrantProp = js.native
    inline def defaultProps_=(x: PartialITableQuadrantProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableQuadrantProps
    extends StObject
       with IProps {
    
    /**
      * A callback that receives a `ref` to the quadrant's body-wrapping element. Will need to be
      * provided only for the MAIN quadrant, because that quadrant contains the main table body.
      */
    var bodyRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      */
    def bodyRenderer(quadrantType: QuadrantType): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): js.UndefOr[Element] = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Unit, showFrozenColumnsOnly: Boolean): js.UndefOr[Element] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the column header.
      */
    var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ Boolean, js.UndefOr[Element]]] = js.native
    
    /**
      * If `false`, hides the column headers.
      *
      * @default true
      */
    var enableColumnHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * If `false`, hides the row headers and settings menu.
      *
      * @default true
      */
    var enableRowHeader: js.UndefOr[Boolean] = js.native
    
    /**
      * The grid computes sizes of cells, rows, or columns from the
      * configurable `columnWidths` and `rowHeights`.
      */
    var grid: Grid = js.native
    
    /**
      * A callback that renders the table menu (the rectangle in the top-left corner).
      */
    var menuRenderer: js.UndefOr[js.Function0[js.UndefOr[Element]]] = js.native
    
    /**
      * An optional callback invoked when the quadrant is scrolled via the scrollbar OR the trackpad/mouse wheel.
      * This callback really only makes sense for the MAIN quadrant, because that's the only quadrant whose
      * scrollbar is visible. Other quadrants should simply provide an `onWheel` callback.
      */
    var onScroll: js.UndefOr[EventHandler[UIEvent[HTMLDivElement, NativeUIEvent]]] = js.native
    
    /**
      * An optional callback invoked when the quadrant is scrolled via the trackpad/mouse wheel. This
      * callback should be provided for all quadrant types except MAIN, which should provide the more
      * generic `onScroll` callback.
      */
    var onWheel: js.UndefOr[EventHandler[WheelEvent[HTMLDivElement]]] = js.native
    
    /**
      * A callback that receives a `ref` to the quadrant's outermost element.
      */
    var quadrantRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * The quadrant type. Informs the values of the parameters that will be passed to the
      * `render...` callbacks, assuming an expected stacking order of the four quadrants.
      */
    var quadrantType: QuadrantType = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the row header.
      */
    var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ Boolean, js.UndefOr[Element]]] = js.native
    
    /**
      * A callback that receives a `ref` to the quadrant's scroll-container element.
      */
    var scrollContainerRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * CSS styles to apply to the quadrant's outermost element.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
}
