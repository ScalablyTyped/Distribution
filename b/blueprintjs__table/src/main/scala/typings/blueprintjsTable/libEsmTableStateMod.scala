package typings.blueprintjsTable

import org.scalablytyped.runtime.StringDictionary
import typings.blueprintjsTable.libEsmCommonCellTypesMod.FocusedCellCoordinates
import typings.blueprintjsTable.libEsmCommonMod.Rect
import typings.blueprintjsTable.libEsmCommonScrollDirectionMod.ScrollDirection
import typings.blueprintjsTable.libEsmRegionsMod.Region
import typings.react.mod.ReactElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmTableStateMod {
  
  trait TableSnapshot extends StObject {
    
    var nextScrollLeft: js.UndefOr[Double] = js.undefined
    
    var nextScrollTop: js.UndefOr[Double] = js.undefined
  }
  object TableSnapshot {
    
    inline def apply(): TableSnapshot = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableSnapshot]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableSnapshot] (val x: Self) extends AnyVal {
      
      inline def setNextScrollLeft(value: Double): Self = StObject.set(x, "nextScrollLeft", value.asInstanceOf[js.Any])
      
      inline def setNextScrollLeftUndefined: Self = StObject.set(x, "nextScrollLeft", js.undefined)
      
      inline def setNextScrollTop(value: Double): Self = StObject.set(x, "nextScrollTop", value.asInstanceOf[js.Any])
      
      inline def setNextScrollTopUndefined: Self = StObject.set(x, "nextScrollTop", js.undefined)
    }
  }
  
  trait TableState extends StObject {
    
    var childrenArray: js.Array[ReactElement]
    
    var columnIdToIndex: StringDictionary[Double]
    
    /**
      * An array of column widths. These are initialized from the column props
      * and updated when the user drags column header resize handles.
      */
    var columnWidths: js.Array[Double]
    
    /**
      * Flag indicating that both the column headers (if present)
      * and row headers (if present) have been rendered and mounted, including any
      * custom renderers which may affect quadrant layout measurements.
      */
    var didHeadersMount: Boolean
    
    /**
      * The coordinates of the currently focused table cell
      */
    var focusedCell: js.UndefOr[FocusedCellCoordinates] = js.undefined
    
    /**
      * An array of pixel offsets for resize guides, which are drawn over the
      * table body when a row is being resized.
      */
    var horizontalGuides: js.Array[Double]
    
    /**
      * If `true`, will disable updates that will cause re-renders of children
      * components. This is used, for example, to disable layout updates while
      * the user is dragging a resize handle.
      */
    var isLayoutLocked: js.UndefOr[Boolean] = js.undefined
    
    /**
      * Whether the user is currently dragging to reorder one or more elements.
      * Can be referenced to toggle the reordering-cursor overlay, which
      * displays a `grabbing` CSS cursor wherever the mouse moves in the table
      * for the duration of the dragging interaction.
      */
    var isReordering: js.UndefOr[Boolean] = js.undefined
    
    /**
      * The number of frozen columns, clamped to [0, num <Column>s].
      */
    var numFrozenColumnsClamped: Double
    
    /**
      * The number of frozen rows, clamped to [0, numRows].
      */
    var numFrozenRowsClamped: Double
    
    /**
      * An array of row heights. These are initialized updated when the user
      * drags row header resize handles.
      */
    var rowHeights: js.Array[Double]
    
    var scrollDirection: js.UndefOr[ScrollDirection | Null] = js.undefined
    
    /**
      * An array of Regions representing the selections of the table.
      */
    var selectedRegions: js.Array[Region]
    
    /**
      * An array of pixel offsets for resize guides, which are drawn over the
      * table body when a column is being resized.
      */
    var verticalGuides: js.Array[Double]
    
    /**
      * The `Rect` bounds of the viewport used to perform virtual viewport
      * performance enhancements.
      */
    var viewportRect: js.UndefOr[Rect] = js.undefined
  }
  object TableState {
    
    inline def apply(
      childrenArray: js.Array[ReactElement],
      columnIdToIndex: StringDictionary[Double],
      columnWidths: js.Array[Double],
      didHeadersMount: Boolean,
      horizontalGuides: js.Array[Double],
      numFrozenColumnsClamped: Double,
      numFrozenRowsClamped: Double,
      rowHeights: js.Array[Double],
      selectedRegions: js.Array[Region],
      verticalGuides: js.Array[Double]
    ): TableState = {
      val __obj = js.Dynamic.literal(childrenArray = childrenArray.asInstanceOf[js.Any], columnIdToIndex = columnIdToIndex.asInstanceOf[js.Any], columnWidths = columnWidths.asInstanceOf[js.Any], didHeadersMount = didHeadersMount.asInstanceOf[js.Any], horizontalGuides = horizontalGuides.asInstanceOf[js.Any], numFrozenColumnsClamped = numFrozenColumnsClamped.asInstanceOf[js.Any], numFrozenRowsClamped = numFrozenRowsClamped.asInstanceOf[js.Any], rowHeights = rowHeights.asInstanceOf[js.Any], selectedRegions = selectedRegions.asInstanceOf[js.Any], verticalGuides = verticalGuides.asInstanceOf[js.Any])
      __obj.asInstanceOf[TableState]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableState] (val x: Self) extends AnyVal {
      
      inline def setChildrenArray(value: js.Array[ReactElement]): Self = StObject.set(x, "childrenArray", value.asInstanceOf[js.Any])
      
      inline def setChildrenArrayVarargs(value: ReactElement*): Self = StObject.set(x, "childrenArray", js.Array(value*))
      
      inline def setColumnIdToIndex(value: StringDictionary[Double]): Self = StObject.set(x, "columnIdToIndex", value.asInstanceOf[js.Any])
      
      inline def setColumnWidths(value: js.Array[Double]): Self = StObject.set(x, "columnWidths", value.asInstanceOf[js.Any])
      
      inline def setColumnWidthsVarargs(value: Double*): Self = StObject.set(x, "columnWidths", js.Array(value*))
      
      inline def setDidHeadersMount(value: Boolean): Self = StObject.set(x, "didHeadersMount", value.asInstanceOf[js.Any])
      
      inline def setFocusedCell(value: FocusedCellCoordinates): Self = StObject.set(x, "focusedCell", value.asInstanceOf[js.Any])
      
      inline def setFocusedCellUndefined: Self = StObject.set(x, "focusedCell", js.undefined)
      
      inline def setHorizontalGuides(value: js.Array[Double]): Self = StObject.set(x, "horizontalGuides", value.asInstanceOf[js.Any])
      
      inline def setHorizontalGuidesVarargs(value: Double*): Self = StObject.set(x, "horizontalGuides", js.Array(value*))
      
      inline def setIsLayoutLocked(value: Boolean): Self = StObject.set(x, "isLayoutLocked", value.asInstanceOf[js.Any])
      
      inline def setIsLayoutLockedUndefined: Self = StObject.set(x, "isLayoutLocked", js.undefined)
      
      inline def setIsReordering(value: Boolean): Self = StObject.set(x, "isReordering", value.asInstanceOf[js.Any])
      
      inline def setIsReorderingUndefined: Self = StObject.set(x, "isReordering", js.undefined)
      
      inline def setNumFrozenColumnsClamped(value: Double): Self = StObject.set(x, "numFrozenColumnsClamped", value.asInstanceOf[js.Any])
      
      inline def setNumFrozenRowsClamped(value: Double): Self = StObject.set(x, "numFrozenRowsClamped", value.asInstanceOf[js.Any])
      
      inline def setRowHeights(value: js.Array[Double]): Self = StObject.set(x, "rowHeights", value.asInstanceOf[js.Any])
      
      inline def setRowHeightsVarargs(value: Double*): Self = StObject.set(x, "rowHeights", js.Array(value*))
      
      inline def setScrollDirection(value: ScrollDirection): Self = StObject.set(x, "scrollDirection", value.asInstanceOf[js.Any])
      
      inline def setScrollDirectionNull: Self = StObject.set(x, "scrollDirection", null)
      
      inline def setScrollDirectionUndefined: Self = StObject.set(x, "scrollDirection", js.undefined)
      
      inline def setSelectedRegions(value: js.Array[Region]): Self = StObject.set(x, "selectedRegions", value.asInstanceOf[js.Any])
      
      inline def setSelectedRegionsVarargs(value: Region*): Self = StObject.set(x, "selectedRegions", js.Array(value*))
      
      inline def setVerticalGuides(value: js.Array[Double]): Self = StObject.set(x, "verticalGuides", value.asInstanceOf[js.Any])
      
      inline def setVerticalGuidesVarargs(value: Double*): Self = StObject.set(x, "verticalGuides", js.Array(value*))
      
      inline def setViewportRect(value: Rect): Self = StObject.set(x, "viewportRect", value.asInstanceOf[js.Any])
      
      inline def setViewportRectUndefined: Self = StObject.set(x, "viewportRect", js.undefined)
    }
  }
}
