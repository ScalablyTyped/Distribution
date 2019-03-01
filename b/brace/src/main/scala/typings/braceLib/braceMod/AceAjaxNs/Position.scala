package typings
package braceLib.braceMod.AceAjaxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var column: scala.Double
  var row: scala.Double
}

object Position {
  @scala.inline
  def apply(column: scala.Double, row: scala.Double): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("row")(row)
    __obj.asInstanceOf[Position]
  }
}

