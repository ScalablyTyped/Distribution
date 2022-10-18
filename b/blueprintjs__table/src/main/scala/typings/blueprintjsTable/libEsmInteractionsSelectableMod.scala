package typings.blueprintjsTable

import typings.blueprintjsTable.anon.PartialIDragSelectablePro
import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.libEsmInteractionsDragTypesMod.ICoordinateData
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.KeyboardEvent
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmInteractionsSelectableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
  @js.native
  open class DragSelectable protected ()
    extends PureComponent[IDragSelectableProps, js.Object, Any] {
    def this(props: IDragSelectableProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDragSelectableProps, context: Any) = this()
    
    /* private */ var didExpandSelectionOnActivate: Any = js.native
    
    /**
      * Expands the last-selected region to the new region, and replaces the
      * last-selected region with the expanded region. If a focused cell is provided,
      * the focused cell will serve as an anchor for the expansion.
      */
    /* private */ var expandSelectedRegions: Any = js.native
    
    /* private */ var finishInteraction: Any = js.native
    
    /* private */ var getDraggableProps: Any = js.native
    
    /* private */ var handleActivate: Any = js.native
    
    /* private */ var handleAddDisjointSelection: Any = js.native
    
    /* private */ var handleClearAllSelectionsNotAtIndex: Any = js.native
    
    /* private */ var handleClearSelectionAtIndex: Any = js.native
    
    /* private */ var handleClick: Any = js.native
    
    /* private */ var handleDragEnd: Any = js.native
    
    /* private */ var handleDragMove: Any = js.native
    
    /* private */ var handleExpandSelection: Any = js.native
    
    /* private */ var handleReplaceSelection: Any = js.native
    
    /* private */ var invokeOnFocusCallbackForRegion: Any = js.native
    
    /* private */ var lastEmittedSelectedRegions: Any = js.native
    
    /* private */ var maybeInvokeSelectionCallback: Any = js.native
    
    /* private */ var shouldAddDisjointSelection: Any = js.native
    
    /* private */ var shouldExpandSelection: Any = js.native
    
    /* private */ var shouldIgnoreMouseDown: Any = js.native
  }
  /* static members */
  object DragSelectable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/selectable", "DragSelectable.defaultProps")
    @js.native
    def defaultProps: PartialIDragSelectablePro = js.native
    inline def defaultProps_=(x: PartialIDragSelectablePro): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDragSelectableProps
    extends StObject
       with ISelectableProps {
    
    /** Element to make interactive. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Whether the selection behavior is disabled.
      *
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
    def locateClick(event: MouseEvent): Region = js.native
    
    /**
      * A callback that determines a `Region` for the `MouseEvent` and
      * coordinate data representing a drag. If no valid region can be found,
      * `null` may be returned.
      */
    def locateDrag(event: MouseEvent, coords: ICoordinateData): js.UndefOr[Region] = js.native
    def locateDrag(event: MouseEvent, coords: ICoordinateData, returnEndOnly: Boolean): js.UndefOr[Region] = js.native
  }
  
  trait ISelectableProps extends StObject {
    
    /**
      * If `false`, only a single region of a single column/row/cell may be
      * selected at one time. Using `ctrl` or `meta` key will have no effect,
      * and a mouse drag will select the current column/row/cell only.
      *
      * @default false
      */
    var enableMultipleSelection: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The currently focused cell.
      */
    var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.undefined
    
    /**
      * When the user focuses something, this callback is called with new
      * focused cell coordinates. This should be considered the new focused cell
      * state for the entire table.
      */
    def onFocusedCell(focusedCell: FocusedCellCoordinates): Unit
    
    /**
      * When the user selects something, this callback is called with a new
      * array of `Region`s. This array should be considered the new selection
      * state for the entire table.
      */
    def onSelection(regions: js.Array[Region]): Unit
    
    /**
      * An additional convenience callback invoked when the user releases the
      * mouse from either a click or a drag, indicating that the selection
      * interaction has ended.
      */
    var onSelectionEnd: js.UndefOr[js.Function1[/* regions */ js.Array[Region], Unit]] = js.undefined
    
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
      *
      * @default []
      */
    var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
  }
  object ISelectableProps {
    
    inline def apply(onFocusedCell: FocusedCellCoordinates => Unit, onSelection: js.Array[Region] => Unit): ISelectableProps = {
      val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onSelection = js.Any.fromFunction1(onSelection))
      __obj.asInstanceOf[ISelectableProps]
    }
    
    extension [Self <: ISelectableProps](x: Self) {
      
      inline def setEnableMultipleSelection(value: Boolean): Self = StObject.set(x, "enableMultipleSelection", value.asInstanceOf[js.Any])
      
      inline def setEnableMultipleSelectionUndefined: Self = StObject.set(x, "enableMultipleSelection", js.undefined)
      
      inline def setFocusedCell(value: FocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setOnFocusedCell(value: FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      inline def setOnSelection(value: js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      inline def setOnSelectionEnd(value: /* regions */ js.Array[Region] => Unit): Self = StObject.set(x, "onSelectionEnd", js.Any.fromFunction1(value))
      
      inline def setOnSelectionEndUndefined: Self = StObject.set(x, "onSelectionEnd", js.undefined)
      
      inline def setSelectedRegionTransform(
        value: (/* region */ Region, /* event */ MouseEvent | KeyboardEvent, /* coords */ js.UndefOr[ICoordinateData]) => Region
      ): Self = StObject.set(x, "selectedRegionTransform", js.Any.fromFunction3(value))
      
      inline def setSelectedRegionTransformUndefined: Self = StObject.set(x, "selectedRegionTransform", js.undefined)
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    }
  }
  
  type ISelectedRegionTransform = js.Function3[
    /* region */ Region, 
    /* event */ MouseEvent | KeyboardEvent, 
    /* coords */ js.UndefOr[ICoordinateData], 
    Region
  ]
  
  type SelectedRegionTransform = ISelectedRegionTransform
}
