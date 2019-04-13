package typings
package atBlueprintjsTableLib.libEsmHeadersColumnHeaderCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
@js.native
class ColumnHeaderCell ()
  extends atBlueprintjsCoreLib.atBlueprintjsCoreMod.AbstractPureComponent[IColumnHeaderCellProps, IColumnHeaderCellState] {
  @JSName("context")
  var context_ColumnHeaderCell: atBlueprintjsTableLib.libEsmCommonContextMod.IColumnInteractionBarContextTypes = js.native
  var handlePopoverClosing: js.Any = js.native
  var handlePopoverOpened: js.Any = js.native
  @JSName("state")
  var state_ColumnHeaderCell: atBlueprintjsTableLib.Anon_IsActive = js.native
  /* private */ def maybeRenderContent(): js.Any = js.native
  /* private */ def maybeRenderDropdownMenu(): js.Any = js.native
  /* private */ def renderName(): js.Any = js.native
}

/* static members */
@JSImport("@blueprintjs/table/lib/esm/headers/columnHeaderCell", "ColumnHeaderCell")
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

