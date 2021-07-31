package typings.datatablesNetFixedcolumns

import typings.datatablesNet.DataTables.CellIndexReturn
import typings.datatablesNet.JQuery
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.auto
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.none
import typings.datatablesNetFixedcolumns.datatablesNetFixedcolumnsStrings.semiauto
import typings.std.Node
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object DataTables {
  
  trait Api extends StObject {
    
    /**
      * @description Namespacing for FixedColumns methods - FixedColumns' methods are available on the returned API instance.
      * @see {@link https://datatables.net/reference/api/fixedColumns()}
      */
    def fixedColumns(): FixedColumnsMethods
  }
  object Api {
    
    @scala.inline
    def apply(fixedColumns: () => FixedColumnsMethods): Api = {
      val __obj = js.Dynamic.literal(fixedColumns = js.Any.fromFunction0(fixedColumns))
      __obj.asInstanceOf[Api]
    }
    
    @scala.inline
    implicit class ApiMutableBuilder[Self <: Api] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedColumns(value: () => FixedColumnsMethods): Self = StObject.set(x, "fixedColumns", js.Any.fromFunction0(value))
    }
  }
  
  trait CellMethods extends StObject {
    
    /**
      * @description Get the fixed column cell node for a cell or the cell from the original DataTable if there is no matching fixed cell found.
      * @see {@link https://datatables.net/reference/api/cell().fixedNode()}
      */
    def fixedNode(): Node
  }
  object CellMethods {
    
    @scala.inline
    def apply(fixedNode: () => Node): CellMethods = {
      val __obj = js.Dynamic.literal(fixedNode = js.Any.fromFunction0(fixedNode))
      __obj.asInstanceOf[CellMethods]
    }
    
    @scala.inline
    implicit class CellMethodsMutableBuilder[Self <: CellMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedNode(value: () => Node): Self = StObject.set(x, "fixedNode", js.Any.fromFunction0(value))
    }
  }
  
  trait CellsMethods extends StObject {
    
    /**
      * @description Get the fixed column cell nodes for multiple cells or an Api instance containing
      * the cells from the original DataTable if there is no matching fixed cell found.
      * @see {@link https://datatables.net/reference/api/cells().fixedNodes()}
      */
    def fixedNodes(): Api
  }
  object CellsMethods {
    
    @scala.inline
    def apply(fixedNodes: () => Api): CellsMethods = {
      val __obj = js.Dynamic.literal(fixedNodes = js.Any.fromFunction0(fixedNodes))
      __obj.asInstanceOf[CellsMethods]
    }
    
    @scala.inline
    implicit class CellsMethodsMutableBuilder[Self <: CellsMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedNodes(value: () => Api): Self = StObject.set(x, "fixedNodes", js.Any.fromFunction0(value))
    }
  }
  
  @js.native
  trait FixedColumnsMethods
    extends StObject
       with Api {
    
    /**
      * @deprecated
      * Deprecated as of v3.2.1 use dt.cell(this).index() instead
      *
      * Get the cell index of a cell in a fixed column
      *
      * @param row The cell (td or th) to get the cell index of. This can be either a cell in the fixed columns or in the host DataTable.
      */
    def cellIndex(row: JQuery): CellIndexReturn = js.native
    def cellIndex(row: Node): CellIndexReturn = js.native
    
    /**
      * @description Redraw the fixed columns based on new table size
      * @see {@link https://datatables.net/reference/api/fixedColumns().relayout()}
      */
    def relayout(): Api = js.native
    
    /**
      * @deprecated
      * Deprecated as of v3.2.1. Use dt.row(this).index() instead
      *
      * Get the row index of a row in a fixed column
      */
    def rowIndex(): Double = js.native
    
    /**
      * @description Update the data shown in the FixedColumns.
      * @see {@link https://datatables.net/reference/api/fixedColumns().update()}
      */
    def update(): Api = js.native
  }
  
  trait FixedColumnsSettings extends StObject {
    
    /**
      * Row height matching algorithm to use
      *
      * FixedColumns has three different algorithms that it can use: 'none', 'semiauto', 'auto'
      * @see {@link https://datatables.net/reference/option/fixedColumns.heightMatch}
      */
    var heightMatch: js.UndefOr[none | semiauto | auto] = js.undefined
    
    /**
      * @description The number of columns on the left hand side of the table to fix in place.
      * @see {@link https://datatables.net/reference/option/fixedColumns.leftColumns}
      */
    var leftColumns: js.UndefOr[Double] = js.undefined
    
    /**
      * @description The number of columns on the right hand side of the table to fix in place.
      * @see {@link https://datatables.net/reference/option/fixedColumns.rightColumns}
      */
    var rightColumns: js.UndefOr[Double] = js.undefined
  }
  object FixedColumnsSettings {
    
    @scala.inline
    def apply(): FixedColumnsSettings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FixedColumnsSettings]
    }
    
    @scala.inline
    implicit class FixedColumnsSettingsMutableBuilder[Self <: FixedColumnsSettings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setHeightMatch(value: none | semiauto | auto): Self = StObject.set(x, "heightMatch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHeightMatchUndefined: Self = StObject.set(x, "heightMatch", js.undefined)
      
      @scala.inline
      def setLeftColumns(value: Double): Self = StObject.set(x, "leftColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLeftColumnsUndefined: Self = StObject.set(x, "leftColumns", js.undefined)
      
      @scala.inline
      def setRightColumns(value: Double): Self = StObject.set(x, "rightColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRightColumnsUndefined: Self = StObject.set(x, "rightColumns", js.undefined)
    }
  }
  
  trait RowsMethods extends StObject {
    
    /**
      * @description Mark the heights of the selected rows (from rows()) to be recalculated on the next draw.
      * @see {@link https://datatables.net/reference/api/rows().recalcHeight()}
      */
    def recalcHeight(): Api
  }
  object RowsMethods {
    
    @scala.inline
    def apply(recalcHeight: () => Api): RowsMethods = {
      val __obj = js.Dynamic.literal(recalcHeight = js.Any.fromFunction0(recalcHeight))
      __obj.asInstanceOf[RowsMethods]
    }
    
    @scala.inline
    implicit class RowsMethodsMutableBuilder[Self <: RowsMethods] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setRecalcHeight(value: () => Api): Self = StObject.set(x, "recalcHeight", js.Any.fromFunction0(value))
    }
  }
  
  trait Settings extends StObject {
    
    /**
      * @description Enable and configure the FixedColumns extension for DataTables.
      * @see {@link https://datatables.net/reference/option/fixedColumns}
      */
    var fixedColumns: js.UndefOr[Boolean | FixedColumnsSettings] = js.undefined
  }
  object Settings {
    
    @scala.inline
    def apply(): Settings = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Settings]
    }
    
    @scala.inline
    implicit class SettingsMutableBuilder[Self <: Settings] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setFixedColumns(value: Boolean | FixedColumnsSettings): Self = StObject.set(x, "fixedColumns", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFixedColumnsUndefined: Self = StObject.set(x, "fixedColumns", js.undefined)
    }
  }
}
