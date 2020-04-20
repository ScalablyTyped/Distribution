package typings.blueprintjsTable.headerCellMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IHeaderCellState extends js.Object {
  var isActive: Boolean
}

object IHeaderCellState {
  @scala.inline
  def apply(isActive: Boolean): IHeaderCellState = {
    val __obj = js.Dynamic.literal(isActive = isActive.asInstanceOf[js.Any])
    __obj.asInstanceOf[IHeaderCellState]
  }
}

