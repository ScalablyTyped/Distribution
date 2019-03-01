package typings
package codemirrorLib.codemirrorMod.CodeMirrorNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var ch: scala.Double
  var line: scala.Double
  var sticky: js.UndefOr[java.lang.String] = js.undefined
}

object Position {
  @scala.inline
  def apply(ch: scala.Double, line: scala.Double, sticky: java.lang.String = null): Position = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ch")(ch)
    __obj.updateDynamic("line")(line)
    if (sticky != null) __obj.updateDynamic("sticky")(sticky)
    __obj.asInstanceOf[Position]
  }
}

