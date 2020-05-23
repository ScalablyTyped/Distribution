package typings.cssTree.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Column extends js.Object {
  var column: Double
  var line: Double
  var offset: Double
}

object Column {
  @scala.inline
  def apply(column: Double, line: Double, offset: Double): Column = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any], offset = offset.asInstanceOf[js.Any])
    __obj.asInstanceOf[Column]
  }
}

