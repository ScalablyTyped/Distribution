package typings
package cssLib.cssMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(column: scala.Int | scala.Double = null, line: scala.Int | scala.Double = null): Position = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

