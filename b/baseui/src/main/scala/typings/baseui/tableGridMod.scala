package typings.baseui

import typings.baseui.anon.Cursor
import typings.baseui.anon.GridColumn
import typings.baseui.anon.GridTemplateColumns
import typings.baseui.baseuiStrings.div
import typings.baseui.tableTypesMod.HeadCellProps
import typings.react.mod.global.JSX.Element
import typings.styletronReact.typesMod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableGridMod {
  
  @JSImport("baseui/table-grid", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  /* Inlined std.Readonly<{ readonly ASC :'ASC',  readonly DESC :'DESC'}> */
  object SORT_DIRECTION {
    
    @JSImport("baseui/table-grid", "SORT_DIRECTION.ASC")
    @js.native
    val ASC: typings.baseui.baseuiStrings.ASC = js.native
    
    @JSImport("baseui/table-grid", "SORT_DIRECTION.DESC")
    @js.native
    val DESC: typings.baseui.baseuiStrings.DESC = js.native
  }
  
  inline def SortableHeadCell(props: HeadCellProps): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("SortableHeadCell")(props.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  @JSImport("baseui/table-grid", "StyledBodyCell")
  @js.native
  val StyledBodyCell: StyletronComponent[div, GridColumn] = js.native
  
  @JSImport("baseui/table-grid", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[div, Cursor] = js.native
  
  @JSImport("baseui/table-grid", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[div, GridTemplateColumns] = js.native
}
