package typings.baseui.tableSemanticMod

import typings.react.mod.ReactNode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TableBuilderColumnProps[RowT] extends js.Object {
  var header: js.UndefOr[ReactNode] = js.native
  var id: js.UndefOr[String] = js.native
  var numeric: js.UndefOr[Boolean] = js.native
  var overrides: js.UndefOr[ColumnOverrides] = js.native
  var sortable: js.UndefOr[Boolean] = js.native
  def children(row: RowT): ReactNode = js.native
  def children(row: RowT, rowIndex: Double): ReactNode = js.native
  def children(row: js.Any): ReactNode = js.native
  def children(row: js.Any, rowIndex: Double): ReactNode = js.native
}

