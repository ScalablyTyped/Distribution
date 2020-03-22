package typings.blueprintjsTable.columnHeaderCellMod

import typings.blueprintjsCore.mod.AbstractPureComponent2
import typings.blueprintjsTable.AnonIsActive
import typings.blueprintjsTable.ValidationMapIColumnInter
import typings.blueprintjsTable.contextMod.IColumnInteractionBarContextTypes
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends AbstractPureComponent2[IColumnHeaderCellProps, IColumnHeaderCellState, js.Object] {
  @JSName("context")
  var context_ColumnHeaderCell: IColumnInteractionBarContextTypes = js.native
  var handlePopoverClosing: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  var maybeRenderContent: js.Any = js.native
  var maybeRenderDropdownMenu: js.Any = js.native
  var renderName: js.Any = js.native
  @JSName("state")
  var state_ColumnHeaderCell: AnonIsActive = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
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

