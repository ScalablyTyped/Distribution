package typings.c3.c3Mod

import typings.c3.Anon_Lines
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Grid extends js.Object {
  var x: js.UndefOr[Anon_Lines] = js.undefined
  var y: js.UndefOr[Anon_Lines] = js.undefined
}

object Grid {
  @scala.inline
  def apply(x: Anon_Lines = null, y: Anon_Lines = null): Grid = {
    val __obj = js.Dynamic.literal()
    if (x != null) __obj.updateDynamic("x")(x)
    if (y != null) __obj.updateDynamic("y")(y)
    __obj.asInstanceOf[Grid]
  }
}

