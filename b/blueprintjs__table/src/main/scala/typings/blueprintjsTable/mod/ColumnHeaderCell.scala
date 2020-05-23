package typings.blueprintjsTable.mod

import typings.blueprintjsTable.anon.ValidationMapIColumnInter
import typings.blueprintjsTable.columnHeaderCellMod.IColumnHeaderCellProps
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends typings.blueprintjsTable.columnHeaderCellMod.ColumnHeaderCell

/* static members */
@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
object ColumnHeaderCell extends js.Object {
  var contextTypes: ValidationMapIColumnInter = js.native
  var defaultProps: IColumnHeaderCellProps = js.native
  /**
    * This method determines if a `MouseEvent` was triggered on a target that
    * should be used as the header click/drag target. This enables users of
    * this component to render fully interactive components in their header
    * cells without worry of selection or resize operations from capturing
    * their mouse events.
    */
  def isHeaderMouseTarget(target: HTMLElement): Boolean = js.native
}

