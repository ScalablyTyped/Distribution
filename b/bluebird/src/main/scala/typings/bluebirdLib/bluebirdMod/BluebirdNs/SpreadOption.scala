package typings
package bluebirdLib.bluebirdMod.BluebirdNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpreadOption extends js.Object {
  var spread: scala.Boolean
}

object SpreadOption {
  @scala.inline
  def apply(spread: scala.Boolean): SpreadOption = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("spread")(spread)
    __obj.asInstanceOf[SpreadOption]
  }
}

