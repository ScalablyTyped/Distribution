package typings.brace.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Annotation extends js.Object {
  var column: Double
  var row: Double
  var text: String
  var `type`: String
}

object Annotation {
  @scala.inline
  def apply(column: Double, row: Double, text: String, `type`: String): Annotation = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotation]
  }
}

