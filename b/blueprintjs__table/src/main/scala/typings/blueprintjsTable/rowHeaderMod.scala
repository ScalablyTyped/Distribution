package typings.blueprintjsTable

import typings.blueprintjsTable.anon.RowHeaderCellRenderer
import typings.blueprintjsTable.gridMod.IRowIndices
import typings.blueprintjsTable.headerMod.IHeaderProps
import typings.blueprintjsTable.resizableMod.IIndexedResizeCallback
import typings.react.mod.Component
import typings.react.mod.ReactElement
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowHeaderMod {
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
  @js.native
  class RowHeader protected ()
    extends Component[IRowHeaderProps, js.Object, js.Any] {
    def this(props: IRowHeaderProps) = this()
    /**
      * @deprecated
      * @see https://reactjs.org/docs/legacy-context.html
      */
    def this(props: IRowHeaderProps, context: js.Any) = this()
    
    /* private */ var convertPointToRow: js.Any = js.native
    
    /* private */ var getCellExtremaClasses: js.Any = js.native
    
    /* private */ var getDragCoordinate: js.Any = js.native
    
    /* private */ var getMouseCoordinate: js.Any = js.native
    
    /* private */ var getRowHeight: js.Any = js.native
    
    /* private */ var handleResizeEnd: js.Any = js.native
    
    /* private */ var handleSizeChanged: js.Any = js.native
    
    /* private */ var isCellSelected: js.Any = js.native
    
    /* private */ var isGhostIndex: js.Any = js.native
    
    /* private */ var renderGhostCell: js.Any = js.native
    
    /* private */ var toRegion: js.Any = js.native
    
    /* private */ var wrapCells: js.Any = js.native
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
       with IRowIndices {
    
    /**
      * A callback invoked when user is done resizing the column
      */
    var onRowHeightChanged: IIndexedResizeCallback = js.native
    
    /**
      * Renders the cell for each row header
      */
    var rowHeaderCellRenderer: js.UndefOr[IRowHeaderRenderer] = js.native
  }
  
  type IRowHeaderRenderer = js.Function1[/* rowIndex */ Double, ReactElement]
  
  trait IRowHeights extends StObject {
    
    var defaultRowHeight: js.UndefOr[Double] = js.undefined
    
    var maxRowHeight: js.UndefOr[Double] = js.undefined
    
    var minRowHeight: js.UndefOr[Double] = js.undefined
  }
  object IRowHeights {
    
    inline def apply(): IRowHeights = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowHeights]
    }
    
    extension [Self <: IRowHeights](x: Self) {
      
      inline def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      inline def setDefaultRowHeightUndefined: Self = StObject.set(x, "defaultRowHeight", js.undefined)
      
      inline def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMaxRowHeightUndefined: Self = StObject.set(x, "maxRowHeight", js.undefined)
      
      inline def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      inline def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
    }
  }
}
