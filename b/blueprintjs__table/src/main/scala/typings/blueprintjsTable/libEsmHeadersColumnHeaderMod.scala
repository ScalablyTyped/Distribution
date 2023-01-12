package typings.blueprintjsTable

import typings.blueprintjsTable.anon.IsReorderable
import typings.blueprintjsTable.blueprintjsTableStrings.column
import typings.blueprintjsTable.blueprintjsTableStrings.row
import typings.blueprintjsTable.libEsmCommonGridMod.ColumnIndices
import typings.blueprintjsTable.libEsmHeadersHeaderMod.IHeaderProps
import typings.blueprintjsTable.libEsmInteractionsResizableMod.IIndexedResizeCallback
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.Ref
import typings.std.HTMLDivElement
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersColumnHeaderMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/columnHeader", "ColumnHeader")
  @js.native
  open class ColumnHeader protected ()
    extends Component[IColumnHeaderProps, js.Object, Any] {
    def this(props: IColumnHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IColumnHeaderProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MColumnHeader(): Unit = js.native
    
    /* private */ var convertPointToColumn: Any = js.native
    
    /* private */ var getCellExtremaClasses: Any = js.native
    
    /* private */ var getColumnWidth: Any = js.native
    
    /* private */ var getDragCoordinate: Any = js.native
    
    /* private */ var getMouseCoordinate: Any = js.native
    
    /* private */ var handleResizeDoubleClick: Any = js.native
    
    /* private */ var handleResizeEnd: Any = js.native
    
    /* private */ var handleSizeChanged: Any = js.native
    
    /* private */ var isCellSelected: Any = js.native
    
    /* private */ var isGhostIndex: Any = js.native
    
    /* private */ var renderGhostCell: Any = js.native
    
    /* private */ var toRegion: Any = js.native
    
    /* private */ var wrapCells: Any = js.native
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
  
  type ColumnHeaderRenderer = IColumnHeaderRenderer
  
  @js.native
  trait IColumnHeaderProps
    extends StObject
       with IHeaderProps
       with IColumnWidths
       with ColumnIndices {
    
    /**
      * A ColumnHeaderRenderer that, for each `<Column>`, will delegate to:
      * 1. The `columnHeaderCellRenderer` method from the `<Column>`
      * 2. A `<ColumnHeaderCell2>` using the `name` prop from the `<Column>`
      * 3. A `<ColumnHeaderCell2>` with a `name` generated from `Utils.toBase26Alpha`
      */
    var cellRenderer: ColumnHeaderRenderer = js.native
    
    /**
      * Ref handler that receives the HTML element that should be measured to
      * indicate the fluid height of the column header.
      */
    var measurableElementRef: js.UndefOr[Ref[HTMLDivElement]] = js.native
    
    /**
      * A callback invoked when user is done resizing the column
      */
    var onColumnWidthChanged: IIndexedResizeCallback = js.native
    
    /**
      * Called on component mount.
      */
    var onMount: js.UndefOr[js.Function1[/* whichHeader */ column | row, Unit]] = js.native
  }
  
  type IColumnHeaderRenderer = js.Function1[/* columnIndex */ Double, ReactElement | Null]
  
  trait IColumnWidths extends StObject {
    
    var defaultColumnWidth: Double
    
    var maxColumnWidth: Double
    
    var minColumnWidth: Double
  }
  object IColumnWidths {
    
    inline def apply(defaultColumnWidth: Double, maxColumnWidth: Double, minColumnWidth: Double): IColumnWidths = {
      val __obj = js.Dynamic.literal(defaultColumnWidth = defaultColumnWidth.asInstanceOf[js.Any], maxColumnWidth = maxColumnWidth.asInstanceOf[js.Any], minColumnWidth = minColumnWidth.asInstanceOf[js.Any])
      __obj.asInstanceOf[IColumnWidths]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: IColumnWidths] (val x: Self) extends AnyVal {
      
      inline def setDefaultColumnWidth(value: Double): Self = StObject.set(x, "defaultColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMaxColumnWidth(value: Double): Self = StObject.set(x, "maxColumnWidth", value.asInstanceOf[js.Any])
      
      inline def setMinColumnWidth(value: Double): Self = StObject.set(x, "minColumnWidth", value.asInstanceOf[js.Any])
    }
  }
}
