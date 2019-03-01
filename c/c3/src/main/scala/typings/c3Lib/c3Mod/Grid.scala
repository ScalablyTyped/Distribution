package typings
package c3Lib.c3Mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid extends js.Object {
  var x: js.UndefOr[c3Lib.Anon_Lines] = js.undefined
  var y: js.UndefOr[c3Lib.Anon_Lines] = js.undefined
}

object Grid {
  @scala.inline
  def apply(x: c3Lib.Anon_Lines = null, y: c3Lib.Anon_Lines = null): Grid = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Grid]
  }
}

