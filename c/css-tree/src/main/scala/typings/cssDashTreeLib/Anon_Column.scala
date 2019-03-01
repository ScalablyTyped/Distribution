package typings
package cssDashTreeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Column extends js.Object {
  var column: scala.Double
  var line: scala.Double
  var offset: scala.Double
}

object Anon_Column {
  @scala.inline
  def apply(column: scala.Double, line: scala.Double, offset: scala.Double): Anon_Column = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("column")(column)
    __obj.updateDynamic("line")(line)
    __obj.updateDynamic("offset")(offset)
    __obj.asInstanceOf[Anon_Column]
  }
}

