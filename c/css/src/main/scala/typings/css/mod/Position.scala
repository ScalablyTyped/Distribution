package typings.css.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
}

object Position {
  @scala.inline
  def apply(column: js.UndefOr[Double] = js.undefined, line: js.UndefOr[Double] = js.undefined): Position = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

