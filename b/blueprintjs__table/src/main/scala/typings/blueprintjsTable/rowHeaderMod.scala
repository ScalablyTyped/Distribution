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
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object rowHeaderMod {
  
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
    
    var convertPointToRow: js.Any = js.native
    
    var getCellExtremaClasses: js.Any = js.native
    
    var getDragCoordinate: js.Any = js.native
    
    var getMouseCoordinate: js.Any = js.native
    
    var getRowHeight: js.Any = js.native
    
    var handleResizeEnd: js.Any = js.native
    
    var handleSizeChanged: js.Any = js.native
    
    var isCellSelected: js.Any = js.native
    
    var isGhostIndex: js.Any = js.native
    
    var renderGhostCell: js.Any = js.native
    
    var toRegion: js.Any = js.native
    
    var wrapCells: js.Any = js.native
  }
  /* static members */
  object RowHeader {
    
    @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader")
    @js.native
    val ^ : js.Any = js.native
    
    @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "RowHeader.defaultProps")
    @js.native
    def defaultProps: RowHeaderCellRenderer = js.native
    @scala.inline
    def defaultProps_=(x: RowHeaderCellRenderer): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("defaultProps")(x.asInstanceOf[js.Any])
  }
  
  @JSImport("@blueprintjs/table/lib/esm/headers/rowHeader", "renderDefaultRowHeader")
  @js.native
  def renderDefaultRowHeader(rowIndex: Double): Element = js.native
  
  @js.native
  trait IRowHeaderProps
    extends IHeaderProps
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
  
  @js.native
  trait IRowHeights extends StObject {
    
    var defaultRowHeight: js.UndefOr[Double] = js.native
    
    var maxRowHeight: js.UndefOr[Double] = js.native
    
    var minRowHeight: js.UndefOr[Double] = js.native
  }
  object IRowHeights {
    
    @scala.inline
    def apply(): IRowHeights = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[IRowHeights]
    }
    
    @scala.inline
    implicit class IRowHeightsMutableBuilder[Self <: IRowHeights] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultRowHeight(value: Double): Self = StObject.set(x, "defaultRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultRowHeightUndefined: Self = StObject.set(x, "defaultRowHeight", js.undefined)
      
      @scala.inline
      def setMaxRowHeight(value: Double): Self = StObject.set(x, "maxRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxRowHeightUndefined: Self = StObject.set(x, "maxRowHeight", js.undefined)
      
      @scala.inline
      def setMinRowHeight(value: Double): Self = StObject.set(x, "minRowHeight", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMinRowHeightUndefined: Self = StObject.set(x, "minRowHeight", js.undefined)
    }
  }
}
