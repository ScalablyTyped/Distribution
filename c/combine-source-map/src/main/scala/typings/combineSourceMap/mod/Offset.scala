package typings.combineSourceMap.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** An offset line and column number */
trait Offset extends js.Object {
  var column: js.UndefOr[Double] = js.undefined
  var line: js.UndefOr[Double] = js.undefined
}

object Offset {
  @scala.inline
  def apply(column: js.UndefOr[Double] = js.undefined, line: js.UndefOr[Double] = js.undefined): Offset = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(column)) __obj.updateDynamic("column")(column.get.asInstanceOf[js.Any])
    if (!js.isUndefined(line)) __obj.updateDynamic("line")(line.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[Offset]
  }
}

