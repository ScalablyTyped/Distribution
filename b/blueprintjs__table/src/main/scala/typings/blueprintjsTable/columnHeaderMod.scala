package typings.blueprintjsTable

import typings.blueprintjsTable.anon.IsReorderable
import typings.blueprintjsTable.gridMod.IColumnIndices
import typings.blueprintjsTable.headerMod.IHeaderProps
import typings.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.std.HTMLElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object columnHeaderMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
  @js.native
  class ColumnHeader protected ()
    extends Component[IColumnHeaderProps, js.Object, js.Any] {
    def this(props: IColumnHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColumnHeaderProps, context: js.Any) = this()
    
    /* private */ var convertPointToColumn: js.Any = js.native
    
    /* private */ var getCellExtremaClasses: js.Any = js.native
    
    /* private */ var getColumnWidth: js.Any = js.native
    
    /* private */ var getDragCoordinate: js.Any = js.native
    
    /* private */ var getMouseCoordinate: js.Any = js.native
    
    /* private */ var handleResizeDoubleClick: js.Any = js.native
    
    /* private */ var handleResizeEnd: js.Any = js.native
    
    /* private */ var handleSizeChanged: js.Any = js.native
    
    /* private */ var isCellSelected: js.Any = js.native
    
    /* private */ var isGhostIndex: js.Any = js.native
    
    /* private */ var renderGhostCell: js.Any = js.native
    
    /* private */ var toRegion: js.Any = js.native
    
    /* private */ var wrapCells: js.Any = js.native
  }
  /* static members */
  object ColumnHeader {
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader.defaultProps")
    @js.native
    def defaultProps: IsReorderable = js.native
    inline def defaultProps_=(x: IsReorderable): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @js.native
  trait IColumnHeaderProps
    extends StObject
       with IHeaderProps
       with IColumnWidths
       with IColumnIndices {
    
    /**
      * A IColumnHeaderRenderer that, for each `<Column>`, will delegate to:
      * 1. The `columnHeaderCellRenderer` method from the `<Column>`
      * 2. A `<ColumnHeaderCell>` using the `name` prop from the `<Column>`
      * 3. A `<ColumnHeaderCell>` with a `name` generated from `Utils.toBase26Alpha`
      */
    var cellRenderer: IColumnHeaderRenderer = js.native
    
    /**
      * Ref handler that receives the HTML element that should be measured to
      * indicate the fluid height of the column header.
      */
    var measurableElementRef: js.UndefOr[js.Function1[/* ref */ HTMLElement | Null, Unit]] = js.native
    
    /**
      * A callback invoked when user is done resizing the column
      */
    var onColumnWidthChanged: IIndexedResizeCallback = js.native
  }
  
  type IColumnHeaderRenderer = js.Function1[/* columnIndex */ Double, ReactElement]
  
  trait IColumnWidths extends StObject {
    
    var defaultColumnWidth: js.UndefOr[Double] = js.undefined
    
    var maxColumnWidth: js.UndefOr[Double] = js.undefined
    
    var minColumnWidth: js.UndefOr[Double] = js.undefined
  }
  object IColumnWidths {
    
    inline def apply(): IColumnWidths = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IColumnWidths]
    }
    
    extension [Self <: IColumnWidths](x: Self) {
      
      inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setDefaultColumnWidthUndefined: Self = StObject.set(x, "defaultColumnWidth", js.undefined)
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidthUndefined: Self = StObject.set(x, "maxColumnWidth", js.undefined)
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidthUndefined: Self = StObject.set(x, "minColumnWidth", js.undefined)
    }
  }
}
