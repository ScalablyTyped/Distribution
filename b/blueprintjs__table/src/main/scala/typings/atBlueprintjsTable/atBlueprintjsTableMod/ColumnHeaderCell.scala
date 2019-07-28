package typings.atBlueprintjsTable.atBlueprintjsTableMod

import typings.atBlueprintjsTable.libEsmCommonContextMod.IColumnInteractionBarContextTypes
import typings.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod.IColumnHeaderCellProps
import typings.react.reactMod.ValidationMap
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends typings.atBlueprintjsTable.libEsmHeadersColumnHeaderCellMod.ColumnHeaderCell

/* static members */
@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
object ColumnHeaderCell extends js.Object {
  var contextTypes: ValidationMap[IColumnInteractionBarContextTypes] = js.native
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

