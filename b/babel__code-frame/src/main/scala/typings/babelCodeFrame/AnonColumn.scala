package typings.babelCodeFrame

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: Double
}

object AnonColumn {
  @scala.inline
  def apply(line: Double, column: Int | Double = null): AnonColumn = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    if (column != null) __obj.updateDynamic("column")(column.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonColumn]
  }
}

