package typings.baseui

import typings.baseui.tableMod.SortableHeadCellProps
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object tableGridMod {
  
  @JSImport("baseui/table-grid", "SORT_DIRECTION")
  @js.native
  object SORT_DIRECTION extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.baseui.tableMod.SORT_DIRECTION with String] = js.native
    
    /* "ASC" */ val ASC: typings.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    
    /* "DESC" */ val DESC: typings.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
  }
  
  @JSImport("baseui/table-grid", "SortableHeadCell")
  @js.native
  val SortableHeadCell: FC[SortableHeadCellProps] = js.native
  
  @JSImport("baseui/table-grid", "StyledBodyCell")
  @js.native
  val StyledBodyCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-grid", "StyledHeadCell")
  @js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  
  @JSImport("baseui/table-grid", "StyledTable")
  @js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
}
