package typings.blueprintjsTable

import typings.blueprintjsTable.anon.PartialIDragReorderable
import typings.blueprintjsTable.cellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.dragTypesMod.ICoordinateData
import typings.blueprintjsTable.esmRegionsMod.Region
import typings.react.mod.PureComponent
import typings.react.mod.ReactNode
import typings.std.MouseEvent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object reorderableMod {
  
  @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
  @js.native
  open class DragReorderable protected ()
    extends PureComponent[IDragReorderable, js.Object, Any] {
    def this(props: IDragReorderable) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IDragReorderable, context: Any) = this()
    
    /* private */ var getDraggableProps: Any = js.native
    
    /* private */ var handleActivate: Any = js.native
    
    /* private */ var handleDragEnd: Any = js.native
    
    /* private */ var handleDragMove: Any = js.native
    
    /* private */ var maybeSelectRegion: Any = js.native
    
    /* private */ var selectedRegionLength: Any = js.native
    
    /* private */ var selectedRegionStartIndex: Any = js.native
    
    /* private */ var shouldIgnoreMouseDown: Any = js.native
  }
  /* static members */
  object DragReorderable {
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/interactions/reorderable", "DragReorderable.defaultProps")
    @js.native
    def defaultProps: PartialIDragReorderable = js.native
    inline def defaultProps_=(x: PartialIDragReorderable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IDragReorderable
    extends StObject
       with IReorderableProps {
    
    /** Element to drag & reorder. */
    var children: js.UndefOr[ReactNode] = js.native
    
    /**
      * Whether the reordering behavior is disabled.
      *
      * @default false
      */
    var disabled: js.UndefOr[Boolean | (js.Function1[/* event */ MouseEvent, Boolean])] = js.native
    
    /**
      * A callback that determines a `Region` for the single `MouseEvent`. If
      * no valid region can be found, `null` may be returned.
      */
    def locateClick(event: MouseEvent): Region = js.native
    
    /**
      * A callback that determines the index at which to show the preview guide.
      * This is equivalent to the absolute index in the old ordering where the
      * reordered element will move.
      */
    def locateDrag(event: MouseEvent, coords: ICoordinateData): js.UndefOr[Double] = js.native
    
    /**
      * A callback that converts the provided index into a region. The returned
      * region will be used to update the current selection after drag-reordering.
      */
    def toRegion(index1: Double): Region = js.native
    def toRegion(index1: Double, index2: Double): Region = js.native
  }
  
  trait IReorderableProps extends StObject {
    
    /**
      * When the user reorders something, this callback is called with the new
      * focus cell for the newly selected set of regions.
      */
    def onFocusedCell(focusedCell: FocusedCellCoordinates): Unit
    
    /**
      * A callback that is called when the user is done dragging to reorder.
      *
      * @param oldIndex the original index of the element or set of elements
      * @param newIndex the new index of the element or set of elements
      * @param length the number of contiguous elements that were moved
      */
    def onReordered(oldIndex: Double, newIndex: Double, length: Double): Unit
    
    /**
      * A callback that is called while the user is dragging to reorder.
      *
      * @param oldIndex the original index of the element or set of elements
      * @param newIndex the new index of the element or set of elements
      * @param length the number of contiguous elements that were moved
      */
    def onReordering(oldIndex: Double, newIndex: Double, length: Double): Unit
    
    /**
      * When the user reorders something, this callback is called with a new
      * array of `Region`s. This array should be considered the new selection
      * state for the entire table.
      */
    def onSelection(regions: js.Array[Region]): Unit
    
    /**
      * An array containing the table's selection Regions.
      *
      * @default []
      */
    var selectedRegions: js.UndefOr[js.Array[Region]] = js.undefined
  }
  object IReorderableProps {
    
    inline def apply(
      onFocusedCell: FocusedCellCoordinates => Unit,
      onReordered: (Double, Double, Double) => Unit,
      onReordering: (Double, Double, Double) => Unit,
      onSelection: js.Array[Region] => Unit
    ): IReorderableProps = {
      val __obj = js.Dynamic.literal(onFocusedCell = js.Any.fromFunction1(onFocusedCell), onReordered = js.Any.fromFunction3(onReordered), onReordering = js.Any.fromFunction3(onReordering), onSelection = js.Any.fromFunction1(onSelection))
      __obj.asInstanceOf[IReorderableProps]
    }
    
    extension [Self <: IReorderableProps](x: Self) {
      
      inline def setOnFocusedCell(value: FocusedCellCoordinates => Unit): Self = StObject.set(x, "onFocusedCell", js.Any.fromFunction1(value))
      
      inline def setOnReordered(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onReordered", js.Any.fromFunction3(value))
      
      inline def setOnReordering(value: (Double, Double, Double) => Unit): Self = StObject.set(x, "onReordering", js.Any.fromFunction3(value))
      
      inline def setOnSelection(value: js.Array[Region] => Unit): Self = StObject.set(x, "onSelection", js.Any.fromFunction1(value))
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsUndefined: Self = StObject.set(x, "selectedRegions", js.undefined)
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
    }
  }
}
