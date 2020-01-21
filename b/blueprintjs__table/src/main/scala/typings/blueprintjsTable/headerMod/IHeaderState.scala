package typings.blueprintjsTable.headerMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderState extends js.Object {
  /**
    * Whether the component has a valid selection specified either via props
    * (i.e. controlled mode) or via a completed drag-select interaction. When
    * true, DragReorderable will know that it can override the click-and-drag
    * interactions that would normally be reserved for drag-select behavior.
    */
  var hasValidSelection: js.UndefOr[Boolean] = js.undefined
}

object IHeaderState {
  @scala.inline
  def apply(hasValidSelection: js.UndefOr[Boolean] = js.undefined): IHeaderState = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(hasValidSelection)) __obj.updateDynamic("hasValidSelection")(hasValidSelection.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderState]
  }
}

