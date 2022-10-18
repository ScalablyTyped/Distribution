package typings.blueprintjsTable

import typings.blueprintjsTable.anon.RowHeaderCellRenderer
import typings.blueprintjsTable.blueprintjsTableStrings.column
import typings.blueprintjsTable.blueprintjsTableStrings.row
import typings.blueprintjsTable.libEsmCommonGridMod.RowIndices
import typings.blueprintjsTable.libEsmHeadersHeaderMod.IHeaderProps
import typings.blueprintjsTable.libEsmInteractionsResizableMod.IIndexedResizeCallback
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libEsmHeadersRowHeaderMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
  @js.native
  open class RowHeader protected ()
    extends Component[IRowHeaderProps, js.Object, Any] {
    def this(props: IRowHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IRowHeaderProps, context: Any) = this()
    
    @JSName("componentDidMount")
    def componentDidMount_MRowHeader(): Unit = js.native
    
    /* private */ var convertPointToRow: Any = js.native
    
    /* private */ var getCellExtremaClasses: Any = js.native
    
    /* private */ var getDragCoordinate: Any = js.native
    
    /* private */ var getMouseCoordinate: Any = js.native
    
    /* private */ var getRowHeight: Any = js.native
    
    /* private */ var handleResizeEnd: Any = js.native
    
    /* private */ var handleSizeChanged: Any = js.native
    
    /* private */ var isCellSelected: Any = js.native
    
    /* private */ var isGhostIndex: Any = js.native
    
    /* private */ var renderGhostCell: Any = js.native
    
    /* private */ var toRegion: Any = js.native
    
    /* private */ var wrapCells: Any = js.native
  }
  /* static members */
  object RowHeader {
    
    @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader.defaultProps")
    @js.native
    def defaultProps: RowHeaderCellRenderer = js.native
    inline def defaultProps_=(x: RowHeaderCellRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  inline def renderDefaultRowHeader(rowIndex: Double): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("renderDefaultRowHeader")(rowIndex.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @js.native
  trait IRowHeaderProps
    extends StObject
       with IHeaderProps
       with IRowHeights
       with RowIndices {
    
    /**
      * Called on component mount.
      */
    var onMount: js.UndefOr[js.Function1[/* whichHeader */ column | row, Unit]] = js.native
    
    /**
      * A callback invoked when user is done resizing the column
      */
    var onRowHeightChanged: IIndexedResizeCallback = js.native
    
    /**
      * Renders the cell for each row header
      */
    var rowHeaderCellRenderer: js.UndefOr[RowHeaderRenderer] = js.native
  }
  
  type IRowHeaderRenderer = js.Function1[/* rowIndex */ Double, ReactElement]
  
  trait IRowHeights extends StObject {
    
    var defaultRowHeight: Double
    
    var maxRowHeight: Double
    
    var minRowHeight: Double
  }
  object IRowHeights {
    
    inline def apply(defaultRowHeight: Double, maxRowHeight: Double, minRowHeight: Double): IRowHeights = {
      val __obj = js.Dynamic.literal(defaultRowHeight = defaultRowHeight.asInstanceOf[js.Any], maxRowHeight = maxRowHeight.asInstanceOf[js.Any], minRowHeight = minRowHeight.asInstanceOf[js.Any])
      __obj.asInstanceOf[IRowHeights]
    }
    
    extension [Self <: IRowHeights](x: Self) {
      
      inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
    }
  }
  
  type RowHeaderRenderer = IRowHeaderRenderer
}
