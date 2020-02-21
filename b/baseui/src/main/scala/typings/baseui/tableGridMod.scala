package typings.baseui

import typings.baseui.tableMod.SortableHeadCellProps
import typings.react.mod.FC
import typings.styletronReact.mod.StyletronComponent
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("baseui/table-grid", JSImport.Namespace)
@js.native
object tableGridMod extends js.Object {
  val SortableHeadCell: FC[SortableHeadCellProps] = js.native
  val StyledBodyCell: StyletronComponent[js.Any] = js.native
  val StyledHeadCell: StyletronComponent[js.Any] = js.native
  val StyledTable: StyletronComponent[js.Any] = js.native
  @js.native
  object SORT_DIRECTION extends js.Object {
    /* "ASC" */ val ASC: typings.baseui.tableMod.SORT_DIRECTION.ASC with String = js.native
    /* "DESC" */ val DESC: typings.baseui.tableMod.SORT_DIRECTION.DESC with String = js.native
    @JSBracketAccess
    def apply(value: String): js.UndefOr[typings.baseui.tableMod.SORT_DIRECTION with String] = js.native
  }
  
}

