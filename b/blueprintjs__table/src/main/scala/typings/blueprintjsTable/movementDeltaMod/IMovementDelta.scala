package typings.blueprintjsTable.movementDeltaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IMovementDelta extends js.Object {
  /** The number of columns by which to move. */
  var cols: Double = js.native
  /** The number of rows by which to move. */
  var rows: Double = js.native
}

object IMovementDelta {
  @scala.inline
  def apply(cols: Double, rows: Double): IMovementDelta = {
    val __obj = js.Dynamic.literal(cols = cols.asInstanceOf[js.Any], rows = rows.asInstanceOf[js.Any])
    __obj.asInstanceOf[IMovementDelta]
  }
  @scala.inline
  implicit class IMovementDeltaOps[Self <: IMovementDelta] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCols(value: Double): Self = this.set("cols", value.asInstanceOf[js.Any])
    @scala.inline
    def setRows(value: Double): Self = this.set("rows", value.asInstanceOf[js.Any])
  }
  
}

