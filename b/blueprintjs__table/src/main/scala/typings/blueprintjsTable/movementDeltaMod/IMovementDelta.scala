package typings.blueprintjsTable.movementDeltaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IMovementDelta extends js.Object {
  /** The number of columns by which to move. */
  var cols: Double
  /** The number of rows by which to move. */
  var rows: Double
}

object IMovementDelta {
  @scala.inline
  def apply(cols: Double, rows: Double): IMovementDelta = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMovementDelta]
  }
}

