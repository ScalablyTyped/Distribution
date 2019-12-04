package typings.atBlueprintjsTable

import typings.atBlueprintjsCore.atBlueprintjsCoreMod.AbstractComponent2
import typings.atBlueprintjsCore.libEsmCommonPropsMod.IProps
import typings.atBlueprintjsTable.libEsmCommonGridMod.Grid
import typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.ITableQuadrantProps
import typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType
import typings.react.reactMod.CSSProperties
import typings.react.reactMod.EventHandler
import typings.react.reactMod.UIEvent
import typings.react.reactMod.WheelEvent
import typings.react.reactMod._Global_.JSX.Element
import typings.std.HTMLDivElement
import typings.std.HTMLElement
import typings.std.Partial
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/quadrants/tableQuadrant", JSImport.Namespace)
@js.native
object libEsmQuadrantsTableQuadrantMod extends js.Object {
  @js.native
  trait ITableQuadrantProps extends IProps {
    /**
      * A callback that receives a `ref` to the quadrant's body-wrapping element. Will need to be
      * provided only for the MAIN quadrant, because that quadrant contains the main table body.
      */
    var bodyRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, _]] = js.native
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
    var onScroll: js.UndefOr[EventHandler[UIEvent[HTMLDivElement]]] = js.native
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
    /**
      * A callback that renders either all of or just frozen sections of the table body.
      */
    def bodyRenderer(): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean): Element = js.native
    def bodyRenderer(quadrantType: QuadrantType, showFrozenRowsOnly: Boolean, showFrozenColumnsOnly: Boolean): Element = js.native
  }
  
  @js.native
  sealed trait QuadrantType extends js.Object
  
  @js.native
  class TableQuadrant ()
    extends AbstractComponent2[ITableQuadrantProps, js.Object, js.Object] {
    var getQuadrantCssClass: js.Any = js.native
  }
  
  @js.native
  object QuadrantType extends js.Object {
    /**
      * The left quadrant, containing row headers and frozen columns.
      */
    @js.native
    sealed trait LEFT extends QuadrantType
    
    /**
      * The main quadrant beneath any frozen rows or columns.
      */
    @js.native
    sealed trait MAIN extends QuadrantType
    
    /**
      * The top quadrant, containing column headers and frozen rows.
      */
    @js.native
    sealed trait TOP extends QuadrantType
    
    /**
      * The top-left quadrant, containing the headers and cells common to both
      * the frozen columns and frozen rows.
      */
    @js.native
    sealed trait TOP_LEFT extends QuadrantType
    
    /* "left" */ val LEFT: typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.LEFT with String = js.native
    /* "main" */ val MAIN: typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.MAIN with String = js.native
    /* "top" */ val TOP: typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.TOP with String = js.native
    /* "top-left" */ val TOP_LEFT: typings.atBlueprintjsTable.libEsmQuadrantsTableQuadrantMod.QuadrantType.TOP_LEFT with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[QuadrantType with String] = js.native
  }
  
  /* static members */
  @js.native
  object TableQuadrant extends js.Object {
    var defaultProps: Partial[ITableQuadrantProps] with js.Object = js.native
  }
  
}

