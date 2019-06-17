package typings
package baseuiLib.buttonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SHAPE extends js.Object {
  var default: baseuiLib.baseuiLibStrings.default
  var round: baseuiLib.baseuiLibStrings.round
  var square: baseuiLib.baseuiLibStrings.square
}

object SHAPE {
  @scala.inline
  def apply(
    default: baseuiLib.baseuiLibStrings.default,
    round: baseuiLib.baseuiLibStrings.round,
    square: baseuiLib.baseuiLibStrings.square
  ): SHAPE = {
    val __obj = js.Dynamic.literal(default = default, round = round, square = square)
  
    __obj.asInstanceOf[SHAPE]
  }
}

