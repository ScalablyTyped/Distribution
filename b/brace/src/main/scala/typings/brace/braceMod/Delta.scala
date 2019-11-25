package typings.brace.braceMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Delta extends js.Object {
  var action: String
  var lines: js.Array[String]
  var range: Range
  var text: String
}

object Delta {
  @scala.inline
  def apply(action: String, lines: js.Array[String], range: Range, text: String): Delta = {
    val __obj = js.Dynamic.literal(action = action.asInstanceOf[js.Any], lines = lines.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Delta]
  }
}

