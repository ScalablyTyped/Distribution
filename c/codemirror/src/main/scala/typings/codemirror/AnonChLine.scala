package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonChLine extends js.Object {
  var ch: Double
  var line: Double
}

object AnonChLine {
  @scala.inline
  def apply(ch: Double, line: Double): AnonChLine = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonChLine]
  }
}

