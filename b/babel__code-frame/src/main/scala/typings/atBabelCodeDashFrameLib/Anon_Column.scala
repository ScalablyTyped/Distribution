package typings
package atBabelCodeDashFrameLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: js.UndefOr[scala.Double] = js.undefined
  var line: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(line: scala.Double, column: scala.Int | scala.Double = null): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("line")(line)
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Column]
  }
}

