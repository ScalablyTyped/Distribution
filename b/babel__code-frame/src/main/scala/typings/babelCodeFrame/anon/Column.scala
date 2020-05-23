package typings.babelCodeFrame.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: Double
}

object Column {
  @scala.inline
  def apply(line: Double, column: js.UndefOr[Double] = js.undefined): Column = {
    val __obj = js.Dynamic.literal(line = line.asInstanceOf[js.Any])
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

