package typings
package axelLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait cursorInterface extends js.Object {
  def off(): scala.Unit
  def on(): scala.Unit
  def reset(): scala.Unit
  def restore(): scala.Unit
}

object cursorInterface {
  @scala.inline
  def apply(
    off: js.Function0[scala.Unit],
    on: js.Function0[scala.Unit],
    reset: js.Function0[scala.Unit],
    restore: js.Function0[scala.Unit]
  ): cursorInterface = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("off")(off)
    __obj.updateDynamic("on")(on)
    __obj.updateDynamic("reset")(reset)
    __obj.updateDynamic("restore")(restore)
    __obj.asInstanceOf[cursorInterface]
  }
}

