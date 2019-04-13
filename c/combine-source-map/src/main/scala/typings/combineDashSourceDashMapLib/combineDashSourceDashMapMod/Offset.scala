package typings
package combineDashSourceDashMapLib.combineDashSourceDashMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An offset line and column number */
trait Offset extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var line: js.UndefOr[scala.Double] = js.undefined
}

object Offset {
  @scala.inline
  def apply(column: scala.Int | scala.Double = null, line: scala.Int | scala.Double = null): Offset = {
    val __obj = js.Dynamic.literal()
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    if (line != null) __obj.updateDynamic("line")(line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

