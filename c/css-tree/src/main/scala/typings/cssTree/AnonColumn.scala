package typings.cssTree

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonColumn extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object AnonColumn {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): AnonColumn = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonColumn]
  }
}

