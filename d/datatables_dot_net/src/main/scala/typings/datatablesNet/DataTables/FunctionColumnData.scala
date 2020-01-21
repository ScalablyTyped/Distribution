package typings.datatablesNet.DataTables

import typings.datatablesNet.datatablesNetStrings.`type`
import typings.datatablesNet.datatablesNetStrings.display
import typings.datatablesNet.datatablesNetStrings.filter
import typings.datatablesNet.datatablesNetStrings.set
import typings.datatablesNet.datatablesNetStrings.sort
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FunctionColumnData extends js.Object {
  def apply(row: js.Any, t: `type`, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: display, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: filter, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
  def apply(row: js.Any, t: set, s: js.Any, meta: CellMetaSettings): Unit = js.native
  def apply(row: js.Any, t: sort, s: js.UndefOr[scala.Nothing], meta: CellMetaSettings): js.Any = js.native
}

