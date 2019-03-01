package typings
package chromeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MIXED extends js.Object {
  var MIXED: chromeLib.chromeLibStrings.mixed
  var NORMAL: chromeLib.chromeLibStrings.normal
  var OFF: chromeLib.chromeLibStrings.off
}

object Anon_MIXED {
  @scala.inline
  def apply(
    MIXED: chromeLib.chromeLibStrings.mixed,
    NORMAL: chromeLib.chromeLibStrings.normal,
    OFF: chromeLib.chromeLibStrings.off
  ): Anon_MIXED = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("MIXED")(MIXED)
    __obj.updateDynamic("NORMAL")(NORMAL)
    __obj.updateDynamic("OFF")(OFF)
    __obj.asInstanceOf[Anon_MIXED]
  }
}

