package typings.blueprintjsTable

import typings.blueprintjsTable.anon.PartialIDragSelectablePro
import typings.blueprintjsTable.commonCellMod.IFocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.IRegion
import typings.react.mod.PureComponent
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object selectableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
  @js.native
  class DragSelectable protected ()
    extends PureComponent[IDragSelectableProps, js.Object, js.Any] {
    def this(props: IDragSelectableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDragSelectableProps, context: js.Any) = this()
    
    var didExpandSelectionOnActivate: js.Any = js.native
    
    /**
      * Expands the last-selected region to the new region, and replaces the
      * last-selected region with the expanded region. If a focused cell is provided,
      * the focused cell will serve as an anchor for the expansion.
      */
    var expandSelectedRegions: js.Any = js.native
    
    var finishInteraction: js.Any = js.native
    
    var getDraggableProps: js.Any = js.native
    
    var handleActivate: js.Any = js.native
    
    var handleAddDisjointSelection: js.Any = js.native
    
    var handleClearAllSelectionsNotAtIndex: js.Any = js.native
    
    var handleClearSelectionAtIndex: js.Any = js.native
    
    var handleClick: js.Any = js.native
    
    var handleDragEnd: js.Any = js.native
    
    var handleDragMove: js.Any = js.native
    
    var handleExpandSelection: js.Any = js.native
    
    var handleReplaceSelection: js.Any = js.native
    
    var invokeOnFocusCallbackForRegion: js.Any = js.native
    
    var lastEmittedSelectedRegions: js.Any = js.native
    
    var maybeInvokeSelectionCallback: js.Any = js.native
    
    var shouldAddDisjointSelection: js.Any = js.native
    
    var shouldExpandSelection: js.Any = js.native
    
    var shouldIgnoreMouseDown: js.Any = js.native
  }
  /* static members */
  object DragSelectable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable.defaultProps")
    @js.native
    def defaultProps: PartialIDragSelectablePro = js.native
    @scala.inline
    def defaultProps_=(x: PartialIDragSelectablePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDragSelectableProps
    extends StObject
       with ISelectableProps {
    
    /**
      * Whether the selection behavior is disabled.
      * @default false
      */
    var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
    
    /**
      * A list of CSS selectors that should _not_ trigger selection when a `mousedown` occurs inside of them.
      */
    var ignoredSelectors: js.UndefOr[js.Array[String]] = js.native
    
    /**
      * A callback that determines a `Region` for the single `MouseEvent`. If
      * no valid region can be found, `null` may be returned.
      */
    def locateClick(event: MouseEvent): IRegion = js.native
    
    /**
      * A callback that determines a `Region` for the `MouseEvent` and
      * coordinate data representing a drag. If no valid region can be found,
      * `null` may be returned.
      */
    def locateDrag(event: MouseEvent, coords: ICoordinateData): IRegion = js.native
    def locateDrag(event: MouseEvent, coords: ICoordinateData, returnEndOnly: Boolean): IRegion = js.native
  }
  
  trait ISelectableProps extends StObject {
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      * @default false
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently focused cell.
      */
    var focusedCell: js.UndefOr[IFocusedCellCoordinates] = js.undefined
    
    /**
      * When the user focuses something, this callback is called with new
      * focused cell coordinates. This should be considered the new focused cell
      * state for the entire table.
      */
    def onFocusedCell(focusedCell: IFocusedCellCoordinates): Unit
    
    /**
      * When the user selects something, this callback is called with a new
      * array of `Region`s. This array should be considered the new selection
      * state for the entire table.
      */
    def onSelection(regions: js.Array[IRegion]): Unit
    
    /**
      * An additional convenience callback invoked when the user releases the
      * mouse from either a click or a drag, indicating that the selection
      * interaction has ended.
      */
    var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[IRegion], Unit]] = js.undefined
    
    /**
      * An optional transform function that will be applied to the located
      * `Region`.
      *
      * This allows you to, for example, convert cell `Region`s into row
      * `Region`s while maintaining the existing multi-select and meta-click
      * functionality.
      */
    var selectedRegionTransform: js.UndefOr[ISelectedRegionTransform] = js.undefined
    
    /**
      * An array containing the table's selection Regions.
      * @default []
      */
    var selectedRegions: js.UndefOr[js.Array[IRegion]] = js.undefined
  }
  object ISelectableProps {
    
    @scala.inline
    def apply(onFocusedCell: IFocusedCellCoordinates => Unit, onSelection: js.Array[IRegion] => Unit): ISelectableProps = {
      val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
      __obj.asInstanceOf[ISelectableProps]
    }
    
    @scala.inline
    implicit class ISelectablePropsMutableBuilder[Self <: ISelectableProps] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
      
      @scala.inline
      def setFocusedCell(value: IFocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      @scala.inline
      def setOnFocusedCell(value: IFocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelection(value: js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionEnd(value: /* regions */ js.Array[IRegion] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
      
      @scala.inline
      def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
      
      @scala.inline
      def setSelectedRegionTransform(
        value: (/* region */ IRegion, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => IRegion
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      @scala.inline
      def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      @scala.inline
      def setSelectedRegions(value: js.Array[IRegion]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      @scala.inline
      def setSelectedRegionsVarargs(value: IRegion*): Self = StObject.set(x, "selectedRegions", js.Array(value :_*))
    }
  }
  
  type ISelectedRegionTransform = js.Function3[
    /* region */ IRegion, 
    /* event */ MouseEvent | KeyboardEvent, 
    /* coords */ js.UndefOr[ICoordinateData], 
    IRegion
  ]
}
