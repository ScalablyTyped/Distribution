package typings
package atBlueprintjsTableLib.atBlueprintjsTableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod.ColumnHeaderCell

/* static members */
@JSImport("@blueprintjs/table", "ColumnHeaderCell")
@js.native
object ColumnHeaderCell extends js.Object {
  var contextTypes: reactLib.reactMod.ValidationMap[atBlueprintjsTableLib.libEsmCommonContextMod.IColumnInteractionBarContextTypes] = js.native
  var defaultProps: atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod.IColumnHeaderCellProps = js.native
  /**
    * This method determines if a `MouseEvent` was triggered on a target that
    * should be used as the header click/drag target. This enables users of
    * this component to render fully interactive components in their header
    * cells without worry of selection or resize operations from capturing
    * their mouse events.
    */
  def isHeaderMouseTarget(target: stdLib.HTMLElement): scala.Boolean = js.native
}

