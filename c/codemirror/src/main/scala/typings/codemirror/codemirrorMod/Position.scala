package typings.codemirror.codemirrorMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var ch: Double
  var line: Double
  var sticky: js.UndefOr[String] = js.undefined
}

object Position {
  @scala.inline
  def apply(ch: Double, line: Double, sticky: String = null): Position = {
    val __obj = js.Dynamic.literal(ch = ch, line = line)
    if (sticky != null) __obj.updateDynamic("sticky")(sticky)
    __obj.asInstanceOf[Position]
  }
}

