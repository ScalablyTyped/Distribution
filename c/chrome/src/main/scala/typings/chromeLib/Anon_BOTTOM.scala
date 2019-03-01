package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BOTTOM extends js.Object {
  var BOTTOM: chromeLib.chromeLibStrings.bottom
  var LEFT: chromeLib.chromeLibStrings.left
  var RIGHT: chromeLib.chromeLibStrings.right
  var TOP: chromeLib.chromeLibStrings.top
}

object Anon_BOTTOM {
  @scala.inline
  def apply(
    BOTTOM: chromeLib.chromeLibStrings.bottom,
    LEFT: chromeLib.chromeLibStrings.left,
    RIGHT: chromeLib.chromeLibStrings.right,
    TOP: chromeLib.chromeLibStrings.top
  ): Anon_BOTTOM = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOTTOM")(BOTTOM)
    __obj.updateDynamic("LEFT")(LEFT)
    __obj.updateDynamic("RIGHT")(RIGHT)
    __obj.updateDynamic("TOP")(TOP)
    __obj.asInstanceOf[Anon_BOTTOM]
  }
}

