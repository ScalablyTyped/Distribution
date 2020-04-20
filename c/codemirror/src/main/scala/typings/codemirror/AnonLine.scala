package typings.codemirror

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLine extends js.Object {
  var ch: Double
  var line: Double
}

object AnonLine {
  @scala.inline
  def apply(ch: Double, line: Double): AnonLine = {
    val __obj = js.Dynamic.literal(ch = ch.asInstanceOf[js.Any], line = line.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonLine]
  }
}

