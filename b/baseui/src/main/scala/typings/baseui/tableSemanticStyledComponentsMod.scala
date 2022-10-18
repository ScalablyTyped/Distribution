package typings.baseui

import typings.baseui.anon.SVGAttributesSVGElementch
import typings.baseui.anon.isFocusVisiblebooleanStyl
import typings.baseui.baseuiStrings.div
import typings.baseui.baseuiStrings.span
import typings.baseui.baseuiStrings.table
import typings.baseui.baseuiStrings.tbody
import typings.baseui.baseuiStrings.td_
import typings.baseui.baseuiStrings.th_
import typings.baseui.baseuiStrings.thead
import typings.baseui.baseuiStrings.tr_
import typings.baseui.tableSemanticTypesMod.Divider
import typings.baseui.tableSemanticTypesMod.Size
import typings.react.mod.ForwardRefExoticComponent
import typings.styletronReact.libTypesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableSemanticStyledComponentsMod {
  
  @JSImport("baseui/table-semantic/styled-components", "StyledRoot")
  @js.native
  val StyledRoot: StyletronComponent[div, StyledRootProps] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledSortAscIcon")
  @js.native
  val StyledSortAscIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledSortDescIcon")
  @js.native
  val StyledSortDescIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledSortIconContainer")
  @js.native
  val StyledSortIconContainer: StyletronComponent[span, js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledSortNoneIcon")
  @js.native
  val StyledSortNoneIcon: StyletronComponent[ForwardRefExoticComponent[SVGAttributesSVGElementch], js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[table, StyledTableProps] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableBody")
  @js.native
  val StyledTableBody: StyletronComponent[tbody, js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableBodyCell")
  @js.native
  val StyledTableBodyCell: StyletronComponent[td_, StyledTableBodyCellProps] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableBodyRow")
  @js.native
  val StyledTableBodyRow: StyletronComponent[tr_, StyledTableBodyRowProps] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableEmptyMessage")
  @js.native
  val StyledTableEmptyMessage: StyletronComponent[div, js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableHead")
  @js.native
  val StyledTableHead: StyletronComponent[thead, js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableHeadCell")
  @js.native
  val StyledTableHeadCell: StyletronComponent[th_, StyledTableHeadCellProps] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableHeadCellSortable")
  @js.native
  val StyledTableHeadCellSortable: StyletronComponent[th_, isFocusVisiblebooleanStyl] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableHeadRow")
  @js.native
  val StyledTableHeadRow: StyletronComponent[tr_, js.Object] = js.native
  
  @JSImport("baseui/table-semantic/styled-components", "StyledTableLoadingMessage")
  @js.native
  val StyledTableLoadingMessage: StyletronComponent[div, js.Object] = js.native
  
  trait StyledRootProps extends StObject {
    
    @JSName("$divider")
    var $divider: js.UndefOr[Divider] = js.undefined
  }
  object StyledRootProps {
    
    inline def apply(): StyledRootProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledRootProps]
    }
    
    extension [Self <: StyledRootProps](x: Self) {
      
      inline def set$divider(value: Divider): Self = StObject.set(x, "$divider", value.asInstanceOf[js.Any])
      
      inline def set$dividerUndefined: Self = StObject.set(x, "$divider", js.undefined)
    }
  }
  
  trait StyledTableBodyCellProps extends StObject {
    
    @JSName("$col")
    var $col: js.UndefOr[js.Object] = js.undefined
    
    @JSName("$colIndex")
    var $colIndex: js.UndefOr[Double | Null] = js.undefined
    
    @JSName("$divider")
    var $divider: js.UndefOr[Divider] = js.undefined
    
    @JSName("$isLastRow")
    var $isLastRow: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$isNumeric")
    var $isNumeric: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$isSortable")
    var $isSortable: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$row")
    var $row: js.UndefOr[js.Object] = js.undefined
    
    @JSName("$rowIndex")
    var $rowIndex: js.UndefOr[Double | Null] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object StyledTableBodyCellProps {
    
    inline def apply(): StyledTableBodyCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledTableBodyCellProps]
    }
    
    extension [Self <: StyledTableBodyCellProps](x: Self) {
      
      inline def set$col(value: js.Object): Self = StObject.set(x, "$col", value.asInstanceOf[js.Any])
      
      inline def set$colIndex(value: Double): Self = StObject.set(x, "$colIndex", value.asInstanceOf[js.Any])
      
      inline def set$colIndexNull: Self = StObject.set(x, "$colIndex", null)
      
      inline def set$colIndexUndefined: Self = StObject.set(x, "$colIndex", js.undefined)
      
      inline def set$colUndefined: Self = StObject.set(x, "$col", js.undefined)
      
      inline def set$divider(value: Divider): Self = StObject.set(x, "$divider", value.asInstanceOf[js.Any])
      
      inline def set$dividerUndefined: Self = StObject.set(x, "$divider", js.undefined)
      
      inline def set$isLastRow(value: Boolean): Self = StObject.set(x, "$isLastRow", value.asInstanceOf[js.Any])
      
      inline def set$isLastRowNull: Self = StObject.set(x, "$isLastRow", null)
      
      inline def set$isLastRowUndefined: Self = StObject.set(x, "$isLastRow", js.undefined)
      
      inline def set$isNumeric(value: Boolean): Self = StObject.set(x, "$isNumeric", value.asInstanceOf[js.Any])
      
      inline def set$isNumericNull: Self = StObject.set(x, "$isNumeric", null)
      
      inline def set$isNumericUndefined: Self = StObject.set(x, "$isNumeric", js.undefined)
      
      inline def set$isSortable(value: Boolean): Self = StObject.set(x, "$isSortable", value.asInstanceOf[js.Any])
      
      inline def set$isSortableNull: Self = StObject.set(x, "$isSortable", null)
      
      inline def set$isSortableUndefined: Self = StObject.set(x, "$isSortable", js.undefined)
      
      inline def set$row(value: js.Object): Self = StObject.set(x, "$row", value.asInstanceOf[js.Any])
      
      inline def set$rowIndex(value: Double): Self = StObject.set(x, "$rowIndex", value.asInstanceOf[js.Any])
      
      inline def set$rowIndexNull: Self = StObject.set(x, "$rowIndex", null)
      
      inline def set$rowIndexUndefined: Self = StObject.set(x, "$rowIndex", js.undefined)
      
      inline def set$rowUndefined: Self = StObject.set(x, "$row", js.undefined)
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  trait StyledTableBodyRowProps extends StObject {
    
    @JSName("$col")
    var $col: js.UndefOr[js.Object] = js.undefined
    
    @JSName("$colIndex")
    var $colIndex: js.UndefOr[Double | Null] = js.undefined
    
    @JSName("$divider")
    var $divider: js.UndefOr[Divider] = js.undefined
  }
  object StyledTableBodyRowProps {
    
    inline def apply(): StyledTableBodyRowProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledTableBodyRowProps]
    }
    
    extension [Self <: StyledTableBodyRowProps](x: Self) {
      
      inline def set$col(value: js.Object): Self = StObject.set(x, "$col", value.asInstanceOf[js.Any])
      
      inline def set$colIndex(value: Double): Self = StObject.set(x, "$colIndex", value.asInstanceOf[js.Any])
      
      inline def set$colIndexNull: Self = StObject.set(x, "$colIndex", null)
      
      inline def set$colIndexUndefined: Self = StObject.set(x, "$colIndex", js.undefined)
      
      inline def set$colUndefined: Self = StObject.set(x, "$col", js.undefined)
      
      inline def set$divider(value: Divider): Self = StObject.set(x, "$divider", value.asInstanceOf[js.Any])
      
      inline def set$dividerUndefined: Self = StObject.set(x, "$divider", js.undefined)
    }
  }
  
  trait StyledTableHeadCellProps extends StObject {
    
    @JSName("$col")
    var $col: js.UndefOr[js.Object] = js.undefined
    
    @JSName("$colIndex")
    var $colIndex: js.UndefOr[Double | Null] = js.undefined
    
    @JSName("$divider")
    var $divider: js.UndefOr[Divider] = js.undefined
    
    @JSName("$isNumeric")
    var $isNumeric: js.UndefOr[Boolean | Null] = js.undefined
    
    @JSName("$size")
    var $size: js.UndefOr[Size] = js.undefined
  }
  object StyledTableHeadCellProps {
    
    inline def apply(): StyledTableHeadCellProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledTableHeadCellProps]
    }
    
    extension [Self <: StyledTableHeadCellProps](x: Self) {
      
      inline def set$col(value: js.Object): Self = StObject.set(x, "$col", value.asInstanceOf[js.Any])
      
      inline def set$colIndex(value: Double): Self = StObject.set(x, "$colIndex", value.asInstanceOf[js.Any])
      
      inline def set$colIndexNull: Self = StObject.set(x, "$colIndex", null)
      
      inline def set$colIndexUndefined: Self = StObject.set(x, "$colIndex", js.undefined)
      
      inline def set$colUndefined: Self = StObject.set(x, "$col", js.undefined)
      
      inline def set$divider(value: Divider): Self = StObject.set(x, "$divider", value.asInstanceOf[js.Any])
      
      inline def set$dividerUndefined: Self = StObject.set(x, "$divider", js.undefined)
      
      inline def set$isNumeric(value: Boolean): Self = StObject.set(x, "$isNumeric", value.asInstanceOf[js.Any])
      
      inline def set$isNumericNull: Self = StObject.set(x, "$isNumeric", null)
      
      inline def set$isNumericUndefined: Self = StObject.set(x, "$isNumeric", js.undefined)
      
      inline def set$size(value: Size): Self = StObject.set(x, "$size", value.asInstanceOf[js.Any])
      
      inline def set$sizeUndefined: Self = StObject.set(x, "$size", js.undefined)
    }
  }
  
  trait StyledTableProps extends StObject {
    
    @JSName("$width")
    var $width: js.UndefOr[String | Null] = js.undefined
  }
  object StyledTableProps {
    
    inline def apply(): StyledTableProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[StyledTableProps]
    }
    
    extension [Self <: StyledTableProps](x: Self) {
      
      inline def set$width(value: String): Self = StObject.set(x, "$width", value.asInstanceOf[js.Any])
      
      inline def set$widthNull: Self = StObject.set(x, "$width", null)
      
      inline def set$widthUndefined: Self = StObject.set(x, "$width", js.undefined)
    }
  }
}
