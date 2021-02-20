package typings.blueprintjsTable

import typings.blueprintjsCore.mod.AbstractComponent2
import typings.blueprintjsCore.propsMod.IProps
import typings.blueprintjsTable.anon.PartialITableQuadrantProp
import typings.blueprintjsTable.gridMod.Grid
import typings.react.mod.CSSProperties
import typings.react.mod.EventHandler
import typings.react.mod.NativeUIEvent
import typings.react.mod.UIEvent
import typings.react.mod.WheelEvent
import typings.react.mod.global.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableQuadrantMod {
  
  @js.native
  sealed trait QuadrantType extends StObject
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "QuadrantType")
  @js.native
  object QuadrantType extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QuadrantType with String] = js.native
    
    /**
      * The left quadrant, containing row headers and frozen columns.
      */
    @js.native
    sealed trait LEFT extends QuadrantType
    /* "left" */ val LEFT: typings.blueprintjsTable.tableQuadrantMod.QuadrantType.LEFT with String = js.native
    
    /**
      * The main quadrant beneath any frozen rows or columns.
      */
    @js.native
    sealed trait MAIN extends QuadrantType
    /* "main" */ val MAIN: typings.blueprintjsTable.tableQuadrantMod.QuadrantType.MAIN with String = js.native
    
    /**
      * The top quadrant, containing column headers and frozen rows.
      */
    @js.native
    sealed trait TOP extends QuadrantType
    /* "top" */ val TOP: typings.blueprintjsTable.tableQuadrantMod.QuadrantType.TOP with String = js.native
    
    /**
      * The top-left quadrant, containing the headers and cells common to both
      * the frozen columns and frozen rows.
      */
    @js.native
    sealed trait TOP_LEFT extends QuadrantType
    /* "top-left" */ val TOP_LEFT: typings.blueprintjsTable.tableQuadrantMod.QuadrantType.TOP_LEFT with String = js.native
  }
  
  @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
  @js.native
  class TableQuadrant protected ()
    extends AbstractComponent2[ITableQuadrantProps, js.Object, js.Object] {
    def this(props: ITableQuadrantProps) = this()
    def this(props: ITableQuadrantProps, context: js.Any) = this()
    
    var getQuadrantCssClass: js.Any = js.native
  }
  /* static members */
  object TableQuadrant {
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", "TableQuadrant.defaultProps")
    @js.native
    def defaultProps: PartialITableQuadrantProp = js.native
    @scala.inline
    def defaultProps_=(x: PartialITableQuadrantProp): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait ITableQuadrantProps extends IProps {
    
    /**
      * A callback that receives a `ref` to the quadrant's body-wrapping element. Will need to be
      * provided only for the MAIN quadrant, because that quadrant contains the main table body.
      */
    var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      */
    def bodyRenderer(): Element = js.native
    def bodyRenderer(
      quadrantType: js.UndefOr[scala.Nothing],
      showFrozenRowsOnly: js.UndefOr[scala.Nothing],
      showFrozenColumnsOnly: Boolean
    ): Element = js.native
    def bodyRenderer(quadrantType: js.UndefOr[scala.Nothing], showFrozenRowsOnly: Boolean): Element = js.native
    def bodyRenderer(
      quadrantType: js.UndefOr[scala.Nothing],
      showFrozenRowsOnly: Boolean,
      showFrozenColumnsOnly: Boolean
    ): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType): Element = js.native
    def bodyRenderer(
      quadrantType: QuadrantType,
      showFrozenRowsOnly: js.UndefOr[scala.Nothing],
      showFrozenColumnsOnly: Boolean
    ): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): Element = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the column header.
      */
    var columnHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenColumnsOnly */ js.UndefOr[Boolean], Element]] = js.native
    
    /**
      * If `false`, hides the row headers and settings menu.
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
    var menuRenderer: js.UndefOr[js.Function0[Element]] = js.native
    
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
    var quadrantRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * The quadrant type. Informs the values of the parameters that will be passed to the
      * `render...` callbacks, assuming an expected stacking order of the four quadrants.
      */
    var quadrantType: js.UndefOr[QuadrantType] = js.native
    
    /**
      * A callback that renders either all of or just the frozen section of the row header.
      */
    var rowHeaderCellRenderer: js.UndefOr[js.Function1[/* showFrozenRowsOnly */ js.UndefOr[Boolean], Element]] = js.native
    
    /**
      * A callback that receives a `ref` to the quadrant's scroll-container element.
      */
    var scrollContainerRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
    
    /**
      * CSS styles to apply to the quadrant's outermost element.
      */
    var style: js.UndefOr[CSSProperties] = js.native
  }
}
